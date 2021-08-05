package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.imagebuilder.GetInfrastructureConfigurationLogging
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getInfrastructureConfigurationMod {
  
  @JSImport("@pulumi/aws/imagebuilder/getInfrastructureConfiguration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInfrastructureConfiguration(args: GetInfrastructureConfigurationArgs): js.Promise[GetInfrastructureConfigurationResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInfrastructureConfiguration")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetInfrastructureConfigurationResult]]
  inline def getInfrastructureConfiguration(args: GetInfrastructureConfigurationArgs, opts: InvokeOptions): js.Promise[GetInfrastructureConfigurationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getInfrastructureConfiguration")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetInfrastructureConfigurationResult]]
  
  trait GetInfrastructureConfigurationArgs extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the infrastructure configuration.
      */
    val arn: String
    
    /**
      * Key-value map of resource tags for the infrastructure created by the infrastructure configuration.
      */
    val resourceTags: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * Key-value map of resource tags for the infrastructure configuration.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetInfrastructureConfigurationArgs {
    
    inline def apply(arn: String): GetInfrastructureConfigurationArgs = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetInfrastructureConfigurationArgs]
    }
    
    extension [Self <: GetInfrastructureConfigurationArgs](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setResourceTags(value: StringDictionary[String]): Self = StObject.set(x, "resourceTags", value.asInstanceOf[js.Any])
      
      inline def setResourceTagsUndefined: Self = StObject.set(x, "resourceTags", js.undefined)
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait GetInfrastructureConfigurationResult extends StObject {
    
    val arn: String
    
    /**
      * Date the infrastructure configuration was updated.
      */
    val dateCreated: String
    
    val dateUpdated: String
    
    /**
      * Description of the infrastructure configuration.
      */
    val description: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * Name of the IAM Instance Profile associated with the configuration.
      */
    val instanceProfileName: String
    
    /**
      * Set of EC2 Instance Types associated with the configuration.
      */
    val instanceTypes: js.Array[String]
    
    /**
      * Name of the EC2 Key Pair associated with the configuration.
      */
    val keyPair: String
    
    /**
      * Nested list of logging settings.
      */
    val loggings: js.Array[GetInfrastructureConfigurationLogging]
    
    /**
      * Name of the infrastructure configuration.
      */
    val name: String
    
    /**
      * Key-value map of resource tags for the infrastructure created by the infrastructure configuration.
      */
    val resourceTags: StringDictionary[String]
    
    /**
      * Set of EC2 Security Group identifiers associated with the configuration.
      */
    val securityGroupIds: js.Array[String]
    
    /**
      * Amazon Resource Name (ARN) of the SNS Topic associated with the configuration.
      */
    val snsTopicArn: String
    
    /**
      * Identifier of the EC2 Subnet associated with the configuration.
      */
    val subnetId: String
    
    /**
      * Key-value map of resource tags for the infrastructure configuration.
      */
    val tags: StringDictionary[String]
    
    /**
      * Whether instances are terminated on failure.
      */
    val terminateInstanceOnFailure: Boolean
  }
  object GetInfrastructureConfigurationResult {
    
    inline def apply(
      arn: String,
      dateCreated: String,
      dateUpdated: String,
      description: String,
      id: String,
      instanceProfileName: String,
      instanceTypes: js.Array[String],
      keyPair: String,
      loggings: js.Array[GetInfrastructureConfigurationLogging],
      name: String,
      resourceTags: StringDictionary[String],
      securityGroupIds: js.Array[String],
      snsTopicArn: String,
      subnetId: String,
      tags: StringDictionary[String],
      terminateInstanceOnFailure: Boolean
    ): GetInfrastructureConfigurationResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], dateCreated = dateCreated.asInstanceOf[js.Any], dateUpdated = dateUpdated.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instanceProfileName = instanceProfileName.asInstanceOf[js.Any], instanceTypes = instanceTypes.asInstanceOf[js.Any], keyPair = keyPair.asInstanceOf[js.Any], loggings = loggings.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resourceTags = resourceTags.asInstanceOf[js.Any], securityGroupIds = securityGroupIds.asInstanceOf[js.Any], snsTopicArn = snsTopicArn.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], terminateInstanceOnFailure = terminateInstanceOnFailure.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetInfrastructureConfigurationResult]
    }
    
    extension [Self <: GetInfrastructureConfigurationResult](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setDateCreated(value: String): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
      
      inline def setDateUpdated(value: String): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInstanceProfileName(value: String): Self = StObject.set(x, "instanceProfileName", value.asInstanceOf[js.Any])
      
      inline def setInstanceTypes(value: js.Array[String]): Self = StObject.set(x, "instanceTypes", value.asInstanceOf[js.Any])
      
      inline def setInstanceTypesVarargs(value: String*): Self = StObject.set(x, "instanceTypes", js.Array(value :_*))
      
      inline def setKeyPair(value: String): Self = StObject.set(x, "keyPair", value.asInstanceOf[js.Any])
      
      inline def setLoggings(value: js.Array[GetInfrastructureConfigurationLogging]): Self = StObject.set(x, "loggings", value.asInstanceOf[js.Any])
      
      inline def setLoggingsVarargs(value: GetInfrastructureConfigurationLogging*): Self = StObject.set(x, "loggings", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setResourceTags(value: StringDictionary[String]): Self = StObject.set(x, "resourceTags", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupIds(value: js.Array[String]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
      
      inline def setSnsTopicArn(value: String): Self = StObject.set(x, "snsTopicArn", value.asInstanceOf[js.Any])
      
      inline def setSubnetId(value: String): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTerminateInstanceOnFailure(value: Boolean): Self = StObject.set(x, "terminateInstanceOnFailure", value.asInstanceOf[js.Any])
    }
  }
}
