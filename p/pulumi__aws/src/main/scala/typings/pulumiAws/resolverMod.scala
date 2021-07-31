package typings.pulumiAws

import typings.pulumiAws.outputMod.appsync.ResolverCachingConfig
import typings.pulumiAws.outputMod.appsync.ResolverPipelineConfig
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolverMod {
  
  @JSImport("@pulumi/aws/appsync/resolver", "Resolver")
  @js.native
  class Resolver protected () extends CustomResource {
    /**
      * Create a Resolver resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResolverArgs) = this()
    def this(name: String, args: ResolverArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The API ID for the GraphQL API.
      */
    val apiId: Output_[String] = js.native
    
    /**
      * The ARN
      */
    val arn: Output_[String] = js.native
    
    /**
      * The CachingConfig.
      */
    val cachingConfig: Output_[js.UndefOr[ResolverCachingConfig]] = js.native
    
    /**
      * The DataSource name.
      */
    val dataSource: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The field name from the schema defined in the GraphQL API.
      */
    val field: Output_[String] = js.native
    
    /**
      * The resolver type. Valid values are `UNIT` and `PIPELINE`.
      */
    val kind: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The PipelineConfig.
      */
    val pipelineConfig: Output_[js.UndefOr[ResolverPipelineConfig]] = js.native
    
    /**
      * The request mapping template for UNIT resolver or 'before mapping template' for PIPELINE resolver.
      */
    val requestTemplate: Output_[String] = js.native
    
    /**
      * The response mapping template for UNIT resolver or 'after mapping template' for PIPELINE resolver.
      */
    val responseTemplate: Output_[String] = js.native
    
    /**
      * The type name from the schema defined in the GraphQL API.
      */
    val `type`: Output_[String] = js.native
  }
  /* static members */
  object Resolver {
    
    @JSImport("@pulumi/aws/appsync/resolver", "Resolver")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Resolver resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): Resolver = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Resolver]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Resolver = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Resolver]
    @scala.inline
    def get(name: String, id: Input[ID], state: ResolverState): Resolver = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Resolver]
    @scala.inline
    def get(name: String, id: Input[ID], state: ResolverState, opts: CustomResourceOptions): Resolver = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Resolver]
    
    /**
      * Returns true if the given object is an instance of Resolver.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/resolver.Resolver */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/appsync/resolver.Resolver */ Boolean]
  }
  
  trait ResolverArgs extends StObject {
    
    /**
      * The API ID for the GraphQL API.
      */
    val apiId: Input[String]
    
    /**
      * The CachingConfig.
      */
    val cachingConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.appsync.ResolverCachingConfig]] = js.undefined
    
    /**
      * The DataSource name.
      */
    val dataSource: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The field name from the schema defined in the GraphQL API.
      */
    val field: Input[String]
    
    /**
      * The resolver type. Valid values are `UNIT` and `PIPELINE`.
      */
    val kind: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The PipelineConfig.
      */
    val pipelineConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.appsync.ResolverPipelineConfig]] = js.undefined
    
    /**
      * The request mapping template for UNIT resolver or 'before mapping template' for PIPELINE resolver.
      */
    val requestTemplate: Input[String]
    
    /**
      * The response mapping template for UNIT resolver or 'after mapping template' for PIPELINE resolver.
      */
    val responseTemplate: Input[String]
    
    /**
      * The type name from the schema defined in the GraphQL API.
      */
    val `type`: Input[String]
  }
  object ResolverArgs {
    
    @scala.inline
    def apply(
      apiId: Input[String],
      field: Input[String],
      requestTemplate: Input[String],
      responseTemplate: Input[String],
      `type`: Input[String]
    ): ResolverArgs = {
      val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], requestTemplate = requestTemplate.asInstanceOf[js.Any], responseTemplate = responseTemplate.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolverArgs]
    }
    
    @scala.inline
    implicit class ResolverArgsMutableBuilder[Self <: ResolverArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiId(value: Input[String]): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCachingConfig(value: Input[typings.pulumiAws.inputMod.appsync.ResolverCachingConfig]): Self = StObject.set(x, "cachingConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCachingConfigUndefined: Self = StObject.set(x, "cachingConfig", js.undefined)
      
      @scala.inline
      def setDataSource(value: Input[String]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      @scala.inline
      def setField(value: Input[String]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: Input[String]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setPipelineConfig(value: Input[typings.pulumiAws.inputMod.appsync.ResolverPipelineConfig]): Self = StObject.set(x, "pipelineConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPipelineConfigUndefined: Self = StObject.set(x, "pipelineConfig", js.undefined)
      
      @scala.inline
      def setRequestTemplate(value: Input[String]): Self = StObject.set(x, "requestTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTemplate(value: Input[String]): Self = StObject.set(x, "responseTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResolverState extends StObject {
    
    /**
      * The API ID for the GraphQL API.
      */
    val apiId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The CachingConfig.
      */
    val cachingConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.appsync.ResolverCachingConfig]] = js.undefined
    
    /**
      * The DataSource name.
      */
    val dataSource: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The field name from the schema defined in the GraphQL API.
      */
    val field: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The resolver type. Valid values are `UNIT` and `PIPELINE`.
      */
    val kind: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The PipelineConfig.
      */
    val pipelineConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.appsync.ResolverPipelineConfig]] = js.undefined
    
    /**
      * The request mapping template for UNIT resolver or 'before mapping template' for PIPELINE resolver.
      */
    val requestTemplate: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The response mapping template for UNIT resolver or 'after mapping template' for PIPELINE resolver.
      */
    val responseTemplate: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The type name from the schema defined in the GraphQL API.
      */
    val `type`: js.UndefOr[Input[String]] = js.undefined
  }
  object ResolverState {
    
    @scala.inline
    def apply(): ResolverState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResolverState]
    }
    
    @scala.inline
    implicit class ResolverStateMutableBuilder[Self <: ResolverState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiId(value: Input[String]): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiIdUndefined: Self = StObject.set(x, "apiId", js.undefined)
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setCachingConfig(value: Input[typings.pulumiAws.inputMod.appsync.ResolverCachingConfig]): Self = StObject.set(x, "cachingConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCachingConfigUndefined: Self = StObject.set(x, "cachingConfig", js.undefined)
      
      @scala.inline
      def setDataSource(value: Input[String]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      @scala.inline
      def setField(value: Input[String]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      @scala.inline
      def setKind(value: Input[String]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setPipelineConfig(value: Input[typings.pulumiAws.inputMod.appsync.ResolverPipelineConfig]): Self = StObject.set(x, "pipelineConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPipelineConfigUndefined: Self = StObject.set(x, "pipelineConfig", js.undefined)
      
      @scala.inline
      def setRequestTemplate(value: Input[String]): Self = StObject.set(x, "requestTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestTemplateUndefined: Self = StObject.set(x, "requestTemplate", js.undefined)
      
      @scala.inline
      def setResponseTemplate(value: Input[String]): Self = StObject.set(x, "responseTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTemplateUndefined: Self = StObject.set(x, "responseTemplate", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
