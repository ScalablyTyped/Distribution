package typings
package simpleDashOauth2Lib.simpleDashOauth2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordTokenConfig extends js.Object {
  /** A string that represents the registered password. */
  var password: java.lang.String
  /** A string or array of strings that represents the application privileges */
  var scope: java.lang.String | js.Array[java.lang.String]
  /** A string that represents the registered username */
  var username: java.lang.String
}

object PasswordTokenConfig {
  @scala.inline
  def apply(
    password: java.lang.String,
    scope: java.lang.String | js.Array[java.lang.String],
    username: java.lang.String
  ): PasswordTokenConfig = {
    val __obj = js.Dynamic.literal(password = password, scope = scope.asInstanceOf[js.Any], username = username)
  
    __obj.asInstanceOf[PasswordTokenConfig]
  }
}

