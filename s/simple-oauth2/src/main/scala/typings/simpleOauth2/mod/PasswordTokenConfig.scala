package typings.simpleOauth2.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordTokenConfig
  extends /* key */ StringDictionary[js.Any] {
  /** A string that represents the registered password. */
  var password: String
  /** A string or array of strings that represents the application privileges */
  var scope: String | js.Array[String]
  /** A string that represents the registered username */
  var username: String
}

object PasswordTokenConfig {
  @scala.inline
  def apply(
    password: String,
    scope: String | js.Array[String],
    username: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): PasswordTokenConfig = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[PasswordTokenConfig]
  }
}

