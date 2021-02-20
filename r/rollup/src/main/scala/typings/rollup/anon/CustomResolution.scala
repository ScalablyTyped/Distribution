package typings.rollup.anon

import typings.rollup.mod.InternalModuleFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomResolution extends StObject {
  
  var customResolution: String | Null = js.native
  
  var format: InternalModuleFormat = js.native
  
  var moduleId: String = js.native
  
  var targetModuleId: String | Null = js.native
}
object CustomResolution {
  
  @scala.inline
  def apply(format: InternalModuleFormat, moduleId: String): CustomResolution = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], moduleId = moduleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResolution]
  }
  
  @scala.inline
  implicit class CustomResolutionMutableBuilder[Self <: CustomResolution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomResolution(value: String): Self = StObject.set(x, "customResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomResolutionNull: Self = StObject.set(x, "customResolution", null)
    
    @scala.inline
    def setFormat(value: InternalModuleFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleId(value: String): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetModuleId(value: String): Self = StObject.set(x, "targetModuleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetModuleIdNull: Self = StObject.set(x, "targetModuleId", null)
  }
}
