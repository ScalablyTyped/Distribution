package typings.reactIntl.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomFormatConfig extends js.Object {
  var format: js.UndefOr[String] = js.undefined
}

object CustomFormatConfig {
  @scala.inline
  def apply(format: String = null): CustomFormatConfig = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomFormatConfig]
  }
}

