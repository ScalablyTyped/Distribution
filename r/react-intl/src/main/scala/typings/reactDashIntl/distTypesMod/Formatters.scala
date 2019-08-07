package typings.reactDashIntl.distTypesMod

import typings.intlDashMessageformat.intlDashMessageformatMod.default
import typings.reactDashIntl.Anon_Locales
import typings.reactDashIntl.Anon_LocalesOptions
import typings.reactDashIntl.Anon_LocalesOptionsSupportedLocalesOf
import typings.reactDashIntl.TypeofClassIntlMessageFormat
import typings.reactDashIntl.TypeofClassIntlRelativeTimeFormat
import typings.std.ConstructorParameters
import typings.std.IntlNs.DateTimeFormat
import typings.std.IntlNs.NumberFormat
import typings.std.IntlNs.PluralRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Formatters extends js.Object {
  def getDateTimeFormat(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.DateTimeFormat> is not an array type */ args: ConstructorParameters[Anon_Locales]
  ): DateTimeFormat
  def getMessageFormat(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type ConstructorParameters<typeof IntlMessageFormat> is not an array type */ args: ConstructorParameters[TypeofClassIntlMessageFormat]
  ): default
  def getNumberFormat(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.NumberFormat> is not an array type */ args: ConstructorParameters[Anon_LocalesOptions]
  ): NumberFormat
  def getPluralRules(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.PluralRules> is not an array type */ args: ConstructorParameters[Anon_LocalesOptionsSupportedLocalesOf]
  ): PluralRules
  def getRelativeTimeFormat(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type ConstructorParameters<typeof IntlRelativeTimeFormat> is not an array type */ args: ConstructorParameters[TypeofClassIntlRelativeTimeFormat]
  ): typings.atFormatjsIntlDashRelativetimeformat.atFormatjsIntlDashRelativetimeformatMod.default
}

object Formatters {
  @scala.inline
  def apply(
    getDateTimeFormat: ConstructorParameters[Anon_Locales] => DateTimeFormat,
    getMessageFormat: ConstructorParameters[TypeofClassIntlMessageFormat] => default,
    getNumberFormat: ConstructorParameters[Anon_LocalesOptions] => NumberFormat,
    getPluralRules: ConstructorParameters[Anon_LocalesOptionsSupportedLocalesOf] => PluralRules,
    getRelativeTimeFormat: ConstructorParameters[TypeofClassIntlRelativeTimeFormat] => typings.atFormatjsIntlDashRelativetimeformat.atFormatjsIntlDashRelativetimeformatMod.default
  ): Formatters = {
    val __obj = js.Dynamic.literal(getDateTimeFormat = js.Any.fromFunction1(getDateTimeFormat), getMessageFormat = js.Any.fromFunction1(getMessageFormat), getNumberFormat = js.Any.fromFunction1(getNumberFormat), getPluralRules = js.Any.fromFunction1(getPluralRules), getRelativeTimeFormat = js.Any.fromFunction1(getRelativeTimeFormat))
  
    __obj.asInstanceOf[Formatters]
  }
}

