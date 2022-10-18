package typings.reactNativeNavigation.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentId extends StObject {
  
  var componentId: js.UndefOr[String] = js.undefined
}
object ComponentId {
  
  inline def apply(): ComponentId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentId]
  }
  
  extension [Self <: ComponentId](x: Self) {
    
    inline def setComponentId(value: String): Self = StObject.set(x, "componentId", value.asInstanceOf[js.Any])
    
    inline def setComponentIdUndefined: Self = StObject.set(x, "componentId", js.undefined)
  }
}
