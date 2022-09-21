package typings.rockset.apiMod

import typings.rockset.apiMod.CsvParams.ColumnTypesEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CsvParams extends StObject {
  
  /**
    * names of columns
    * @type {Array<string>}
    * @memberof CsvParams
    */
  var columnNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * names of columns
    * @type {Array<string>}
    * @memberof CsvParams
    */
  var columnTypes: js.UndefOr[js.Array[ColumnTypesEnum]] = js.undefined
  
  /**
    * can be one of: UTF-8, ISO_8859_1, UTF-16
    * @type {string}
    * @memberof CsvParams
    */
  var encoding: js.UndefOr[String] = js.undefined
  
  /**
    * escape character removes any special meaning from the following character,default is '\\'
    * @type {string}
    * @memberof CsvParams
    */
  var escapeChar: js.UndefOr[String] = js.undefined
  
  /**
    * If the first line in every object specifies the column names
    * @type {boolean}
    * @memberof CsvParams
    */
  var firstLineAsColumnNames: js.UndefOr[Boolean] = js.undefined
  
  /**
    * character within which a cell value is enclosed,null character if no such character, default is '\"'
    * @type {string}
    * @memberof CsvParams
    */
  var quoteChar: js.UndefOr[String] = js.undefined
  
  /**
    * a single character that is the column separator
    * @type {string}
    * @memberof CsvParams
    */
  var separator: js.UndefOr[String] = js.undefined
}
object CsvParams {
  
  inline def apply(): CsvParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CsvParams]
  }
  
  @js.native
  sealed trait ColumnTypesEnum extends StObject
  /**
    * @export
    * @enum {string}
    */
  @JSImport("rockset/dist/codegen/api", "CsvParams.ColumnTypesEnum")
  @js.native
  object ColumnTypesEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ColumnTypesEnum & Double] = js.native
    
    @js.native
    sealed trait BOOL
      extends StObject
         with ColumnTypesEnum
    /* 2 */ val BOOL: typings.rockset.apiMod.CsvParams.ColumnTypesEnum.BOOL & Double = js.native
    
    @js.native
    sealed trait BOOLEAN
      extends StObject
         with ColumnTypesEnum
    /* 1 */ val BOOLEAN: typings.rockset.apiMod.CsvParams.ColumnTypesEnum.BOOLEAN & Double = js.native
    
    @js.native
    sealed trait DATE
      extends StObject
         with ColumnTypesEnum
    /* 7 */ val DATE: typings.rockset.apiMod.CsvParams.ColumnTypesEnum.DATE & Double = js.native
    
    @js.native
    sealed trait DATETIME
      extends StObject
         with ColumnTypesEnum
    /* 8 */ val DATETIME: typings.rockset.apiMod.CsvParams.ColumnTypesEnum.DATETIME & Double = js.native
    
    @js.native
    sealed trait FLOAT
      extends StObject
         with ColumnTypesEnum
    /* 5 */ val FLOAT: typings.rockset.apiMod.CsvParams.ColumnTypesEnum.FLOAT & Double = js.native
    
    @js.native
    sealed trait INT
      extends StObject
         with ColumnTypesEnum
    /* 4 */ val INT: typings.rockset.apiMod.CsvParams.ColumnTypesEnum.INT & Double = js.native
    
    @js.native
    sealed trait INTEGER
      extends StObject
         with ColumnTypesEnum
    /* 3 */ val INTEGER: typings.rockset.apiMod.CsvParams.ColumnTypesEnum.INTEGER & Double = js.native
    
    @js.native
    sealed trait STRING
      extends StObject
         with ColumnTypesEnum
    /* 10 */ val STRING: typings.rockset.apiMod.CsvParams.ColumnTypesEnum.STRING & Double = js.native
    
    @js.native
    sealed trait TIME
      extends StObject
         with ColumnTypesEnum
    /* 6 */ val TIME: typings.rockset.apiMod.CsvParams.ColumnTypesEnum.TIME & Double = js.native
    
    @js.native
    sealed trait TIMESTAMP
      extends StObject
         with ColumnTypesEnum
    /* 9 */ val TIMESTAMP: typings.rockset.apiMod.CsvParams.ColumnTypesEnum.TIMESTAMP & Double = js.native
    
    @js.native
    sealed trait UNKNOWN
      extends StObject
         with ColumnTypesEnum
    /* 0 */ val UNKNOWN: typings.rockset.apiMod.CsvParams.ColumnTypesEnum.UNKNOWN & Double = js.native
  }
  
  extension [Self <: CsvParams](x: Self) {
    
    inline def setColumnNames(value: js.Array[String]): Self = StObject.set(x, "columnNames", value.asInstanceOf[js.Any])
    
    inline def setColumnNamesUndefined: Self = StObject.set(x, "columnNames", js.undefined)
    
    inline def setColumnNamesVarargs(value: String*): Self = StObject.set(x, "columnNames", js.Array(value*))
    
    inline def setColumnTypes(value: js.Array[ColumnTypesEnum]): Self = StObject.set(x, "columnTypes", value.asInstanceOf[js.Any])
    
    inline def setColumnTypesUndefined: Self = StObject.set(x, "columnTypes", js.undefined)
    
    inline def setColumnTypesVarargs(value: ColumnTypesEnum*): Self = StObject.set(x, "columnTypes", js.Array(value*))
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setEscapeChar(value: String): Self = StObject.set(x, "escapeChar", value.asInstanceOf[js.Any])
    
    inline def setEscapeCharUndefined: Self = StObject.set(x, "escapeChar", js.undefined)
    
    inline def setFirstLineAsColumnNames(value: Boolean): Self = StObject.set(x, "firstLineAsColumnNames", value.asInstanceOf[js.Any])
    
    inline def setFirstLineAsColumnNamesUndefined: Self = StObject.set(x, "firstLineAsColumnNames", js.undefined)
    
    inline def setQuoteChar(value: String): Self = StObject.set(x, "quoteChar", value.asInstanceOf[js.Any])
    
    inline def setQuoteCharUndefined: Self = StObject.set(x, "quoteChar", js.undefined)
    
    inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
  }
}
