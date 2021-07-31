package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.Ref
import typings.reactstrap.fadeMod.FadeProps
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alertMod {
  
  @JSImport("reactstrap/lib/Alert", JSImport.Default)
  @js.native
  class default ()
    extends Component[AlertProps, js.Object, js.Any]
  
  type Alert = Component[AlertProps, js.Object, js.Any]
  
  trait AlertProps
    extends StObject
       with UncontrolledAlertProps {
    
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    var toggle: js.UndefOr[MouseEventHandler[js.Any]] = js.undefined
  }
  object AlertProps {
    
    @scala.inline
    def apply(): AlertProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlertProps]
    }
    
    @scala.inline
    implicit class AlertPropsMutableBuilder[Self <: AlertProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      @scala.inline
      def setToggle(value: MouseEvent[js.Any, NativeMouseEvent] => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
    }
  }
  
  trait UncontrolledAlertProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[js.Any] {
    
    var closeAriaLabel: js.UndefOr[String] = js.undefined
    
    var closeClassName: js.UndefOr[String] = js.undefined
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var fade: js.UndefOr[Boolean] = js.undefined
    
    var innerRef: js.UndefOr[Ref[HTMLElement]] = js.undefined
    
    var tag: js.UndefOr[ElementType[js.Any]] = js.undefined
    
    var transition: js.UndefOr[FadeProps] = js.undefined
  }
  object UncontrolledAlertProps {
    
    @scala.inline
    def apply(): UncontrolledAlertProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UncontrolledAlertProps]
    }
    
    @scala.inline
    implicit class UncontrolledAlertPropsMutableBuilder[Self <: UncontrolledAlertProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloseAriaLabel(value: String): Self = StObject.set(x, "closeAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseAriaLabelUndefined: Self = StObject.set(x, "closeAriaLabel", js.undefined)
      
      @scala.inline
      def setCloseClassName(value: String): Self = StObject.set(x, "closeClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseClassNameUndefined: Self = StObject.set(x, "closeClassName", js.undefined)
      
      @scala.inline
      def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      @scala.inline
      def setFade(value: Boolean): Self = StObject.set(x, "fade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFadeUndefined: Self = StObject.set(x, "fade", js.undefined)
      
      @scala.inline
      def setInnerRef(value: Ref[HTMLElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      @scala.inline
      def setTag(value: ElementType[js.Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setTransition(value: FadeProps): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    }
  }
}
