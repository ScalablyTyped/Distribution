package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
  */
trait AzureFileVolumeSource extends StObject {
  
  /**
    * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
    */
  var readOnly: Boolean
  
  /**
    * the name of secret that contains Azure Storage Account Name and Key
    */
  var secretName: String
  
  /**
    * Share Name
    */
  var shareName: String
}
object AzureFileVolumeSource {
  
  inline def apply(readOnly: Boolean, secretName: String, shareName: String): AzureFileVolumeSource = {
    val __obj = js.Dynamic.literal(readOnly = readOnly.asInstanceOf[js.Any], secretName = secretName.asInstanceOf[js.Any], shareName = shareName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureFileVolumeSource]
  }
  
  extension [Self <: AzureFileVolumeSource](x: Self) {
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setSecretName(value: String): Self = StObject.set(x, "secretName", value.asInstanceOf[js.Any])
    
    inline def setShareName(value: String): Self = StObject.set(x, "shareName", value.asInstanceOf[js.Any])
  }
}
