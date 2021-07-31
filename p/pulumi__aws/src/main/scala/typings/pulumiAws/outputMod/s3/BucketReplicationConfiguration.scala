package typings.pulumiAws.outputMod.s3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketReplicationConfiguration extends StObject {
  
  /**
    * The ARN of the IAM role for Amazon S3 to assume when replicating the objects.
    */
  var role: String
  
  /**
    * Specifies the rules managing the replication (documented below).
    */
  var rules: js.Array[BucketReplicationConfigurationRule]
}
object BucketReplicationConfiguration {
  
  @scala.inline
  def apply(role: String, rules: js.Array[BucketReplicationConfigurationRule]): BucketReplicationConfiguration = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketReplicationConfiguration]
  }
  
  @scala.inline
  implicit class BucketReplicationConfigurationMutableBuilder[Self <: BucketReplicationConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRules(value: js.Array[BucketReplicationConfigurationRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesVarargs(value: BucketReplicationConfigurationRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}
