package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiSuiteReport
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var id: js.UndefOr[Id] = js.undefined
  
  var testReports: js.UndefOr[js.Array[ApiTestReport]] = js.undefined
}
object ApiSuiteReport {
  
  inline def apply(): ApiSuiteReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiSuiteReport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApiSuiteReport] (val x: Self) extends AnyVal {
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setTestReports(value: js.Array[ApiTestReport]): Self = StObject.set(x, "testReports", value.asInstanceOf[js.Any])
    
    inline def setTestReportsUndefined: Self = StObject.set(x, "testReports", js.undefined)
    
    inline def setTestReportsVarargs(value: ApiTestReport*): Self = StObject.set(x, "testReports", js.Array(value*))
  }
}
