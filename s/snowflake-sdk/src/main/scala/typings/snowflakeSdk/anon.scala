package typings.snowflakeSdk

import typings.snowflakeSdk.mod.Bind
import typings.snowflakeSdk.mod.SnowflakeError
import typings.snowflakeSdk.mod.Statement
import typings.snowflakeSdk.snowflakeSdkStrings.Boolean
import typings.snowflakeSdk.snowflakeSdkStrings.Buffer
import typings.snowflakeSdk.snowflakeSdkStrings.Date
import typings.snowflakeSdk.snowflakeSdkStrings.JSON
import typings.snowflakeSdk.snowflakeSdkStrings.Number
import typings.snowflakeSdk.snowflakeSdkStrings.String
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Binds extends StObject {
    
    var binds: js.UndefOr[typings.snowflakeSdk.mod.Binds] = js.undefined
    
    var complete: js.UndefOr[
        js.Function3[
          /* err */ js.UndefOr[SnowflakeError], 
          /* stmt */ Statement, 
          /* rows */ js.UndefOr[js.Array[Any]], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * ### Related Docs
      * - {@link https://docs.snowflake.com/en/user-guide/nodejs-driver-use.html#fetching-data-types-as-strings Fetching Data Types As Strings}
      */
    var fetchAsString: js.UndefOr[js.Array[String | Boolean | Number | Date | JSON | Buffer]] = js.undefined
    
    var sqlText: java.lang.String
    
    /**
      * ### Related Docs
      * - {@link https://docs.snowflake.com/en/user-guide/nodejs-driver-use.html#batch-processing-results Batch Processing Results}
      */
    var streamResult: js.UndefOr[scala.Boolean] = js.undefined
  }
  object Binds {
    
    inline def apply(sqlText: java.lang.String): Binds = {
      val __obj = js.Dynamic.literal(sqlText = sqlText.asInstanceOf[js.Any])
      __obj.asInstanceOf[Binds]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Binds] (val x: Self) extends AnyVal {
      
      inline def setBinds(value: typings.snowflakeSdk.mod.Binds): Self = StObject.set(x, "binds", value.asInstanceOf[js.Any])
      
      inline def setBindsUndefined: Self = StObject.set(x, "binds", js.undefined)
      
      inline def setBindsVarargs(value: (js.Array[Bind] | Bind)*): Self = StObject.set(x, "binds", js.Array(value*))
      
      inline def setComplete(
        value: (/* err */ js.UndefOr[SnowflakeError], /* stmt */ Statement, /* rows */ js.UndefOr[js.Array[Any]]) => Unit
      ): Self = StObject.set(x, "complete", js.Any.fromFunction3(value))
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setFetchAsString(value: js.Array[String | Boolean | Number | Date | JSON | Buffer]): Self = StObject.set(x, "fetchAsString", value.asInstanceOf[js.Any])
      
      inline def setFetchAsStringUndefined: Self = StObject.set(x, "fetchAsString", js.undefined)
      
      inline def setFetchAsStringVarargs(value: (String | Boolean | Number | Date | JSON | Buffer)*): Self = StObject.set(x, "fetchAsString", js.Array(value*))
      
      inline def setSqlText(value: java.lang.String): Self = StObject.set(x, "sqlText", value.asInstanceOf[js.Any])
      
      inline def setStreamResult(value: scala.Boolean): Self = StObject.set(x, "streamResult", value.asInstanceOf[js.Any])
      
      inline def setStreamResultUndefined: Self = StObject.set(x, "streamResult", js.undefined)
    }
  }
}
