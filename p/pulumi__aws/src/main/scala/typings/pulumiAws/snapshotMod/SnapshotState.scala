package typings.pulumiAws.snapshotMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotState extends js.Object {
  
  /**
    * Amazon Resource Name (ARN) of the EBS Snapshot.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The data encryption key identifier for the snapshot.
    */
  val dataEncryptionKeyId: js.UndefOr[Input[String]] = js.native
  
  /**
    * A description of what the snapshot is.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * Whether the snapshot is encrypted.
    */
  val encrypted: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The ARN for the KMS encryption key.
    */
  val kmsKeyId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Value from an Amazon-maintained list (`amazon`, `aws-marketplace`, `microsoft`) of snapshot owners.
    */
  val ownerAlias: js.UndefOr[Input[String]] = js.native
  
  /**
    * The AWS account ID of the EBS snapshot owner.
    */
  val ownerId: js.UndefOr[Input[String]] = js.native
  
  /**
    * A map of tags to assign to the snapshot
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The Volume ID of which to make a snapshot.
    */
  val volumeId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The size of the drive in GiBs.
    */
  val volumeSize: js.UndefOr[Input[Double]] = js.native
}
object SnapshotState {
  
  @scala.inline
  def apply(): SnapshotState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotState]
  }
  
  @scala.inline
  implicit class SnapshotStateOps[Self <: SnapshotState] (val x: Self) extends AnyVal {
    
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
    def setDataEncryptionKeyId(value: Input[String]): Self = this.set("dataEncryptionKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataEncryptionKeyId: Self = this.set("dataEncryptionKeyId", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEncrypted(value: Input[Boolean]): Self = this.set("encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncrypted: Self = this.set("encrypted", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: Input[String]): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("kmsKeyId", js.undefined)
    
    @scala.inline
    def setOwnerAlias(value: Input[String]): Self = this.set("ownerAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerAlias: Self = this.set("ownerAlias", js.undefined)
    
    @scala.inline
    def setOwnerId(value: Input[String]): Self = this.set("ownerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerId: Self = this.set("ownerId", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setVolumeId(value: Input[String]): Self = this.set("volumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeId: Self = this.set("volumeId", js.undefined)
    
    @scala.inline
    def setVolumeSize(value: Input[Double]): Self = this.set("volumeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeSize: Self = this.set("volumeSize", js.undefined)
  }
}
