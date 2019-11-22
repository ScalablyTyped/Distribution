package typings.reactDashIntl.libTypesMod

import typings.atFormatjsIntlDashListformat.atFormatjsIntlDashListformatMod.default
import typings.reactDashIntl.Anon_Locales
import typings.reactDashIntl.Anon_LocalesOptions
import typings.reactDashIntl.Anon_LocalesOptionsSupportedLocalesOf
import typings.reactDashIntl.TypeofClassIntlListFormat
import typings.reactDashIntl.TypeofClassIntlMessageFormat
import typings.reactDashIntl.TypeofClassIntlRelativeTimeFormat
import typings.std.ConstructorParameters
import typings.std.Intl.DateTimeFormat
import typings.std.Intl.NumberFormat
import typings.std.Intl.PluralRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Formatters extends js.Object {
  def getDateTimeFormat(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.DateTimeFormat> is not an array type */ args: ConstructorParameters[Anon_Locales]
  ): DateTimeFormat
  def getListFormat(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type ConstructorParameters<typeof IntlListFormat> is not an array type */ args: ConstructorParameters[TypeofClassIntlListFormat]
  ): default
  def getMessageFormat(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type ConstructorParameters<typeof IntlMessageFormat> is not an array type */ args: ConstructorParameters[TypeofClassIntlMessageFormat]
  ): typings.intlDashMessageformat.intlDashMessageformatMod.default
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
    getListFormat: ConstructorParameters[TypeofClassIntlListFormat] => default,
    getMessageFormat: ConstructorParameters[TypeofClassIntlMessageFormat] => typings.intlDashMessageformat.intlDashMessageformatMod.default,
    getNumberFormat: ConstructorParameters[Anon_LocalesOptions] => NumberFormat,
    getPluralRules: ConstructorParameters[Anon_LocalesOptionsSupportedLocalesOf] => PluralRules,
    getRelativeTimeFormat: ConstructorParameters[TypeofClassIntlRelativeTimeFormat] => typings.atFormatjsIntlDashRelativetimeformat.atFormatjsIntlDashRelativetimeformatMod.default
  ): Formatters = {
    val __obj = js.Dynamic.literal(getDateTimeFormat = js.Any.fromFunction1(getDateTimeFormat), getListFormat = js.Any.fromFunction1(getListFormat), getMessageFormat = js.Any.fromFunction1(getMessageFormat), getNumberFormat = js.Any.fromFunction1(getNumberFormat), getPluralRules = js.Any.fromFunction1(getPluralRules), getRelativeTimeFormat = js.Any.fromFunction1(getRelativeTimeFormat))
  
    __obj.asInstanceOf[Formatters]
  }
}

