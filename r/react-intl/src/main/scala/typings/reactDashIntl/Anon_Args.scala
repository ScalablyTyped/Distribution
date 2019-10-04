package typings.reactDashIntl

import typings.intlDashMessageformat.distCoreMod.Options
import typings.intlDashMessageformat.distFormattersMod.Formats
import typings.intlDashMessageformatDashParser.distTypesMod.MessageFormatElement
import typings.std.IntlNs.DateTimeFormatOptions
import typings.std.IntlNs.NumberFormatOptions
import typings.std.IntlNs.PluralRulesOptions
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Args extends js.Object {
  def getDateTimeFormat(): js.Any = js.native
  def getDateTimeFormat(locales: js.UndefOr[scala.Nothing], options: DateTimeFormatOptions): js.Any = js.native
  def getDateTimeFormat(locales: String): js.Any = js.native
  def getDateTimeFormat(locales: String, options: DateTimeFormatOptions): js.Any = js.native
  def getDateTimeFormat(locales: js.Array[String]): js.Any = js.native
  def getDateTimeFormat(locales: js.Array[String], options: DateTimeFormatOptions): js.Any = js.native
  def getMessageFormat(message: String | js.Array[MessageFormatElement]): js.Any = js.native
  def getMessageFormat(message: String | js.Array[MessageFormatElement], locales: String | js.Array[String]): js.Any = js.native
  def getMessageFormat(
    message: String | js.Array[MessageFormatElement],
    locales: String | js.Array[String],
    overrideFormats: Partial[Formats]
  ): js.Any = js.native
  def getMessageFormat(
    message: String | js.Array[MessageFormatElement],
    locales: String | js.Array[String],
    overrideFormats: Partial[Formats],
    opts: Options
  ): js.Any = js.native
  def getNumberFormat(): js.Any = js.native
  def getNumberFormat(locales: js.UndefOr[scala.Nothing], options: NumberFormatOptions): js.Any = js.native
  def getNumberFormat(locales: String): js.Any = js.native
  def getNumberFormat(locales: String, options: NumberFormatOptions): js.Any = js.native
  def getNumberFormat(locales: js.Array[String]): js.Any = js.native
  def getNumberFormat(locales: js.Array[String], options: NumberFormatOptions): js.Any = js.native
  def getPluralRules(): js.Any = js.native
  def getPluralRules(locales: js.UndefOr[scala.Nothing], options: PluralRulesOptions): js.Any = js.native
  def getPluralRules(locales: String): js.Any = js.native
  def getPluralRules(locales: String, options: PluralRulesOptions): js.Any = js.native
  def getPluralRules(locales: js.Array[String]): js.Any = js.native
  def getPluralRules(locales: js.Array[String], options: PluralRulesOptions): js.Any = js.native
  def getRelativeTimeFormat(args: js.Any*): js.Any = js.native
}

