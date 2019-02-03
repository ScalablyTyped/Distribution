package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "apigateway")
@js.native
object apigatewayNs extends js.Object {
  @js.native
  class Account protected ()
    extends atPulumiAwsLib.apigatewayMod.Account {
    /**
      * Create a Account resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayAccountMod.AccountArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayAccountMod.AccountArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class ApiKey protected ()
    extends atPulumiAwsLib.apigatewayMod.ApiKey {
    /**
      * Create a ApiKey resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayApiKeyMod.ApiKeyArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayApiKeyMod.ApiKeyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Authorizer protected ()
    extends atPulumiAwsLib.apigatewayMod.Authorizer {
    /**
      * Create a Authorizer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayAuthorizerMod.AuthorizerArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayAuthorizerMod.AuthorizerArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class BasePathMapping protected ()
    extends atPulumiAwsLib.apigatewayMod.BasePathMapping {
    /**
      * Create a BasePathMapping resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayBasePathMappingMod.BasePathMappingArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayBasePathMappingMod.BasePathMappingArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class ClientCertificate protected ()
    extends atPulumiAwsLib.apigatewayMod.ClientCertificate {
    /**
      * Create a ClientCertificate resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayClientCertificateMod.ClientCertificateArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayClientCertificateMod.ClientCertificateArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Deployment protected ()
    extends atPulumiAwsLib.apigatewayMod.Deployment {
    /**
      * Create a Deployment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayDeploymentMod.DeploymentArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayDeploymentMod.DeploymentArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class DocumentationPart protected ()
    extends atPulumiAwsLib.apigatewayMod.DocumentationPart {
    /**
      * Create a DocumentationPart resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayDocumentationPartMod.DocumentationPartArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayDocumentationPartMod.DocumentationPartArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class DocumentationVersion protected ()
    extends atPulumiAwsLib.apigatewayMod.DocumentationVersion {
    /**
      * Create a DocumentationVersion resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayDocumentationVersionMod.DocumentationVersionArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayDocumentationVersionMod.DocumentationVersionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class DomainName protected ()
    extends atPulumiAwsLib.apigatewayMod.DomainName {
    /**
      * Create a DomainName resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayDomainNameMod.DomainNameArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayDomainNameMod.DomainNameArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Integration protected ()
    extends atPulumiAwsLib.apigatewayMod.Integration {
    /**
      * Create a Integration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayIntegrationMod.IntegrationArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayIntegrationMod.IntegrationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class IntegrationResponse protected ()
    extends atPulumiAwsLib.apigatewayMod.IntegrationResponse {
    /**
      * Create a IntegrationResponse resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayIntegrationResponseMod.IntegrationResponseArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayIntegrationResponseMod.IntegrationResponseArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Method protected ()
    extends atPulumiAwsLib.apigatewayMod.Method {
    /**
      * Create a Method resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayMethodMod.MethodArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayMethodMod.MethodArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class MethodResponse protected ()
    extends atPulumiAwsLib.apigatewayMod.MethodResponse {
    /**
      * Create a MethodResponse resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayMethodResponseMod.MethodResponseArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayMethodResponseMod.MethodResponseArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class MethodSettings protected ()
    extends atPulumiAwsLib.apigatewayMod.MethodSettings {
    /**
      * Create a MethodSettings resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayMethodSettingsMod.MethodSettingsArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayMethodSettingsMod.MethodSettingsArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Model protected ()
    extends atPulumiAwsLib.apigatewayMod.Model {
    /**
      * Create a Model resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayModelMod.ModelArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayModelMod.ModelArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class RequestValidator protected ()
    extends atPulumiAwsLib.apigatewayMod.RequestValidator {
    /**
      * Create a RequestValidator resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayRequestValidatorMod.RequestValidatorArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayRequestValidatorMod.RequestValidatorArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Resource protected ()
    extends atPulumiAwsLib.apigatewayMod.Resource {
    /**
      * Create a Resource resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayResourceMod.ResourceArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayResourceMod.ResourceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Response protected ()
    extends atPulumiAwsLib.apigatewayMod.Response {
    /**
      * Create a Response resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayResponseMod.ResponseArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayResponseMod.ResponseArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class RestApi protected ()
    extends atPulumiAwsLib.apigatewayMod.RestApi {
    /**
      * Create a RestApi resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayRestApiMod.RestApiArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayRestApiMod.RestApiArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Stage protected ()
    extends atPulumiAwsLib.apigatewayMod.Stage {
    /**
      * Create a Stage resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayStageMod.StageArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayStageMod.StageArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class UsagePlan protected ()
    extends atPulumiAwsLib.apigatewayMod.UsagePlan {
    /**
      * Create a UsagePlan resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayUsagePlanMod.UsagePlanArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayUsagePlanMod.UsagePlanArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class UsagePlanKey protected ()
    extends atPulumiAwsLib.apigatewayMod.UsagePlanKey {
    /**
      * Create a UsagePlanKey resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayUsagePlanKeyMod.UsagePlanKeyArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayUsagePlanKeyMod.UsagePlanKeyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class VpcLink protected ()
    extends atPulumiAwsLib.apigatewayMod.VpcLink {
    /**
      * Create a VpcLink resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayVpcLinkMod.VpcLinkArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayVpcLinkMod.VpcLinkArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  def getKey(args: atPulumiAwsLib.apigatewayGetKeyMod.GetKeyArgs): js.Promise[atPulumiAwsLib.apigatewayGetKeyMod.GetKeyResult] = js.native
  def getKey(
    args: atPulumiAwsLib.apigatewayGetKeyMod.GetKeyArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.apigatewayGetKeyMod.GetKeyResult] = js.native
  def getResource(args: atPulumiAwsLib.apigatewayGetResourceMod.GetResourceArgs): js.Promise[atPulumiAwsLib.apigatewayGetResourceMod.GetResourceResult] = js.native
  def getResource(
    args: atPulumiAwsLib.apigatewayGetResourceMod.GetResourceArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.apigatewayGetResourceMod.GetResourceResult] = js.native
  def getRestApi(args: atPulumiAwsLib.apigatewayGetRestApiMod.GetRestApiArgs): js.Promise[atPulumiAwsLib.apigatewayGetRestApiMod.GetRestApiResult] = js.native
  def getRestApi(
    args: atPulumiAwsLib.apigatewayGetRestApiMod.GetRestApiArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.apigatewayGetRestApiMod.GetRestApiResult] = js.native
  def getVpcLink(args: atPulumiAwsLib.apigatewayGetVpcLinkMod.GetVpcLinkArgs): js.Promise[atPulumiAwsLib.apigatewayGetVpcLinkMod.GetVpcLinkResult] = js.native
  def getVpcLink(
    args: atPulumiAwsLib.apigatewayGetVpcLinkMod.GetVpcLinkArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.apigatewayGetVpcLinkMod.GetVpcLinkResult] = js.native
  /* static members */
  @js.native
  object Account extends js.Object {
    /**
      * Get an existing Account resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.apigatewayAccountMod.Account = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayAccountMod.AccountState
    ): atPulumiAwsLib.apigatewayAccountMod.Account = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayAccountMod.AccountState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.apigatewayAccountMod.Account = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.apigatewayApiKeyMod.ApiKey = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayApiKeyMod.ApiKeyState
    ): atPulumiAwsLib.apigatewayApiKeyMod.ApiKey = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayApiKeyMod.ApiKeyState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.apigatewayApiKeyMod.ApiKey = js.native
  }
  
  /* static members */
  @js.native
  object Authorizer extends js.Object {
    /**
      * Get an existing Authorizer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.apigatewayAuthorizerMod.Authorizer = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayAuthorizerMod.AuthorizerState
    ): atPulumiAwsLib.apigatewayAuthorizerMod.Authorizer = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayAuthorizerMod.AuthorizerState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.apigatewayAuthorizerMod.Authorizer = js.native
  }
  
  /* static members */
  @js.native
  object BasePathMapping extends js.Object {
    /**
      * Get an existing BasePathMapping resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.apigatewayBasePathMappingMod.BasePathMapping = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayBasePathMappingMod.BasePathMappingState
    ): atPulumiAwsLib.apigatewayBasePathMappingMod.BasePathMapping = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayBasePathMappingMod.BasePathMappingState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.apigatewayBasePathMappingMod.BasePathMapping = js.native
  }
  
  /* static members */
  @js.native
  object ClientCertificate extends js.Object {
    /**
      * Get an existing ClientCertificate resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.apigatewayClientCertificateMod.ClientCertificate = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayClientCertificateMod.ClientCertificateState
    ): atPulumiAwsLib.apigatewayClientCertificateMod.ClientCertificate = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayClientCertificateMod.ClientCertificateState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.apigatewayClientCertificateMod.ClientCertificate = js.native
  }
  
  /* static members */
  @js.native
  object Deployment extends js.Object {
    /**
      * Get an existing Deployment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.apigatewayDeploymentMod.Deployment = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayDeploymentMod.DeploymentState
    ): atPulumiAwsLib.apigatewayDeploymentMod.Deployment = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayDeploymentMod.DeploymentState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.apigatewayDeploymentMod.Deployment = js.native
  }
  
  /* static members */
  @js.native
  object DocumentationPart extends js.Object {
    /**
      * Get an existing DocumentationPart resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.apigatewayDocumentationPartMod.DocumentationPart = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayDocumentationPartMod.DocumentationPartState
    ): atPulumiAwsLib.apigatewayDocumentationPartMod.DocumentationPart = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayDocumentationPartMod.DocumentationPartState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.apigatewayDocumentationPartMod.DocumentationPart = js.native
  }
  
  /* static members */
  @js.native
  object DocumentationVersion extends js.Object {
    /**
      * Get an existing DocumentationVersion resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.apigatewayDocumentationVersionMod.DocumentationVersion = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayDocumentationVersionMod.DocumentationVersionState
    ): atPulumiAwsLib.apigatewayDocumentationVersionMod.DocumentationVersion = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayDocumentationVersionMod.DocumentationVersionState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.apigatewayDocumentationVersionMod.DocumentationVersion = js.native
  }
  
  /* static members */
  @js.native
  object DomainName extends js.Object {
    /**
      * Get an existing DomainName resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.apigatewayDomainNameMod.DomainName = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayDomainNameMod.DomainNameState
    ): atPulumiAwsLib.apigatewayDomainNameMod.DomainName = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayDomainNameMod.DomainNameState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.apigatewayDomainNameMod.DomainName = js.native
  }
  
  /* static members */
  @js.native
  object Integration extends js.Object {
    /**
      * Get an existing Integration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.apigatewayIntegrationMod.Integration = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayIntegrationMod.IntegrationState
    ): atPulumiAwsLib.apigatewayIntegrationMod.Integration = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayIntegrationMod.IntegrationState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.apigatewayIntegrationMod.Integration = js.native
  }
  
  /* static members */
  @js.native
  object IntegrationResponse extends js.Object {
    /**
      * Get an existing IntegrationResponse resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.apigatewayIntegrationResponseMod.IntegrationResponse = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayIntegrationResponseMod.IntegrationResponseState
    ): atPulumiAwsLib.apigatewayIntegrationResponseMod.IntegrationResponse = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayIntegrationResponseMod.IntegrationResponseState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.apigatewayIntegrationResponseMod.IntegrationResponse = js.native
  }
  
  /* static members */
  @js.native
  object Method extends js.Object {
    /**
      * Get an existing Method resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.apigatewayMethodMod.Method = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayMethodMod.MethodState
    ): atPulumiAwsLib.apigatewayMethodMod.Method = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayMethodMod.MethodState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.apigatewayMethodMod.Method = js.native
  }
  
  /* static members */
  @js.native
  object MethodResponse extends js.Object {
    /**
      * Get an existing MethodResponse resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.apigatewayMethodResponseMod.MethodResponse = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayMethodResponseMod.MethodResponseState
    ): atPulumiAwsLib.apigatewayMethodResponseMod.MethodResponse = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayMethodResponseMod.MethodResponseState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.apigatewayMethodResponseMod.MethodResponse = js.native
  }
  
  /* static members */
  @js.native
  object MethodSettings extends js.Object {
    /**
      * Get an existing MethodSettings resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.apigatewayMethodSettingsMod.MethodSettings = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayMethodSettingsMod.MethodSettingsState
    ): atPulumiAwsLib.apigatewayMethodSettingsMod.MethodSettings = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayMethodSettingsMod.MethodSettingsState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.apigatewayMethodSettingsMod.MethodSettings = js.native
  }
  
  /* static members */
  @js.native
  object Model extends js.Object {
    /**
      * Get an existing Model resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.apigatewayModelMod.Model = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayModelMod.ModelState
    ): atPulumiAwsLib.apigatewayModelMod.Model = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayModelMod.ModelState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.apigatewayModelMod.Model = js.native
  }
  
  /* static members */
  @js.native
  object RequestValidator extends js.Object {
    /**
      * Get an existing RequestValidator resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.apigatewayRequestValidatorMod.RequestValidator = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayRequestValidatorMod.RequestValidatorState
    ): atPulumiAwsLib.apigatewayRequestValidatorMod.RequestValidator = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayRequestValidatorMod.RequestValidatorState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.apigatewayRequestValidatorMod.RequestValidator = js.native
  }
  
  /* static members */
  @js.native
  object Resource extends js.Object {
    /**
      * Get an existing Resource resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.apigatewayResourceMod.Resource = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayResourceMod.ResourceState
    ): atPulumiAwsLib.apigatewayResourceMod.Resource = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayResourceMod.ResourceState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.apigatewayResourceMod.Resource = js.native
  }
  
  /* static members */
  @js.native
  object Response extends js.Object {
    /**
      * Get an existing Response resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.apigatewayResponseMod.Response = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayResponseMod.ResponseState
    ): atPulumiAwsLib.apigatewayResponseMod.Response = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayResponseMod.ResponseState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.apigatewayResponseMod.Response = js.native
  }
  
  /* static members */
  @js.native
  object RestApi extends js.Object {
    /**
      * Get an existing RestApi resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.apigatewayRestApiMod.RestApi = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayRestApiMod.RestApiState
    ): atPulumiAwsLib.apigatewayRestApiMod.RestApi = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayRestApiMod.RestApiState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.apigatewayRestApiMod.RestApi = js.native
  }
  
  /* static members */
  @js.native
  object Stage extends js.Object {
    /**
      * Get an existing Stage resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.apigatewayStageMod.Stage = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayStageMod.StageState
    ): atPulumiAwsLib.apigatewayStageMod.Stage = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayStageMod.StageState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.apigatewayStageMod.Stage = js.native
  }
  
  /* static members */
  @js.native
  object UsagePlan extends js.Object {
    /**
      * Get an existing UsagePlan resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.apigatewayUsagePlanMod.UsagePlan = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayUsagePlanMod.UsagePlanState
    ): atPulumiAwsLib.apigatewayUsagePlanMod.UsagePlan = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayUsagePlanMod.UsagePlanState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.apigatewayUsagePlanMod.UsagePlan = js.native
  }
  
  /* static members */
  @js.native
  object UsagePlanKey extends js.Object {
    /**
      * Get an existing UsagePlanKey resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.apigatewayUsagePlanKeyMod.UsagePlanKey = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayUsagePlanKeyMod.UsagePlanKeyState
    ): atPulumiAwsLib.apigatewayUsagePlanKeyMod.UsagePlanKey = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayUsagePlanKeyMod.UsagePlanKeyState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.apigatewayUsagePlanKeyMod.UsagePlanKey = js.native
  }
  
  /* static members */
  @js.native
  object VpcLink extends js.Object {
    /**
      * Get an existing VpcLink resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.apigatewayVpcLinkMod.VpcLink = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayVpcLinkMod.VpcLinkState
    ): atPulumiAwsLib.apigatewayVpcLinkMod.VpcLink = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.apigatewayVpcLinkMod.VpcLinkState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.apigatewayVpcLinkMod.VpcLink = js.native
  }
  
  @JSName("x")
  @js.native
  object xNs extends js.Object {
    @js.native
    class API protected ()
      extends atPulumiAwsLib.apigatewayMod.xNs.API {
      def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayExperimentalApiMod.APIArgs) = this()
      def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayExperimentalApiMod.APIArgs, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
    }
    
  }
  
}

