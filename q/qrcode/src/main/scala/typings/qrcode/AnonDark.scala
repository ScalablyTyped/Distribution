package typings.qrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDark extends js.Object {
  /**
    * Color of dark module. Value must be in hex format (RGBA).
    * Note: dark color should always be darker than color.light.
    * Default: #000000ff
    */
  var dark: js.UndefOr[String] = js.undefined
  /**
    * Color of light module. Value must be in hex format (RGBA).
    * Default: #ffffffff
    */
  var light: js.UndefOr[String] = js.undefined
}

object AnonDark {
  @scala.inline
  def apply(dark: String = null, light: String = null): AnonDark = {
    val __obj = js.Dynamic.literal()
    if (dark != null) __obj.updateDynamic("dark")(dark.asInstanceOf[js.Any])
    if (light != null) __obj.updateDynamic("light")(light.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDark]
  }
}

