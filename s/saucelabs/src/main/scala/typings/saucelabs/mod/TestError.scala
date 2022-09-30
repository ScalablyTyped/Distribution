package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestError
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var error: js.UndefOr[String] = js.undefined
  
  var file: js.UndefOr[String] = js.undefined
  
  var lineNumber: js.UndefOr[Double] = js.undefined
}
object TestError {
  
  inline def apply(): TestError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestError]
  }
  
  extension [Self <: TestError](x: Self) {
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    inline def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
  }
}
