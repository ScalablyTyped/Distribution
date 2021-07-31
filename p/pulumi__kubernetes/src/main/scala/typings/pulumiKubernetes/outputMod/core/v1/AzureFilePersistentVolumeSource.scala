package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
  */
trait AzureFilePersistentVolumeSource extends StObject {
  
  /**
    * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
    */
  var readOnly: Boolean
  
  /**
    * the name of secret that contains Azure Storage Account Name and Key
    */
  var secretName: String
  
  /**
    * the namespace of the secret that contains Azure Storage Account Name and Key default is the same as the Pod
    */
  var secretNamespace: String
  
  /**
    * Share Name
    */
  var shareName: String
}
object AzureFilePersistentVolumeSource {
  
  @scala.inline
  def apply(readOnly: Boolean, secretName: String, secretNamespace: String, shareName: String): AzureFilePersistentVolumeSource = {
    val __obj = js.Dynamic.literal(readOnly = readOnly.asInstanceOf[js.Any], secretName = secretName.asInstanceOf[js.Any], secretNamespace = secretNamespace.asInstanceOf[js.Any], shareName = shareName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureFilePersistentVolumeSource]
  }
  
  @scala.inline
  implicit class AzureFilePersistentVolumeSourceMutableBuilder[Self <: AzureFilePersistentVolumeSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretName(value: String): Self = StObject.set(x, "secretName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretNamespace(value: String): Self = StObject.set(x, "secretNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareName(value: String): Self = StObject.set(x, "shareName", value.asInstanceOf[js.Any])
  }
}
