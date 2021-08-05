package typings.sparkpost.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Emailrfc822 extends StObject {
  
  var email_rfc822: String
}
object Emailrfc822 {
  
  inline def apply(email_rfc822: String): Emailrfc822 = {
    val __obj = js.Dynamic.literal(email_rfc822 = email_rfc822.asInstanceOf[js.Any])
    __obj.asInstanceOf[Emailrfc822]
  }
  
  extension [Self <: Emailrfc822](x: Self) {
    
    inline def setEmail_rfc822(value: String): Self = StObject.set(x, "email_rfc822", value.asInstanceOf[js.Any])
  }
}
