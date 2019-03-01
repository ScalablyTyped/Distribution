package typings
package reactDashI18nextLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_I18nLng extends js.Object {
  var i18n: i18nextLib.i18nextMod.i18nextNs.i18n
  var lng: java.lang.String
}

object Anon_I18nLng {
  @scala.inline
  def apply(i18n: i18nextLib.i18nextMod.i18nextNs.i18n, lng: java.lang.String): Anon_I18nLng = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("i18n")(i18n)
    __obj.updateDynamic("lng")(lng)
    __obj.asInstanceOf[Anon_I18nLng]
  }
}

