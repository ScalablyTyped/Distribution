package typings.sidewayAddress.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object email {
  
  @JSImport("@sideway/address", "email")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Analyzes a string to verify it is a valid email address.
    * 
    * @param email - the email address to validate.
    * @param options - optional settings.
    * 
    * @return - undefined when valid, otherwise an object with single error key with a string message value.
    */
  inline def analyze(email: String): Analysis | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("analyze")(email.asInstanceOf[js.Any]).asInstanceOf[Analysis | Null]
  inline def analyze(email: String, options: Options): Analysis | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("analyze")(email.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Analysis | Null]
  
  /**
    * Analyzes a string to verify it is a valid email address.
    * 
    * @param email - the email address to validate.
    * @param options - optional settings.
    * 
    * @return - true when valid, otherwise false.
    */
  inline def isValid(email: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(email.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValid(email: String, options: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(email.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait Options
    extends StObject
       with typings.sidewayAddress.mod.domain.Options {
    
    /**
      * Determines whether to ignore the standards maximum email length limit.
      * 
      * @default false
      */
    val ignoreLength: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setIgnoreLength(value: Boolean): Self = StObject.set(x, "ignoreLength", value.asInstanceOf[js.Any])
      
      inline def setIgnoreLengthUndefined: Self = StObject.set(x, "ignoreLength", js.undefined)
    }
  }
}
