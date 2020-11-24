package typings.rollup.anon

import typings.rollup.mod.InternalModuleFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomResolution extends js.Object {
  
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
  implicit class CustomResolutionOps[Self <: CustomResolution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFormat(value: InternalModuleFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleId(value: String): Self = this.set("moduleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomResolution(value: String): Self = this.set("customResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomResolutionNull: Self = this.set("customResolution", null)
    
    @scala.inline
    def setTargetModuleId(value: String): Self = this.set("targetModuleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetModuleIdNull: Self = this.set("targetModuleId", null)
  }
}
