package typings.storybookCoreCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Handler extends StObject {
  
  var handler: Any
  
  var modulesCount: Double
}
object Handler {
  
  inline def apply(handler: Any, modulesCount: Double): Handler = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], modulesCount = modulesCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handler]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Handler] (val x: Self) extends AnyVal {
    
    inline def setHandler(value: Any): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    inline def setModulesCount(value: Double): Self = StObject.set(x, "modulesCount", value.asInstanceOf[js.Any])
  }
}
