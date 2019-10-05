package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.appsyncApiKeyMod.ApiKeyArgs
import typings.atPulumiAws.appsyncApiKeyMod.ApiKeyState
import typings.atPulumiAws.appsyncDataSourceMod.DataSourceArgs
import typings.atPulumiAws.appsyncDataSourceMod.DataSourceState
import typings.atPulumiAws.appsyncFunctionMod.FunctionArgs
import typings.atPulumiAws.appsyncFunctionMod.FunctionState
import typings.atPulumiAws.appsyncGraphQLApiMod.GraphQLApiArgs
import typings.atPulumiAws.appsyncGraphQLApiMod.GraphQLApiState
import typings.atPulumiAws.appsyncResolverMod.ResolverArgs
import typings.atPulumiAws.appsyncResolverMod.ResolverState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "appsync")
@js.native
object appsync extends js.Object {
  @js.native
  class ApiKey protected ()
    extends typings.atPulumiAws.appsyncMod.ApiKey {
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
  
  @js.native
  class DataSource protected ()
    extends typings.atPulumiAws.appsyncMod.DataSource {
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
  
  @js.native
  class Function protected ()
    extends typings.atPulumiAws.appsyncMod.Function {
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
  
  @js.native
  class GraphQLApi protected ()
    extends typings.atPulumiAws.appsyncMod.GraphQLApi {
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
  
  @js.native
  class Resolver protected ()
    extends typings.atPulumiAws.appsyncMod.Resolver {
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
  @js.native
  object ApiKey extends js.Object {
    /**
      * Get an existing ApiKey resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.appsyncApiKeyMod.ApiKey = js.native
    def get(name: String, id: Input[ID], state: ApiKeyState): typings.atPulumiAws.appsyncApiKeyMod.ApiKey = js.native
    def get(name: String, id: Input[ID], state: ApiKeyState, opts: CustomResourceOptions): typings.atPulumiAws.appsyncApiKeyMod.ApiKey = js.native
    /**
      * Returns true if the given object is an instance of ApiKey.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/apiKey.ApiKey */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object DataSource extends js.Object {
    /**
      * Get an existing DataSource resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.appsyncDataSourceMod.DataSource = js.native
    def get(name: String, id: Input[ID], state: DataSourceState): typings.atPulumiAws.appsyncDataSourceMod.DataSource = js.native
    def get(name: String, id: Input[ID], state: DataSourceState, opts: CustomResourceOptions): typings.atPulumiAws.appsyncDataSourceMod.DataSource = js.native
    /**
      * Returns true if the given object is an instance of DataSource.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/dataSource.DataSource */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Function extends js.Object {
    /**
      * Get an existing Function resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.appsyncFunctionMod.Function = js.native
    def get(name: String, id: Input[ID], state: FunctionState): typings.atPulumiAws.appsyncFunctionMod.Function = js.native
    def get(name: String, id: Input[ID], state: FunctionState, opts: CustomResourceOptions): typings.atPulumiAws.appsyncFunctionMod.Function = js.native
    /**
      * Returns true if the given object is an instance of Function.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/function.Function */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object GraphQLApi extends js.Object {
    /**
      * Get an existing GraphQLApi resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.appsyncGraphQLApiMod.GraphQLApi = js.native
    def get(name: String, id: Input[ID], state: GraphQLApiState): typings.atPulumiAws.appsyncGraphQLApiMod.GraphQLApi = js.native
    def get(name: String, id: Input[ID], state: GraphQLApiState, opts: CustomResourceOptions): typings.atPulumiAws.appsyncGraphQLApiMod.GraphQLApi = js.native
    /**
      * Returns true if the given object is an instance of GraphQLApi.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/graphQLApi.GraphQLApi */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Resolver extends js.Object {
    /**
      * Get an existing Resolver resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.appsyncResolverMod.Resolver = js.native
    def get(name: String, id: Input[ID], state: ResolverState): typings.atPulumiAws.appsyncResolverMod.Resolver = js.native
    def get(name: String, id: Input[ID], state: ResolverState, opts: CustomResourceOptions): typings.atPulumiAws.appsyncResolverMod.Resolver = js.native
    /**
      * Returns true if the given object is an instance of Resolver.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/resolver.Resolver */ Boolean = js.native
  }
  
}

