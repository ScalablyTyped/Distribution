package typings
package qrcodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dark extends js.Object {
  /**
    * Color of dark module. Value must be in hex format (RGBA).
    * Note: dark color should always be darker than color.light.
    * Default: #000000ff
    */
  var dark: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Color of light module. Value must be in hex format (RGBA).
    * Default: #ffffffff
    */
  var light: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Dark {
  @scala.inline
  def apply(dark: java.lang.String = null, light: java.lang.String = null): Anon_Dark = {
    val __obj = js.Dynamic.literal()
    if (dark != null) __obj.updateDynamic("dark")(dark)
    if (light != null) __obj.updateDynamic("light")(light)
    __obj.asInstanceOf[Anon_Dark]
  }
}

