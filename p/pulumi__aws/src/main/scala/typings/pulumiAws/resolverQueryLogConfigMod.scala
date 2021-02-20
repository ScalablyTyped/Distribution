package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolverQueryLogConfigMod {
  
  @JSImport("@pulumi/aws/route53/resolverQueryLogConfig", "ResolverQueryLogConfig")
  @js.native
  class ResolverQueryLogConfig protected () extends CustomResource {
    /**
      * Create a ResolverQueryLogConfig resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResolverQueryLogConfigArgs) = this()
    def this(name: String, args: ResolverQueryLogConfigArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN (Amazon Resource Name) of the Route 53 Resolver query logging configuration.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The ARN of the resource that you want Route 53 Resolver to send query logs.
      * You can send query logs to an S3 bucket, a CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream.
      */
    val destinationArn: Output_[String] = js.native
    
    /**
      * The name of the Route 53 Resolver query logging configuration.
      */
    val name: Output_[String] = js.native
    
    /**
      * The AWS account ID of the account that created the query logging configuration.
      */
    val ownerId: Output_[String] = js.native
    
    /**
      * An indication of whether the query logging configuration is shared with other AWS accounts, or was shared with the current account by another AWS account.
      * Sharing is configured through AWS Resource Access Manager (AWS RAM).
      * Values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
      */
    val shareStatus: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object ResolverQueryLogConfig {
    
    /**
      * Get an existing ResolverQueryLogConfig resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/route53/resolverQueryLogConfig", "ResolverQueryLogConfig.get")
    @js.native
    def get(name: String, id: Input[ID]): ResolverQueryLogConfig = js.native
    @JSImport("@pulumi/aws/route53/resolverQueryLogConfig", "ResolverQueryLogConfig.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ResolverQueryLogConfig = js.native
    @JSImport("@pulumi/aws/route53/resolverQueryLogConfig", "ResolverQueryLogConfig.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResolverQueryLogConfigState): ResolverQueryLogConfig = js.native
    @JSImport("@pulumi/aws/route53/resolverQueryLogConfig", "ResolverQueryLogConfig.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResolverQueryLogConfigState, opts: CustomResourceOptions): ResolverQueryLogConfig = js.native
    
    /**
      * Returns true if the given object is an instance of ResolverQueryLogConfig.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/route53/resolverQueryLogConfig", "ResolverQueryLogConfig.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/resolverQueryLogConfig.ResolverQueryLogConfig */ Boolean = js.native
  }
  
  @js.native
  trait ResolverQueryLogConfigArgs extends StObject {
    
    /**
      * The ARN of the resource that you want Route 53 Resolver to send query logs.
      * You can send query logs to an S3 bucket, a CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream.
      */
    val destinationArn: Input[String] = js.native
    
    /**
      * The name of the Route 53 Resolver query logging configuration.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object ResolverQueryLogConfigArgs {
    
    @scala.inline
    def apply(destinationArn: Input[String]): ResolverQueryLogConfigArgs = {
      val __obj = js.Dynamic.literal(destinationArn = destinationArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolverQueryLogConfigArgs]
    }
    
    @scala.inline
    implicit class ResolverQueryLogConfigArgsMutableBuilder[Self <: ResolverQueryLogConfigArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestinationArn(value: Input[String]): Self = StObject.set(x, "destinationArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait ResolverQueryLogConfigState extends StObject {
    
    /**
      * The ARN (Amazon Resource Name) of the Route 53 Resolver query logging configuration.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN of the resource that you want Route 53 Resolver to send query logs.
      * You can send query logs to an S3 bucket, a CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream.
      */
    val destinationArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the Route 53 Resolver query logging configuration.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The AWS account ID of the account that created the query logging configuration.
      */
    val ownerId: js.UndefOr[Input[String]] = js.native
    
    /**
      * An indication of whether the query logging configuration is shared with other AWS accounts, or was shared with the current account by another AWS account.
      * Sharing is configured through AWS Resource Access Manager (AWS RAM).
      * Values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
      */
    val shareStatus: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object ResolverQueryLogConfigState {
    
    @scala.inline
    def apply(): ResolverQueryLogConfigState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResolverQueryLogConfigState]
    }
    
    @scala.inline
    implicit class ResolverQueryLogConfigStateMutableBuilder[Self <: ResolverQueryLogConfigState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDestinationArn(value: Input[String]): Self = StObject.set(x, "destinationArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationArnUndefined: Self = StObject.set(x, "destinationArn", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOwnerId(value: Input[String]): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
      
      @scala.inline
      def setShareStatus(value: Input[String]): Self = StObject.set(x, "shareStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShareStatusUndefined: Self = StObject.set(x, "shareStatus", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
