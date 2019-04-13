package typings
package reactDashI18nextLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_I18n extends js.Object {
  var i18n: i18nextLib.i18nextMod.i18n
  var ready: scala.Boolean
  var t: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify i18next.TFunction */ js.Any
}

object Anon_I18n {
  @scala.inline
  def apply(
    i18n: i18nextLib.i18nextMod.i18n,
    ready: scala.Boolean,
    t: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify i18next.TFunction */ js.Any
  ): Anon_I18n = {
    val __obj = js.Dynamic.literal(i18n = i18n, ready = ready, t = t)
  
    __obj.asInstanceOf[Anon_I18n]
  }
}

