package typings.sidewayAddress.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object email {
  
  /**
    * Analyzes a string to verify it is a valid email address.
    * 
    * @param email - the email address to validate.
    * @param options - optional settings.
    * 
    * @return - undefined when valid, otherwise an object with single error key with a string message value.
    */
  @JSImport("@sideway/address", "email.analyze")
  @js.native
  def analyze(email: String): Analysis | Null = js.native
  @JSImport("@sideway/address", "email.analyze")
  @js.native
  def analyze(email: String, options: Options): Analysis | Null = js.native
  
  /**
    * Analyzes a string to verify it is a valid email address.
    * 
    * @param email - the email address to validate.
    * @param options - optional settings.
    * 
    * @return - true when valid, otherwise false.
    */
  @JSImport("@sideway/address", "email.isValid")
  @js.native
  def isValid(email: String): Boolean = js.native
  @JSImport("@sideway/address", "email.isValid")
  @js.native
  def isValid(email: String, options: Options): Boolean = js.native
  
  @js.native
  trait Options
    extends typings.sidewayAddress.mod.domain.Options {
    
    /**
      * Determines whether to ignore the standards maximum email length limit.
      * 
      * @default false
      */
    val ignoreLength: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIgnoreLength(value: Boolean): Self = StObject.set(x, "ignoreLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreLengthUndefined: Self = StObject.set(x, "ignoreLength", js.undefined)
    }
  }
}
