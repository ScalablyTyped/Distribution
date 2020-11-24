package typings.reactNativeGoby.mod

import typings.reactNativeGoby.mod.Goby.DeploymentStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatusReport extends js.Object {
  
  /**
    * Details of the package that was deployed (or attempted to).
    */
  @JSName("package")
  var _package: js.UndefOr[Package] = js.native
  
  /**
    * The version of the app that was deployed (for a native app upgrade).
    */
  var appVersion: js.UndefOr[String] = js.native
  
  /**
    * Deployment key used when deploying the previous package.
    */
  var previousDeploymentKey: js.UndefOr[String] = js.native
  
  /**
    * The label (v#) of the package that was upgraded from.
    */
  var previousLabelOrAppVersion: js.UndefOr[String] = js.native
  
  /**
    * Whether the deployment succeeded or failed.
    */
  var status: DeploymentStatus = js.native
}
object StatusReport {
  
  @scala.inline
  def apply(status: DeploymentStatus): StatusReport = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusReport]
  }
  
  @scala.inline
  implicit class StatusReportOps[Self <: StatusReport] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: DeploymentStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_package(value: Package): Self = this.set("package", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_package: Self = this.set("package", js.undefined)
    
    @scala.inline
    def setAppVersion(value: String): Self = this.set("appVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppVersion: Self = this.set("appVersion", js.undefined)
    
    @scala.inline
    def setPreviousDeploymentKey(value: String): Self = this.set("previousDeploymentKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousDeploymentKey: Self = this.set("previousDeploymentKey", js.undefined)
    
    @scala.inline
    def setPreviousLabelOrAppVersion(value: String): Self = this.set("previousLabelOrAppVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousLabelOrAppVersion: Self = this.set("previousLabelOrAppVersion", js.undefined)
  }
}
