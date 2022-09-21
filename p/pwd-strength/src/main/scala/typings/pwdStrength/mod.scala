package typings.pwdStrength

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(password: String): PwdStrengthReturn = ^.asInstanceOf[js.Dynamic].apply(password.asInstanceOf[js.Any]).asInstanceOf[PwdStrengthReturn]
  inline def apply(password: String, options: PwdStrengthOptions): PwdStrengthReturn = (^.asInstanceOf[js.Dynamic].apply(password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PwdStrengthReturn]
  
  @JSImport("pwd-strength", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait PwdStrengthColorOptions extends StObject {
    
    var average: js.UndefOr[String] = js.undefined
    
    var error: js.UndefOr[String] = js.undefined
    
    var secure: js.UndefOr[String] = js.undefined
    
    var strong: js.UndefOr[String] = js.undefined
    
    var weak: js.UndefOr[String] = js.undefined
  }
  object PwdStrengthColorOptions {
    
    inline def apply(): PwdStrengthColorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PwdStrengthColorOptions]
    }
    
    extension [Self <: PwdStrengthColorOptions](x: Self) {
      
      inline def setAverage(value: String): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
      
      inline def setAverageUndefined: Self = StObject.set(x, "average", js.undefined)
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setSecure(value: String): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setStrong(value: String): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
      
      inline def setStrongUndefined: Self = StObject.set(x, "strong", js.undefined)
      
      inline def setWeak(value: String): Self = StObject.set(x, "weak", value.asInstanceOf[js.Any])
      
      inline def setWeakUndefined: Self = StObject.set(x, "weak", js.undefined)
    }
  }
  
  trait PwdStrengthLanguageOptions extends StObject {
    
    var average: js.UndefOr[String] = js.undefined
    
    var maxConsecutiveRepeatingChars: js.UndefOr[String] = js.undefined
    
    var minLowerChar: js.UndefOr[String] = js.undefined
    
    var minLowerChars: js.UndefOr[String] = js.undefined
    
    var minPasswordChar: js.UndefOr[String] = js.undefined
    
    var minPasswordChars: js.UndefOr[String] = js.undefined
    
    var minSpecialChar: js.UndefOr[String] = js.undefined
    
    var minSpecialChars: js.UndefOr[String] = js.undefined
    
    var minUpperChar: js.UndefOr[String] = js.undefined
    
    var minUpperChars: js.UndefOr[String] = js.undefined
    
    var secure: js.UndefOr[String] = js.undefined
    
    var strong: js.UndefOr[String] = js.undefined
    
    var weak: js.UndefOr[String] = js.undefined
  }
  object PwdStrengthLanguageOptions {
    
    inline def apply(): PwdStrengthLanguageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PwdStrengthLanguageOptions]
    }
    
    extension [Self <: PwdStrengthLanguageOptions](x: Self) {
      
      inline def setAverage(value: String): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
      
      inline def setAverageUndefined: Self = StObject.set(x, "average", js.undefined)
      
      inline def setMaxConsecutiveRepeatingChars(value: String): Self = StObject.set(x, "maxConsecutiveRepeatingChars", value.asInstanceOf[js.Any])
      
      inline def setMaxConsecutiveRepeatingCharsUndefined: Self = StObject.set(x, "maxConsecutiveRepeatingChars", js.undefined)
      
      inline def setMinLowerChar(value: String): Self = StObject.set(x, "minLowerChar", value.asInstanceOf[js.Any])
      
      inline def setMinLowerCharUndefined: Self = StObject.set(x, "minLowerChar", js.undefined)
      
      inline def setMinLowerChars(value: String): Self = StObject.set(x, "minLowerChars", value.asInstanceOf[js.Any])
      
      inline def setMinLowerCharsUndefined: Self = StObject.set(x, "minLowerChars", js.undefined)
      
      inline def setMinPasswordChar(value: String): Self = StObject.set(x, "minPasswordChar", value.asInstanceOf[js.Any])
      
      inline def setMinPasswordCharUndefined: Self = StObject.set(x, "minPasswordChar", js.undefined)
      
      inline def setMinPasswordChars(value: String): Self = StObject.set(x, "minPasswordChars", value.asInstanceOf[js.Any])
      
      inline def setMinPasswordCharsUndefined: Self = StObject.set(x, "minPasswordChars", js.undefined)
      
      inline def setMinSpecialChar(value: String): Self = StObject.set(x, "minSpecialChar", value.asInstanceOf[js.Any])
      
      inline def setMinSpecialCharUndefined: Self = StObject.set(x, "minSpecialChar", js.undefined)
      
      inline def setMinSpecialChars(value: String): Self = StObject.set(x, "minSpecialChars", value.asInstanceOf[js.Any])
      
      inline def setMinSpecialCharsUndefined: Self = StObject.set(x, "minSpecialChars", js.undefined)
      
      inline def setMinUpperChar(value: String): Self = StObject.set(x, "minUpperChar", value.asInstanceOf[js.Any])
      
      inline def setMinUpperCharUndefined: Self = StObject.set(x, "minUpperChar", js.undefined)
      
      inline def setMinUpperChars(value: String): Self = StObject.set(x, "minUpperChars", value.asInstanceOf[js.Any])
      
      inline def setMinUpperCharsUndefined: Self = StObject.set(x, "minUpperChars", js.undefined)
      
      inline def setSecure(value: String): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setStrong(value: String): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
      
      inline def setStrongUndefined: Self = StObject.set(x, "strong", js.undefined)
      
      inline def setWeak(value: String): Self = StObject.set(x, "weak", value.asInstanceOf[js.Any])
      
      inline def setWeakUndefined: Self = StObject.set(x, "weak", js.undefined)
    }
  }
  
  trait PwdStrengthOptions extends StObject {
    
    var color: js.UndefOr[PwdStrengthColorOptions] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var lang: js.UndefOr[PwdStrengthLanguageOptions] = js.undefined
    
    var maxConsecutiveRepeatingChars: js.UndefOr[Double] = js.undefined
    
    var minLowerChars: js.UndefOr[Double] = js.undefined
    
    var minNumberChars: js.UndefOr[Double] = js.undefined
    
    var minPasswordLength: js.UndefOr[Double] = js.undefined
    
    var minSpecialChars: js.UndefOr[Double] = js.undefined
    
    var minUpperChars: js.UndefOr[Double] = js.undefined
  }
  object PwdStrengthOptions {
    
    inline def apply(): PwdStrengthOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PwdStrengthOptions]
    }
    
    extension [Self <: PwdStrengthOptions](x: Self) {
      
      inline def setColor(value: PwdStrengthColorOptions): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setLang(value: PwdStrengthLanguageOptions): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setMaxConsecutiveRepeatingChars(value: Double): Self = StObject.set(x, "maxConsecutiveRepeatingChars", value.asInstanceOf[js.Any])
      
      inline def setMaxConsecutiveRepeatingCharsUndefined: Self = StObject.set(x, "maxConsecutiveRepeatingChars", js.undefined)
      
      inline def setMinLowerChars(value: Double): Self = StObject.set(x, "minLowerChars", value.asInstanceOf[js.Any])
      
      inline def setMinLowerCharsUndefined: Self = StObject.set(x, "minLowerChars", js.undefined)
      
      inline def setMinNumberChars(value: Double): Self = StObject.set(x, "minNumberChars", value.asInstanceOf[js.Any])
      
      inline def setMinNumberCharsUndefined: Self = StObject.set(x, "minNumberChars", js.undefined)
      
      inline def setMinPasswordLength(value: Double): Self = StObject.set(x, "minPasswordLength", value.asInstanceOf[js.Any])
      
      inline def setMinPasswordLengthUndefined: Self = StObject.set(x, "minPasswordLength", js.undefined)
      
      inline def setMinSpecialChars(value: Double): Self = StObject.set(x, "minSpecialChars", value.asInstanceOf[js.Any])
      
      inline def setMinSpecialCharsUndefined: Self = StObject.set(x, "minSpecialChars", js.undefined)
      
      inline def setMinUpperChars(value: Double): Self = StObject.set(x, "minUpperChars", value.asInstanceOf[js.Any])
      
      inline def setMinUpperCharsUndefined: Self = StObject.set(x, "minUpperChars", js.undefined)
    }
  }
  
  trait PwdStrengthReturn extends StObject {
    
    var color: String
    
    var key: String
    
    var message: String
    
    var success: Boolean
  }
  object PwdStrengthReturn {
    
    inline def apply(color: String, key: String, message: String, success: Boolean): PwdStrengthReturn = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[PwdStrengthReturn]
    }
    
    extension [Self <: PwdStrengthReturn](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
}
