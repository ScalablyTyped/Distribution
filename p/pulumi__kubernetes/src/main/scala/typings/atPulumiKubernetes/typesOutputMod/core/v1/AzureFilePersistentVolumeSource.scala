package typings.atPulumiKubernetes.typesOutputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
  */
trait AzureFilePersistentVolumeSource extends js.Object {
  /**
    * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
    * VolumeMounts.
    */
  val readOnly: Boolean
  /**
    * the name of secret that contains Azure Storage Account Name and Key
    */
  val secretName: String
  /**
    * the namespace of the secret that contains Azure Storage Account Name and Key default is the
    * same as the Pod
    */
  val secretNamespace: String
  /**
    * Share Name
    */
  val shareName: String
}

object AzureFilePersistentVolumeSource {
  @scala.inline
  def apply(readOnly: Boolean, secretName: String, secretNamespace: String, shareName: String): AzureFilePersistentVolumeSource = {
    val __obj = js.Dynamic.literal(readOnly = readOnly.asInstanceOf[js.Any], secretName = secretName.asInstanceOf[js.Any], secretNamespace = secretNamespace.asInstanceOf[js.Any], shareName = shareName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AzureFilePersistentVolumeSource]
  }
}

