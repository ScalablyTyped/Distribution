package typings.reactPopper.mod

import typings.popperjsCore.enumsMod.Placement
import typings.popperjsCore.typesMod.PositioningStrategy
import typings.popperjsCore.typesMod.VirtualElement
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.reactPopper.anon.PartialState
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopperProps[Modifiers] extends js.Object {
  
  def children(props: PopperChildrenProps): ReactNode = js.native
  
  var innerRef: js.UndefOr[Ref[_]] = js.native
  
  var modifiers: js.UndefOr[js.Array[Modifier[Modifiers, js.Object]]] = js.native
  
  var onFirstUpdate: js.UndefOr[js.Function1[/* state */ PartialState, Unit]] = js.native
  
  var placement: js.UndefOr[Placement] = js.native
  
  var referenceElement: js.UndefOr[HTMLElement | VirtualElement] = js.native
  
  var strategy: js.UndefOr[PositioningStrategy] = js.native
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
    def setOnFirstUpdate(value: /* state */ PartialState => Unit): Self = this.set("onFirstUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFirstUpdate: Self = this.set("onFirstUpdate", js.undefined)
    
    @scala.inline
    def setPlacement(value: Placement): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    
    @scala.inline
    def setReferenceElement(value: HTMLElement | VirtualElement): Self = this.set("referenceElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferenceElement: Self = this.set("referenceElement", js.undefined)
    
    @scala.inline
    def setStrategy(value: PositioningStrategy): Self = this.set("strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrategy: Self = this.set("strategy", js.undefined)
  }
}
