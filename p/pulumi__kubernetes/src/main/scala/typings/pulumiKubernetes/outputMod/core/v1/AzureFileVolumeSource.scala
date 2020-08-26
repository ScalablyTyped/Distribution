package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
  */
@js.native
trait AzureFileVolumeSource extends js.Object {
  /**
    * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
    */
  var readOnly: Boolean = js.native
  /**
    * the name of secret that contains Azure Storage Account Name and Key
    */
  var secretName: String = js.native
  /**
    * Share Name
    */
  var shareName: String = js.native
}

object AzureFileVolumeSource {
  @scala.inline
  def apply(readOnly: Boolean, secretName: String, shareName: String): AzureFileVolumeSource = {
    val __obj = js.Dynamic.literal(readOnly = readOnly.asInstanceOf[js.Any], secretName = secretName.asInstanceOf[js.Any], shareName = shareName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureFileVolumeSource]
  }
  @scala.inline
  implicit class AzureFileVolumeSourceOps[Self <: AzureFileVolumeSource] (val x: Self) extends AnyVal {
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
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecretName(value: String): Self = this.set("secretName", value.asInstanceOf[js.Any])
    @scala.inline
    def setShareName(value: String): Self = this.set("shareName", value.asInstanceOf[js.Any])
  }
  
}

