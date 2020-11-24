package typings.pulumiAws.volumeAttachmentMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VolumeAttachmentArgs extends js.Object {
  
  /**
    * The device name to expose to the instance (for
    * example, `/dev/sdh` or `xvdh`).  See [Device Naming on Linux Instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html#available-ec2-device-names) and [Device Naming on Windows Instances](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/device_naming.html#available-ec2-device-names) for more information.
    */
  val deviceName: Input[String] = js.native
  
  /**
    * Set to `true` if you want to force the
    * volume to detach. Useful if previous attempts failed, but use this option only
    * as a last resort, as this can result in **data loss**. See
    * [Detaching an Amazon EBS Volume from an Instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-detaching-volume.html) for more information.
    */
  val forceDetach: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * ID of the Instance to attach to
    */
  val instanceId: Input[String] = js.native
  
  /**
    * Set this to true if you do not wish
    * to detach the volume from the instance to which it is attached at destroy
    * time, and instead just remove the attachment from this provider state. This is
    * useful when destroying an instance which has volumes created by some other
    * means attached.
    */
  val skipDestroy: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * ID of the Volume to be attached
    */
  val volumeId: Input[String] = js.native
}
object VolumeAttachmentArgs {
  
  @scala.inline
  def apply(deviceName: Input[String], instanceId: Input[String], volumeId: Input[String]): VolumeAttachmentArgs = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], volumeId = volumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeAttachmentArgs]
  }
  
  @scala.inline
  implicit class VolumeAttachmentArgsOps[Self <: VolumeAttachmentArgs] (val x: Self) extends AnyVal {
    
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
    def setDeviceName(value: Input[String]): Self = this.set("deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: Input[String]): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeId(value: Input[String]): Self = this.set("volumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceDetach(value: Input[Boolean]): Self = this.set("forceDetach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceDetach: Self = this.set("forceDetach", js.undefined)
    
    @scala.inline
    def setSkipDestroy(value: Input[Boolean]): Self = this.set("skipDestroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipDestroy: Self = this.set("skipDestroy", js.undefined)
  }
}
