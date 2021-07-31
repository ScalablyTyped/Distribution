package typings.pulumiAws

import typings.pulumiAws.appsyncApiKeyMod.ApiKeyArgs
import typings.pulumiAws.appsyncApiKeyMod.ApiKeyState
import typings.pulumiAws.dataSourceMod.DataSourceArgs
import typings.pulumiAws.dataSourceMod.DataSourceState
import typings.pulumiAws.functionMod.FunctionArgs
import typings.pulumiAws.functionMod.FunctionState
import typings.pulumiAws.graphQLApiMod.GraphQLApiArgs
import typings.pulumiAws.graphQLApiMod.GraphQLApiState
import typings.pulumiAws.resolverMod.ResolverArgs
import typings.pulumiAws.resolverMod.ResolverState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appsyncMod {
  
  @JSImport("@pulumi/aws/appsync", "ApiKey")
  @js.native
  class ApiKey protected ()
    extends typings.pulumiAws.appsyncApiKeyMod.ApiKey {
    /**
      * Create a ApiKey resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ApiKeyArgs) = this()
    def this(name: String, args: ApiKeyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ApiKey {
    
    @JSImport("@pulumi/aws/appsync", "ApiKey")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ApiKey resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.appsyncApiKeyMod.ApiKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.appsyncApiKeyMod.ApiKey]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.appsyncApiKeyMod.ApiKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.appsyncApiKeyMod.ApiKey]
    @scala.inline
    def get(name: String, id: Input[ID], state: ApiKeyState): typings.pulumiAws.appsyncApiKeyMod.ApiKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.appsyncApiKeyMod.ApiKey]
    @scala.inline
    def get(name: String, id: Input[ID], state: ApiKeyState, opts: CustomResourceOptions): typings.pulumiAws.appsyncApiKeyMod.ApiKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.appsyncApiKeyMod.ApiKey]
    
    /**
      * Returns true if the given object is an instance of ApiKey.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/apiKey.ApiKey */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/appsync/apiKey.ApiKey */ Boolean]
  }
  
  @JSImport("@pulumi/aws/appsync", "DataSource")
  @js.native
  class DataSource protected ()
    extends typings.pulumiAws.dataSourceMod.DataSource {
    /**
      * Create a DataSource resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DataSourceArgs) = this()
    def this(name: String, args: DataSourceArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object DataSource {
    
    @JSImport("@pulumi/aws/appsync", "DataSource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing DataSource resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.dataSourceMod.DataSource = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.dataSourceMod.DataSource]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.dataSourceMod.DataSource = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.dataSourceMod.DataSource]
    @scala.inline
    def get(name: String, id: Input[ID], state: DataSourceState): typings.pulumiAws.dataSourceMod.DataSource = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.dataSourceMod.DataSource]
    @scala.inline
    def get(name: String, id: Input[ID], state: DataSourceState, opts: CustomResourceOptions): typings.pulumiAws.dataSourceMod.DataSource = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.dataSourceMod.DataSource]
    
    /**
      * Returns true if the given object is an instance of DataSource.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/dataSource.DataSource */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/appsync/dataSource.DataSource */ Boolean]
  }
  
  @JSImport("@pulumi/aws/appsync", "Function")
  @js.native
  class Function protected ()
    extends typings.pulumiAws.functionMod.Function {
    /**
      * Create a Function resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: FunctionArgs) = this()
    def this(name: String, args: FunctionArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Function {
    
    @JSImport("@pulumi/aws/appsync", "Function")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Function resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.functionMod.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.functionMod.Function]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.functionMod.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.functionMod.Function]
    @scala.inline
    def get(name: String, id: Input[ID], state: FunctionState): typings.pulumiAws.functionMod.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.functionMod.Function]
    @scala.inline
    def get(name: String, id: Input[ID], state: FunctionState, opts: CustomResourceOptions): typings.pulumiAws.functionMod.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.functionMod.Function]
    
    /**
      * Returns true if the given object is an instance of Function.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/function.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/appsync/function.Function */ Boolean]
  }
  
  @JSImport("@pulumi/aws/appsync", "GraphQLApi")
  @js.native
  class GraphQLApi protected ()
    extends typings.pulumiAws.graphQLApiMod.GraphQLApi {
    /**
      * Create a GraphQLApi resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GraphQLApiArgs) = this()
    def this(name: String, args: GraphQLApiArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object GraphQLApi {
    
    @JSImport("@pulumi/aws/appsync", "GraphQLApi")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing GraphQLApi resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.graphQLApiMod.GraphQLApi = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.graphQLApiMod.GraphQLApi]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.graphQLApiMod.GraphQLApi = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.graphQLApiMod.GraphQLApi]
    @scala.inline
    def get(name: String, id: Input[ID], state: GraphQLApiState): typings.pulumiAws.graphQLApiMod.GraphQLApi = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.graphQLApiMod.GraphQLApi]
    @scala.inline
    def get(name: String, id: Input[ID], state: GraphQLApiState, opts: CustomResourceOptions): typings.pulumiAws.graphQLApiMod.GraphQLApi = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.graphQLApiMod.GraphQLApi]
    
    /**
      * Returns true if the given object is an instance of GraphQLApi.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/graphQLApi.GraphQLApi */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/appsync/graphQLApi.GraphQLApi */ Boolean]
  }
  
  @JSImport("@pulumi/aws/appsync", "Resolver")
  @js.native
  class Resolver protected ()
    extends typings.pulumiAws.resolverMod.Resolver {
    /**
      * Create a Resolver resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResolverArgs) = this()
    def this(name: String, args: ResolverArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Resolver {
    
    @JSImport("@pulumi/aws/appsync", "Resolver")
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
    def get(name: String, id: Input[ID]): typings.pulumiAws.resolverMod.Resolver = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.resolverMod.Resolver]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.resolverMod.Resolver = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.resolverMod.Resolver]
    @scala.inline
    def get(name: String, id: Input[ID], state: ResolverState): typings.pulumiAws.resolverMod.Resolver = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.resolverMod.Resolver]
    @scala.inline
    def get(name: String, id: Input[ID], state: ResolverState, opts: CustomResourceOptions): typings.pulumiAws.resolverMod.Resolver = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.resolverMod.Resolver]
    
    /**
      * Returns true if the given object is an instance of Resolver.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/resolver.Resolver */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/appsync/resolver.Resolver */ Boolean]
  }
}
