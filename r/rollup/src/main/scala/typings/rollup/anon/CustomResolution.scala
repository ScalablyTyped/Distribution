package typings.rollup.anon

import typings.rollup.mod.InternalModuleFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomResolution extends StObject {
  
  var customResolution: String | Null
  
  var format: InternalModuleFormat
  
  var moduleId: String
  
  var targetModuleId: String | Null
}
object CustomResolution {
  
  inline def apply(format: InternalModuleFormat, moduleId: String): CustomResolution = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], moduleId = moduleId.asInstanceOf[js.Any], customResolution = null, targetModuleId = null)
    __obj.asInstanceOf[CustomResolution]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomResolution] (val x: Self) extends AnyVal {
    
    inline def setCustomResolution(value: String): Self = StObject.set(x, "customResolution", value.asInstanceOf[js.Any])
    
    inline def setCustomResolutionNull: Self = StObject.set(x, "customResolution", null)
    
    inline def setFormat(value: InternalModuleFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setModuleId(value: String): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
    
    inline def setTargetModuleId(value: String): Self = StObject.set(x, "targetModuleId", value.asInstanceOf[js.Any])
    
    inline def setTargetModuleIdNull: Self = StObject.set(x, "targetModuleId", null)
  }
}
