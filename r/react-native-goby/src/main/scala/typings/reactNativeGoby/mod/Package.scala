package typings.reactNativeGoby.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Package extends js.Object {
  
  /**
    * The app binary version that this update is dependent on. This is the value that was
    * specified via the appStoreVersion parameter when calling the CLI's release command.
    */
  var appVersion: String = js.native
  
  /**
    * The deployment key that was used to originally download this update.
    */
  var deploymentKey: String = js.native
  
  /**
    * The description of the update. This is the same value that you specified in the CLI when you released the update.
    */
  var description: String = js.native
  
  /**
    * Indicates whether this update has been previously installed but was rolled back.
    */
  var failedInstall: Boolean = js.native
  
  /**
    * Indicates whether this is the first time the update has been run after being installed.
    */
  var isFirstRun: Boolean = js.native
  
  /**
    * Indicates whether the update is considered mandatory. This is the value that was specified in the CLI when the update was released.
    */
  var isMandatory: Boolean = js.native
  
  /**
    * Indicates whether this update is in a "pending" state. When true, that means the update has been downloaded and installed, but the app restart
    * needed to apply it hasn't occurred yet, and therefore, its changes aren't currently visible to the end-user.
    */
  var isPending: Boolean = js.native
  
  /**
    * The internal label automatically given to the update by the Goby server. This value uniquely identifies the update within its deployment.
    */
  var label: String = js.native
  
  /**
    * The SHA hash value of the update.
    */
  var packageHash: String = js.native
  
  /**
    * The size of the code contained within the update, in bytes.
    */
  var packageSize: Double = js.native
}
object Package {
  
  @scala.inline
  def apply(
    appVersion: String,
    deploymentKey: String,
    description: String,
    failedInstall: Boolean,
    isFirstRun: Boolean,
    isMandatory: Boolean,
    isPending: Boolean,
    label: String,
    packageHash: String,
    packageSize: Double
  ): Package = {
    val __obj = js.Dynamic.literal(appVersion = appVersion.asInstanceOf[js.Any], deploymentKey = deploymentKey.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], failedInstall = failedInstall.asInstanceOf[js.Any], isFirstRun = isFirstRun.asInstanceOf[js.Any], isMandatory = isMandatory.asInstanceOf[js.Any], isPending = isPending.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], packageHash = packageHash.asInstanceOf[js.Any], packageSize = packageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Package]
  }
  
  @scala.inline
  implicit class PackageOps[Self <: Package] (val x: Self) extends AnyVal {
    
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
    def setAppVersion(value: String): Self = this.set("appVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentKey(value: String): Self = this.set("deploymentKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedInstall(value: Boolean): Self = this.set("failedInstall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFirstRun(value: Boolean): Self = this.set("isFirstRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMandatory(value: Boolean): Self = this.set("isMandatory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPending(value: Boolean): Self = this.set("isPending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageHash(value: String): Self = this.set("packageHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageSize(value: Double): Self = this.set("packageSize", value.asInstanceOf[js.Any])
  }
}
