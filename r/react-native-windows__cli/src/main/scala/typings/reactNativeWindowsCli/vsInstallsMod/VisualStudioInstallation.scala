package typings.reactNativeWindowsCli.vsInstallsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VisualStudioInstallation extends js.Object {
  
  var installationPath: String = js.native
  
  var installationVersion: String = js.native
  
  var instanceId: String = js.native
}
object VisualStudioInstallation {
  
  @scala.inline
  def apply(installationPath: String, installationVersion: String, instanceId: String): VisualStudioInstallation = {
    val __obj = js.Dynamic.literal(installationPath = installationPath.asInstanceOf[js.Any], installationVersion = installationVersion.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualStudioInstallation]
  }
  
  @scala.inline
  implicit class VisualStudioInstallationOps[Self <: VisualStudioInstallation] (val x: Self) extends AnyVal {
    
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
    def setInstallationPath(value: String): Self = this.set("installationPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallationVersion(value: String): Self = this.set("installationVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: String): Self = this.set("instanceId", value.asInstanceOf[js.Any])
  }
}
