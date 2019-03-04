package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

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
  val datasetName: java.lang.String
  /**
    * UUID of the dataset. This is unique identifier of a Flocker dataset
    */
  val datasetUUID: java.lang.String
}

object FlockerVolumeSource {
  @scala.inline
  def apply(datasetName: java.lang.String, datasetUUID: java.lang.String): FlockerVolumeSource = {
    val __obj = js.Dynamic.literal(datasetName = datasetName, datasetUUID = datasetUUID)
  
    __obj.asInstanceOf[FlockerVolumeSource]
  }
}

