package typings.reactIntl.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Exclude<@formatjs/intl-listformat.@formatjs/intl-listformat.IntlListFormatOptions, 'localeMatcher'> */
/* Rewritten from type alias, can be one of: 
  - typings.reactIntl.reactIntlStrings.`type`
  - typings.reactIntl.reactIntlStrings.style
*/
trait FormatListOptions extends js.Object

object FormatListOptions {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def style: typings.reactIntl.reactIntlStrings.style = this.cast("style")
  @scala.inline
  def `type`: typings.reactIntl.reactIntlStrings.`type` = this.cast("type")
}

