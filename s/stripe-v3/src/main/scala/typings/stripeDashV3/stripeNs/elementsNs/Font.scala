package typings.stripeDashV3.stripeNs.elementsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Font extends js.Object {
  var cssSrc: js.UndefOr[String] = js.undefined
  var display: js.UndefOr[String] = js.undefined
  var family: js.UndefOr[String] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[String] = js.undefined
  var unicodeRange: js.UndefOr[String] = js.undefined
  var weight: js.UndefOr[String] = js.undefined
}

object Font {
  @scala.inline
  def apply(
    cssSrc: String = null,
    display: String = null,
    family: String = null,
    src: String = null,
    style: String = null,
    unicodeRange: String = null,
    weight: String = null
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

