package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketReplicationConfiguration extends StObject {
  
  /**
    * The ARN of the IAM role for Amazon S3 to assume when replicating the objects.
    */
  var role: Input[String]
  
  /**
    * Specifies the rules managing the replication (documented below).
    */
  var rules: Input[js.Array[Input[BucketReplicationConfigurationRule]]]
}
object BucketReplicationConfiguration {
  
  @scala.inline
  def apply(role: Input[String], rules: Input[js.Array[Input[BucketReplicationConfigurationRule]]]): BucketReplicationConfiguration = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketReplicationConfiguration]
  }
  
  @scala.inline
  implicit class BucketReplicationConfigurationMutableBuilder[Self <: BucketReplicationConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRole(value: Input[String]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRules(value: Input[js.Array[Input[BucketReplicationConfigurationRule]]]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesVarargs(value: Input[BucketReplicationConfigurationRule]*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}
