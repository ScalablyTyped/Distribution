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
  def apply(
    format: js.Function1[scala.Double, java.lang.String],
    resolvedOptions: js.Function0[ResolvedNumberFormatOptions]
  ): NumberFormat = {
    val __obj = js.Dynamic.literal(format = format, resolvedOptions = resolvedOptions)
  
    __obj.asInstanceOf[NumberFormat]
  }
}

