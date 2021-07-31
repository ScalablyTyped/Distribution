package typings.pulumiAws.outputMod.glue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassifierCsvClassifier extends StObject {
  
  /**
    * Enables the processing of files that contain only one column.
    */
  var allowSingleColumn: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the CSV file contains a header. This can be one of "ABSENT", "PRESENT", or "UNKNOWN".
    */
  var containsHeader: js.UndefOr[String] = js.undefined
  
  /**
    * The delimiter used in the Csv to separate columns.
    */
  var delimiter: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether to trim column values.
    */
  var disableValueTrimming: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of strings representing column names.
    */
  var headers: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A custom symbol to denote what combines content into a single column value. It must be different from the column delimiter.
    */
  var quoteSymbol: js.UndefOr[String] = js.undefined
}
object ClassifierCsvClassifier {
  
  @scala.inline
  def apply(): ClassifierCsvClassifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassifierCsvClassifier]
  }
  
  @scala.inline
  implicit class ClassifierCsvClassifierMutableBuilder[Self <: ClassifierCsvClassifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowSingleColumn(value: Boolean): Self = StObject.set(x, "allowSingleColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSingleColumnUndefined: Self = StObject.set(x, "allowSingleColumn", js.undefined)
    
    @scala.inline
    def setContainsHeader(value: String): Self = StObject.set(x, "containsHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainsHeaderUndefined: Self = StObject.set(x, "containsHeader", js.undefined)
    
    @scala.inline
    def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    @scala.inline
    def setDisableValueTrimming(value: Boolean): Self = StObject.set(x, "disableValueTrimming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableValueTrimmingUndefined: Self = StObject.set(x, "disableValueTrimming", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    @scala.inline
    def setQuoteSymbol(value: String): Self = StObject.set(x, "quoteSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuoteSymbolUndefined: Self = StObject.set(x, "quoteSymbol", js.undefined)
  }
}
