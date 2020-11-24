package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketReplicationConfiguration extends js.Object {
  
  /**
    * The ARN of the IAM role for Amazon S3 to assume when replicating the objects.
    */
  var role: Input[String] = js.native
  
  /**
    * Specifies the rules managing the replication (documented below).
    */
  var rules: Input[js.Array[Input[BucketReplicationConfigurationRule]]] = js.native
}
object BucketReplicationConfiguration {
  
  @scala.inline
  def apply(role: Input[String], rules: Input[js.Array[Input[BucketReplicationConfigurationRule]]]): BucketReplicationConfiguration = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketReplicationConfiguration]
  }
  
  @scala.inline
  implicit class BucketReplicationConfigurationOps[Self <: BucketReplicationConfiguration] (val x: Self) extends AnyVal {
    
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
    def setRole(value: Input[String]): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesVarargs(value: Input[BucketReplicationConfigurationRule]*): Self = this.set("rules", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: Input[js.Array[Input[BucketReplicationConfigurationRule]]]): Self = this.set("rules", value.asInstanceOf[js.Any])
  }
}
