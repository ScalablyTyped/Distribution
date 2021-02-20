package typings.reactGoogleRecaptcha

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-google-recaptcha", JSImport.Default)
  @js.native
  class default protected () extends ReCAPTCHA {
    def this(props: ReCAPTCHAProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ReCAPTCHAProps, context: js.Any) = this()
  }
  
  @JSImport("react-google-recaptcha", "ReCAPTCHA")
  @js.native
  class ReCAPTCHA protected ()
    extends Component[ReCAPTCHAProps, js.Object, js.Any] {
    def this(props: ReCAPTCHAProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ReCAPTCHAProps, context: js.Any) = this()
    
    /**
      * Programatically invoke the reCAPTCHA check.
      * Used if the invisible reCAPTCHA is on a div instead of a button.
      */
    def execute(): Unit = js.native
    
    /**
      * Programmatically invoke the challenge and return a promise that resolves
      * to the token or errors (if encountered). Alternative approach to
      * execute() in combination with the onChange() prop.
      * @return token | null
      */
    def executeAsync(): js.Promise[String | Null] = js.native
    
    /**
      * Gets the response for the reCAPTCHA widget.
      * @return the response of the reCAPTCHA widget.
      */
    def getValue(): String | Null = js.native
    
    /**
      * Gets the widgetId of reCAPTCHA widget.
      * @return widgetId | null
      */
    def getWidgetId(): Double | Null = js.native
    
    /**
      * Resets the reCAPTCHA widget.
      */
    def reset(): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.bottomright
    - typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.bottomleft
    - typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.`inline`
  */
  trait Badge extends StObject
  object Badge {
    
    @scala.inline
    def bottomleft: typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.bottomleft = "bottomleft".asInstanceOf[typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.bottomleft]
    
    @scala.inline
    def bottomright: typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.bottomright = "bottomright".asInstanceOf[typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.bottomright]
    
    @scala.inline
    def `inline`: typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.`inline` = "inline".asInstanceOf[typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.`inline`]
  }
  
  @js.native
  trait ReCAPTCHAProps extends StObject {
    
    /**
      * The badge location for g-recaptcha with size of "invisible".
      * @default "bottomright"
      */
    var badge: js.UndefOr[Badge] = js.native
    
    /**
      *  If you are using the barebone component you need to provide access to the
      *  google grecaptcha object.
      */
    var grecaptcha: js.UndefOr[js.Object] = js.native
    
    /**
      *  Forces the widget to render in a specific language.
      *  Auto-detects the user's language if unspecified.
      */
    var hl: js.UndefOr[String] = js.native
    
    /**
      * The function to be called when the user successfully completes the normal
      * or the compact captcha. It will also be called with null, when captcha expires.
      * @param token string or null
      */
    var onChange: js.UndefOr[js.Function1[/* token */ String | Null, Unit]] = js.native
    
    /**
      *  Optional callback, called when reCAPTCHA encounters an error (usually network connectivity)
      *  and cannot continue until connectivity is restored. If you specify a function here, you are
      *  responsible for informing the user that they should retry.
      */
    var onErrored: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Callback called when a challenge expires and has to be redone by the user.
      */
    var onExpired: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * The API client key
      */
    var sitekey: String = js.native
    
    /**
      * This allows you to change the size or do an invisible captcha.
      * @default "normal"
      */
    var size: js.UndefOr[Size] = js.native
    
    /**
      * Set the stoken parameter, which allows the captcha to be used from different domains.
      * @see reCAPTCHA secure-token
      */
    var stoken: js.UndefOr[String] = js.native
    
    /**
      * The tabindex of the element.
      * @default 0
      */
    var tabindex: js.UndefOr[Double] = js.native
    
    /**
      * The theme of the widget.
      * @default "light"
      */
    var theme: js.UndefOr[Theme] = js.native
    
    /**
      * The type of initial captcha.
      * @default "image"
      */
    var `type`: js.UndefOr[Type] = js.native
  }
  object ReCAPTCHAProps {
    
    @scala.inline
    def apply(sitekey: String): ReCAPTCHAProps = {
      val __obj = js.Dynamic.literal(sitekey = sitekey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReCAPTCHAProps]
    }
    
    @scala.inline
    implicit class ReCAPTCHAPropsMutableBuilder[Self <: ReCAPTCHAProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBadge(value: Badge): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      @scala.inline
      def setGrecaptcha(value: js.Object): Self = StObject.set(x, "grecaptcha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrecaptchaUndefined: Self = StObject.set(x, "grecaptcha", js.undefined)
      
      @scala.inline
      def setHl(value: String): Self = StObject.set(x, "hl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHlUndefined: Self = StObject.set(x, "hl", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* token */ String | Null => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnErrored(value: () => Unit): Self = StObject.set(x, "onErrored", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnErroredUndefined: Self = StObject.set(x, "onErrored", js.undefined)
      
      @scala.inline
      def setOnExpired(value: () => Unit): Self = StObject.set(x, "onExpired", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnExpiredUndefined: Self = StObject.set(x, "onExpired", js.undefined)
      
      @scala.inline
      def setSitekey(value: String): Self = StObject.set(x, "sitekey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStoken(value: String): Self = StObject.set(x, "stoken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStokenUndefined: Self = StObject.set(x, "stoken", js.undefined)
      
      @scala.inline
      def setTabindex(value: Double): Self = StObject.set(x, "tabindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabindexUndefined: Self = StObject.set(x, "tabindex", js.undefined)
      
      @scala.inline
      def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.compact
    - typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.normal
    - typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.invisible
  */
  trait Size extends StObject
  object Size {
    
    @scala.inline
    def compact: typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.compact = "compact".asInstanceOf[typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.compact]
    
    @scala.inline
    def invisible: typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.invisible = "invisible".asInstanceOf[typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.invisible]
    
    @scala.inline
    def normal: typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.normal = "normal".asInstanceOf[typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.normal]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.light
    - typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.dark
  */
  trait Theme extends StObject
  object Theme {
    
    @scala.inline
    def dark: typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.dark = "dark".asInstanceOf[typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.dark]
    
    @scala.inline
    def light: typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.light = "light".asInstanceOf[typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.light]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.image
    - typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.audio
  */
  trait Type extends StObject
  object Type {
    
    @scala.inline
    def audio: typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.audio = "audio".asInstanceOf[typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.audio]
    
    @scala.inline
    def image: typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.image = "image".asInstanceOf[typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.image]
  }
}
