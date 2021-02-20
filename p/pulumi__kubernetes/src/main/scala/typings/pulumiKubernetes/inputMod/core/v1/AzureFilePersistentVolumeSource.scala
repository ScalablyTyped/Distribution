package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
  */
@js.native
trait AzureFilePersistentVolumeSource extends StObject {
  
  /**
    * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * the name of secret that contains Azure Storage Account Name and Key
    */
  var secretName: Input[String] = js.native
  
  /**
    * the namespace of the secret that contains Azure Storage Account Name and Key default is the same as the Pod
    */
  var secretNamespace: js.UndefOr[Input[String]] = js.native
  
  /**
    * Share Name
    */
  var shareName: Input[String] = js.native
}
object AzureFilePersistentVolumeSource {
  
  @scala.inline
  def apply(secretName: Input[String], shareName: Input[String]): AzureFilePersistentVolumeSource = {
    val __obj = js.Dynamic.literal(secretName = secretName.asInstanceOf[js.Any], shareName = shareName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureFilePersistentVolumeSource]
  }
  
  @scala.inline
  implicit class AzureFilePersistentVolumeSourceMutableBuilder[Self <: AzureFilePersistentVolumeSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadOnly(value: Input[Boolean]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setSecretName(value: Input[String]): Self = StObject.set(x, "secretName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretNamespace(value: Input[String]): Self = StObject.set(x, "secretNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretNamespaceUndefined: Self = StObject.set(x, "secretNamespace", js.undefined)
    
    @scala.inline
    def setShareName(value: Input[String]): Self = StObject.set(x, "shareName", value.asInstanceOf[js.Any])
  }
}
