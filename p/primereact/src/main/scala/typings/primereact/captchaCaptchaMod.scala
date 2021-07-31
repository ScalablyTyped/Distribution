package typings.primereact

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object captchaCaptchaMod {
  
  @JSImport("primereact/components/captcha/Captcha", "Captcha")
  @js.native
  class Captcha protected ()
    extends Component[CaptchaProps, js.Any, js.Any] {
    def this(props: CaptchaProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CaptchaProps, context: js.Any) = this()
  }
  
  trait CaptchaProps extends StObject {
    
    var id: js.UndefOr[String] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var onExpire: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onResponse: js.UndefOr[js.Function1[/* response */ js.Any, Unit]] = js.undefined
    
    var siteKey: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[String] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var theme: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CaptchaProps {
    
    @scala.inline
    def apply(): CaptchaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaptchaProps]
    }
    
    @scala.inline
    implicit class CaptchaPropsMutableBuilder[Self <: CaptchaProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setOnExpire(value: () => Unit): Self = StObject.set(x, "onExpire", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnExpireUndefined: Self = StObject.set(x, "onExpire", js.undefined)
      
      @scala.inline
      def setOnResponse(value: /* response */ js.Any => Unit): Self = StObject.set(x, "onResponse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponseUndefined: Self = StObject.set(x, "onResponse", js.undefined)
      
      @scala.inline
      def setSiteKey(value: String): Self = StObject.set(x, "siteKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSiteKeyUndefined: Self = StObject.set(x, "siteKey", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
