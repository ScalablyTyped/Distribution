package typings.reactIntl

import typings.std.ConstructorParameters
import typings.std.Intl.NumberFormat
import typings.std.Intl.NumberFormatPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl/lib/formatters/number", JSImport.Namespace)
@js.native
object numberMod extends js.Object {
  def formatNumber(
    config: PickIntlConfiglocaleformaFormats,
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[AnonInstantiable], NumberFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts ? : react-intl.react-intl/lib/types.FormatNumberOptions): string>[0] */ js.Any
  ): String = js.native
  def formatNumber(
    config: PickIntlConfiglocaleformaFormats,
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[AnonInstantiable], NumberFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts ? : react-intl.react-intl/lib/types.FormatNumberOptions): string>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts ? : react-intl.react-intl/lib/types.FormatNumberOptions): string>[1] */ js.Any
  ): String = js.native
  def formatNumberToParts(
    config: PickIntlConfiglocaleformaFormats,
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[AnonInstantiable], NumberFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts ? : react-intl.react-intl/lib/types.FormatNumberOptions): string>[0] */ js.Any
  ): js.Array[NumberFormatPart] = js.native
  def formatNumberToParts(
    config: PickIntlConfiglocaleformaFormats,
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[AnonInstantiable], NumberFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts ? : react-intl.react-intl/lib/types.FormatNumberOptions): string>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts ? : react-intl.react-intl/lib/types.FormatNumberOptions): string>[1] */ js.Any
  ): js.Array[NumberFormatPart] = js.native
  def getFormatter(
    hasLocaleFormatsOnError: PickIntlConfiglocaleformaFormats,
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[AnonInstantiable], NumberFormat]
  ): NumberFormat = js.native
  def getFormatter(
    hasLocaleFormatsOnError: PickIntlConfiglocaleformaFormats,
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[AnonInstantiable], NumberFormat],
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts ? : react-intl.react-intl/lib/types.FormatNumberOptions): string>[1] */ js.Any
  ): NumberFormat = js.native
}

