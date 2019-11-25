package typings.atPulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
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
  val driver: String
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system.
    * Ex. "ext4", "xfs", "ntfs". The default filesystem depends on FlexVolume script.
    */
  val fsType: String
  /**
    * Optional: Extra command options if any.
    */
  val options: StringDictionary[String]
  /**
    * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
    * VolumeMounts.
    */
  val readOnly: Boolean
  /**
    * Optional: SecretRef is reference to the secret object containing sensitive information to
    * pass to the plugin scripts. This may be empty if no secret object is specified. If the
    * secret object contains more than one secret, all secrets are passed to the plugin scripts.
    */
  val secretRef: SecretReference
}

object FlexPersistentVolumeSource {
  @scala.inline
  def apply(
    driver: String,
    fsType: String,
    options: StringDictionary[String],
    readOnly: Boolean,
    secretRef: SecretReference
  ): FlexPersistentVolumeSource = {
    val __obj = js.Dynamic.literal(driver = driver.asInstanceOf[js.Any], fsType = fsType.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], secretRef = secretRef.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FlexPersistentVolumeSource]
  }
}

