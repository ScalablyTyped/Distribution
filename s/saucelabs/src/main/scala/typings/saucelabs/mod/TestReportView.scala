package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.saucelabs.saucelabsStrings.ABORTED
import typings.saucelabs.saucelabsStrings.CANCELED
import typings.saucelabs.saucelabsStrings.FAILURE
import typings.saucelabs.saucelabsStrings.SKIPPED
import typings.saucelabs.saucelabsStrings.SUCCESS
import typings.saucelabs.saucelabsStrings.UNKNOWN
import typings.saucelabs.saucelabsStrings.WARNING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestReportView
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var reportId: js.UndefOr[Id] = js.undefined
  
  var status: js.UndefOr[UNKNOWN | SUCCESS | WARNING | FAILURE | SKIPPED | ABORTED | CANCELED] = js.undefined
}
object TestReportView {
  
  @scala.inline
  def apply(): TestReportView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestReportView]
  }
  
  @scala.inline
  implicit class TestReportViewMutableBuilder[Self <: TestReportView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReportId(value: Id): Self = StObject.set(x, "reportId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportIdUndefined: Self = StObject.set(x, "reportId", js.undefined)
    
    @scala.inline
    def setStatus(value: UNKNOWN | SUCCESS | WARNING | FAILURE | SKIPPED | ABORTED | CANCELED): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
