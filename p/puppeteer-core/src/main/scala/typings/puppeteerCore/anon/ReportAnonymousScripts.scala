package typings.puppeteerCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportAnonymousScripts extends StObject {
  
  var reportAnonymousScripts: js.UndefOr[Boolean] = js.undefined
  
  var resetOnNavigation: js.UndefOr[Boolean] = js.undefined
}
object ReportAnonymousScripts {
  
  @scala.inline
  def apply(): ReportAnonymousScripts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportAnonymousScripts]
  }
  
  @scala.inline
  implicit class ReportAnonymousScriptsMutableBuilder[Self <: ReportAnonymousScripts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReportAnonymousScripts(value: Boolean): Self = StObject.set(x, "reportAnonymousScripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportAnonymousScriptsUndefined: Self = StObject.set(x, "reportAnonymousScripts", js.undefined)
    
    @scala.inline
    def setResetOnNavigation(value: Boolean): Self = StObject.set(x, "resetOnNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetOnNavigationUndefined: Self = StObject.set(x, "resetOnNavigation", js.undefined)
  }
}
