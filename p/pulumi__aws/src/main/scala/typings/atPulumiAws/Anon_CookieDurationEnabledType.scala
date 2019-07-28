package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CookieDurationEnabledType extends js.Object {
  var cookieDuration: js.UndefOr[Input[Double]] = js.undefined
  var enabled: js.UndefOr[Input[Boolean]] = js.undefined
  var `type`: Input[String]
}

object Anon_CookieDurationEnabledType {
  @scala.inline
  def apply(`type`: Input[String], cookieDuration: Input[Double] = null, enabled: Input[Boolean] = null): Anon_CookieDurationEnabledType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (cookieDuration != null) __obj.updateDynamic("cookieDuration")(cookieDuration.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CookieDurationEnabledType]
  }
}

