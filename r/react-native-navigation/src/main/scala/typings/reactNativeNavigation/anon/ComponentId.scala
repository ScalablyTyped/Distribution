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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentId] (val x: Self) extends AnyVal {
    
    inline def setComponentId(value: String): Self = StObject.set(x, "componentId", value.asInstanceOf[js.Any])
    
    inline def setComponentIdUndefined: Self = StObject.set(x, "componentId", js.undefined)
  }
}
