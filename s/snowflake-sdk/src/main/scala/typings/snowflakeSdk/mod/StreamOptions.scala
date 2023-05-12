package typings.snowflakeSdk.mod

import typings.snowflakeSdk.snowflakeSdkStrings.Boolean
import typings.snowflakeSdk.snowflakeSdkStrings.Buffer
import typings.snowflakeSdk.snowflakeSdkStrings.Date
import typings.snowflakeSdk.snowflakeSdkStrings.Number
import typings.snowflakeSdk.snowflakeSdkStrings.String
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamOptions extends StObject {
  
  var end: js.UndefOr[Double] = js.undefined
  
  var fetchAsString: js.UndefOr[
    js.Array[
      String | Boolean | Number | Date | typings.snowflakeSdk.snowflakeSdkStrings.JSON | Buffer
    ]
  ] = js.undefined
  
  var start: js.UndefOr[Double] = js.undefined
}
object StreamOptions {
  
  inline def apply(): StreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamOptions] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setFetchAsString(
      value: js.Array[
          String | Boolean | Number | Date | typings.snowflakeSdk.snowflakeSdkStrings.JSON | Buffer
        ]
    ): Self = StObject.set(x, "fetchAsString", value.asInstanceOf[js.Any])
    
    inline def setFetchAsStringUndefined: Self = StObject.set(x, "fetchAsString", js.undefined)
    
    inline def setFetchAsStringVarargs(
      value: (String | Boolean | Number | Date | typings.snowflakeSdk.snowflakeSdkStrings.JSON | Buffer)*
    ): Self = StObject.set(x, "fetchAsString", js.Array(value*))
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
