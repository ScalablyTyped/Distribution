package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiTestReport
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var id: js.UndefOr[Id] = js.undefined
  
  var test: js.UndefOr[ApiTest] = js.undefined
}
object ApiTestReport {
  
  inline def apply(): ApiTestReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiTestReport]
  }
  
  extension [Self <: ApiTestReport](x: Self) {
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setTest(value: ApiTest): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
  }
}
