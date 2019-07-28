package typings.simpleDashOauth2.simpleDashOauth2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordTokenConfig extends js.Object {
  /** A string that represents the registered password. */
  var password: String
  /** A string or array of strings that represents the application privileges */
  var scope: String | js.Array[String]
  /** A string that represents the registered username */
  var username: String
}

object PasswordTokenConfig {
  @scala.inline
  def apply(password: String, scope: String | js.Array[String], username: String): PasswordTokenConfig = {
    val __obj = js.Dynamic.literal(password = password, scope = scope.asInstanceOf[js.Any], username = username)
  
    __obj.asInstanceOf[PasswordTokenConfig]
  }
}

