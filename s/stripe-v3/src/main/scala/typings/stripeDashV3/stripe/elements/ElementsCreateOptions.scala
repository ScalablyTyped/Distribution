package typings.stripeDashV3.stripe.elements

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementsCreateOptions extends js.Object {
  var fonts: js.UndefOr[js.Array[Font]] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
}

object ElementsCreateOptions {
  @scala.inline
  def apply(fonts: js.Array[Font] = null, locale: String = null): ElementsCreateOptions = {
    val __obj = js.Dynamic.literal()
    if (fonts != null) __obj.updateDynamic("fonts")(fonts)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    __obj.asInstanceOf[ElementsCreateOptions]
  }
}

