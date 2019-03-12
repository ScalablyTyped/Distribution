package typings
package stdLib.IntlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluralRules extends js.Object {
  def resolvedOptions(): ResolvedPluralRulesOptions
  def select(n: scala.Double): java.lang.String
}

object PluralRules {
  @scala.inline
  def apply(resolvedOptions: () => ResolvedPluralRulesOptions, select: scala.Double => java.lang.String): PluralRules = {
    val __obj = js.Dynamic.literal(resolvedOptions = js.Any.fromFunction0(resolvedOptions), select = js.Any.fromFunction1(select))
  
    __obj.asInstanceOf[PluralRules]
  }
}

