package typings.pulumiAws.bucketLifecycleConfigurationMod

import typings.pulumiAws.inputMod.s3control.BucketLifecycleConfigurationRule
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketLifecycleConfigurationState extends js.Object {
  
  /**
    * Amazon Resource Name (ARN) of the bucket.
    */
  val bucket: js.UndefOr[Input[String]] = js.native
  
  /**
    * Configuration block(s) containing lifecycle rules for the bucket.
    */
  val rules: js.UndefOr[Input[js.Array[Input[BucketLifecycleConfigurationRule]]]] = js.native
}
object BucketLifecycleConfigurationState {
  
  @scala.inline
  def apply(): BucketLifecycleConfigurationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketLifecycleConfigurationState]
  }
  
  @scala.inline
  implicit class BucketLifecycleConfigurationStateOps[Self <: BucketLifecycleConfigurationState] (val x: Self) extends AnyVal {
    
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
    def setRulesVarargs(value: Input[BucketLifecycleConfigurationRule]*): Self = this.set("rules", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: Input[js.Array[Input[BucketLifecycleConfigurationRule]]]): Self = this.set("rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
  }
}
