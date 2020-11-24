package typings.reactOverlays.esmOverlayMod

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.reactOverlays.anon.ForceUpdate
import typings.reactOverlays.anon.OmitUsePopperOptionsplace
import typings.reactOverlays.anon.Popper
import typings.reactOverlays.anon.inbooleanundefinedappearb
import typings.reactOverlays.esmTypesMod.TransitionCallbacks
import typings.reactOverlays.esmUsePopperMod.Offset
import typings.reactOverlays.esmUsePopperMod.OffsetValue
import typings.reactOverlays.esmUsePopperMod.Placement
import typings.reactOverlays.esmUseRootCloseMod.MouseEvents
import typings.reactOverlays.esmUseWaitForDOMRefMod.DOMContainer
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverlayProps extends TransitionCallbacks {
  
  def children(value: ForceUpdate): ReactNode = js.native
  
  var container: js.UndefOr[DOMContainer[HTMLElement]] = js.native
  
  var containerPadding: js.UndefOr[Double] = js.native
  
  var flip: js.UndefOr[Boolean] = js.native
  
  var offset: js.UndefOr[Offset] = js.native
  
  var onHide: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.native
  
  var placement: js.UndefOr[Placement] = js.native
  
  var popperConfig: js.UndefOr[OmitUsePopperOptionsplace] = js.native
  
  var rootClose: js.UndefOr[Boolean] = js.native
  
  var rootCloseDisabled: js.UndefOr[Boolean] = js.native
  
  var rootCloseEvent: js.UndefOr[MouseEvents] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
  
  var target: DOMContainer[HTMLElement] = js.native
  
  var transition: js.UndefOr[ComponentType[inbooleanundefinedappearb]] = js.native
}
object OverlayProps {
  
  @scala.inline
  def apply(children: ForceUpdate => ReactNode): OverlayProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[OverlayProps]
  }
  
  @scala.inline
  implicit class OverlayPropsOps[Self <: OverlayProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ForceUpdate => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContainerFunction0(value: () => HTMLElement | RefObject[HTMLElement] | Null): Self = this.set("container", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContainer(value: DOMContainer[HTMLElement]): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setContainerNull: Self = this.set("container", null)
    
    @scala.inline
    def setContainerPadding(value: Double): Self = this.set("containerPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerPadding: Self = this.set("containerPadding", js.undefined)
    
    @scala.inline
    def setFlip(value: Boolean): Self = this.set("flip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlip: Self = this.set("flip", js.undefined)
    
    @scala.inline
    def setOffsetFunction1(value: /* details */ Popper => OffsetValue): Self = this.set("offset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOffset(value: Offset): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOnHide(value: /* e */ Event => Unit): Self = this.set("onHide", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    
    @scala.inline
    def setPlacement(value: Placement): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    
    @scala.inline
    def setPopperConfig(value: OmitUsePopperOptionsplace): Self = this.set("popperConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopperConfig: Self = this.set("popperConfig", js.undefined)
    
    @scala.inline
    def setRootClose(value: Boolean): Self = this.set("rootClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootClose: Self = this.set("rootClose", js.undefined)
    
    @scala.inline
    def setRootCloseDisabled(value: Boolean): Self = this.set("rootCloseDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootCloseDisabled: Self = this.set("rootCloseDisabled", js.undefined)
    
    @scala.inline
    def setRootCloseEvent(value: MouseEvents): Self = this.set("rootCloseEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootCloseEvent: Self = this.set("rootCloseEvent", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setTargetFunction0(value: () => HTMLElement | RefObject[HTMLElement] | Null): Self = this.set("target", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTarget(value: DOMContainer[HTMLElement]): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNull: Self = this.set("target", null)
    
    @scala.inline
    def setTransition(value: ComponentType[inbooleanundefinedappearb]): Self = this.set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
  }
}
