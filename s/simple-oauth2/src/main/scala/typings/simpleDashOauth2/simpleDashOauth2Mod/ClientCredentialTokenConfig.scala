package typings.simpleDashOauth2.simpleDashOauth2Mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientCredentialTokenConfig
  extends /* key */ StringDictionary[js.Any] {
  /** A string that represents the application privileges */
  var scope: js.UndefOr[String | js.Array[String]] = js.undefined
}

object ClientCredentialTokenConfig {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    scope: String | js.Array[String] = null
  ): ClientCredentialTokenConfig = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientCredentialTokenConfig]
  }
}

