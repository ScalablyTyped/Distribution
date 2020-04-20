package typings.reactI18next

import typings.i18next.mod.i18n
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLng extends js.Object {
  var i18n: typings.i18next.mod.i18n
  var lng: String
}

object AnonLng {
  @scala.inline
  def apply(i18n: i18n, lng: String): AnonLng = {
    val __obj = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLng]
  }
}

