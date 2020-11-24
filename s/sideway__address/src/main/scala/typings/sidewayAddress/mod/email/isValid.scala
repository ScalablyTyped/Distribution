package typings.sidewayAddress.mod.email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sideway/address", "email.isValid")
@js.native
object isValid extends js.Object {
  
  /**
    * Analyzes a string to verify it is a valid email address.
    * 
    * @param email - the email address to validate.
    * @param options - optional settings.
    * 
    * @return - true when valid, otherwise false.
    */
  def apply(email: String): Boolean = js.native
  def apply(email: String, options: Options): Boolean = js.native
}
