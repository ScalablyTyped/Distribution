package typings.reactReconciler.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactPortal extends StObject {
  
  @JSName("$$typeof")
  var DollarDollartypeof: js.Symbol | Double
  
  var children: ReactNode
  
  var containerInfo: Any
  
  // TODO: figure out the API for cross-renderer implementation.
  var implementation: Any
  
  var key: Null | String
}
object ReactPortal {
  
  inline def apply(DollarDollartypeof: js.Symbol | Double, containerInfo: Any, implementation: Any): ReactPortal = {
    val __obj = js.Dynamic.literal(containerInfo = containerInfo.asInstanceOf[js.Any], implementation = implementation.asInstanceOf[js.Any], key = null)
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactPortal]
  }
  
  extension [Self <: ReactPortal](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setContainerInfo(value: Any): Self = StObject.set(x, "containerInfo", value.asInstanceOf[js.Any])
    
    inline def setDollarDollartypeof(value: js.Symbol | Double): Self = StObject.set(x, "$$typeof", value.asInstanceOf[js.Any])
    
    inline def setImplementation(value: Any): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
  }
}
