package typings.reactDashI18next

import typings.i18next.i18nextMod.TFunction
import typings.i18next.i18nextMod.i18n
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_I18n extends js.Object {
  var i18n: typings.i18next.i18nextMod.i18n
  var ready: Boolean
  var t: TFunction
}

object Anon_I18n {
  @scala.inline
  def apply(i18n: i18n, ready: Boolean, t: TFunction): Anon_I18n = {
    val __obj = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_I18n]
  }
}

