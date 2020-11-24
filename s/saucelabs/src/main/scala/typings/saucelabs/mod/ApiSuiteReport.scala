package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
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
  implicit class ApiSuiteReportOps[Self <: ApiSuiteReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: Id): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setTestReportsVarargs(value: ApiTestReport*): Self = this.set("testReports", js.Array(value :_*))
    
    @scala.inline
    def setTestReports(value: js.Array[ApiTestReport]): Self = this.set("testReports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestReports: Self = this.set("testReports", js.undefined)
  }
}
