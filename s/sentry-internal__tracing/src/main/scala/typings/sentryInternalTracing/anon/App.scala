package typings.sentryInternalTracing.anon

import typings.sentryInternalTracing.typesNodeIntegrationsExpressMod.Router
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait App extends StObject {
  
  var app: js.UndefOr[Router] = js.undefined
  
  var methods: js.UndefOr[js.Array[typings.sentryInternalTracing.typesNodeIntegrationsExpressMod.Method]] = js.undefined
  
  var router: js.UndefOr[Router] = js.undefined
}
object App {
  
  inline def apply(): App = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[App]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: App] (val x: Self) extends AnyVal {
    
    inline def setApp(value: Router): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
    
    inline def setMethods(value: js.Array[typings.sentryInternalTracing.typesNodeIntegrationsExpressMod.Method]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
    
    inline def setMethodsVarargs(value: typings.sentryInternalTracing.typesNodeIntegrationsExpressMod.Method*): Self = StObject.set(x, "methods", js.Array(value*))
    
    inline def setRouter(value: Router): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
    
    inline def setRouterUndefined: Self = StObject.set(x, "router", js.undefined)
  }
}
