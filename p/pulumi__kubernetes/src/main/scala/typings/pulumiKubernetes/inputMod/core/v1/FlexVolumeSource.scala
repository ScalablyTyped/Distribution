package typings.pulumiKubernetes.inputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * FlexVolume represents a generic volume resource that is provisioned/attached using an exec
  * based plugin.
  */
trait FlexVolumeSource extends js.Object {
  /**
    * Driver is the name of the driver to use for this volume.
    */
  var driver: Input[String]
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system.
    * Ex. "ext4", "xfs", "ntfs". The default filesystem depends on FlexVolume script.
    */
  var fsType: js.UndefOr[Input[String]] = js.undefined
  /**
    * Optional: Extra command options if any.
    */
  var options: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  /**
    * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
    * VolumeMounts.
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Optional: SecretRef is reference to the secret object containing sensitive information to
    * pass to the plugin scripts. This may be empty if no secret object is specified. If the
    * secret object contains more than one secret, all secrets are passed to the plugin scripts.
    */
  var secretRef: js.UndefOr[Input[LocalObjectReference]] = js.undefined
}

object FlexVolumeSource {
  @scala.inline
  def apply(
    driver: Input[String],
    fsType: Input[String] = null,
    options: Input[StringDictionary[Input[String]]] = null,
    readOnly: Input[Boolean] = null,
    secretRef: Input[LocalObjectReference] = null
  ): FlexVolumeSource = {
    val __obj = js.Dynamic.literal(driver = driver.asInstanceOf[js.Any])
    if (fsType != null) __obj.updateDynamic("fsType")(fsType.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (secretRef != null) __obj.updateDynamic("secretRef")(secretRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexVolumeSource]
  }
}

