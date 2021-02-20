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
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverMod {
  
  @JSImport("reactstrap/lib/Popover", JSImport.Default)
  @js.native
  class default ()
    extends Component[PopoverProps, js.Object, js.Any]
  
  type Popover = Component[PopoverProps, js.Object, js.Any]
  
  type PopoverChildren = (js.Function1[/* props */ PopoverChildrenRenderProps, ReactNode]) | ReactNode
  
  @js.native
  trait PopoverChildrenRenderProps extends StObject {
    
    def scheduleUpdate(): Unit = js.native
  }
  object PopoverChildrenRenderProps {
    
    @scala.inline
    def apply(scheduleUpdate: () => Unit): PopoverChildrenRenderProps = {
      val __obj = js.Dynamic.literal(scheduleUpdate = js.Any.fromFunction0(scheduleUpdate))
      __obj.asInstanceOf[PopoverChildrenRenderProps]
    }
    
    @scala.inline
    implicit class PopoverChildrenRenderPropsMutableBuilder[Self <: PopoverChildrenRenderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScheduleUpdate(value: () => Unit): Self = StObject.set(x, "scheduleUpdate", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait PopoverProps
    extends HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[js.Any] {
    
    var boundariesElement: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Boundary */ js.Any) | Element
      ] = js.native
    
    @JSName("children")
    var children_PopoverProps: js.UndefOr[PopoverChildren] = js.native
    
    var container: js.UndefOr[String | HTMLElement | RefObject[HTMLElement]] = js.native
    
    var cssModule: js.UndefOr[CSSModule] = js.native
    
    var delay: js.UndefOr[Double | Hide] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var fade: js.UndefOr[Boolean] = js.native
    
    var flip: js.UndefOr[Boolean] = js.native
    
    var hideArrow: js.UndefOr[Boolean] = js.native
    
    var innerClassName: js.UndefOr[String] = js.native
    
    var isOpen: js.UndefOr[Boolean] = js.native
    
    var modifiers: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Modifiers */ js.Any
      ] = js.native
    
    var placement: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Placement */ js.Any
      ] = js.native
    
    var placementPrefix: js.UndefOr[String] = js.native
    
    var popperClassName: js.UndefOr[String] = js.native
    
    var target: String | HTMLElement | RefObject[HTMLElement] = js.native
    
    var toggle: js.UndefOr[MouseEventHandler[_] | js.Function0[Unit]] = js.native
  }
  object PopoverProps {
    
    @scala.inline
    def apply(target: String | HTMLElement | RefObject[HTMLElement]): PopoverProps = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopoverProps]
    }
    
    @scala.inline
    implicit class PopoverPropsMutableBuilder[Self <: PopoverProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoundariesElement(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Boundary */ js.Any) | Element
      ): Self = StObject.set(x, "boundariesElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundariesElementUndefined: Self = StObject.set(x, "boundariesElement", js.undefined)
      
      @scala.inline
      def setChildren(value: PopoverChildren): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction1(value: /* props */ PopoverChildrenRenderProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
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
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFade(value: Boolean): Self = StObject.set(x, "fade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFadeUndefined: Self = StObject.set(x, "fade", js.undefined)
      
      @scala.inline
      def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      @scala.inline
      def setHideArrow(value: Boolean): Self = StObject.set(x, "hideArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideArrowUndefined: Self = StObject.set(x, "hideArrow", js.undefined)
      
      @scala.inline
      def setInnerClassName(value: String): Self = StObject.set(x, "innerClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerClassNameUndefined: Self = StObject.set(x, "innerClassName", js.undefined)
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
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
      def setPlacementPrefix(value: String): Self = StObject.set(x, "placementPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementPrefixUndefined: Self = StObject.set(x, "placementPrefix", js.undefined)
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setPopperClassName(value: String): Self = StObject.set(x, "popperClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopperClassNameUndefined: Self = StObject.set(x, "popperClassName", js.undefined)
      
      @scala.inline
      def setTarget(value: String | HTMLElement | RefObject[HTMLElement]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
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
  trait UncontrolledPopoverProps extends PopoverProps {
    
    var defaultOpen: js.UndefOr[Boolean] = js.native
  }
  object UncontrolledPopoverProps {
    
    @scala.inline
    def apply(target: String | HTMLElement | RefObject[HTMLElement]): UncontrolledPopoverProps = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[UncontrolledPopoverProps]
    }
    
    @scala.inline
    implicit class UncontrolledPopoverPropsMutableBuilder[Self <: UncontrolledPopoverProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
    }
  }
}
