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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipMod {
  
  @JSImport("reactstrap/lib/Tooltip", JSImport.Default)
  @js.native
  class default ()
    extends Component[TooltipProps, js.Object, js.Any]
  
  type Tooltip = Component[TooltipProps, js.Object, js.Any]
  
  type TooltipChildren = (js.Function1[/* props */ TooltipChildrenRenderProps, ReactNode]) | ReactNode
  
  @js.native
  trait TooltipChildrenRenderProps extends StObject {
    
    def scheduleUpdate(): Unit = js.native
  }
  object TooltipChildrenRenderProps {
    
    @scala.inline
    def apply(scheduleUpdate: () => Unit): TooltipChildrenRenderProps = {
      val __obj = js.Dynamic.literal(scheduleUpdate = js.Any.fromFunction0(scheduleUpdate))
      __obj.asInstanceOf[TooltipChildrenRenderProps]
    }
    
    @scala.inline
    implicit class TooltipChildrenRenderPropsMutableBuilder[Self <: TooltipChildrenRenderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScheduleUpdate(value: () => Unit): Self = StObject.set(x, "scheduleUpdate", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait TooltipProps extends UncontrolledTooltipProps {
    
    var isOpen: js.UndefOr[Boolean] = js.native
    
    var toggle: js.UndefOr[MouseEventHandler[_] | js.Function0[Unit]] = js.native
  }
  object TooltipProps {
    
    @scala.inline
    def apply(target: String | HTMLElement | RefObject[HTMLElement]): TooltipProps = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipProps]
    }
    
    @scala.inline
    implicit class TooltipPropsMutableBuilder[Self <: TooltipProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      @scala.inline
      def setToggle(value: MouseEventHandler[_] | js.Function0[Unit]): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleFunction0(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToggleFunction1(value: MouseEvent[_, NativeMouseEvent] => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
    }
  }
  
  @js.native
  trait UncontrolledTooltipProps
    extends HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[js.Any] {
    
    var autohide: js.UndefOr[Boolean] = js.native
    
    @JSName("children")
    var children_UncontrolledTooltipProps: js.UndefOr[TooltipChildren] = js.native
    
    var container: js.UndefOr[String | HTMLElement | RefObject[HTMLElement]] = js.native
    
    var cssModule: js.UndefOr[CSSModule] = js.native
    
    var delay: js.UndefOr[Double | Hide] = js.native
    
    var fade: js.UndefOr[Boolean] = js.native
    
    var flip: js.UndefOr[Boolean] = js.native
    
    var innerClassName: js.UndefOr[String] = js.native
    
    var modifiers: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Modifiers */ js.Any
      ] = js.native
    
    var placement: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Placement */ js.Any
      ] = js.native
    
    var popperClassName: js.UndefOr[String] = js.native
    
    var target: String | HTMLElement | RefObject[HTMLElement] = js.native
  }
  object UncontrolledTooltipProps {
    
    @scala.inline
    def apply(target: String | HTMLElement | RefObject[HTMLElement]): UncontrolledTooltipProps = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[UncontrolledTooltipProps]
    }
    
    @scala.inline
    implicit class UncontrolledTooltipPropsMutableBuilder[Self <: UncontrolledTooltipProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutohide(value: Boolean): Self = StObject.set(x, "autohide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutohideUndefined: Self = StObject.set(x, "autohide", js.undefined)
      
      @scala.inline
      def setChildren(value: TooltipChildren): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction1(value: /* props */ TooltipChildrenRenderProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setContainer(value: String | HTMLElement | RefObject[HTMLElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      @scala.inline
      def setDelay(value: Double | Hide): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setFade(value: Boolean): Self = StObject.set(x, "fade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFadeUndefined: Self = StObject.set(x, "fade", js.undefined)
      
      @scala.inline
      def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      @scala.inline
      def setInnerClassName(value: String): Self = StObject.set(x, "innerClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerClassNameUndefined: Self = StObject.set(x, "innerClassName", js.undefined)
      
      @scala.inline
      def setModifiers(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Modifiers */ js.Any
      ): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      @scala.inline
      def setPlacement(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Placement */ js.Any
      ): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setPopperClassName(value: String): Self = StObject.set(x, "popperClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopperClassNameUndefined: Self = StObject.set(x, "popperClassName", js.undefined)
      
      @scala.inline
      def setTarget(value: String | HTMLElement | RefObject[HTMLElement]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
