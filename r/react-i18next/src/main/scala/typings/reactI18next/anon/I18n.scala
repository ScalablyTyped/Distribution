package typings.reactI18next.anon

import typings.i18next.mod.TFunction
import typings.i18next.mod.i18n
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18n extends js.Object {
  var i18n: typings.i18next.mod.i18n
  var ready: Boolean
  var t: TFunction
}

object I18n {
  @scala.inline
  def apply(i18n: i18n, ready: Boolean, t: TFunction): I18n = {
    val __obj = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18n]
  }
}

