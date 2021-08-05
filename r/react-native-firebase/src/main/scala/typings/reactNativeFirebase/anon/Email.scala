package typings.reactNativeFirebase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Email extends StObject {
  
  var email: js.UndefOr[String] = js.undefined
  
  var fromEmail: js.UndefOr[String] = js.undefined
}
object Email {
  
  inline def apply(): Email = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Email]
  }
  
  extension [Self <: Email](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setFromEmail(value: String): Self = StObject.set(x, "fromEmail", value.asInstanceOf[js.Any])
    
    inline def setFromEmailUndefined: Self = StObject.set(x, "fromEmail", js.undefined)
  }
}
