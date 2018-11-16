package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Represents storage that is managed by an external CSI volume driver
         */

trait CSIPersistentVolumeSource extends js.Object {
  /**
               * Driver is the name of the driver to use for this volume. Required.
               */
  val driver: java.lang.String
  /**
               * Optional: The value to pass to ControllerPublishVolumeRequest. Defaults to false
               * (read/write).
               */
  val readOnly: scala.Boolean
  /**
               * VolumeHandle is the unique volume name returned by the CSI volume plugin’s CreateVolume
               * to refer to the volume on all subsequent calls. Required.
               */
  val volumeHandle: java.lang.String
}

