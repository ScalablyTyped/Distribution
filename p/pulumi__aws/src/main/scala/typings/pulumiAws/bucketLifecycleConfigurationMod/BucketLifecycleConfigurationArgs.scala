package typings.pulumiAws.bucketLifecycleConfigurationMod

import typings.pulumiAws.inputMod.s3control.BucketLifecycleConfigurationRule
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketLifecycleConfigurationArgs extends js.Object {
  
  /**
    * Amazon Resource Name (ARN) of the bucket.
    */
  val bucket: Input[String] = js.native
  
  /**
    * Configuration block(s) containing lifecycle rules for the bucket.
    */
  val rules: Input[js.Array[Input[BucketLifecycleConfigurationRule]]] = js.native
}
object BucketLifecycleConfigurationArgs {
  
  @scala.inline
  def apply(bucket: Input[String], rules: Input[js.Array[Input[BucketLifecycleConfigurationRule]]]): BucketLifecycleConfigurationArgs = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketLifecycleConfigurationArgs]
  }
  
  @scala.inline
  implicit class BucketLifecycleConfigurationArgsOps[Self <: BucketLifecycleConfigurationArgs] (val x: Self) extends AnyVal {
    
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
    def setRulesVarargs(value: Input[BucketLifecycleConfigurationRule]*): Self = this.set("rules", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: Input[js.Array[Input[BucketLifecycleConfigurationRule]]]): Self = this.set("rules", value.asInstanceOf[js.Any])
  }
}
