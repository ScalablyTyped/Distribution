package typings.reactPopper.mod

import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.HTMLElement
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopperProps[Modifiers] extends js.Object {
  var innerRef: js.UndefOr[Ref[_]] = js.native
  var modifiers: js.UndefOr[js.Array[Modifier[Modifiers, js.Object]]] = js.native
  var onFirstUpdate: js.UndefOr[
    js.Function1[
      /* state */ Partial[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.State */ _
      ], 
      Unit
    ]
  ] = js.native
  var placement: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Placement */ js.Any
  ] = js.native
  var referenceElement: js.UndefOr[
    HTMLElement | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.VirtualElement */ js.Any)
  ] = js.native
  var strategy: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.PositioningStrategy */ js.Any
  ] = js.native
  def children(props: PopperChildrenProps): ReactNode = js.native
}

object PopperProps {
  @scala.inline
  def apply[Modifiers](children: PopperChildrenProps => ReactNode): PopperProps[Modifiers] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[PopperProps[Modifiers]]
  }
  @scala.inline
  implicit class PopperPropsOps[Self <: PopperProps[_], Modifiers] (val x: Self with PopperProps[Modifiers]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChildren(value: PopperChildrenProps => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setInnerRefFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("innerRef", js.Any.fromFunction1(value))
    @scala.inline
    def setInnerRef(value: Ref[_]): Self = this.set("innerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerRef: Self = this.set("innerRef", js.undefined)
    @scala.inline
    def setInnerRefNull: Self = this.set("innerRef", null)
    @scala.inline
    def setModifiersVarargs(value: (Modifier[Modifiers, js.Object])*): Self = this.set("modifiers", js.Array(value :_*))
    @scala.inline
    def setModifiers(value: js.Array[Modifier[Modifiers, js.Object]]): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifiers: Self = this.set("modifiers", js.undefined)
    @scala.inline
    def setOnFirstUpdate(
      value: /* state */ Partial[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.State */ _
        ] => Unit
    ): Self = this.set("onFirstUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFirstUpdate: Self = this.set("onFirstUpdate", js.undefined)
    @scala.inline
    def setPlacement(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Placement */ js.Any
    ): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setReferenceElement(
      value: HTMLElement | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.VirtualElement */ js.Any)
    ): Self = this.set("referenceElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceElement: Self = this.set("referenceElement", js.undefined)
    @scala.inline
    def setStrategy(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.PositioningStrategy */ js.Any
    ): Self = this.set("strategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrategy: Self = this.set("strategy", js.undefined)
  }
  
}

