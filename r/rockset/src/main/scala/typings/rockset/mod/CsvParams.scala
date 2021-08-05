package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CsvParams extends StObject {
  
  // names of columns
  var columnNames: js.UndefOr[js.Array[String]] = js.undefined
  
  // names of columns
  var columnTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  // can be one of: UTF-8, ISO_8859_1, UTF-16
  var encoding: js.UndefOr[String] = js.undefined
  
  // If the first line in every object specifies the column names
  var firstLineAsColumnNames: js.UndefOr[Boolean] = js.undefined
  
  // character within which a cell value is enclosed,null character if no such character, default is '"'
  var quoteChar: js.UndefOr[String] = js.undefined
  
  // a single character that is the column seperator
  var separator: js.UndefOr[String] = js.undefined
}
object CsvParams {
  
  inline def apply(): CsvParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CsvParams]
  }
  
  extension [Self <: CsvParams](x: Self) {
    
    inline def setColumnNames(value: js.Array[String]): Self = StObject.set(x, "columnNames", value.asInstanceOf[js.Any])
    
    inline def setColumnNamesUndefined: Self = StObject.set(x, "columnNames", js.undefined)
    
    inline def setColumnNamesVarargs(value: String*): Self = StObject.set(x, "columnNames", js.Array(value :_*))
    
    inline def setColumnTypes(value: js.Array[String]): Self = StObject.set(x, "columnTypes", value.asInstanceOf[js.Any])
    
    inline def setColumnTypesUndefined: Self = StObject.set(x, "columnTypes", js.undefined)
    
    inline def setColumnTypesVarargs(value: String*): Self = StObject.set(x, "columnTypes", js.Array(value :_*))
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setFirstLineAsColumnNames(value: Boolean): Self = StObject.set(x, "firstLineAsColumnNames", value.asInstanceOf[js.Any])
    
    inline def setFirstLineAsColumnNamesUndefined: Self = StObject.set(x, "firstLineAsColumnNames", js.undefined)
    
    inline def setQuoteChar(value: String): Self = StObject.set(x, "quoteChar", value.asInstanceOf[js.Any])
    
    inline def setQuoteCharUndefined: Self = StObject.set(x, "quoteChar", js.undefined)
    
    inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
  }
}
