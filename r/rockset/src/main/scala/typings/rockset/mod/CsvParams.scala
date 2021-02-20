package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CsvParams extends StObject {
  
  // names of columns
  var columnNames: js.UndefOr[js.Array[String]] = js.native
  
  // names of columns
  var columnTypes: js.UndefOr[js.Array[String]] = js.native
  
  // can be one of: UTF-8, ISO_8859_1, UTF-16
  var encoding: js.UndefOr[String] = js.native
  
  // If the first line in every object specifies the column names
  var firstLineAsColumnNames: js.UndefOr[Boolean] = js.native
  
  // character within which a cell value is enclosed,null character if no such character, default is '"'
  var quoteChar: js.UndefOr[String] = js.native
  
  // a single character that is the column seperator
  var separator: js.UndefOr[String] = js.native
}
object CsvParams {
  
  @scala.inline
  def apply(): CsvParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CsvParams]
  }
  
  @scala.inline
  implicit class CsvParamsMutableBuilder[Self <: CsvParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnNames(value: js.Array[String]): Self = StObject.set(x, "columnNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnNamesUndefined: Self = StObject.set(x, "columnNames", js.undefined)
    
    @scala.inline
    def setColumnNamesVarargs(value: String*): Self = StObject.set(x, "columnNames", js.Array(value :_*))
    
    @scala.inline
    def setColumnTypes(value: js.Array[String]): Self = StObject.set(x, "columnTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnTypesUndefined: Self = StObject.set(x, "columnTypes", js.undefined)
    
    @scala.inline
    def setColumnTypesVarargs(value: String*): Self = StObject.set(x, "columnTypes", js.Array(value :_*))
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setFirstLineAsColumnNames(value: Boolean): Self = StObject.set(x, "firstLineAsColumnNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstLineAsColumnNamesUndefined: Self = StObject.set(x, "firstLineAsColumnNames", js.undefined)
    
    @scala.inline
    def setQuoteChar(value: String): Self = StObject.set(x, "quoteChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuoteCharUndefined: Self = StObject.set(x, "quoteChar", js.undefined)
    
    @scala.inline
    def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
  }
}
