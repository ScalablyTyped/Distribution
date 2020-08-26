package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var readOnly: js.UndefOr[Input[Boolean]] = js.native
  /**
    * the name of secret that contains Azure Storage Account Name and Key
    */
  var secretName: Input[String] = js.native
  /**
    * Share Name
    */
  var shareName: Input[String] = js.native
}

object AzureFileVolumeSource {
  @scala.inline
  def apply(secretName: Input[String], shareName: Input[String]): AzureFileVolumeSource = {
    val __obj = js.Dynamic.literal(secretName = secretName.asInstanceOf[js.Any], shareName = shareName.asInstanceOf[js.Any])
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
    def setSecretName(value: Input[String]): Self = this.set("secretName", value.asInstanceOf[js.Any])
    @scala.inline
    def setShareName(value: Input[String]): Self = this.set("shareName", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadOnly(value: Input[Boolean]): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
  }
  
}

