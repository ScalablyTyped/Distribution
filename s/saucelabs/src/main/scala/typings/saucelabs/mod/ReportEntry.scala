package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportEntry
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var key: js.UndefOr[ReportKey] = js.undefined
  
  var view: js.UndefOr[TestReportView] = js.undefined
}
object ReportEntry {
  
  @scala.inline
  def apply(): ReportEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportEntry]
  }
  
  @scala.inline
  implicit class ReportEntryMutableBuilder[Self <: ReportEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: ReportKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setView(value: TestReportView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
