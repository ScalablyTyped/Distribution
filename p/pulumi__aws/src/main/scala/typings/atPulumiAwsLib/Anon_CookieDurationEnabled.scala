package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CookieDurationEnabled extends js.Object {
  var cookieDuration: js.UndefOr[scala.Double] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: java.lang.String
}

object Anon_CookieDurationEnabled {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    cookieDuration: scala.Int | scala.Double = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_CookieDurationEnabled = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (cookieDuration != null) __obj.updateDynamic("cookieDuration")(cookieDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[Anon_CookieDurationEnabled]
  }
}

