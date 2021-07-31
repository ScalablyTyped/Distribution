package typings.snowflakeSdk

import typings.snowflakeSdk.mod.Statement
import typings.snowflakeSdk.snowflakeSdkStrings.Boolean
import typings.snowflakeSdk.snowflakeSdkStrings.Date
import typings.snowflakeSdk.snowflakeSdkStrings.JSON
import typings.snowflakeSdk.snowflakeSdkStrings.Number
import typings.snowflakeSdk.snowflakeSdkStrings.String
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Binds extends StObject {
    
    var binds: js.UndefOr[typings.snowflakeSdk.mod.Binds] = js.native
    
    def complete(err: Error, stmt: Statement): Unit = js.native
    def complete(err: Error, stmt: Statement, rows: js.Array[js.Any]): Unit = js.native
    
    /**
      * ### Related Docs
      * - {@link https://docs.snowflake.com/en/user-guide/nodejs-driver-use.html#fetching-data-types-as-strings Fetching Data Types As Strings}
      */
    var fetchAsString: js.UndefOr[js.Array[String | Boolean | Number | Date | JSON]] = js.native
    
    var sqlText: java.lang.String = js.native
    
    /**
      * ### Related Docs
      * - {@link https://docs.snowflake.com/en/user-guide/nodejs-driver-use.html#batch-processing-results Batch Processing Results}
      */
    var streamResult: js.UndefOr[scala.Boolean] = js.native
  }
}
