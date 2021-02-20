package typings.reactMessengerCheckbox

import typings.react.mod.Component
import typings.reactMessengerCheckbox.reactMessengerCheckboxStrings.dark
import typings.reactMessengerCheckbox.reactMessengerCheckboxStrings.large
import typings.reactMessengerCheckbox.reactMessengerCheckboxStrings.light
import typings.reactMessengerCheckbox.reactMessengerCheckboxStrings.medium
import typings.reactMessengerCheckbox.reactMessengerCheckboxStrings.small
import typings.reactMessengerCheckbox.reactMessengerCheckboxStrings.standard
import typings.reactMessengerCheckbox.reactMessengerCheckboxStrings.xlarge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * <MessengerCheckbox />
    */
  @JSImport("react-messenger-checkbox", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[ReactMessengerProps, js.Object, js.Any]
  
  /**
    * <MessengerCheckbox />
    */
  type MessengerCheckbox = Component[ReactMessengerProps, js.Object, js.Any]
  
  @js.native
  trait ReactMessengerProps extends StObject {
    
    var allowLogin: js.UndefOr[Boolean] = js.native
    
    var appId: String = js.native
    
    var autoLogAppEvents: js.UndefOr[Boolean] = js.native
    
    var centerAlign: js.UndefOr[Boolean] = js.native
    
    var debug: js.UndefOr[Boolean] = js.native
    
    var language: js.UndefOr[String] = js.native
    
    var onEvent: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
    
    var origin: String = js.native
    
    var pageId: String = js.native
    
    var prechecked: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[small | medium | large | standard | xlarge] = js.native
    
    var skin: js.UndefOr[light | dark] = js.native
    
    var userRef: String = js.native
    
    var version: js.UndefOr[String] = js.native
    
    var xfbml: js.UndefOr[Boolean] = js.native
  }
  object ReactMessengerProps {
    
    @scala.inline
    def apply(appId: String, origin: String, pageId: String, userRef: String): ReactMessengerProps = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], pageId = pageId.asInstanceOf[js.Any], userRef = userRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactMessengerProps]
    }
    
    @scala.inline
    implicit class ReactMessengerPropsMutableBuilder[Self <: ReactMessengerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowLogin(value: Boolean): Self = StObject.set(x, "allowLogin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowLoginUndefined: Self = StObject.set(x, "allowLogin", js.undefined)
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoLogAppEvents(value: Boolean): Self = StObject.set(x, "autoLogAppEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoLogAppEventsUndefined: Self = StObject.set(x, "autoLogAppEvents", js.undefined)
      
      @scala.inline
      def setCenterAlign(value: Boolean): Self = StObject.set(x, "centerAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterAlignUndefined: Self = StObject.set(x, "centerAlign", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setOnEvent(value: /* event */ js.Any => Unit): Self = StObject.set(x, "onEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEventUndefined: Self = StObject.set(x, "onEvent", js.undefined)
      
      @scala.inline
      def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageId(value: String): Self = StObject.set(x, "pageId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrechecked(value: Boolean): Self = StObject.set(x, "prechecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecheckedUndefined: Self = StObject.set(x, "prechecked", js.undefined)
      
      @scala.inline
      def setSize(value: small | medium | large | standard | xlarge): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSkin(value: light | dark): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      @scala.inline
      def setUserRef(value: String): Self = StObject.set(x, "userRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      @scala.inline
      def setXfbml(value: Boolean): Self = StObject.set(x, "xfbml", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXfbmlUndefined: Self = StObject.set(x, "xfbml", js.undefined)
    }
  }
}
