package typings.sentryBrowser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@sentry/browser.@sentry/browser/types/integrations/breadcrumbs.BreadcrumbsOptions> */
trait PartialBreadcrumbsOptions extends StObject {
  
  var console: js.UndefOr[Boolean] = js.undefined
  
  var dom: js.UndefOr[Boolean | MaxStringLength] = js.undefined
  
  var fetch: js.UndefOr[Boolean] = js.undefined
  
  var history: js.UndefOr[Boolean] = js.undefined
  
  var sentry: js.UndefOr[Boolean] = js.undefined
  
  var xhr: js.UndefOr[Boolean] = js.undefined
}
object PartialBreadcrumbsOptions {
  
  inline def apply(): PartialBreadcrumbsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBreadcrumbsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialBreadcrumbsOptions] (val x: Self) extends AnyVal {
    
    inline def setConsole(value: Boolean): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
    
    inline def setConsoleUndefined: Self = StObject.set(x, "console", js.undefined)
    
    inline def setDom(value: Boolean | MaxStringLength): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
    
    inline def setDomUndefined: Self = StObject.set(x, "dom", js.undefined)
    
    inline def setFetch(value: Boolean): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
    
    inline def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
    
    inline def setHistory(value: Boolean): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    inline def setSentry(value: Boolean): Self = StObject.set(x, "sentry", value.asInstanceOf[js.Any])
    
    inline def setSentryUndefined: Self = StObject.set(x, "sentry", js.undefined)
    
    inline def setXhr(value: Boolean): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
    
    inline def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
  }
}
