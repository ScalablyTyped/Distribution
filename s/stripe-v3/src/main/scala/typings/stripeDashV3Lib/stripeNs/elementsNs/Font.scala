package typings
package stripeDashV3Lib.stripeNs.elementsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Font extends js.Object {
  var cssSrc: js.UndefOr[java.lang.String] = js.undefined
  var display: js.UndefOr[java.lang.String] = js.undefined
  var family: js.UndefOr[java.lang.String] = js.undefined
  var src: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[java.lang.String] = js.undefined
  var unicodeRange: js.UndefOr[java.lang.String] = js.undefined
  var weight: js.UndefOr[java.lang.String] = js.undefined
}

object Font {
  @scala.inline
  def apply(
    cssSrc: java.lang.String = null,
    display: java.lang.String = null,
    family: java.lang.String = null,
    src: java.lang.String = null,
    style: java.lang.String = null,
    unicodeRange: java.lang.String = null,
    weight: java.lang.String = null
  ): Font = {
    val __obj = js.Dynamic.literal()
    if (cssSrc != null) __obj.updateDynamic("cssSrc")(cssSrc)
    if (display != null) __obj.updateDynamic("display")(display)
    if (family != null) __obj.updateDynamic("family")(family)
    if (src != null) __obj.updateDynamic("src")(src)
    if (style != null) __obj.updateDynamic("style")(style)
    if (unicodeRange != null) __obj.updateDynamic("unicodeRange")(unicodeRange)
    if (weight != null) __obj.updateDynamic("weight")(weight)
    __obj.asInstanceOf[Font]
  }
}

