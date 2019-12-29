package typings.stripeDashV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Token extends js.Object {
  /*
    * Converts the provided token into a PaymentMethod to use for
    * confirmation.
    */
  var token: String
}

object Anon_Token {
  @scala.inline
  def apply(token: String): Anon_Token = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Token]
  }
}

