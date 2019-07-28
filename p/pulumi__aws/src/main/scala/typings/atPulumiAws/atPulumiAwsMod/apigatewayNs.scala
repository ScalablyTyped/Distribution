package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.apigatewayAccountMod.AccountArgs
import typings.atPulumiAws.apigatewayAccountMod.AccountState
import typings.atPulumiAws.apigatewayApiKeyMod.ApiKeyArgs
import typings.atPulumiAws.apigatewayApiKeyMod.ApiKeyState
import typings.atPulumiAws.apigatewayAuthorizerMod.AuthorizerArgs
import typings.atPulumiAws.apigatewayAuthorizerMod.AuthorizerState
import typings.atPulumiAws.apigatewayBasePathMappingMod.BasePathMappingArgs
import typings.atPulumiAws.apigatewayBasePathMappingMod.BasePathMappingState
import typings.atPulumiAws.apigatewayClientCertificateMod.ClientCertificateArgs
import typings.atPulumiAws.apigatewayClientCertificateMod.ClientCertificateState
import typings.atPulumiAws.apigatewayDeploymentMod.DeploymentArgs
import typings.atPulumiAws.apigatewayDeploymentMod.DeploymentState
import typings.atPulumiAws.apigatewayDocumentationPartMod.DocumentationPartArgs
import typings.atPulumiAws.apigatewayDocumentationPartMod.DocumentationPartState
import typings.atPulumiAws.apigatewayDocumentationVersionMod.DocumentationVersionArgs
import typings.atPulumiAws.apigatewayDocumentationVersionMod.DocumentationVersionState
import typings.atPulumiAws.apigatewayDomainNameMod.DomainNameArgs
import typings.atPulumiAws.apigatewayDomainNameMod.DomainNameState
import typings.atPulumiAws.apigatewayGetKeyMod.GetKeyArgs
import typings.atPulumiAws.apigatewayGetKeyMod.GetKeyResult
import typings.atPulumiAws.apigatewayGetResourceMod.GetResourceArgs
import typings.atPulumiAws.apigatewayGetResourceMod.GetResourceResult
import typings.atPulumiAws.apigatewayGetRestApiMod.GetRestApiArgs
import typings.atPulumiAws.apigatewayGetRestApiMod.GetRestApiResult
import typings.atPulumiAws.apigatewayGetVpcLinkMod.GetVpcLinkArgs
import typings.atPulumiAws.apigatewayGetVpcLinkMod.GetVpcLinkResult
import typings.atPulumiAws.apigatewayIntegrationMod.IntegrationArgs
import typings.atPulumiAws.apigatewayIntegrationMod.IntegrationState
import typings.atPulumiAws.apigatewayIntegrationResponseMod.IntegrationResponseArgs
import typings.atPulumiAws.apigatewayIntegrationResponseMod.IntegrationResponseState
import typings.atPulumiAws.apigatewayMethodMod.MethodArgs
import typings.atPulumiAws.apigatewayMethodMod.MethodState
import typings.atPulumiAws.apigatewayMethodResponseMod.MethodResponseArgs
import typings.atPulumiAws.apigatewayMethodResponseMod.MethodResponseState
import typings.atPulumiAws.apigatewayMethodSettingsMod.MethodSettingsArgs
import typings.atPulumiAws.apigatewayMethodSettingsMod.MethodSettingsState
import typings.atPulumiAws.apigatewayModelMod.ModelArgs
import typings.atPulumiAws.apigatewayModelMod.ModelState
import typings.atPulumiAws.apigatewayRequestValidatorMod.RequestValidatorArgs
import typings.atPulumiAws.apigatewayRequestValidatorMod.RequestValidatorState
import typings.atPulumiAws.apigatewayResourceMod.ResourceArgs
import typings.atPulumiAws.apigatewayResourceMod.ResourceState
import typings.atPulumiAws.apigatewayResponseMod.ResponseArgs
import typings.atPulumiAws.apigatewayResponseMod.ResponseState
import typings.atPulumiAws.apigatewayRestApiMod.RestApiArgs
import typings.atPulumiAws.apigatewayRestApiMod.RestApiState
import typings.atPulumiAws.apigatewayStageMod.StageArgs
import typings.atPulumiAws.apigatewayStageMod.StageState
import typings.atPulumiAws.apigatewayUsagePlanKeyMod.UsagePlanKeyArgs
import typings.atPulumiAws.apigatewayUsagePlanKeyMod.UsagePlanKeyState
import typings.atPulumiAws.apigatewayUsagePlanMod.UsagePlanArgs
import typings.atPulumiAws.apigatewayUsagePlanMod.UsagePlanState
import typings.atPulumiAws.apigatewayVpcLinkMod.VpcLinkArgs
import typings.atPulumiAws.apigatewayVpcLinkMod.VpcLinkState
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "apigateway")
@js.native
object apigatewayNs extends js.Object {
  @js.native
  class Account protected ()
    extends typings.atPulumiAws.apigatewayMod.Account {
    /**
      * Create a Account resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: AccountArgs) = this()
    def this(name: String, args: AccountArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ApiKey protected ()
    extends typings.atPulumiAws.apigatewayMod.ApiKey {
    /**
      * Create a ApiKey resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ApiKeyArgs) = this()
    def this(name: String, args: ApiKeyArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Authorizer protected ()
    extends typings.atPulumiAws.apigatewayMod.Authorizer {
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
  
  @js.native
  class BasePathMapping protected ()
    extends typings.atPulumiAws.apigatewayMod.BasePathMapping {
    /**
      * Create a BasePathMapping resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BasePathMappingArgs) = this()
    def this(name: String, args: BasePathMappingArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ClientCertificate protected ()
    extends typings.atPulumiAws.apigatewayMod.ClientCertificate {
    /**
      * Create a ClientCertificate resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClientCertificateArgs) = this()
    def this(name: String, args: ClientCertificateArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Deployment protected ()
    extends typings.atPulumiAws.apigatewayMod.Deployment {
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
  
  @js.native
  class DocumentationPart protected ()
    extends typings.atPulumiAws.apigatewayMod.DocumentationPart {
    /**
      * Create a DocumentationPart resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DocumentationPartArgs) = this()
    def this(name: String, args: DocumentationPartArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class DocumentationVersion protected ()
    extends typings.atPulumiAws.apigatewayMod.DocumentationVersion {
    /**
      * Create a DocumentationVersion resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DocumentationVersionArgs) = this()
    def this(name: String, args: DocumentationVersionArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class DomainName protected ()
    extends typings.atPulumiAws.apigatewayMod.DomainName {
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
  
  @js.native
  class Integration protected ()
    extends typings.atPulumiAws.apigatewayMod.Integration {
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
  
  @js.native
  class IntegrationResponse protected ()
    extends typings.atPulumiAws.apigatewayMod.IntegrationResponse {
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
  
  @js.native
  class Method protected ()
    extends typings.atPulumiAws.apigatewayMod.Method {
    /**
      * Create a Method resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MethodArgs) = this()
    def this(name: String, args: MethodArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class MethodResponse protected ()
    extends typings.atPulumiAws.apigatewayMod.MethodResponse {
    /**
      * Create a MethodResponse resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MethodResponseArgs) = this()
    def this(name: String, args: MethodResponseArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class MethodSettings protected ()
    extends typings.atPulumiAws.apigatewayMod.MethodSettings {
    /**
      * Create a MethodSettings resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MethodSettingsArgs) = this()
    def this(name: String, args: MethodSettingsArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Model protected ()
    extends typings.atPulumiAws.apigatewayMod.Model {
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
  
  @js.native
  class RequestValidator protected ()
    extends typings.atPulumiAws.apigatewayMod.RequestValidator {
    /**
      * Create a RequestValidator resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RequestValidatorArgs) = this()
    def this(name: String, args: RequestValidatorArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Resource protected ()
    extends typings.atPulumiAws.apigatewayMod.Resource {
    /**
      * Create a Resource resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResourceArgs) = this()
    def this(name: String, args: ResourceArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Response protected ()
    extends typings.atPulumiAws.apigatewayMod.Response {
    /**
      * Create a Response resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResponseArgs) = this()
    def this(name: String, args: ResponseArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class RestApi protected ()
    extends typings.atPulumiAws.apigatewayMod.RestApi {
    /**
      * Create a RestApi resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: RestApiArgs) = this()
    def this(name: String, args: RestApiArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Stage protected ()
    extends typings.atPulumiAws.apigatewayMod.Stage {
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
  
  @js.native
  class UsagePlan protected ()
    extends typings.atPulumiAws.apigatewayMod.UsagePlan {
    /**
      * Create a UsagePlan resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: UsagePlanArgs) = this()
    def this(name: String, args: UsagePlanArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class UsagePlanKey protected ()
    extends typings.atPulumiAws.apigatewayMod.UsagePlanKey {
    /**
      * Create a UsagePlanKey resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: UsagePlanKeyArgs) = this()
    def this(name: String, args: UsagePlanKeyArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class VpcLink protected ()
    extends typings.atPulumiAws.apigatewayMod.VpcLink {
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
  
  def getKey(args: GetKeyArgs): js.Promise[GetKeyResult] with GetKeyResult = js.native
  def getKey(args: GetKeyArgs, opts: InvokeOptions): js.Promise[GetKeyResult] with GetKeyResult = js.native
  def getResource(args: GetResourceArgs): js.Promise[GetResourceResult] with GetResourceResult = js.native
  def getResource(args: GetResourceArgs, opts: InvokeOptions): js.Promise[GetResourceResult] with GetResourceResult = js.native
  def getRestApi(args: GetRestApiArgs): js.Promise[GetRestApiResult] with GetRestApiResult = js.native
  def getRestApi(args: GetRestApiArgs, opts: InvokeOptions): js.Promise[GetRestApiResult] with GetRestApiResult = js.native
  def getVpcLink(args: GetVpcLinkArgs): js.Promise[GetVpcLinkResult] with GetVpcLinkResult = js.native
  def getVpcLink(args: GetVpcLinkArgs, opts: InvokeOptions): js.Promise[GetVpcLinkResult] with GetVpcLinkResult = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.apigatewayAccountMod.Account = js.native
    def get(name: String, id: Input[ID], state: AccountState): typings.atPulumiAws.apigatewayAccountMod.Account = js.native
    def get(name: String, id: Input[ID], state: AccountState, opts: CustomResourceOptions): typings.atPulumiAws.apigatewayAccountMod.Account = js.native
    /**
      * Returns true if the given object is an instance of Account.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/account.Account */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.apigatewayApiKeyMod.ApiKey = js.native
    def get(name: String, id: Input[ID], state: ApiKeyState): typings.atPulumiAws.apigatewayApiKeyMod.ApiKey = js.native
    def get(name: String, id: Input[ID], state: ApiKeyState, opts: CustomResourceOptions): typings.atPulumiAws.apigatewayApiKeyMod.ApiKey = js.native
    /**
      * Returns true if the given object is an instance of ApiKey.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/apiKey.ApiKey */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.apigatewayAuthorizerMod.Authorizer = js.native
    def get(name: String, id: Input[ID], state: AuthorizerState): typings.atPulumiAws.apigatewayAuthorizerMod.Authorizer = js.native
    def get(name: String, id: Input[ID], state: AuthorizerState, opts: CustomResourceOptions): typings.atPulumiAws.apigatewayAuthorizerMod.Authorizer = js.native
    /**
      * Returns true if the given object is an instance of Authorizer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/authorizer.Authorizer */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.apigatewayBasePathMappingMod.BasePathMapping = js.native
    def get(name: String, id: Input[ID], state: BasePathMappingState): typings.atPulumiAws.apigatewayBasePathMappingMod.BasePathMapping = js.native
    def get(name: String, id: Input[ID], state: BasePathMappingState, opts: CustomResourceOptions): typings.atPulumiAws.apigatewayBasePathMappingMod.BasePathMapping = js.native
    /**
      * Returns true if the given object is an instance of BasePathMapping.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/basePathMapping.BasePathMapping */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.apigatewayClientCertificateMod.ClientCertificate = js.native
    def get(name: String, id: Input[ID], state: ClientCertificateState): typings.atPulumiAws.apigatewayClientCertificateMod.ClientCertificate = js.native
    def get(name: String, id: Input[ID], state: ClientCertificateState, opts: CustomResourceOptions): typings.atPulumiAws.apigatewayClientCertificateMod.ClientCertificate = js.native
    /**
      * Returns true if the given object is an instance of ClientCertificate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/clientCertificate.ClientCertificate */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.apigatewayDeploymentMod.Deployment = js.native
    def get(name: String, id: Input[ID], state: DeploymentState): typings.atPulumiAws.apigatewayDeploymentMod.Deployment = js.native
    def get(name: String, id: Input[ID], state: DeploymentState, opts: CustomResourceOptions): typings.atPulumiAws.apigatewayDeploymentMod.Deployment = js.native
    /**
      * Returns true if the given object is an instance of Deployment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/deployment.Deployment */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.apigatewayDocumentationPartMod.DocumentationPart = js.native
    def get(name: String, id: Input[ID], state: DocumentationPartState): typings.atPulumiAws.apigatewayDocumentationPartMod.DocumentationPart = js.native
    def get(name: String, id: Input[ID], state: DocumentationPartState, opts: CustomResourceOptions): typings.atPulumiAws.apigatewayDocumentationPartMod.DocumentationPart = js.native
    /**
      * Returns true if the given object is an instance of DocumentationPart.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/documentationPart.DocumentationPart */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.apigatewayDocumentationVersionMod.DocumentationVersion = js.native
    def get(name: String, id: Input[ID], state: DocumentationVersionState): typings.atPulumiAws.apigatewayDocumentationVersionMod.DocumentationVersion = js.native
    def get(name: String, id: Input[ID], state: DocumentationVersionState, opts: CustomResourceOptions): typings.atPulumiAws.apigatewayDocumentationVersionMod.DocumentationVersion = js.native
    /**
      * Returns true if the given object is an instance of DocumentationVersion.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/documentationVersion.DocumentationVersion */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.apigatewayDomainNameMod.DomainName = js.native
    def get(name: String, id: Input[ID], state: DomainNameState): typings.atPulumiAws.apigatewayDomainNameMod.DomainName = js.native
    def get(name: String, id: Input[ID], state: DomainNameState, opts: CustomResourceOptions): typings.atPulumiAws.apigatewayDomainNameMod.DomainName = js.native
    /**
      * Returns true if the given object is an instance of DomainName.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/domainName.DomainName */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.apigatewayIntegrationMod.Integration = js.native
    def get(name: String, id: Input[ID], state: IntegrationState): typings.atPulumiAws.apigatewayIntegrationMod.Integration = js.native
    def get(name: String, id: Input[ID], state: IntegrationState, opts: CustomResourceOptions): typings.atPulumiAws.apigatewayIntegrationMod.Integration = js.native
    /**
      * Returns true if the given object is an instance of Integration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/integration.Integration */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.apigatewayIntegrationResponseMod.IntegrationResponse = js.native
    def get(name: String, id: Input[ID], state: IntegrationResponseState): typings.atPulumiAws.apigatewayIntegrationResponseMod.IntegrationResponse = js.native
    def get(name: String, id: Input[ID], state: IntegrationResponseState, opts: CustomResourceOptions): typings.atPulumiAws.apigatewayIntegrationResponseMod.IntegrationResponse = js.native
    /**
      * Returns true if the given object is an instance of IntegrationResponse.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/integrationResponse.IntegrationResponse */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.apigatewayMethodMod.Method = js.native
    def get(name: String, id: Input[ID], state: MethodState): typings.atPulumiAws.apigatewayMethodMod.Method = js.native
    def get(name: String, id: Input[ID], state: MethodState, opts: CustomResourceOptions): typings.atPulumiAws.apigatewayMethodMod.Method = js.native
    /**
      * Returns true if the given object is an instance of Method.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/method.Method */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.apigatewayMethodResponseMod.MethodResponse = js.native
    def get(name: String, id: Input[ID], state: MethodResponseState): typings.atPulumiAws.apigatewayMethodResponseMod.MethodResponse = js.native
    def get(name: String, id: Input[ID], state: MethodResponseState, opts: CustomResourceOptions): typings.atPulumiAws.apigatewayMethodResponseMod.MethodResponse = js.native
    /**
      * Returns true if the given object is an instance of MethodResponse.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/methodResponse.MethodResponse */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.apigatewayMethodSettingsMod.MethodSettings = js.native
    def get(name: String, id: Input[ID], state: MethodSettingsState): typings.atPulumiAws.apigatewayMethodSettingsMod.MethodSettings = js.native
    def get(name: String, id: Input[ID], state: MethodSettingsState, opts: CustomResourceOptions): typings.atPulumiAws.apigatewayMethodSettingsMod.MethodSettings = js.native
    /**
      * Returns true if the given object is an instance of MethodSettings.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/methodSettings.MethodSettings */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.apigatewayModelMod.Model = js.native
    def get(name: String, id: Input[ID], state: ModelState): typings.atPulumiAws.apigatewayModelMod.Model = js.native
    def get(name: String, id: Input[ID], state: ModelState, opts: CustomResourceOptions): typings.atPulumiAws.apigatewayModelMod.Model = js.native
    /**
      * Returns true if the given object is an instance of Model.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/model.Model */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.apigatewayRequestValidatorMod.RequestValidator = js.native
    def get(name: String, id: Input[ID], state: RequestValidatorState): typings.atPulumiAws.apigatewayRequestValidatorMod.RequestValidator = js.native
    def get(name: String, id: Input[ID], state: RequestValidatorState, opts: CustomResourceOptions): typings.atPulumiAws.apigatewayRequestValidatorMod.RequestValidator = js.native
    /**
      * Returns true if the given object is an instance of RequestValidator.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/requestValidator.RequestValidator */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.apigatewayResourceMod.Resource = js.native
    def get(name: String, id: Input[ID], state: ResourceState): typings.atPulumiAws.apigatewayResourceMod.Resource = js.native
    def get(name: String, id: Input[ID], state: ResourceState, opts: CustomResourceOptions): typings.atPulumiAws.apigatewayResourceMod.Resource = js.native
    /**
      * Returns true if the given object is an instance of Resource.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/resource.Resource */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.apigatewayResponseMod.Response = js.native
    def get(name: String, id: Input[ID], state: ResponseState): typings.atPulumiAws.apigatewayResponseMod.Response = js.native
    def get(name: String, id: Input[ID], state: ResponseState, opts: CustomResourceOptions): typings.atPulumiAws.apigatewayResponseMod.Response = js.native
    /**
      * Returns true if the given object is an instance of Response.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/response.Response */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.apigatewayRestApiMod.RestApi = js.native
    def get(name: String, id: Input[ID], state: RestApiState): typings.atPulumiAws.apigatewayRestApiMod.RestApi = js.native
    def get(name: String, id: Input[ID], state: RestApiState, opts: CustomResourceOptions): typings.atPulumiAws.apigatewayRestApiMod.RestApi = js.native
    /**
      * Returns true if the given object is an instance of RestApi.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/restApi.RestApi */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.apigatewayStageMod.Stage = js.native
    def get(name: String, id: Input[ID], state: StageState): typings.atPulumiAws.apigatewayStageMod.Stage = js.native
    def get(name: String, id: Input[ID], state: StageState, opts: CustomResourceOptions): typings.atPulumiAws.apigatewayStageMod.Stage = js.native
    /**
      * Returns true if the given object is an instance of Stage.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/stage.Stage */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.apigatewayUsagePlanMod.UsagePlan = js.native
    def get(name: String, id: Input[ID], state: UsagePlanState): typings.atPulumiAws.apigatewayUsagePlanMod.UsagePlan = js.native
    def get(name: String, id: Input[ID], state: UsagePlanState, opts: CustomResourceOptions): typings.atPulumiAws.apigatewayUsagePlanMod.UsagePlan = js.native
    /**
      * Returns true if the given object is an instance of UsagePlan.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/usagePlan.UsagePlan */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.apigatewayUsagePlanKeyMod.UsagePlanKey = js.native
    def get(name: String, id: Input[ID], state: UsagePlanKeyState): typings.atPulumiAws.apigatewayUsagePlanKeyMod.UsagePlanKey = js.native
    def get(name: String, id: Input[ID], state: UsagePlanKeyState, opts: CustomResourceOptions): typings.atPulumiAws.apigatewayUsagePlanKeyMod.UsagePlanKey = js.native
    /**
      * Returns true if the given object is an instance of UsagePlanKey.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/usagePlanKey.UsagePlanKey */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.apigatewayVpcLinkMod.VpcLink = js.native
    def get(name: String, id: Input[ID], state: VpcLinkState): typings.atPulumiAws.apigatewayVpcLinkMod.VpcLink = js.native
    def get(name: String, id: Input[ID], state: VpcLinkState, opts: CustomResourceOptions): typings.atPulumiAws.apigatewayVpcLinkMod.VpcLink = js.native
    /**
      * Returns true if the given object is an instance of VpcLink.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/vpcLink.VpcLink */ Boolean = js.native
  }
  
}

