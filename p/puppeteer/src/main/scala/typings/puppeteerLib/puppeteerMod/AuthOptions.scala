package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthOptions extends js.Object {
  var password: java.lang.String
  var username: java.lang.String
}

object AuthOptions {
  @scala.inline
  def apply(password: java.lang.String, username: java.lang.String): AuthOptions = {
    val __obj = js.Dynamic.literal(password = password, username = username)
  
    __obj.asInstanceOf[AuthOptions]
  }
}

