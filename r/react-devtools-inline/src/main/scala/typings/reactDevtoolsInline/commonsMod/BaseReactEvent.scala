package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseReactEvent extends StObject {
  
  val componentName: js.UndefOr[String] = js.undefined
  
  val timestamp: Milliseconds
  
  var warning: String | Null
}
object BaseReactEvent {
  
  inline def apply(timestamp: Milliseconds): BaseReactEvent = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any], warning = null)
    __obj.asInstanceOf[BaseReactEvent]
  }
  
  extension [Self <: BaseReactEvent](x: Self) {
    
    inline def setComponentName(value: String): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
    
    inline def setComponentNameUndefined: Self = StObject.set(x, "componentName", js.undefined)
    
    inline def setTimestamp(value: Milliseconds): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningNull: Self = StObject.set(x, "warning", null)
  }
}
