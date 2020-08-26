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
  def apply(): ClassifierCsvClassifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassifierCsvClassifier]
  }
  @scala.inline
  implicit class ClassifierCsvClassifierOps[Self <: ClassifierCsvClassifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowSingleColumn(value: Boolean): Self = this.set("allowSingleColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSingleColumn: Self = this.set("allowSingleColumn", js.undefined)
    @scala.inline
    def setContainsHeader(value: String): Self = this.set("containsHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainsHeader: Self = this.set("containsHeader", js.undefined)
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    @scala.inline
    def setDisableValueTrimming(value: Boolean): Self = this.set("disableValueTrimming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableValueTrimming: Self = this.set("disableValueTrimming", js.undefined)
    @scala.inline
    def setHeadersVarargs(value: String*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: js.Array[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setQuoteSymbol(value: String): Self = this.set("quoteSymbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuoteSymbol: Self = this.set("quoteSymbol", js.undefined)
  }
  
}

