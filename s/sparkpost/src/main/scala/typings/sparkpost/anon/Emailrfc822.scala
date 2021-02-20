package typings.sparkpost.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Emailrfc822 extends StObject {
  
  var email_rfc822: String = js.native
}
object Emailrfc822 {
  
  @scala.inline
  def apply(email_rfc822: String): Emailrfc822 = {
    val __obj = js.Dynamic.literal(email_rfc822 = email_rfc822.asInstanceOf[js.Any])
    __obj.asInstanceOf[Emailrfc822]
  }
  
  @scala.inline
  implicit class Emailrfc822MutableBuilder[Self <: Emailrfc822] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail_rfc822(value: String): Self = StObject.set(x, "email_rfc822", value.asInstanceOf[js.Any])
  }
}
