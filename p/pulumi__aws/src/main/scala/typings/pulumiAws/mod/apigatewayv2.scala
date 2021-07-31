package typings.pulumiAws.mod

import typings.pulumiAws.apiMappingMod.ApiMappingArgs
import typings.pulumiAws.apiMappingMod.ApiMappingState
import typings.pulumiAws.apiMod.ApiArgs
import typings.pulumiAws.apiMod.ApiState
import typings.pulumiAws.authorizerMod.AuthorizerArgs
import typings.pulumiAws.authorizerMod.AuthorizerState
import typings.pulumiAws.deploymentMod.DeploymentArgs
import typings.pulumiAws.deploymentMod.DeploymentState
import typings.pulumiAws.domainNameMod.DomainNameArgs
import typings.pulumiAws.domainNameMod.DomainNameState
import typings.pulumiAws.integrationMod.IntegrationArgs
import typings.pulumiAws.integrationMod.IntegrationState
import typings.pulumiAws.integrationResponseMod.IntegrationResponseArgs
import typings.pulumiAws.integrationResponseMod.IntegrationResponseState
import typings.pulumiAws.modelMod.ModelArgs
import typings.pulumiAws.modelMod.ModelState
import typings.pulumiAws.routeMod.RouteArgs
import typings.pulumiAws.routeMod.RouteState
import typings.pulumiAws.routeResponseMod.RouteResponseArgs
import typings.pulumiAws.routeResponseMod.RouteResponseState
import typings.pulumiAws.stageMod.StageArgs
import typings.pulumiAws.stageMod.StageState
import typings.pulumiAws.vpcLinkMod.VpcLinkArgs
import typings.pulumiAws.vpcLinkMod.VpcLinkState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apigatewayv2 {
  
  @JSImport("@pulumi/aws", "apigatewayv2.Api")
  @js.native
  class Api protected ()
    extends typings.pulumiAws.apigatewayv2Mod.Api {
    /**
      * Create a Api resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ApiArgs) = this()
    def this(name: String, args: ApiArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Api {
    
    @JSImport("@pulumi/aws", "apigatewayv2.Api")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Api resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.apiMod.Api = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.apiMod.Api]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.apiMod.Api = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.apiMod.Api]
    @scala.inline
    def get(name: String, id: Input[ID], state: ApiState): typings.pulumiAws.apiMod.Api = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.apiMod.Api]
    @scala.inline
    def get(name: String, id: Input[ID], state: ApiState, opts: CustomResourceOptions): typings.pulumiAws.apiMod.Api = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.apiMod.Api]
    
    /**
      * Returns true if the given object is an instance of Api.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/api.Api */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/apigatewayv2/api.Api */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "apigatewayv2.ApiMapping")
  @js.native
  class ApiMapping protected ()
    extends typings.pulumiAws.apigatewayv2Mod.ApiMapping {
    /**
      * Create a ApiMapping resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ApiMappingArgs) = this()
    def this(name: String, args: ApiMappingArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ApiMapping {
    
    @JSImport("@pulumi/aws", "apigatewayv2.ApiMapping")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ApiMapping resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.apiMappingMod.ApiMapping = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.apiMappingMod.ApiMapping]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.apiMappingMod.ApiMapping = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.apiMappingMod.ApiMapping]
    @scala.inline
    def get(name: String, id: Input[ID], state: ApiMappingState): typings.pulumiAws.apiMappingMod.ApiMapping = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.apiMappingMod.ApiMapping]
    @scala.inline
    def get(name: String, id: Input[ID], state: ApiMappingState, opts: CustomResourceOptions): typings.pulumiAws.apiMappingMod.ApiMapping = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.apiMappingMod.ApiMapping]
    
    /**
      * Returns true if the given object is an instance of ApiMapping.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/apiMapping.ApiMapping */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/apigatewayv2/apiMapping.ApiMapping */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "apigatewayv2.Authorizer")
  @js.native
  class Authorizer protected ()
    extends typings.pulumiAws.apigatewayv2Mod.Authorizer {
    /**
      * Create a Authorizer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AuthorizerArgs) = this()
    def this(name: String, args: AuthorizerArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Authorizer {
    
    @JSImport("@pulumi/aws", "apigatewayv2.Authorizer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Authorizer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.authorizerMod.Authorizer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.authorizerMod.Authorizer]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.authorizerMod.Authorizer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.authorizerMod.Authorizer]
    @scala.inline
    def get(name: String, id: Input[ID], state: AuthorizerState): typings.pulumiAws.authorizerMod.Authorizer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.authorizerMod.Authorizer]
    @scala.inline
    def get(name: String, id: Input[ID], state: AuthorizerState, opts: CustomResourceOptions): typings.pulumiAws.authorizerMod.Authorizer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.authorizerMod.Authorizer]
    
    /**
      * Returns true if the given object is an instance of Authorizer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/authorizer.Authorizer */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/apigatewayv2/authorizer.Authorizer */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "apigatewayv2.Deployment")
  @js.native
  class Deployment protected ()
    extends typings.pulumiAws.apigatewayv2Mod.Deployment {
    /**
      * Create a Deployment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DeploymentArgs) = this()
    def this(name: String, args: DeploymentArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Deployment {
    
    @JSImport("@pulumi/aws", "apigatewayv2.Deployment")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Deployment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.deploymentMod.Deployment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.deploymentMod.Deployment]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.deploymentMod.Deployment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.deploymentMod.Deployment]
    @scala.inline
    def get(name: String, id: Input[ID], state: DeploymentState): typings.pulumiAws.deploymentMod.Deployment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.deploymentMod.Deployment]
    @scala.inline
    def get(name: String, id: Input[ID], state: DeploymentState, opts: CustomResourceOptions): typings.pulumiAws.deploymentMod.Deployment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.deploymentMod.Deployment]
    
    /**
      * Returns true if the given object is an instance of Deployment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/deployment.Deployment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/apigatewayv2/deployment.Deployment */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "apigatewayv2.DomainName")
  @js.native
  class DomainName protected ()
    extends typings.pulumiAws.apigatewayv2Mod.DomainName {
    /**
      * Create a DomainName resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DomainNameArgs) = this()
    def this(name: String, args: DomainNameArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object DomainName {
    
    @JSImport("@pulumi/aws", "apigatewayv2.DomainName")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing DomainName resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.domainNameMod.DomainName = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.domainNameMod.DomainName]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.domainNameMod.DomainName = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.domainNameMod.DomainName]
    @scala.inline
    def get(name: String, id: Input[ID], state: DomainNameState): typings.pulumiAws.domainNameMod.DomainName = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.domainNameMod.DomainName]
    @scala.inline
    def get(name: String, id: Input[ID], state: DomainNameState, opts: CustomResourceOptions): typings.pulumiAws.domainNameMod.DomainName = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.domainNameMod.DomainName]
    
    /**
      * Returns true if the given object is an instance of DomainName.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/domainName.DomainName */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/apigatewayv2/domainName.DomainName */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "apigatewayv2.Integration")
  @js.native
  class Integration protected ()
    extends typings.pulumiAws.apigatewayv2Mod.Integration {
    /**
      * Create a Integration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: IntegrationArgs) = this()
    def this(name: String, args: IntegrationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Integration {
    
    @JSImport("@pulumi/aws", "apigatewayv2.Integration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Integration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.integrationMod.Integration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.integrationMod.Integration]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.integrationMod.Integration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.integrationMod.Integration]
    @scala.inline
    def get(name: String, id: Input[ID], state: IntegrationState): typings.pulumiAws.integrationMod.Integration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.integrationMod.Integration]
    @scala.inline
    def get(name: String, id: Input[ID], state: IntegrationState, opts: CustomResourceOptions): typings.pulumiAws.integrationMod.Integration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.integrationMod.Integration]
    
    /**
      * Returns true if the given object is an instance of Integration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/integration.Integration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/apigatewayv2/integration.Integration */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "apigatewayv2.IntegrationResponse")
  @js.native
  class IntegrationResponse protected ()
    extends typings.pulumiAws.apigatewayv2Mod.IntegrationResponse {
    /**
      * Create a IntegrationResponse resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: IntegrationResponseArgs) = this()
    def this(name: String, args: IntegrationResponseArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object IntegrationResponse {
    
    @JSImport("@pulumi/aws", "apigatewayv2.IntegrationResponse")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing IntegrationResponse resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.integrationResponseMod.IntegrationResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.integrationResponseMod.IntegrationResponse]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.integrationResponseMod.IntegrationResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.integrationResponseMod.IntegrationResponse]
    @scala.inline
    def get(name: String, id: Input[ID], state: IntegrationResponseState): typings.pulumiAws.integrationResponseMod.IntegrationResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.integrationResponseMod.IntegrationResponse]
    @scala.inline
    def get(name: String, id: Input[ID], state: IntegrationResponseState, opts: CustomResourceOptions): typings.pulumiAws.integrationResponseMod.IntegrationResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.integrationResponseMod.IntegrationResponse]
    
    /**
      * Returns true if the given object is an instance of IntegrationResponse.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/integrationResponse.IntegrationResponse */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/apigatewayv2/integrationResponse.IntegrationResponse */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "apigatewayv2.Model")
  @js.native
  class Model protected ()
    extends typings.pulumiAws.apigatewayv2Mod.Model {
    /**
      * Create a Model resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ModelArgs) = this()
    def this(name: String, args: ModelArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Model {
    
    @JSImport("@pulumi/aws", "apigatewayv2.Model")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Model resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.modelMod.Model = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.modelMod.Model]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.modelMod.Model = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.modelMod.Model]
    @scala.inline
    def get(name: String, id: Input[ID], state: ModelState): typings.pulumiAws.modelMod.Model = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.modelMod.Model]
    @scala.inline
    def get(name: String, id: Input[ID], state: ModelState, opts: CustomResourceOptions): typings.pulumiAws.modelMod.Model = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.modelMod.Model]
    
    /**
      * Returns true if the given object is an instance of Model.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/model.Model */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/apigatewayv2/model.Model */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "apigatewayv2.Route")
  @js.native
  class Route protected ()
    extends typings.pulumiAws.apigatewayv2Mod.Route {
    /**
      * Create a Route resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RouteArgs) = this()
    def this(name: String, args: RouteArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Route {
    
    @JSImport("@pulumi/aws", "apigatewayv2.Route")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Route resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.routeMod.Route = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.routeMod.Route]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.routeMod.Route = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.routeMod.Route]
    @scala.inline
    def get(name: String, id: Input[ID], state: RouteState): typings.pulumiAws.routeMod.Route = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.routeMod.Route]
    @scala.inline
    def get(name: String, id: Input[ID], state: RouteState, opts: CustomResourceOptions): typings.pulumiAws.routeMod.Route = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.routeMod.Route]
    
    /**
      * Returns true if the given object is an instance of Route.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/route.Route */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/apigatewayv2/route.Route */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "apigatewayv2.RouteResponse")
  @js.native
  class RouteResponse protected ()
    extends typings.pulumiAws.apigatewayv2Mod.RouteResponse {
    /**
      * Create a RouteResponse resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RouteResponseArgs) = this()
    def this(name: String, args: RouteResponseArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object RouteResponse {
    
    @JSImport("@pulumi/aws", "apigatewayv2.RouteResponse")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing RouteResponse resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.routeResponseMod.RouteResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.routeResponseMod.RouteResponse]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.routeResponseMod.RouteResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.routeResponseMod.RouteResponse]
    @scala.inline
    def get(name: String, id: Input[ID], state: RouteResponseState): typings.pulumiAws.routeResponseMod.RouteResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.routeResponseMod.RouteResponse]
    @scala.inline
    def get(name: String, id: Input[ID], state: RouteResponseState, opts: CustomResourceOptions): typings.pulumiAws.routeResponseMod.RouteResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.routeResponseMod.RouteResponse]
    
    /**
      * Returns true if the given object is an instance of RouteResponse.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/routeResponse.RouteResponse */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/apigatewayv2/routeResponse.RouteResponse */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "apigatewayv2.Stage")
  @js.native
  class Stage protected ()
    extends typings.pulumiAws.apigatewayv2Mod.Stage {
    /**
      * Create a Stage resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: StageArgs) = this()
    def this(name: String, args: StageArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Stage {
    
    @JSImport("@pulumi/aws", "apigatewayv2.Stage")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Stage resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.stageMod.Stage = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.stageMod.Stage]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.stageMod.Stage = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.stageMod.Stage]
    @scala.inline
    def get(name: String, id: Input[ID], state: StageState): typings.pulumiAws.stageMod.Stage = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.stageMod.Stage]
    @scala.inline
    def get(name: String, id: Input[ID], state: StageState, opts: CustomResourceOptions): typings.pulumiAws.stageMod.Stage = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.stageMod.Stage]
    
    /**
      * Returns true if the given object is an instance of Stage.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/stage.Stage */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/apigatewayv2/stage.Stage */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "apigatewayv2.VpcLink")
  @js.native
  class VpcLink protected ()
    extends typings.pulumiAws.apigatewayv2Mod.VpcLink {
    /**
      * Create a VpcLink resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VpcLinkArgs) = this()
    def this(name: String, args: VpcLinkArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object VpcLink {
    
    @JSImport("@pulumi/aws", "apigatewayv2.VpcLink")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing VpcLink resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.vpcLinkMod.VpcLink = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.vpcLinkMod.VpcLink]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.vpcLinkMod.VpcLink = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.vpcLinkMod.VpcLink]
    @scala.inline
    def get(name: String, id: Input[ID], state: VpcLinkState): typings.pulumiAws.vpcLinkMod.VpcLink = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.vpcLinkMod.VpcLink]
    @scala.inline
    def get(name: String, id: Input[ID], state: VpcLinkState, opts: CustomResourceOptions): typings.pulumiAws.vpcLinkMod.VpcLink = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.vpcLinkMod.VpcLink]
    
    /**
      * Returns true if the given object is an instance of VpcLink.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/vpcLink.VpcLink */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/apigatewayv2/vpcLink.VpcLink */ Boolean]
  }
}
