package typings.pulumiAws.volumeMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VolumeState extends js.Object {
  
  /**
    * The volume ARN (e.g. arn:aws:ec2:us-east-1:0123456789012:volume/vol-59fcb34e).
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The AZ where the EBS volume will exist.
    */
  val availabilityZone: js.UndefOr[Input[String]] = js.native
  
  /**
    * If true, the disk will be encrypted.
    */
  val encrypted: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The amount of IOPS to provision for the disk. Only valid for `type` of `io1` or `io2`.
    */
  val iops: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The ARN for the KMS encryption key. When specifying `kmsKeyId`, `encrypted` needs to be set to true.
    */
  val kmsKeyId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies whether to enable Amazon EBS Multi-Attach. Multi-Attach is supported exclusively on `io1` volumes.
    */
  val multiAttachEnabled: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the Outpost.
    */
  val outpostArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The size of the drive in GiBs.
    */
  val size: js.UndefOr[Input[Double]] = js.native
  
  /**
    * A snapshot to base the EBS volume off of.
    */
  val snapshotId: js.UndefOr[Input[String]] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The type of EBS volume. Can be "standard", "gp2", "io1", "io2", "sc1" or "st1" (Default: "gp2").
    */
  val `type`: js.UndefOr[Input[String]] = js.native
}
object VolumeState {
  
  @scala.inline
  def apply(): VolumeState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeState]
  }
  
  @scala.inline
  implicit class VolumeStateOps[Self <: VolumeState] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setAvailabilityZone(value: Input[String]): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("availabilityZone", js.undefined)
    
    @scala.inline
    def setEncrypted(value: Input[Boolean]): Self = this.set("encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncrypted: Self = this.set("encrypted", js.undefined)
    
    @scala.inline
    def setIops(value: Input[Double]): Self = this.set("iops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIops: Self = this.set("iops", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: Input[String]): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("kmsKeyId", js.undefined)
    
    @scala.inline
    def setMultiAttachEnabled(value: Input[Boolean]): Self = this.set("multiAttachEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiAttachEnabled: Self = this.set("multiAttachEnabled", js.undefined)
    
    @scala.inline
    def setOutpostArn(value: Input[String]): Self = this.set("outpostArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutpostArn: Self = this.set("outpostArn", js.undefined)
    
    @scala.inline
    def setSize(value: Input[Double]): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSnapshotId(value: Input[String]): Self = this.set("snapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotId: Self = this.set("snapshotId", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
