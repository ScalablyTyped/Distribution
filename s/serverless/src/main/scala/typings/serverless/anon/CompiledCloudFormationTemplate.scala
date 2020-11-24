package typings.serverless.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompiledCloudFormationTemplate extends js.Object {
  
  var compiledCloudFormationTemplate: Outputs = js.native
  
  var name: String = js.native
  
  var region: String = js.native
  
  var runtime: js.UndefOr[String] = js.native
  
  var stage: String = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var versionFunctions: Boolean = js.native
}
object CompiledCloudFormationTemplate {
  
  @scala.inline
  def apply(
    compiledCloudFormationTemplate: Outputs,
    name: String,
    region: String,
    stage: String,
    versionFunctions: Boolean
  ): CompiledCloudFormationTemplate = {
    val __obj = js.Dynamic.literal(compiledCloudFormationTemplate = compiledCloudFormationTemplate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], versionFunctions = versionFunctions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompiledCloudFormationTemplate]
  }
  
  @scala.inline
  implicit class CompiledCloudFormationTemplateOps[Self <: CompiledCloudFormationTemplate] (val x: Self) extends AnyVal {
    
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
    def setCompiledCloudFormationTemplate(value: Outputs): Self = this.set("compiledCloudFormationTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStage(value: String): Self = this.set("stage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionFunctions(value: Boolean): Self = this.set("versionFunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntime(value: String): Self = this.set("runtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuntime: Self = this.set("runtime", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
