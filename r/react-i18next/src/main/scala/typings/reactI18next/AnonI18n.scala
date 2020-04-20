package typings.reactI18next

import typings.i18next.mod.TFunction
import typings.i18next.mod.i18n
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonI18n extends js.Object {
  var i18n: typings.i18next.mod.i18n
  var ready: Boolean
  var t: TFunction
}

object AnonI18n {
  @scala.inline
  def apply(i18n: i18n, ready: Boolean, t: TFunction): AnonI18n = {
    val __obj = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonI18n]
  }
}

