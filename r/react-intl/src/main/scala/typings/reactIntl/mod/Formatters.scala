package typings.reactIntl.mod

import typings.formatjsIntlListformat.mod.default
import typings.reactIntl.AnonCall
import typings.reactIntl.AnonInstantiable
import typings.reactIntl.AnonSupportedLocalesOf
import typings.reactIntl.TypeofIntlListFormat
import typings.reactIntl.TypeofIntlMessageFormat
import typings.reactIntl.TypeofIntlRelativeTimeFor
import typings.std.ConstructorParameters
import typings.std.Intl.DateTimeFormat
import typings.std.Intl.NumberFormat
import typings.std.Intl.PluralRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Formatters extends js.Object {
  def getDateTimeFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.DateTimeFormat> is not an array type */ args: ConstructorParameters[AnonCall]
  ): DateTimeFormat
  def getDisplayNames(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof DisplayNames> is not an array type */ args: ConstructorParameters[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DisplayNames */ _
    ]
  ): js.Any
  def getListFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof IntlListFormat> is not an array type */ args: ConstructorParameters[TypeofIntlListFormat]
  ): default
  def getMessageFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof IntlMessageFormat> is not an array type */ args: ConstructorParameters[TypeofIntlMessageFormat]
  ): typings.intlMessageformat.mod.default
  def getNumberFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.NumberFormat> is not an array type */ args: ConstructorParameters[AnonInstantiable]
  ): NumberFormat
  def getPluralRules(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.PluralRules> is not an array type */ args: ConstructorParameters[AnonSupportedLocalesOf]
  ): PluralRules
  def getRelativeTimeFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof IntlRelativeTimeFormat> is not an array type */ args: ConstructorParameters[TypeofIntlRelativeTimeFor]
  ): typings.formatjsIntlRelativetimeformat.mod.default
}

object Formatters {
  @scala.inline
  def apply(
    getDateTimeFormat: ConstructorParameters[AnonCall] => DateTimeFormat,
    getDisplayNames: ConstructorParameters[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DisplayNames */ _
    ] => js.Any,
    getListFormat: ConstructorParameters[TypeofIntlListFormat] => default,
    getMessageFormat: ConstructorParameters[TypeofIntlMessageFormat] => typings.intlMessageformat.mod.default,
    getNumberFormat: ConstructorParameters[AnonInstantiable] => NumberFormat,
    getPluralRules: ConstructorParameters[AnonSupportedLocalesOf] => PluralRules,
    getRelativeTimeFormat: ConstructorParameters[TypeofIntlRelativeTimeFor] => typings.formatjsIntlRelativetimeformat.mod.default
  ): Formatters = {
    val __obj = js.Dynamic.literal(getDateTimeFormat = js.Any.fromFunction1(getDateTimeFormat), getDisplayNames = js.Any.fromFunction1(getDisplayNames), getListFormat = js.Any.fromFunction1(getListFormat), getMessageFormat = js.Any.fromFunction1(getMessageFormat), getNumberFormat = js.Any.fromFunction1(getNumberFormat), getPluralRules = js.Any.fromFunction1(getPluralRules), getRelativeTimeFormat = js.Any.fromFunction1(getRelativeTimeFormat))
  
    __obj.asInstanceOf[Formatters]
  }
}

