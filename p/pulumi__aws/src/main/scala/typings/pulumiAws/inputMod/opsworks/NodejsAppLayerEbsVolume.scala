package typings.pulumiAws.inputMod.opsworks

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodejsAppLayerEbsVolume extends js.Object {
  
  var encrypted: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * For PIOPS volumes, the IOPS per disk.
    */
  var iops: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The path to mount the EBS volume on the layer's instances.
    */
  var mountPoint: Input[String] = js.native
  
  /**
    * The number of disks to use for the EBS volume.
    */
  var numberOfDisks: Input[Double] = js.native
  
  /**
    * The RAID level to use for the volume.
    */
  var raidLevel: js.UndefOr[Input[String]] = js.native
  
  /**
    * The size of the volume in gigabytes.
    */
  var size: Input[Double] = js.native
  
  /**
    * The type of volume to create. This may be `standard` (the default), `io1` or `gp2`.
    */
  var `type`: js.UndefOr[Input[String]] = js.native
}
object NodejsAppLayerEbsVolume {
  
  @scala.inline
  def apply(mountPoint: Input[String], numberOfDisks: Input[Double], size: Input[Double]): NodejsAppLayerEbsVolume = {
    val __obj = js.Dynamic.literal(mountPoint = mountPoint.asInstanceOf[js.Any], numberOfDisks = numberOfDisks.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodejsAppLayerEbsVolume]
  }
  
  @scala.inline
  implicit class NodejsAppLayerEbsVolumeOps[Self <: NodejsAppLayerEbsVolume] (val x: Self) extends AnyVal {
    
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
    def setMountPoint(value: Input[String]): Self = this.set("mountPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfDisks(value: Input[Double]): Self = this.set("numberOfDisks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Input[Double]): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncrypted(value: Input[Boolean]): Self = this.set("encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncrypted: Self = this.set("encrypted", js.undefined)
    
    @scala.inline
    def setIops(value: Input[Double]): Self = this.set("iops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIops: Self = this.set("iops", js.undefined)
    
    @scala.inline
    def setRaidLevel(value: Input[String]): Self = this.set("raidLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaidLevel: Self = this.set("raidLevel", js.undefined)
    
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
