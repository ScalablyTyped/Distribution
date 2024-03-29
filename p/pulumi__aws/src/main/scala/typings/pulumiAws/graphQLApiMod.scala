package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.appsync.GraphQLApiAdditionalAuthenticationProvider
import typings.pulumiAws.outputMod.appsync.GraphQLApiLogConfig
import typings.pulumiAws.outputMod.appsync.GraphQLApiOpenidConnectConfig
import typings.pulumiAws.outputMod.appsync.GraphQLApiUserPoolConfig
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object graphQLApiMod {
  
  @JSImport("@pulumi/aws/appsync/graphQLApi", "GraphQLApi")
  @js.native
  class GraphQLApi protected () extends CustomResource {
    /**
      * Create a GraphQLApi resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GraphQLApiArgs) = this()
    def this(name: String, args: GraphQLApiArgs, opts: CustomResourceOptions) = this()
    
    /**
      * One or more additional authentication providers for the GraphqlApi. Defined below.
      */
    val additionalAuthenticationProviders: Output_[js.UndefOr[js.Array[GraphQLApiAdditionalAuthenticationProvider]]] = js.native
    
    /**
      * The ARN
      */
    val arn: Output_[String] = js.native
    
    /**
      * The authentication type. Valid values: `API_KEY`, `AWS_IAM`, `AMAZON_COGNITO_USER_POOLS`, `OPENID_CONNECT`
      */
    val authenticationType: Output_[String] = js.native
    
    /**
      * Nested argument containing logging configuration. Defined below.
      */
    val logConfig: Output_[js.UndefOr[GraphQLApiLogConfig]] = js.native
    
    /**
      * A user-supplied name for the GraphqlApi.
      */
    val name: Output_[String] = js.native
    
    /**
      * Nested argument containing OpenID Connect configuration. Defined below.
      */
    val openidConnectConfig: Output_[js.UndefOr[GraphQLApiOpenidConnectConfig]] = js.native
    
    /**
      * The schema definition, in GraphQL schema language format. This provider cannot perform drift detection of this configuration.
      */
    val schema: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Map of URIs associated with the API. e.g. `uris["GRAPHQL"] = https://ID.appsync-api.REGION.amazonaws.com/graphql`
      */
    val uris: Output_[StringDictionary[String]] = js.native
    
    /**
      * The Amazon Cognito User Pool configuration. Defined below.
      */
    val userPoolConfig: Output_[js.UndefOr[GraphQLApiUserPoolConfig]] = js.native
    
    /**
      * Whether tracing with X-ray is enabled. Defaults to false.
      */
    val xrayEnabled: Output_[js.UndefOr[Boolean]] = js.native
  }
  /* static members */
  object GraphQLApi {
    
    @JSImport("@pulumi/aws/appsync/graphQLApi", "GraphQLApi")
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
    inline def get(name: String, id: Input[ID]): GraphQLApi = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[GraphQLApi]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): GraphQLApi = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[GraphQLApi]
    inline def get(name: String, id: Input[ID], state: GraphQLApiState): GraphQLApi = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[GraphQLApi]
    inline def get(name: String, id: Input[ID], state: GraphQLApiState, opts: CustomResourceOptions): GraphQLApi = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[GraphQLApi]
    
    /**
      * Returns true if the given object is an instance of GraphQLApi.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/graphQLApi.GraphQLApi */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/appsync/graphQLApi.GraphQLApi */ Boolean]
  }
  
  trait GraphQLApiArgs extends StObject {
    
    /**
      * One or more additional authentication providers for the GraphqlApi. Defined below.
      */
    val additionalAuthenticationProviders: js.UndefOr[
        Input[
          js.Array[
            Input[typings.pulumiAws.inputMod.appsync.GraphQLApiAdditionalAuthenticationProvider]
          ]
        ]
      ] = js.undefined
    
    /**
      * The authentication type. Valid values: `API_KEY`, `AWS_IAM`, `AMAZON_COGNITO_USER_POOLS`, `OPENID_CONNECT`
      */
    val authenticationType: Input[String]
    
    /**
      * Nested argument containing logging configuration. Defined below.
      */
    val logConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.appsync.GraphQLApiLogConfig]] = js.undefined
    
    /**
      * A user-supplied name for the GraphqlApi.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Nested argument containing OpenID Connect configuration. Defined below.
      */
    val openidConnectConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.appsync.GraphQLApiOpenidConnectConfig]] = js.undefined
    
    /**
      * The schema definition, in GraphQL schema language format. This provider cannot perform drift detection of this configuration.
      */
    val schema: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The Amazon Cognito User Pool configuration. Defined below.
      */
    val userPoolConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.appsync.GraphQLApiUserPoolConfig]] = js.undefined
    
    /**
      * Whether tracing with X-ray is enabled. Defaults to false.
      */
    val xrayEnabled: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object GraphQLApiArgs {
    
    inline def apply(authenticationType: Input[String]): GraphQLApiArgs = {
      val __obj = js.Dynamic.literal(authenticationType = authenticationType.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphQLApiArgs]
    }
    
    extension [Self <: GraphQLApiArgs](x: Self) {
      
      inline def setAdditionalAuthenticationProviders(
        value: Input[
              js.Array[
                Input[typings.pulumiAws.inputMod.appsync.GraphQLApiAdditionalAuthenticationProvider]
              ]
            ]
      ): Self = StObject.set(x, "additionalAuthenticationProviders", value.asInstanceOf[js.Any])
      
      inline def setAdditionalAuthenticationProvidersUndefined: Self = StObject.set(x, "additionalAuthenticationProviders", js.undefined)
      
      inline def setAdditionalAuthenticationProvidersVarargs(value: Input[typings.pulumiAws.inputMod.appsync.GraphQLApiAdditionalAuthenticationProvider]*): Self = StObject.set(x, "additionalAuthenticationProviders", js.Array(value :_*))
      
      inline def setAuthenticationType(value: Input[String]): Self = StObject.set(x, "authenticationType", value.asInstanceOf[js.Any])
      
      inline def setLogConfig(value: Input[typings.pulumiAws.inputMod.appsync.GraphQLApiLogConfig]): Self = StObject.set(x, "logConfig", value.asInstanceOf[js.Any])
      
      inline def setLogConfigUndefined: Self = StObject.set(x, "logConfig", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOpenidConnectConfig(value: Input[typings.pulumiAws.inputMod.appsync.GraphQLApiOpenidConnectConfig]): Self = StObject.set(x, "openidConnectConfig", value.asInstanceOf[js.Any])
      
      inline def setOpenidConnectConfigUndefined: Self = StObject.set(x, "openidConnectConfig", js.undefined)
      
      inline def setSchema(value: Input[String]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setUserPoolConfig(value: Input[typings.pulumiAws.inputMod.appsync.GraphQLApiUserPoolConfig]): Self = StObject.set(x, "userPoolConfig", value.asInstanceOf[js.Any])
      
      inline def setUserPoolConfigUndefined: Self = StObject.set(x, "userPoolConfig", js.undefined)
      
      inline def setXrayEnabled(value: Input[Boolean]): Self = StObject.set(x, "xrayEnabled", value.asInstanceOf[js.Any])
      
      inline def setXrayEnabledUndefined: Self = StObject.set(x, "xrayEnabled", js.undefined)
    }
  }
  
  trait GraphQLApiState extends StObject {
    
    /**
      * One or more additional authentication providers for the GraphqlApi. Defined below.
      */
    val additionalAuthenticationProviders: js.UndefOr[
        Input[
          js.Array[
            Input[typings.pulumiAws.inputMod.appsync.GraphQLApiAdditionalAuthenticationProvider]
          ]
        ]
      ] = js.undefined
    
    /**
      * The ARN
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The authentication type. Valid values: `API_KEY`, `AWS_IAM`, `AMAZON_COGNITO_USER_POOLS`, `OPENID_CONNECT`
      */
    val authenticationType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Nested argument containing logging configuration. Defined below.
      */
    val logConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.appsync.GraphQLApiLogConfig]] = js.undefined
    
    /**
      * A user-supplied name for the GraphqlApi.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Nested argument containing OpenID Connect configuration. Defined below.
      */
    val openidConnectConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.appsync.GraphQLApiOpenidConnectConfig]] = js.undefined
    
    /**
      * The schema definition, in GraphQL schema language format. This provider cannot perform drift detection of this configuration.
      */
    val schema: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Map of URIs associated with the API. e.g. `uris["GRAPHQL"] = https://ID.appsync-api.REGION.amazonaws.com/graphql`
      */
    val uris: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The Amazon Cognito User Pool configuration. Defined below.
      */
    val userPoolConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.appsync.GraphQLApiUserPoolConfig]] = js.undefined
    
    /**
      * Whether tracing with X-ray is enabled. Defaults to false.
      */
    val xrayEnabled: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object GraphQLApiState {
    
    inline def apply(): GraphQLApiState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GraphQLApiState]
    }
    
    extension [Self <: GraphQLApiState](x: Self) {
      
      inline def setAdditionalAuthenticationProviders(
        value: Input[
              js.Array[
                Input[typings.pulumiAws.inputMod.appsync.GraphQLApiAdditionalAuthenticationProvider]
              ]
            ]
      ): Self = StObject.set(x, "additionalAuthenticationProviders", value.asInstanceOf[js.Any])
      
      inline def setAdditionalAuthenticationProvidersUndefined: Self = StObject.set(x, "additionalAuthenticationProviders", js.undefined)
      
      inline def setAdditionalAuthenticationProvidersVarargs(value: Input[typings.pulumiAws.inputMod.appsync.GraphQLApiAdditionalAuthenticationProvider]*): Self = StObject.set(x, "additionalAuthenticationProviders", js.Array(value :_*))
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setAuthenticationType(value: Input[String]): Self = StObject.set(x, "authenticationType", value.asInstanceOf[js.Any])
      
      inline def setAuthenticationTypeUndefined: Self = StObject.set(x, "authenticationType", js.undefined)
      
      inline def setLogConfig(value: Input[typings.pulumiAws.inputMod.appsync.GraphQLApiLogConfig]): Self = StObject.set(x, "logConfig", value.asInstanceOf[js.Any])
      
      inline def setLogConfigUndefined: Self = StObject.set(x, "logConfig", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOpenidConnectConfig(value: Input[typings.pulumiAws.inputMod.appsync.GraphQLApiOpenidConnectConfig]): Self = StObject.set(x, "openidConnectConfig", value.asInstanceOf[js.Any])
      
      inline def setOpenidConnectConfigUndefined: Self = StObject.set(x, "openidConnectConfig", js.undefined)
      
      inline def setSchema(value: Input[String]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setUris(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "uris", value.asInstanceOf[js.Any])
      
      inline def setUrisUndefined: Self = StObject.set(x, "uris", js.undefined)
      
      inline def setUserPoolConfig(value: Input[typings.pulumiAws.inputMod.appsync.GraphQLApiUserPoolConfig]): Self = StObject.set(x, "userPoolConfig", value.asInstanceOf[js.Any])
      
      inline def setUserPoolConfigUndefined: Self = StObject.set(x, "userPoolConfig", js.undefined)
      
      inline def setXrayEnabled(value: Input[Boolean]): Self = StObject.set(x, "xrayEnabled", value.asInstanceOf[js.Any])
      
      inline def setXrayEnabledUndefined: Self = StObject.set(x, "xrayEnabled", js.undefined)
    }
  }
}
