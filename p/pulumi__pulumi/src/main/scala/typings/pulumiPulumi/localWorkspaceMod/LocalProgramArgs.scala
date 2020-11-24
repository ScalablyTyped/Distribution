package typings.pulumiPulumi.localWorkspaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalProgramArgs extends js.Object {
  
  var stackName: String = js.native
  
  var workDir: String = js.native
}
object LocalProgramArgs {
  
  @scala.inline
  def apply(stackName: String, workDir: String): LocalProgramArgs = {
    val __obj = js.Dynamic.literal(stackName = stackName.asInstanceOf[js.Any], workDir = workDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalProgramArgs]
  }
  
  @scala.inline
  implicit class LocalProgramArgsOps[Self <: LocalProgramArgs] (val x: Self) extends AnyVal {
    
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
    def setStackName(value: String): Self = this.set("stackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkDir(value: String): Self = this.set("workDir", value.asInstanceOf[js.Any])
  }
}
