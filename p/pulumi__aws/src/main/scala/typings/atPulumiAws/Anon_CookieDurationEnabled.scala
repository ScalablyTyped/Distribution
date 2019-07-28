package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CookieDurationEnabled extends js.Object {
  var cookieDuration: js.UndefOr[Double] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var `type`: String
}

object Anon_CookieDurationEnabled {
  @scala.inline
  def apply(`type`: String, cookieDuration: Int | Double = null, enabled: js.UndefOr[Boolean] = js.undefined): Anon_CookieDurationEnabled = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (cookieDuration != null) __obj.updateDynamic("cookieDuration")(cookieDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[Anon_CookieDurationEnabled]
  }
}

