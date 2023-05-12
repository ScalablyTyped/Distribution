package typings.sentryBrowser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@sentry/browser.@sentry/browser/types/integrations/breadcrumbs.BreadcrumbsOptions> */
trait ReadonlyBreadcrumbsOption extends StObject {
  
  val console: Boolean
  
  val dom: Boolean | MaxStringLength
  
  val fetch: Boolean
  
  val history: Boolean
  
  val sentry: Boolean
  
  val xhr: Boolean
}
object ReadonlyBreadcrumbsOption {
  
  inline def apply(
    console: Boolean,
    dom: Boolean | MaxStringLength,
    fetch: Boolean,
    history: Boolean,
    sentry: Boolean,
    xhr: Boolean
  ): ReadonlyBreadcrumbsOption = {
    val __obj = js.Dynamic.literal(console = console.asInstanceOf[js.Any], dom = dom.asInstanceOf[js.Any], fetch = fetch.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any], sentry = sentry.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyBreadcrumbsOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyBreadcrumbsOption] (val x: Self) extends AnyVal {
    
    inline def setConsole(value: Boolean): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
    
    inline def setDom(value: Boolean | MaxStringLength): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
    
    inline def setFetch(value: Boolean): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
    
    inline def setHistory(value: Boolean): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setSentry(value: Boolean): Self = StObject.set(x, "sentry", value.asInstanceOf[js.Any])
    
    inline def setXhr(value: Boolean): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
  }
}
