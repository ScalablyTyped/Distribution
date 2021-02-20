package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiSuiteReport
  extends /* key */ StringDictionary[js.Any] {
  
  var id: js.UndefOr[Id] = js.native
  
  var testReports: js.UndefOr[js.Array[ApiTestReport]] = js.native
}
object ApiSuiteReport {
  
  @scala.inline
  def apply(): ApiSuiteReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiSuiteReport]
  }
  
  @scala.inline
  implicit class ApiSuiteReportMutableBuilder[Self <: ApiSuiteReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setTestReports(value: js.Array[ApiTestReport]): Self = StObject.set(x, "testReports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestReportsUndefined: Self = StObject.set(x, "testReports", js.undefined)
    
    @scala.inline
    def setTestReportsVarargs(value: ApiTestReport*): Self = StObject.set(x, "testReports", js.Array(value :_*))
  }
}
