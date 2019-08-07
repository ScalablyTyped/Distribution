package typings.reactDashIntl

import typings.atFormatjsIntlDashRelativetimeformat.distCoreMod.IntlRelativeTimeFormatOptions
import typings.intlDashMessageformat.libCoreMod.Options
import typings.intlDashMessageformat.libFormattersMod.Formats
import typings.intlDashMessageformatDashParser.libTypesMod.MessageFormatElement
import typings.std.IntlNs.DateTimeFormatOptions
import typings.std.IntlNs.NumberFormatOptions
import typings.std.IntlNs.PluralRulesOptions
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_00 extends js.Object {
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
  def getRelativeTimeFormat(): js.Any = js.native
  def getRelativeTimeFormat(__0_0: js.UndefOr[scala.Nothing], __0_1: IntlRelativeTimeFormatOptions): js.Any = js.native
  def getRelativeTimeFormat(__0_0: String): js.Any = js.native
  def getRelativeTimeFormat(__0_0: String, __0_1: IntlRelativeTimeFormatOptions): js.Any = js.native
  def getRelativeTimeFormat(__0_0: js.Array[String]): js.Any = js.native
  def getRelativeTimeFormat(__0_0: js.Array[String], __0_1: IntlRelativeTimeFormatOptions): js.Any = js.native
}

