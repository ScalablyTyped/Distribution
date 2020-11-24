package typings.pulumiAws.amiCopyMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.AmiCopyEbsBlockDevice
import typings.pulumiAws.inputMod.ec2.AmiCopyEphemeralBlockDevice
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AmiCopyArgs extends js.Object {
  
  /**
    * A longer, human-readable description for the AMI.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * Nested block describing an EBS block device that should be
    * attached to created instances. The structure of this block is described below.
    */
  val ebsBlockDevices: js.UndefOr[Input[js.Array[Input[AmiCopyEbsBlockDevice]]]] = js.native
  
  /**
    * Boolean controlling whether the created EBS volumes will be encrypted. Can't be used with `snapshotId`.
    */
  val encrypted: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Nested block describing an ephemeral block device that
    * should be attached to created instances. The structure of this block is described below.
    */
  val ephemeralBlockDevices: js.UndefOr[Input[js.Array[Input[AmiCopyEphemeralBlockDevice]]]] = js.native
  
  /**
    * The full ARN of the AWS Key Management Service (AWS KMS) CMK to use when encrypting the snapshots of
    * an image during a copy operation. This parameter is only required if you want to use a non-default CMK;
    * if this parameter is not specified, the default CMK for EBS is used
    */
  val kmsKeyId: js.UndefOr[Input[String]] = js.native
  
  /**
    * A region-unique name for the AMI.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The id of the AMI to copy. This id must be valid in the region
    * given by `sourceAmiRegion`.
    */
  val sourceAmiId: Input[String] = js.native
  
  /**
    * The region from which the AMI will be copied. This may be the
    * same as the AWS provider region in order to create a copy within the same region.
    */
  val sourceAmiRegion: Input[String] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object AmiCopyArgs {
  
  @scala.inline
  def apply(sourceAmiId: Input[String], sourceAmiRegion: Input[String]): AmiCopyArgs = {
    val __obj = js.Dynamic.literal(sourceAmiId = sourceAmiId.asInstanceOf[js.Any], sourceAmiRegion = sourceAmiRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmiCopyArgs]
  }
  
  @scala.inline
  implicit class AmiCopyArgsOps[Self <: AmiCopyArgs] (val x: Self) extends AnyVal {
    
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
    def setSourceAmiId(value: Input[String]): Self = this.set("sourceAmiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceAmiRegion(value: Input[String]): Self = this.set("sourceAmiRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEbsBlockDevicesVarargs(value: Input[AmiCopyEbsBlockDevice]*): Self = this.set("ebsBlockDevices", js.Array(value :_*))
    
    @scala.inline
    def setEbsBlockDevices(value: Input[js.Array[Input[AmiCopyEbsBlockDevice]]]): Self = this.set("ebsBlockDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEbsBlockDevices: Self = this.set("ebsBlockDevices", js.undefined)
    
    @scala.inline
    def setEncrypted(value: Input[Boolean]): Self = this.set("encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncrypted: Self = this.set("encrypted", js.undefined)
    
    @scala.inline
    def setEphemeralBlockDevicesVarargs(value: Input[AmiCopyEphemeralBlockDevice]*): Self = this.set("ephemeralBlockDevices", js.Array(value :_*))
    
    @scala.inline
    def setEphemeralBlockDevices(value: Input[js.Array[Input[AmiCopyEphemeralBlockDevice]]]): Self = this.set("ephemeralBlockDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEphemeralBlockDevices: Self = this.set("ephemeralBlockDevices", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: Input[String]): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("kmsKeyId", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
