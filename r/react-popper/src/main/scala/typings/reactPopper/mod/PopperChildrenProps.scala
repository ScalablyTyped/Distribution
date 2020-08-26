package typings.reactPopper.mod

import typings.react.mod.CSSProperties
import typings.react.mod.Ref
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopperChildrenProps extends js.Object {
  var arrowProps: PopperArrowProps = js.native
  var hasPopperEscaped: js.UndefOr[Boolean] = js.native
  var isReferenceHidden: js.UndefOr[Boolean] = js.native
  var placement: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Placement */ js.Any = js.native
  var ref: Ref[_] = js.native
  var style: CSSProperties = js.native
  def forceUpdate(): Partial[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.State */ _
  ] = js.native
  def update(): js.Promise[
    Null | (Partial[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.State */ _
    ])
  ] = js.native
}

object PopperChildrenProps {
  @scala.inline
  def apply(
    arrowProps: PopperArrowProps,
    forceUpdate: () => Partial[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.State */ _
    ],
    placement: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Placement */ js.Any,
    style: CSSProperties,
    update: () => js.Promise[
      Null | (Partial[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.State */ _
      ])
    ]
  ): PopperChildrenProps = {
    val __obj = js.Dynamic.literal(arrowProps = arrowProps.asInstanceOf[js.Any], forceUpdate = js.Any.fromFunction0(forceUpdate), placement = placement.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[PopperChildrenProps]
  }
  @scala.inline
  implicit class PopperChildrenPropsOps[Self <: PopperChildrenProps] (val x: Self) extends AnyVal {
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
    def setArrowProps(value: PopperArrowProps): Self = this.set("arrowProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setForceUpdate(
      value: () => Partial[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.State */ _
        ]
    ): Self = this.set("forceUpdate", js.Any.fromFunction0(value))
    @scala.inline
    def setPlacement(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Placement */ js.Any
    ): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(
      value: () => js.Promise[
          Null | (Partial[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.State */ _
          ])
        ]
    ): Self = this.set("update", js.Any.fromFunction0(value))
    @scala.inline
    def setHasPopperEscaped(value: Boolean): Self = this.set("hasPopperEscaped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasPopperEscaped: Self = this.set("hasPopperEscaped", js.undefined)
    @scala.inline
    def setIsReferenceHidden(value: Boolean): Self = this.set("isReferenceHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsReferenceHidden: Self = this.set("isReferenceHidden", js.undefined)
    @scala.inline
    def setRefFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    @scala.inline
    def setRef(value: Ref[_]): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
  }
  
}

