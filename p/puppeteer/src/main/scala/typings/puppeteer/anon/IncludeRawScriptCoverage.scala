package typings.puppeteer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeRawScriptCoverage extends StObject {
  
  var includeRawScriptCoverage: js.UndefOr[Boolean] = js.undefined
  
  var reportAnonymousScripts: js.UndefOr[Boolean] = js.undefined
  
  var resetOnNavigation: js.UndefOr[Boolean] = js.undefined
}
object IncludeRawScriptCoverage {
  
  inline def apply(): IncludeRawScriptCoverage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeRawScriptCoverage]
  }
  
  extension [Self <: IncludeRawScriptCoverage](x: Self) {
    
    inline def setIncludeRawScriptCoverage(value: Boolean): Self = StObject.set(x, "includeRawScriptCoverage", value.asInstanceOf[js.Any])
    
    inline def setIncludeRawScriptCoverageUndefined: Self = StObject.set(x, "includeRawScriptCoverage", js.undefined)
    
    inline def setReportAnonymousScripts(value: Boolean): Self = StObject.set(x, "reportAnonymousScripts", value.asInstanceOf[js.Any])
    
    inline def setReportAnonymousScriptsUndefined: Self = StObject.set(x, "reportAnonymousScripts", js.undefined)
    
    inline def setResetOnNavigation(value: Boolean): Self = StObject.set(x, "resetOnNavigation", value.asInstanceOf[js.Any])
    
    inline def setResetOnNavigationUndefined: Self = StObject.set(x, "resetOnNavigation", js.undefined)
  }
}
