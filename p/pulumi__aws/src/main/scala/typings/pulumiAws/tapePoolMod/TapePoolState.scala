package typings.pulumiAws.tapePoolMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TapePoolState extends js.Object {
  
  /**
    * Volume Amazon Resource Name (ARN), e.g. `aws_storagegateway_tape_pool.example arn:aws:storagegateway:us-east-1:123456789012:tapepool/pool-12345678`.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the new custom tape pool.
    */
  val poolName: js.UndefOr[Input[String]] = js.native
  
  /**
    * Tape retention lock time is set in days. Tape retention lock can be enabled for up to 100 years (36,500 days). Default value is 0.
    */
  val retentionLockTimeInDays: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Tape retention lock can be configured in two modes. When configured in governance mode, AWS accounts with specific IAM permissions are authorized to remove the tape retention lock from archived virtual tapes. When configured in compliance mode, the tape retention lock cannot be removed by any user, including the root AWS account. Possible values are `COMPLIANCE`, `GOVERNANCE`, and `NONE`. Default value is `NONE`.
    */
  val retentionLockType: js.UndefOr[Input[String]] = js.native
  
  /**
    * The storage class that is associated with the new custom pool. When you use your backup application to eject the tape, the tape is archived directly into the storage class that corresponds to the pool. Possible values are `DEEP_ARCHIVE` or `GLACIER`.
    */
  val storageClass: js.UndefOr[Input[String]] = js.native
  
  /**
    * Key-value map of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object TapePoolState {
  
  @scala.inline
  def apply(): TapePoolState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TapePoolState]
  }
  
  @scala.inline
  implicit class TapePoolStateOps[Self <: TapePoolState] (val x: Self) extends AnyVal {
    
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
    def setPoolName(value: Input[String]): Self = this.set("poolName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoolName: Self = this.set("poolName", js.undefined)
    
    @scala.inline
    def setRetentionLockTimeInDays(value: Input[Double]): Self = this.set("retentionLockTimeInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetentionLockTimeInDays: Self = this.set("retentionLockTimeInDays", js.undefined)
    
    @scala.inline
    def setRetentionLockType(value: Input[String]): Self = this.set("retentionLockType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetentionLockType: Self = this.set("retentionLockType", js.undefined)
    
    @scala.inline
    def setStorageClass(value: Input[String]): Self = this.set("storageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageClass: Self = this.set("storageClass", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
