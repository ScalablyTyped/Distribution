package typings.reactIntl.mod

import typings.formatjsIntlListformat.mod.default
import typings.reactIntl.AnonLocales
import typings.reactIntl.AnonLocalesOptions
import typings.reactIntl.AnonLocalesOptionsSupportedLocalesOf
import typings.reactIntl.TypeofClassIntlListFormat
import typings.reactIntl.TypeofClassIntlMessageFormat
import typings.reactIntl.TypeofClassIntlRelativeTimeFormat
import typings.std.ConstructorParameters
import typings.std.Intl.DateTimeFormat
import typings.std.Intl.NumberFormat
import typings.std.Intl.PluralRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Formatters extends js.Object {
  def getDateTimeFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.DateTimeFormat> is not an array type */ args: ConstructorParameters[AnonLocales]
  ): DateTimeFormat
  def getListFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof IntlListFormat> is not an array type */ args: ConstructorParameters[TypeofClassIntlListFormat]
  ): default
  def getMessageFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof IntlMessageFormat> is not an array type */ args: ConstructorParameters[TypeofClassIntlMessageFormat]
  ): typings.intlMessageformat.mod.default
  def getNumberFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.NumberFormat> is not an array type */ args: ConstructorParameters[AnonLocalesOptions]
  ): NumberFormat
  def getPluralRules(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.PluralRules> is not an array type */ args: ConstructorParameters[AnonLocalesOptionsSupportedLocalesOf]
  ): PluralRules
  def getRelativeTimeFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof IntlRelativeTimeFormat> is not an array type */ args: ConstructorParameters[TypeofClassIntlRelativeTimeFormat]
  ): typings.formatjsIntlRelativetimeformat.mod.default
}

object Formatters {
  @scala.inline
  def apply(
    getDateTimeFormat: ConstructorParameters[AnonLocales] => DateTimeFormat,
    getListFormat: ConstructorParameters[TypeofClassIntlListFormat] => default,
    getMessageFormat: ConstructorParameters[TypeofClassIntlMessageFormat] => typings.intlMessageformat.mod.default,
    getNumberFormat: ConstructorParameters[AnonLocalesOptions] => NumberFormat,
    getPluralRules: ConstructorParameters[AnonLocalesOptionsSupportedLocalesOf] => PluralRules,
    getRelativeTimeFormat: ConstructorParameters[TypeofClassIntlRelativeTimeFormat] => typings.formatjsIntlRelativetimeformat.mod.default
  ): Formatters = {
    val __obj = js.Dynamic.literal(getDateTimeFormat = js.Any.fromFunction1(getDateTimeFormat), getListFormat = js.Any.fromFunction1(getListFormat), getMessageFormat = js.Any.fromFunction1(getMessageFormat), getNumberFormat = js.Any.fromFunction1(getNumberFormat), getPluralRules = js.Any.fromFunction1(getPluralRules), getRelativeTimeFormat = js.Any.fromFunction1(getRelativeTimeFormat))
  
    __obj.asInstanceOf[Formatters]
  }
}

