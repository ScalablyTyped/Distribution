package typings.reactDashI18next

import typings.i18next.i18nextMod.i18n
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_I18n extends js.Object {
  var i18n: typings.i18next.i18nextMod.i18n
  var ready: Boolean
  var t: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify i18next.TFunction */ js.Any
}

object Anon_I18n {
  @scala.inline
  def apply(
    i18n: i18n,
    ready: Boolean,
    t: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify i18next.TFunction */ js.Any
  ): Anon_I18n = {
    val __obj = js.Dynamic.literal(i18n = i18n, ready = ready, t = t)
  
    __obj.asInstanceOf[Anon_I18n]
  }
}

