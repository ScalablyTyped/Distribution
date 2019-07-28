package typings.atPulumiKubernetes.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
  */
trait AzureFileVolumeSource extends js.Object {
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
    * Share Name
    */
  val shareName: String
}

object AzureFileVolumeSource {
  @scala.inline
  def apply(readOnly: Boolean, secretName: String, shareName: String): AzureFileVolumeSource = {
    val __obj = js.Dynamic.literal(readOnly = readOnly, secretName = secretName, shareName = shareName)
  
    __obj.asInstanceOf[AzureFileVolumeSource]
  }
}

