package typings.reactRecaptcha

import typings.react.mod.Component
import typings.reactRecaptcha.reactRecaptchaStrings.`inline`
import typings.reactRecaptcha.reactRecaptchaStrings.audio
import typings.reactRecaptcha.reactRecaptchaStrings.bottomleft
import typings.reactRecaptcha.reactRecaptchaStrings.bottomright
import typings.reactRecaptcha.reactRecaptchaStrings.compact
import typings.reactRecaptcha.reactRecaptchaStrings.dark
import typings.reactRecaptcha.reactRecaptchaStrings.explicit
import typings.reactRecaptcha.reactRecaptchaStrings.image
import typings.reactRecaptcha.reactRecaptchaStrings.invisible
import typings.reactRecaptcha.reactRecaptchaStrings.light
import typings.reactRecaptcha.reactRecaptchaStrings.normal
import typings.reactRecaptcha.reactRecaptchaStrings.onload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-recaptcha", JSImport.Namespace)
  @js.native
  class ^ () extends Recaptcha
  @JSImport("react-recaptcha", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("react-recaptcha", "defaultProps")
  @js.native
  def defaultProps: RecaptchaProps = js.native
  @scala.inline
  def defaultProps_=(x: RecaptchaProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("react-recaptcha", "propTypes")
  @js.native
  def propTypes: js.Any = js.native
  @scala.inline
  def propTypes_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Recaptcha
    extends Component[RecaptchaProps, js.Object, js.Any] {
    
    def execute(): Unit = js.native
    
    def reset(): Unit = js.native
  }
  
  trait RecaptchaProps extends StObject {
    
    var badge: js.UndefOr[bottomright | bottomleft | `inline`] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var elementID: js.UndefOr[String] = js.undefined
    
    var expiredCallback: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    var expiredCallbackName: js.UndefOr[String] = js.undefined
    
    var hl: js.UndefOr[String] = js.undefined
    
    var onloadCallback: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    var onloadCallbackName: js.UndefOr[String] = js.undefined
    
    var render: js.UndefOr[onload | explicit] = js.undefined
    
    var sitekey: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[normal | compact | invisible] = js.undefined
    
    var tabindex: js.UndefOr[Double | String] = js.undefined
    
    var theme: js.UndefOr[dark | light] = js.undefined
    
    var `type`: js.UndefOr[audio | image] = js.undefined
    
    var verifyCallback: js.UndefOr[js.Function1[/* response */ String, js.Any]] = js.undefined
    
    var verifyCallbackName: js.UndefOr[String] = js.undefined
  }
  object RecaptchaProps {
    
    @scala.inline
    def apply(): RecaptchaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecaptchaProps]
    }
    
    @scala.inline
    implicit class RecaptchaPropsMutableBuilder[Self <: RecaptchaProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBadge(value: bottomright | bottomleft | `inline`): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setElementID(value: String): Self = StObject.set(x, "elementID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementIDUndefined: Self = StObject.set(x, "elementID", js.undefined)
      
      @scala.inline
      def setExpiredCallback(value: () => js.Any): Self = StObject.set(x, "expiredCallback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setExpiredCallbackName(value: String): Self = StObject.set(x, "expiredCallbackName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiredCallbackNameUndefined: Self = StObject.set(x, "expiredCallbackName", js.undefined)
      
      @scala.inline
      def setExpiredCallbackUndefined: Self = StObject.set(x, "expiredCallback", js.undefined)
      
      @scala.inline
      def setHl(value: String): Self = StObject.set(x, "hl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHlUndefined: Self = StObject.set(x, "hl", js.undefined)
      
      @scala.inline
      def setOnloadCallback(value: () => js.Any): Self = StObject.set(x, "onloadCallback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnloadCallbackName(value: String): Self = StObject.set(x, "onloadCallbackName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnloadCallbackNameUndefined: Self = StObject.set(x, "onloadCallbackName", js.undefined)
      
      @scala.inline
      def setOnloadCallbackUndefined: Self = StObject.set(x, "onloadCallback", js.undefined)
      
      @scala.inline
      def setRender(value: onload | explicit): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setSitekey(value: String): Self = StObject.set(x, "sitekey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSitekeyUndefined: Self = StObject.set(x, "sitekey", js.undefined)
      
      @scala.inline
      def setSize(value: normal | compact | invisible): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTabindex(value: Double | String): Self = StObject.set(x, "tabindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabindexUndefined: Self = StObject.set(x, "tabindex", js.undefined)
      
      @scala.inline
      def setTheme(value: dark | light): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setType(value: audio | image): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setVerifyCallback(value: /* response */ String => js.Any): Self = StObject.set(x, "verifyCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVerifyCallbackName(value: String): Self = StObject.set(x, "verifyCallbackName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerifyCallbackNameUndefined: Self = StObject.set(x, "verifyCallbackName", js.undefined)
      
      @scala.inline
      def setVerifyCallbackUndefined: Self = StObject.set(x, "verifyCallback", js.undefined)
    }
  }
}
