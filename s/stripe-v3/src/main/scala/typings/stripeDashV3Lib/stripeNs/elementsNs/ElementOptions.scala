package typings
package stripeDashV3Lib.stripeNs.elementsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementOptions extends js.Object {
  var fonts: js.UndefOr[js.Array[Font]] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
}

object ElementOptions {
  @scala.inline
  def apply(fonts: js.Array[Font] = null, locale: java.lang.String = null): ElementOptions = {
    val __obj = js.Dynamic.literal()
    if (fonts != null) __obj.updateDynamic("fonts")(fonts)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    __obj.asInstanceOf[ElementOptions]
  }
}

