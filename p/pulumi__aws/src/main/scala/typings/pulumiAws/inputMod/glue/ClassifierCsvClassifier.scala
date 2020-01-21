package typings.pulumiAws.inputMod.glue

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassifierCsvClassifier extends js.Object {
  /**
    * Enables the processing of files that contain only one column.
    */
  var allowSingleColumn: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Indicates whether the CSV file contains a header. This can be one of "ABSENT", "PRESENT", or "UNKNOWN".
    */
  var containsHeader: js.UndefOr[Input[String]] = js.native
  /**
    * The delimiter used in the Csv to separate columns.
    */
  var delimiter: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies whether to trim column values.
    */
  var disableValueTrimming: js.UndefOr[Input[Boolean]] = js.native
  /**
    * A list of strings representing column names.
    */
  var headers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A custom symbol to denote what combines content into a single column value. It must be different from the column delimiter.
    */
  var quoteSymbol: js.UndefOr[Input[String]] = js.native
}

object ClassifierCsvClassifier {
  @scala.inline
  def apply(
    allowSingleColumn: Input[Boolean] = null,
    containsHeader: Input[String] = null,
    delimiter: Input[String] = null,
    disableValueTrimming: Input[Boolean] = null,
    headers: Input[js.Array[Input[String]]] = null,
    quoteSymbol: Input[String] = null
  ): ClassifierCsvClassifier = {
    val __obj = js.Dynamic.literal()
    if (allowSingleColumn != null) __obj.updateDynamic("allowSingleColumn")(allowSingleColumn.asInstanceOf[js.Any])
    if (containsHeader != null) __obj.updateDynamic("containsHeader")(containsHeader.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (disableValueTrimming != null) __obj.updateDynamic("disableValueTrimming")(disableValueTrimming.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (quoteSymbol != null) __obj.updateDynamic("quoteSymbol")(quoteSymbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifierCsvClassifier]
  }
}

