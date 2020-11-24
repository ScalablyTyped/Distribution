package typings.pulumiKubernetes.inputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
  */
@js.native
trait FlexVolumeSource extends js.Object {
  
  /**
    * Driver is the name of the driver to use for this volume.
    */
  var driver: Input[String] = js.native
  
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". The default filesystem depends on FlexVolume script.
    */
  var fsType: js.UndefOr[Input[String]] = js.native
  
  /**
    * Optional: Extra command options if any.
    */
  var options: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Optional: SecretRef is reference to the secret object containing sensitive information to pass to the plugin scripts. This may be empty if no secret object is specified. If the secret object contains more than one secret, all secrets are passed to the plugin scripts.
    */
  var secretRef: js.UndefOr[Input[LocalObjectReference]] = js.native
}
object FlexVolumeSource {
  
  @scala.inline
  def apply(driver: Input[String]): FlexVolumeSource = {
    val __obj = js.Dynamic.literal(driver = driver.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexVolumeSource]
  }
  
  @scala.inline
  implicit class FlexVolumeSourceOps[Self <: FlexVolumeSource] (val x: Self) extends AnyVal {
    
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
    def setDriver(value: Input[String]): Self = this.set("driver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFsType(value: Input[String]): Self = this.set("fsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFsType: Self = this.set("fsType", js.undefined)
    
    @scala.inline
    def setOptions(value: Input[StringDictionary[Input[String]]]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Input[Boolean]): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setSecretRef(value: Input[LocalObjectReference]): Self = this.set("secretRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretRef: Self = this.set("secretRef", js.undefined)
  }
}
