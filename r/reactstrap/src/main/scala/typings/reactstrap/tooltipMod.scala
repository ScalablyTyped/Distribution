package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.reactstrap.anon.Hide
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipMod {
  
  @JSImport("reactstrap/lib/Tooltip", JSImport.Default)
  @js.native
  class default ()
    extends Component[TooltipProps, js.Object, js.Any]
  
  type Tooltip = Component[TooltipProps, js.Object, js.Any]
  
  type TooltipChildren = (js.Function1[/* props */ TooltipChildrenRenderProps, ReactNode]) | ReactNode
  
  trait TooltipChildrenRenderProps extends StObject {
    
    def scheduleUpdate(): Unit
  }
  object TooltipChildrenRenderProps {
    
    inline def apply(scheduleUpdate: () => Unit): TooltipChildrenRenderProps = {
      val __obj = js.Dynamic.literal(scheduleUpdate = js.Any.fromFunction0(scheduleUpdate))
      __obj.asInstanceOf[TooltipChildrenRenderProps]
    }
    
    extension [Self <: TooltipChildrenRenderProps](x: Self) {
      
      inline def setScheduleUpdate(value: () => Unit): Self = StObject.set(x, "scheduleUpdate", js.Any.fromFunction0(value))
    }
  }
  
  trait TooltipProps
    extends StObject
       with UncontrolledTooltipProps {
    
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    var toggle: js.UndefOr[MouseEventHandler[js.Any] | js.Function0[Unit]] = js.undefined
  }
  object TooltipProps {
    
    inline def apply(target: String | HTMLElement | RefObject[HTMLElement]): TooltipProps = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipProps]
    }
    
    extension [Self <: TooltipProps](x: Self) {
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setToggle(value: MouseEventHandler[js.Any] | js.Function0[Unit]): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      
      inline def setToggleFunction0(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
      
      inline def setToggleFunction1(value: MouseEvent[js.Any, NativeMouseEvent] => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction1(value))
      
      inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
    }
  }
  
  trait UncontrolledTooltipProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[js.Any] {
    
    var autohide: js.UndefOr[Boolean] = js.undefined
    
    @JSName("children")
    var children_UncontrolledTooltipProps: js.UndefOr[TooltipChildren] = js.undefined
    
    var container: js.UndefOr[String | HTMLElement | RefObject[HTMLElement]] = js.undefined
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var delay: js.UndefOr[Double | Hide] = js.undefined
    
    var fade: js.UndefOr[Boolean] = js.undefined
    
    var flip: js.UndefOr[Boolean] = js.undefined
    
    var innerClassName: js.UndefOr[String] = js.undefined
    
    var modifiers: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Modifiers */ js.Any
      ] = js.undefined
    
    var placement: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Placement */ js.Any
      ] = js.undefined
    
    var popperClassName: js.UndefOr[String] = js.undefined
    
    var target: String | HTMLElement | RefObject[HTMLElement]
  }
  object UncontrolledTooltipProps {
    
    inline def apply(target: String | HTMLElement | RefObject[HTMLElement]): UncontrolledTooltipProps = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[UncontrolledTooltipProps]
    }
    
    extension [Self <: UncontrolledTooltipProps](x: Self) {
      
      inline def setAutohide(value: Boolean): Self = StObject.set(x, "autohide", value.asInstanceOf[js.Any])
      
      inline def setAutohideUndefined: Self = StObject.set(x, "autohide", js.undefined)
      
      inline def setChildren(value: TooltipChildren): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* props */ TooltipChildrenRenderProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setContainer(value: String | HTMLElement | RefObject[HTMLElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setDelay(value: Double | Hide): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setFade(value: Boolean): Self = StObject.set(x, "fade", value.asInstanceOf[js.Any])
      
      inline def setFadeUndefined: Self = StObject.set(x, "fade", js.undefined)
      
      inline def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      inline def setInnerClassName(value: String): Self = StObject.set(x, "innerClassName", value.asInstanceOf[js.Any])
      
      inline def setInnerClassNameUndefined: Self = StObject.set(x, "innerClassName", js.undefined)
      
      inline def setModifiers(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Modifiers */ js.Any
      ): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      inline def setPlacement(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Placement */ js.Any
      ): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPopperClassName(value: String): Self = StObject.set(x, "popperClassName", value.asInstanceOf[js.Any])
      
      inline def setPopperClassNameUndefined: Self = StObject.set(x, "popperClassName", js.undefined)
      
      inline def setTarget(value: String | HTMLElement | RefObject[HTMLElement]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
