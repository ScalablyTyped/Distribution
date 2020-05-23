package typings.pulumiAws.outputMod.glue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassifierCsvClassifier extends js.Object {
  /**
    * Enables the processing of files that contain only one column.
    */
  var allowSingleColumn: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the CSV file contains a header. This can be one of "ABSENT", "PRESENT", or "UNKNOWN".
    */
  var containsHeader: js.UndefOr[String] = js.native
  /**
    * The delimiter used in the Csv to separate columns.
    */
  var delimiter: js.UndefOr[String] = js.native
  /**
    * Specifies whether to trim column values.
    */
  var disableValueTrimming: js.UndefOr[Boolean] = js.native
  /**
    * A list of strings representing column names.
    */
  var headers: js.UndefOr[js.Array[String]] = js.native
  /**
    * A custom symbol to denote what combines content into a single column value. It must be different from the column delimiter.
    */
  var quoteSymbol: js.UndefOr[String] = js.native
}

object ClassifierCsvClassifier {
  @scala.inline
  def apply(
    allowSingleColumn: js.UndefOr[Boolean] = js.undefined,
    containsHeader: String = null,
    delimiter: String = null,
    disableValueTrimming: js.UndefOr[Boolean] = js.undefined,
    headers: js.Array[String] = null,
    quoteSymbol: String = null
  ): ClassifierCsvClassifier = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSingleColumn)) __obj.updateDynamic("allowSingleColumn")(allowSingleColumn.get.asInstanceOf[js.Any])
    if (containsHeader != null) __obj.updateDynamic("containsHeader")(containsHeader.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (!js.isUndefined(disableValueTrimming)) __obj.updateDynamic("disableValueTrimming")(disableValueTrimming.get.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (quoteSymbol != null) __obj.updateDynamic("quoteSymbol")(quoteSymbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifierCsvClassifier]
  }
}

