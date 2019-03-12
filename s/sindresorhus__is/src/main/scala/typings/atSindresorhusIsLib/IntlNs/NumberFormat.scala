package typings
package atSindresorhusIsLib.IntlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberFormat extends js.Object {
  def format(value: scala.Double): java.lang.String
  def resolvedOptions(): ResolvedNumberFormatOptions
}

object NumberFormat {
  @scala.inline
  def apply(format: scala.Double => java.lang.String, resolvedOptions: () => ResolvedNumberFormatOptions): NumberFormat = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), resolvedOptions = js.Any.fromFunction0(resolvedOptions))
  
    __obj.asInstanceOf[NumberFormat]
  }
}

