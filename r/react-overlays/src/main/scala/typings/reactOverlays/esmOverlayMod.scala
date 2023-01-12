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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmOverlayMod extends Shortcut {
  
  /**
    * Built on top of `Popper.js`, the overlay component is
    * great for custom tooltip overlays.
    */
  @JSImport("react-overlays/esm/Overlay", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[OverlayProps & RefAttributes[HTMLElement]] = js.native
  
  trait OverlayProps
    extends StObject
       with TransitionCallbacks {
    
    def children(value: ForceUpdate): ReactNode
    
    var container: js.UndefOr[DOMContainer[HTMLElement]] = js.undefined
    
    var containerPadding: js.UndefOr[Double] = js.undefined
    
    var flip: js.UndefOr[Boolean] = js.undefined
    
    var offset: js.UndefOr[Offset] = js.undefined
    
    var onHide: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
    
    var placement: js.UndefOr[Placement] = js.undefined
    
    var popperConfig: js.UndefOr[OmitUsePopperOptionsplace] = js.undefined
    
    var rootClose: js.UndefOr[Boolean] = js.undefined
    
    var rootCloseDisabled: js.UndefOr[Boolean] = js.undefined
    
    var rootCloseEvent: js.UndefOr[MouseEvents] = js.undefined
    
    var show: js.UndefOr[Boolean] = js.undefined
    
    var target: DOMContainer[HTMLElement]
    
    var transition: js.UndefOr[ComponentType[inbooleanundefinedappearb]] = js.undefined
  }
  object OverlayProps {
    
    inline def apply(children: ForceUpdate => ReactNode): OverlayProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), target = null)
      __obj.asInstanceOf[OverlayProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OverlayProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ForceUpdate => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setContainer(value: DOMContainer[HTMLElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerFunction0(value: () => HTMLElement | RefObject[HTMLElement] | Null): Self = StObject.set(x, "container", js.Any.fromFunction0(value))
      
      inline def setContainerNull: Self = StObject.set(x, "container", null)
      
      inline def setContainerPadding(value: Double): Self = StObject.set(x, "containerPadding", value.asInstanceOf[js.Any])
      
      inline def setContainerPaddingUndefined: Self = StObject.set(x, "containerPadding", js.undefined)
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      inline def setOffset(value: Offset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetFunction1(value: /* details */ Popper => OffsetValue): Self = StObject.set(x, "offset", js.Any.fromFunction1(value))
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOnHide(value: /* e */ Event => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction1(value))
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPopperConfig(value: OmitUsePopperOptionsplace): Self = StObject.set(x, "popperConfig", value.asInstanceOf[js.Any])
      
      inline def setPopperConfigUndefined: Self = StObject.set(x, "popperConfig", js.undefined)
      
      inline def setRootClose(value: Boolean): Self = StObject.set(x, "rootClose", value.asInstanceOf[js.Any])
      
      inline def setRootCloseDisabled(value: Boolean): Self = StObject.set(x, "rootCloseDisabled", value.asInstanceOf[js.Any])
      
      inline def setRootCloseDisabledUndefined: Self = StObject.set(x, "rootCloseDisabled", js.undefined)
      
      inline def setRootCloseEvent(value: MouseEvents): Self = StObject.set(x, "rootCloseEvent", value.asInstanceOf[js.Any])
      
      inline def setRootCloseEventUndefined: Self = StObject.set(x, "rootCloseEvent", js.undefined)
      
      inline def setRootCloseUndefined: Self = StObject.set(x, "rootClose", js.undefined)
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setTarget(value: DOMContainer[HTMLElement]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetFunction0(value: () => HTMLElement | RefObject[HTMLElement] | Null): Self = StObject.set(x, "target", js.Any.fromFunction0(value))
      
      inline def setTargetNull: Self = StObject.set(x, "target", null)
      
      inline def setTransition(value: ComponentType[inbooleanundefinedappearb]): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[OverlayProps & RefAttributes[HTMLElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esmOverlayMod.foo` */
  override def _to: ForwardRefExoticComponent[OverlayProps & RefAttributes[HTMLElement]] = default
}
