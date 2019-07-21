package typings
package rocksetLib.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CsvParams extends js.Object {
  // names of columns
  var columnNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  // names of columns
  var columnTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  // can be one of: UTF-8, ISO_8859_1, UTF-16
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  // If the first line in every object specifies the column names
  var firstLineAsColumnNames: js.UndefOr[scala.Boolean] = js.undefined
  // character within which a cell value is enclosed,null character if no such character, default is '"'
  var quoteChar: js.UndefOr[java.lang.String] = js.undefined
  // a single character that is the column seperator
  var separator: js.UndefOr[java.lang.String] = js.undefined
}

object CsvParams {
  @scala.inline
  def apply(
    columnNames: js.Array[java.lang.String] = null,
    columnTypes: js.Array[java.lang.String] = null,
    encoding: java.lang.String = null,
    firstLineAsColumnNames: js.UndefOr[scala.Boolean] = js.undefined,
    quoteChar: java.lang.String = null,
    separator: java.lang.String = null
  ): CsvParams = {
    val __obj = js.Dynamic.literal()
    if (columnNames != null) __obj.updateDynamic("columnNames")(columnNames)
    if (columnTypes != null) __obj.updateDynamic("columnTypes")(columnTypes)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (!js.isUndefined(firstLineAsColumnNames)) __obj.updateDynamic("firstLineAsColumnNames")(firstLineAsColumnNames)
    if (quoteChar != null) __obj.updateDynamic("quoteChar")(quoteChar)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    __obj.asInstanceOf[CsvParams]
  }
}

