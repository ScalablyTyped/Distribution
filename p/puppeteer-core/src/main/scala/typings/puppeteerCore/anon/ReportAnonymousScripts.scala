package typings.puppeteerCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportAnonymousScripts extends StObject {
  
  var reportAnonymousScripts: js.UndefOr[Boolean] = js.undefined
  
  var resetOnNavigation: js.UndefOr[Boolean] = js.undefined
}
object ReportAnonymousScripts {
  
  inline def apply(): ReportAnonymousScripts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportAnonymousScripts]
  }
  
  extension [Self <: ReportAnonymousScripts](x: Self) {
    
    inline def setReportAnonymousScripts(value: Boolean): Self = StObject.set(x, "reportAnonymousScripts", value.asInstanceOf[js.Any])
    
    inline def setReportAnonymousScriptsUndefined: Self = StObject.set(x, "reportAnonymousScripts", js.undefined)
    
    inline def setResetOnNavigation(value: Boolean): Self = StObject.set(x, "resetOnNavigation", value.asInstanceOf[js.Any])
    
    inline def setResetOnNavigationUndefined: Self = StObject.set(x, "resetOnNavigation", js.undefined)
  }
}
