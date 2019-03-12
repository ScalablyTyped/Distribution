package typings
package atSindresorhusIsLib.IntlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collator extends js.Object {
  def compare(x: java.lang.String, y: java.lang.String): scala.Double
  def resolvedOptions(): ResolvedCollatorOptions
}

object Collator {
  @scala.inline
  def apply(
    compare: (java.lang.String, java.lang.String) => scala.Double,
    resolvedOptions: () => ResolvedCollatorOptions
  ): Collator = {
    val __obj = js.Dynamic.literal(compare = js.Any.fromFunction2(compare), resolvedOptions = js.Any.fromFunction0(resolvedOptions))
  
    __obj.asInstanceOf[Collator]
  }
}

