package typings.pulumiAws.bucketOwnershipControlsMod

import typings.pulumiAws.inputMod.s3.BucketOwnershipControlsRule
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketOwnershipControlsState extends js.Object {
  
  /**
    * The name of the bucket that you want to associate this access point with.
    */
  val bucket: js.UndefOr[Input[String]] = js.native
  
  /**
    * Configuration block(s) with Ownership Controls rules. Detailed below.
    */
  val rule: js.UndefOr[Input[BucketOwnershipControlsRule]] = js.native
}
object BucketOwnershipControlsState {
  
  @scala.inline
  def apply(): BucketOwnershipControlsState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketOwnershipControlsState]
  }
  
  @scala.inline
  implicit class BucketOwnershipControlsStateOps[Self <: BucketOwnershipControlsState] (val x: Self) extends AnyVal {
    
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
    def setBucket(value: Input[String]): Self = this.set("bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucket: Self = this.set("bucket", js.undefined)
    
    @scala.inline
    def setRule(value: Input[BucketOwnershipControlsRule]): Self = this.set("rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRule: Self = this.set("rule", js.undefined)
  }
}
