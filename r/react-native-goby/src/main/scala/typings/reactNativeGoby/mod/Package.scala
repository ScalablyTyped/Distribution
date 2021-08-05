package typings.reactNativeGoby.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Package extends StObject {
  
  /**
    * The app binary version that this update is dependent on. This is the value that was
    * specified via the appStoreVersion parameter when calling the CLI's release command.
    */
  var appVersion: String
  
  /**
    * The deployment key that was used to originally download this update.
    */
  var deploymentKey: String
  
  /**
    * The description of the update. This is the same value that you specified in the CLI when you released the update.
    */
  var description: String
  
  /**
    * Indicates whether this update has been previously installed but was rolled back.
    */
  var failedInstall: Boolean
  
  /**
    * Indicates whether this is the first time the update has been run after being installed.
    */
  var isFirstRun: Boolean
  
  /**
    * Indicates whether the update is considered mandatory. This is the value that was specified in the CLI when the update was released.
    */
  var isMandatory: Boolean
  
  /**
    * Indicates whether this update is in a "pending" state. When true, that means the update has been downloaded and installed, but the app restart
    * needed to apply it hasn't occurred yet, and therefore, its changes aren't currently visible to the end-user.
    */
  var isPending: Boolean
  
  /**
    * The internal label automatically given to the update by the Goby server. This value uniquely identifies the update within its deployment.
    */
  var label: String
  
  /**
    * The SHA hash value of the update.
    */
  var packageHash: String
  
  /**
    * The size of the code contained within the update, in bytes.
    */
  var packageSize: Double
}
object Package {
  
  inline def apply(
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
  
  extension [Self <: Package](x: Self) {
    
    inline def setAppVersion(value: String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
    
    inline def setDeploymentKey(value: String): Self = StObject.set(x, "deploymentKey", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setFailedInstall(value: Boolean): Self = StObject.set(x, "failedInstall", value.asInstanceOf[js.Any])
    
    inline def setIsFirstRun(value: Boolean): Self = StObject.set(x, "isFirstRun", value.asInstanceOf[js.Any])
    
    inline def setIsMandatory(value: Boolean): Self = StObject.set(x, "isMandatory", value.asInstanceOf[js.Any])
    
    inline def setIsPending(value: Boolean): Self = StObject.set(x, "isPending", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setPackageHash(value: String): Self = StObject.set(x, "packageHash", value.asInstanceOf[js.Any])
    
    inline def setPackageSize(value: Double): Self = StObject.set(x, "packageSize", value.asInstanceOf[js.Any])
  }
}
