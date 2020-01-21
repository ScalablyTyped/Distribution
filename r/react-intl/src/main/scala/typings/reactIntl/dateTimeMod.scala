package typings.reactIntl

import typings.reactIntl.reactIntlStrings.date
import typings.reactIntl.reactIntlStrings.formats
import typings.reactIntl.reactIntlStrings.locale
import typings.reactIntl.reactIntlStrings.onError
import typings.reactIntl.reactIntlStrings.time
import typings.reactIntl.reactIntlStrings.timeZone
import typings.reactIntl.typesMod.IntlConfig
import typings.std.ConstructorParameters
import typings.std.Intl.DateTimeFormat
import typings.std.Intl.DateTimeFormatPart
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl/lib/formatters/dateTime", JSImport.Namespace)
@js.native
object dateTimeMod extends js.Object {
  def formatDate(
    config: Pick[IntlConfig, locale | formats | onError | timeZone],
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[AnonLocales], DateTimeFormat]
  ): String = js.native
  def formatDate(
    config: Pick[IntlConfig, locale | formats | onError | timeZone],
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[AnonLocales], DateTimeFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[0] */ js.Any
  ): String = js.native
  def formatDate(
    config: Pick[IntlConfig, locale | formats | onError | timeZone],
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[AnonLocales], DateTimeFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[1] */ js.Any
  ): String = js.native
  def formatDateToParts(
    config: Pick[IntlConfig, locale | formats | onError | timeZone],
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[AnonLocales], DateTimeFormat]
  ): js.Array[DateTimeFormatPart] = js.native
  def formatDateToParts(
    config: Pick[IntlConfig, locale | formats | onError | timeZone],
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[AnonLocales], DateTimeFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[0] */ js.Any
  ): js.Array[DateTimeFormatPart] = js.native
  def formatDateToParts(
    config: Pick[IntlConfig, locale | formats | onError | timeZone],
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[AnonLocales], DateTimeFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[1] */ js.Any
  ): js.Array[DateTimeFormatPart] = js.native
  def formatTime(
    config: Pick[IntlConfig, locale | formats | onError | timeZone],
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[AnonLocales], DateTimeFormat]
  ): String = js.native
  def formatTime(
    config: Pick[IntlConfig, locale | formats | onError | timeZone],
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[AnonLocales], DateTimeFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[0] */ js.Any
  ): String = js.native
  def formatTime(
    config: Pick[IntlConfig, locale | formats | onError | timeZone],
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[AnonLocales], DateTimeFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[1] */ js.Any
  ): String = js.native
  def formatTimeToParts(
    config: Pick[IntlConfig, locale | formats | onError | timeZone],
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[AnonLocales], DateTimeFormat]
  ): js.Array[DateTimeFormatPart] = js.native
  def formatTimeToParts(
    config: Pick[IntlConfig, locale | formats | onError | timeZone],
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[AnonLocales], DateTimeFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[0] */ js.Any
  ): js.Array[DateTimeFormatPart] = js.native
  def formatTimeToParts(
    config: Pick[IntlConfig, locale | formats | onError | timeZone],
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[AnonLocales], DateTimeFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[1] */ js.Any
  ): js.Array[DateTimeFormatPart] = js.native
  def getFormatter(
    hasLocaleFormatsOnErrorTimeZone: Pick[IntlConfig, locale | formats | onError | timeZone],
    `type`: date,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[AnonLocales], DateTimeFormat]
  ): DateTimeFormat = js.native
  def getFormatter(
    hasLocaleFormatsOnErrorTimeZone: Pick[IntlConfig, locale | formats | onError | timeZone],
    `type`: date,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[AnonLocales], DateTimeFormat],
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[1] */ js.Any
  ): DateTimeFormat = js.native
  def getFormatter(
    hasLocaleFormatsOnErrorTimeZone: Pick[IntlConfig, locale | formats | onError | timeZone],
    `type`: time,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[AnonLocales], DateTimeFormat]
  ): DateTimeFormat = js.native
  def getFormatter(
    hasLocaleFormatsOnErrorTimeZone: Pick[IntlConfig, locale | formats | onError | timeZone],
    `type`: time,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[AnonLocales], DateTimeFormat],
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[1] */ js.Any
  ): DateTimeFormat = js.native
}

