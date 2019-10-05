package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Flocker volume mounted by the Flocker agent. One and only one of datasetName and
  * datasetUUID should be set. Flocker volumes do not support ownership management or SELinux
  * relabeling.
  */
trait FlockerVolumeSource extends js.Object {
  /**
    * Name of the dataset stored as metadata -> name on the dataset for Flocker should be
    * considered as deprecated
    */
  var datasetName: js.UndefOr[Input[String]] = js.undefined
  /**
    * UUID of the dataset. This is unique identifier of a Flocker dataset
    */
  var datasetUUID: js.UndefOr[Input[String]] = js.undefined
}

object FlockerVolumeSource {
  @scala.inline
  def apply(datasetName: Input[String] = null, datasetUUID: Input[String] = null): FlockerVolumeSource = {
    val __obj = js.Dynamic.literal()
    if (datasetName != null) __obj.updateDynamic("datasetName")(datasetName.asInstanceOf[js.Any])
    if (datasetUUID != null) __obj.updateDynamic("datasetUUID")(datasetUUID.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlockerVolumeSource]
  }
}

