package typings.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirehoseDeliveryStreamElasticsearchConfigurationVpcConfig extends StObject {
  
  /**
    * The ARN of the IAM role to be assumed by Firehose for calling the Amazon EC2 configuration API and for creating network interfaces. Make sure role has necessary [IAM permissions](https://docs.aws.amazon.com/firehose/latest/dev/controlling-access.html#using-iam-es-vpc)
    */
  var roleArn: String
  
  /**
    * A list of security group IDs to associate with Kinesis Firehose.
    */
  var securityGroupIds: js.Array[String]
  
  /**
    * A list of subnet IDs to associate with Kinesis Firehose.
    */
  var subnetIds: js.Array[String]
  
  var vpcId: String
}
object FirehoseDeliveryStreamElasticsearchConfigurationVpcConfig {
  
  inline def apply(roleArn: String, securityGroupIds: js.Array[String], subnetIds: js.Array[String], vpcId: String): FirehoseDeliveryStreamElasticsearchConfigurationVpcConfig = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamElasticsearchConfigurationVpcConfig]
  }
  
  extension [Self <: FirehoseDeliveryStreamElasticsearchConfigurationVpcConfig](x: Self) {
    
    inline def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIds(value: js.Array[String]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
    
    inline def setSubnetIds(value: js.Array[String]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
    
    inline def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
  }
}
