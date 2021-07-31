package typings.pulumiAws.outputMod.iot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicRuleS3 extends StObject {
  
  /**
    * The Amazon S3 bucket name.
    */
  var bucketName: String
  
  /**
    * The object key.
    */
  var key: String
  
  /**
    * The IAM role ARN that allows access to the CloudWatch alarm.
    */
  var roleArn: String
}
object TopicRuleS3 {
  
  @scala.inline
  def apply(bucketName: String, key: String, roleArn: String): TopicRuleS3 = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleS3]
  }
  
  @scala.inline
  implicit class TopicRuleS3MutableBuilder[Self <: TopicRuleS3] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
