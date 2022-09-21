package typings.sentryNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Breadcrumbs extends StObject {
  
  var breadcrumbs: js.UndefOr[Boolean] = js.undefined
  
  var tracing: js.UndefOr[Boolean] = js.undefined
}
object Breadcrumbs {
  
  inline def apply(): Breadcrumbs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Breadcrumbs]
  }
  
  extension [Self <: Breadcrumbs](x: Self) {
    
    inline def setBreadcrumbs(value: Boolean): Self = StObject.set(x, "breadcrumbs", value.asInstanceOf[js.Any])
    
    inline def setBreadcrumbsUndefined: Self = StObject.set(x, "breadcrumbs", js.undefined)
    
    inline def setTracing(value: Boolean): Self = StObject.set(x, "tracing", value.asInstanceOf[js.Any])
    
    inline def setTracingUndefined: Self = StObject.set(x, "tracing", js.undefined)
  }
}
