package typings.reactDashIntl

import typings.reactDashIntl.libTypesMod.IntlConfig
import typings.reactDashIntl.reactDashIntlStrings.date
import typings.reactDashIntl.reactDashIntlStrings.formats
import typings.reactDashIntl.reactDashIntlStrings.locale
import typings.reactDashIntl.reactDashIntlStrings.onError
import typings.reactDashIntl.reactDashIntlStrings.time
import typings.reactDashIntl.reactDashIntlStrings.timeZone
import typings.std.ConstructorParameters
import typings.std.Intl.DateTimeFormat
import typings.std.Intl.DateTimeFormatPart
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl/lib/formatters/dateTime", JSImport.Namespace)
@js.native
object libFormattersDateTimeMod extends js.Object {
  def formatDate(
    config: Pick[IntlConfig, locale | formats | onError | timeZone],
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Anon_Locales], DateTimeFormat]
  ): String = js.native
  def formatDate(
    config: Pick[IntlConfig, locale | formats | onError | timeZone],
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Anon_Locales], DateTimeFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[0] */ js.Any
  ): String = js.native
  def formatDate(
    config: Pick[IntlConfig, locale | formats | onError | timeZone],
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Anon_Locales], DateTimeFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[1] */ js.Any
  ): String = js.native
  def formatDateToParts(
    config: Pick[IntlConfig, locale | formats | onError | timeZone],
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Anon_Locales], DateTimeFormat]
  ): js.Array[DateTimeFormatPart] = js.native
  def formatDateToParts(
    config: Pick[IntlConfig, locale | formats | onError | timeZone],
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Anon_Locales], DateTimeFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[0] */ js.Any
  ): js.Array[DateTimeFormatPart] = js.native
  def formatDateToParts(
    config: Pick[IntlConfig, locale | formats | onError | timeZone],
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Anon_Locales], DateTimeFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[1] */ js.Any
  ): js.Array[DateTimeFormatPart] = js.native
  def formatTime(
    config: Pick[IntlConfig, locale | formats | onError | timeZone],
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Anon_Locales], DateTimeFormat]
  ): String = js.native
  def formatTime(
    config: Pick[IntlConfig, locale | formats | onError | timeZone],
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Anon_Locales], DateTimeFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[0] */ js.Any
  ): String = js.native
  def formatTime(
    config: Pick[IntlConfig, locale | formats | onError | timeZone],
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Anon_Locales], DateTimeFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[1] */ js.Any
  ): String = js.native
  def formatTimeToParts(
    config: Pick[IntlConfig, locale | formats | onError | timeZone],
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Anon_Locales], DateTimeFormat]
  ): js.Array[DateTimeFormatPart] = js.native
  def formatTimeToParts(
    config: Pick[IntlConfig, locale | formats | onError | timeZone],
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Anon_Locales], DateTimeFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[0] */ js.Any
  ): js.Array[DateTimeFormatPart] = js.native
  def formatTimeToParts(
    config: Pick[IntlConfig, locale | formats | onError | timeZone],
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Anon_Locales], DateTimeFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[1] */ js.Any
  ): js.Array[DateTimeFormatPart] = js.native
  def getFormatter(
    hasLocaleFormatsOnErrorTimeZone: Pick[IntlConfig, locale | formats | onError | timeZone],
    `type`: date,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Anon_Locales], DateTimeFormat]
  ): DateTimeFormat = js.native
  def getFormatter(
    hasLocaleFormatsOnErrorTimeZone: Pick[IntlConfig, locale | formats | onError | timeZone],
    `type`: date,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Anon_Locales], DateTimeFormat],
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[1] */ js.Any
  ): DateTimeFormat = js.native
  def getFormatter(
    hasLocaleFormatsOnErrorTimeZone: Pick[IntlConfig, locale | formats | onError | timeZone],
    `type`: time,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Anon_Locales], DateTimeFormat]
  ): DateTimeFormat = js.native
  def getFormatter(
    hasLocaleFormatsOnErrorTimeZone: Pick[IntlConfig, locale | formats | onError | timeZone],
    `type`: time,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Anon_Locales], DateTimeFormat],
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[1] */ js.Any
  ): DateTimeFormat = js.native
}

