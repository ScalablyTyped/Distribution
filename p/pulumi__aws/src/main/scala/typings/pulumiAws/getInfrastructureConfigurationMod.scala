package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.imagebuilder.GetInfrastructureConfigurationLogging
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getInfrastructureConfigurationMod {
  
  @JSImport("@pulumi/aws/imagebuilder/getInfrastructureConfiguration", "getInfrastructureConfiguration")
  @js.native
  def getInfrastructureConfiguration(args: GetInfrastructureConfigurationArgs): js.Promise[GetInfrastructureConfigurationResult] = js.native
  @JSImport("@pulumi/aws/imagebuilder/getInfrastructureConfiguration", "getInfrastructureConfiguration")
  @js.native
  def getInfrastructureConfiguration(args: GetInfrastructureConfigurationArgs, opts: InvokeOptions): js.Promise[GetInfrastructureConfigurationResult] = js.native
  
  @js.native
  trait GetInfrastructureConfigurationArgs extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the infrastructure configuration.
      */
    val arn: String = js.native
    
    /**
      * Key-value map of resource tags for the infrastructure created by the infrastructure configuration.
      */
    val resourceTags: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * Key-value map of resource tags for the infrastructure configuration.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetInfrastructureConfigurationArgs {
    
    @scala.inline
    def apply(arn: String): GetInfrastructureConfigurationArgs = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetInfrastructureConfigurationArgs]
    }
    
    @scala.inline
    implicit class GetInfrastructureConfigurationArgsMutableBuilder[Self <: GetInfrastructureConfigurationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceTags(value: StringDictionary[String]): Self = StObject.set(x, "resourceTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceTagsUndefined: Self = StObject.set(x, "resourceTags", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetInfrastructureConfigurationResult extends StObject {
    
    val arn: String = js.native
    
    /**
      * Date the infrastructure configuration was updated.
      */
    val dateCreated: String = js.native
    
    val dateUpdated: String = js.native
    
    /**
      * Description of the infrastructure configuration.
      */
    val description: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * Name of the IAM Instance Profile associated with the configuration.
      */
    val instanceProfileName: String = js.native
    
    /**
      * Set of EC2 Instance Types associated with the configuration.
      */
    val instanceTypes: js.Array[String] = js.native
    
    /**
      * Name of the EC2 Key Pair associated with the configuration.
      */
    val keyPair: String = js.native
    
    /**
      * Nested list of logging settings.
      */
    val loggings: js.Array[GetInfrastructureConfigurationLogging] = js.native
    
    /**
      * Name of the infrastructure configuration.
      */
    val name: String = js.native
    
    /**
      * Key-value map of resource tags for the infrastructure created by the infrastructure configuration.
      */
    val resourceTags: StringDictionary[String] = js.native
    
    /**
      * Set of EC2 Security Group identifiers associated with the configuration.
      */
    val securityGroupIds: js.Array[String] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the SNS Topic associated with the configuration.
      */
    val snsTopicArn: String = js.native
    
    /**
      * Identifier of the EC2 Subnet associated with the configuration.
      */
    val subnetId: String = js.native
    
    /**
      * Key-value map of resource tags for the infrastructure configuration.
      */
    val tags: StringDictionary[String] = js.native
    
    /**
      * Whether instances are terminated on failure.
      */
    val terminateInstanceOnFailure: Boolean = js.native
  }
  object GetInfrastructureConfigurationResult {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class GetInfrastructureConfigurationResultMutableBuilder[Self <: GetInfrastructureConfigurationResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateCreated(value: String): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUpdated(value: String): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceProfileName(value: String): Self = StObject.set(x, "instanceProfileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceTypes(value: js.Array[String]): Self = StObject.set(x, "instanceTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceTypesVarargs(value: String*): Self = StObject.set(x, "instanceTypes", js.Array(value :_*))
      
      @scala.inline
      def setKeyPair(value: String): Self = StObject.set(x, "keyPair", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggings(value: js.Array[GetInfrastructureConfigurationLogging]): Self = StObject.set(x, "loggings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggingsVarargs(value: GetInfrastructureConfigurationLogging*): Self = StObject.set(x, "loggings", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceTags(value: StringDictionary[String]): Self = StObject.set(x, "resourceTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupIds(value: js.Array[String]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
      
      @scala.inline
      def setSnsTopicArn(value: String): Self = StObject.set(x, "snsTopicArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetId(value: String): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTerminateInstanceOnFailure(value: Boolean): Self = StObject.set(x, "terminateInstanceOnFailure", value.asInstanceOf[js.Any])
    }
  }
}
