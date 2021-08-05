package typings.reactGoogleRecaptcha

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    inline def bottomleft: typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.bottomleft = "bottomleft".asInstanceOf[typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.bottomleft]
    
    inline def bottomright: typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.bottomright = "bottomright".asInstanceOf[typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.bottomright]
    
    inline def `inline`: typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.`inline` = "inline".asInstanceOf[typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.`inline`]
  }
  
  trait ReCAPTCHAProps extends StObject {
    
    /**
      * The badge location for g-recaptcha with size of "invisible".
      * @default "bottomright"
      */
    var badge: js.UndefOr[Badge] = js.undefined
    
    /**
      *  If you are using the barebone component you need to provide access to the
      *  google grecaptcha object.
      */
    var grecaptcha: js.UndefOr[js.Object] = js.undefined
    
    /**
      *  Forces the widget to render in a specific language.
      *  Auto-detects the user's language if unspecified.
      */
    var hl: js.UndefOr[String] = js.undefined
    
    /**
      * The function to be called when the user successfully completes the normal
      * or the compact captcha. It will also be called with null, when captcha expires.
      * @param token string or null
      */
    var onChange: js.UndefOr[js.Function1[/* token */ String | Null, Unit]] = js.undefined
    
    /**
      *  Optional callback, called when reCAPTCHA encounters an error (usually network connectivity)
      *  and cannot continue until connectivity is restored. If you specify a function here, you are
      *  responsible for informing the user that they should retry.
      */
    var onErrored: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Callback called when a challenge expires and has to be redone by the user.
      */
    var onExpired: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * The API client key
      */
    var sitekey: String
    
    /**
      * This allows you to change the size or do an invisible captcha.
      * @default "normal"
      */
    var size: js.UndefOr[Size] = js.undefined
    
    /**
      * Set the stoken parameter, which allows the captcha to be used from different domains.
      * @see reCAPTCHA secure-token
      */
    var stoken: js.UndefOr[String] = js.undefined
    
    /**
      * The tabindex of the element.
      * @default 0
      */
    var tabindex: js.UndefOr[Double] = js.undefined
    
    /**
      * The theme of the widget.
      * @default "light"
      */
    var theme: js.UndefOr[Theme] = js.undefined
    
    /**
      * The type of initial captcha.
      * @default "image"
      */
    var `type`: js.UndefOr[Type] = js.undefined
  }
  object ReCAPTCHAProps {
    
    inline def apply(sitekey: String): ReCAPTCHAProps = {
      val __obj = js.Dynamic.literal(sitekey = sitekey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReCAPTCHAProps]
    }
    
    extension [Self <: ReCAPTCHAProps](x: Self) {
      
      inline def setBadge(value: Badge): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      inline def setGrecaptcha(value: js.Object): Self = StObject.set(x, "grecaptcha", value.asInstanceOf[js.Any])
      
      inline def setGrecaptchaUndefined: Self = StObject.set(x, "grecaptcha", js.undefined)
      
      inline def setHl(value: String): Self = StObject.set(x, "hl", value.asInstanceOf[js.Any])
      
      inline def setHlUndefined: Self = StObject.set(x, "hl", js.undefined)
      
      inline def setOnChange(value: /* token */ String | Null => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnErrored(value: () => Unit): Self = StObject.set(x, "onErrored", js.Any.fromFunction0(value))
      
      inline def setOnErroredUndefined: Self = StObject.set(x, "onErrored", js.undefined)
      
      inline def setOnExpired(value: () => Unit): Self = StObject.set(x, "onExpired", js.Any.fromFunction0(value))
      
      inline def setOnExpiredUndefined: Self = StObject.set(x, "onExpired", js.undefined)
      
      inline def setSitekey(value: String): Self = StObject.set(x, "sitekey", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStoken(value: String): Self = StObject.set(x, "stoken", value.asInstanceOf[js.Any])
      
      inline def setStokenUndefined: Self = StObject.set(x, "stoken", js.undefined)
      
      inline def setTabindex(value: Double): Self = StObject.set(x, "tabindex", value.asInstanceOf[js.Any])
      
      inline def setTabindexUndefined: Self = StObject.set(x, "tabindex", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.compact
    - typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.normal
    - typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.invisible
  */
  trait Size extends StObject
  object Size {
    
    inline def compact: typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.compact = "compact".asInstanceOf[typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.compact]
    
    inline def invisible: typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.invisible = "invisible".asInstanceOf[typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.invisible]
    
    inline def normal: typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.normal = "normal".asInstanceOf[typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.normal]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.light
    - typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.dark
  */
  trait Theme extends StObject
  object Theme {
    
    inline def dark: typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.dark = "dark".asInstanceOf[typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.dark]
    
    inline def light: typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.light = "light".asInstanceOf[typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.light]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.image
    - typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.audio
  */
  trait Type extends StObject
  object Type {
    
    inline def audio: typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.audio = "audio".asInstanceOf[typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.audio]
    
    inline def image: typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.image = "image".asInstanceOf[typings.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.image]
  }
}
