package typings.sidewayAddress

import typings.sidewayAddress.domainMod.Analysis
import typings.sidewayAddress.domainMod.DomainOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emailMod {
  
  @JSImport("@sideway/address/dist/email", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def analyzeEmail(email: String): Analysis | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("analyzeEmail")(email.asInstanceOf[js.Any]).asInstanceOf[Analysis | Null]
  inline def analyzeEmail(email: String, options: EmailOptions): Analysis | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("analyzeEmail")(email.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Analysis | Null]
  
  inline def isEmailValid(email: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmailValid")(email.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isEmailValid(email: String, options: EmailOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEmailValid")(email.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait EmailOptions
    extends StObject
       with DomainOptions {
    
    /**
      * Determines whether to ignore the standards maximum email length limit.
      *
      * @default false
      */
    val ignoreLength: js.UndefOr[Boolean] = js.undefined
  }
  object EmailOptions {
    
    inline def apply(): EmailOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmailOptions]
    }
    
    extension [Self <: EmailOptions](x: Self) {
      
      inline def setIgnoreLength(value: Boolean): Self = StObject.set(x, "ignoreLength", value.asInstanceOf[js.Any])
      
      inline def setIgnoreLengthUndefined: Self = StObject.set(x, "ignoreLength", js.undefined)
    }
  }
}
