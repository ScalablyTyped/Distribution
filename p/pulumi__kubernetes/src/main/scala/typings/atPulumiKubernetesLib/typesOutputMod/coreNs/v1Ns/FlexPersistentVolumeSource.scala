package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * FlexPersistentVolumeSource represents a generic persistent volume resource that is
         * provisioned/attached using an exec based plugin.
         */

trait FlexPersistentVolumeSource extends js.Object {
  /**
               * Driver is the name of the driver to use for this volume.
               */
  val driver: java.lang.String
  /**
               * Filesystem type to mount. Must be a filesystem type supported by the host operating system.
               * Ex. "ext4", "xfs", "ntfs". The default filesystem depends on FlexVolume script.
               */
  val fsType: java.lang.String
  /**
               * Optional: Extra command options if any.
               */
  val options: ScalablyTyped.runtime.StringDictionary[java.lang.String]
  /**
               * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
               * VolumeMounts.
               */
  val readOnly: scala.Boolean
  /**
               * Optional: SecretRef is reference to the secret object containing sensitive information to
               * pass to the plugin scripts. This may be empty if no secret object is specified. If the
               * secret object contains more than one secret, all secrets are passed to the plugin scripts.
               */
  val secretRef: SecretReference
}

