package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("@pulumi/aws/route53/resolverQueryLogConfig", "ResolverQueryLogConfig")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ResolverQueryLogConfig resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): ResolverQueryLogConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ResolverQueryLogConfig]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ResolverQueryLogConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ResolverQueryLogConfig]
    @scala.inline
    def get(name: String, id: Input[ID], state: ResolverQueryLogConfigState): ResolverQueryLogConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ResolverQueryLogConfig]
    @scala.inline
    def get(name: String, id: Input[ID], state: ResolverQueryLogConfigState, opts: CustomResourceOptions): ResolverQueryLogConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ResolverQueryLogConfig]
    
    /**
      * Returns true if the given object is an instance of ResolverQueryLogConfig.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/resolverQueryLogConfig.ResolverQueryLogConfig */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/route53/resolverQueryLogConfig.ResolverQueryLogConfig */ Boolean]
  }
  
  trait ResolverQueryLogConfigArgs extends StObject {
    
    /**
      * The ARN of the resource that you want Route 53 Resolver to send query logs.
      * You can send query logs to an S3 bucket, a CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream.
      */
    val destinationArn: Input[String]
    
    /**
      * The name of the Route 53 Resolver query logging configuration.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
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
  
  trait ResolverQueryLogConfigState extends StObject {
    
    /**
      * The ARN (Amazon Resource Name) of the Route 53 Resolver query logging configuration.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of the resource that you want Route 53 Resolver to send query logs.
      * You can send query logs to an S3 bucket, a CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream.
      */
    val destinationArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the Route 53 Resolver query logging configuration.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The AWS account ID of the account that created the query logging configuration.
      */
    val ownerId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * An indication of whether the query logging configuration is shared with other AWS accounts, or was shared with the current account by another AWS account.
      * Sharing is configured through AWS Resource Access Manager (AWS RAM).
      * Values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
      */
    val shareStatus: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
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
