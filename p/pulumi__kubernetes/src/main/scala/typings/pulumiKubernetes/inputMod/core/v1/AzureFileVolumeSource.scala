package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var readOnly: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * the name of secret that contains Azure Storage Account Name and Key
    */
  var secretName: Input[String]
  /**
    * Share Name
    */
  var shareName: Input[String]
}

object AzureFileVolumeSource {
  @scala.inline
  def apply(secretName: Input[String], shareName: Input[String], readOnly: Input[Boolean] = null): AzureFileVolumeSource = {
    val __obj = js.Dynamic.literal(secretName = secretName.asInstanceOf[js.Any], shareName = shareName.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureFileVolumeSource]
  }
}

