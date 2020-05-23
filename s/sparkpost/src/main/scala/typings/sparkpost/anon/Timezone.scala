package typings.sparkpost.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timezone extends js.Object {
  var timezone: js.UndefOr[String] = js.undefined
}

object Timezone {
  @scala.inline
  def apply(timezone: String = null): Timezone = {
    val __obj = js.Dynamic.literal()
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timezone]
  }
}

