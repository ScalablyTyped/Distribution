package typings.reactOverlays

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmOverlayMod extends Shortcut {
  
  /**
    * Built on top of `Popper.js`, the overlay component is
    * great for custom tooltip overlays.
    */
  @JSImport("react-overlays/esm/Overlay", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[OverlayProps with RefAttributes[HTMLElement]] = js.native
  
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
    implicit class OverlayPropsMutableBuilder[Self <: OverlayProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ForceUpdate => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContainer(value: DOMContainer[HTMLElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerFunction0(value: () => HTMLElement | RefObject[HTMLElement] | Null): Self = StObject.set(x, "container", js.Any.fromFunction0(value))
      
      @scala.inline
      def setContainerNull: Self = StObject.set(x, "container", null)
      
      @scala.inline
      def setContainerPadding(value: Double): Self = StObject.set(x, "containerPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerPaddingUndefined: Self = StObject.set(x, "containerPadding", js.undefined)
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      @scala.inline
      def setOffset(value: Offset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetFunction1(value: /* details */ Popper => OffsetValue): Self = StObject.set(x, "offset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOnHide(value: /* e */ Event => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      @scala.inline
      def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setPopperConfig(value: OmitUsePopperOptionsplace): Self = StObject.set(x, "popperConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopperConfigUndefined: Self = StObject.set(x, "popperConfig", js.undefined)
      
      @scala.inline
      def setRootClose(value: Boolean): Self = StObject.set(x, "rootClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootCloseDisabled(value: Boolean): Self = StObject.set(x, "rootCloseDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootCloseDisabledUndefined: Self = StObject.set(x, "rootCloseDisabled", js.undefined)
      
      @scala.inline
      def setRootCloseEvent(value: MouseEvents): Self = StObject.set(x, "rootCloseEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootCloseEventUndefined: Self = StObject.set(x, "rootCloseEvent", js.undefined)
      
      @scala.inline
      def setRootCloseUndefined: Self = StObject.set(x, "rootClose", js.undefined)
      
      @scala.inline
      def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      @scala.inline
      def setTarget(value: DOMContainer[HTMLElement]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetFunction0(value: () => HTMLElement | RefObject[HTMLElement] | Null): Self = StObject.set(x, "target", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTargetNull: Self = StObject.set(x, "target", null)
      
      @scala.inline
      def setTransition(value: ComponentType[inbooleanundefinedappearb]): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[OverlayProps with RefAttributes[HTMLElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esmOverlayMod.foo` */
  override def _to: ForwardRefExoticComponent[OverlayProps with RefAttributes[HTMLElement]] = default
}
