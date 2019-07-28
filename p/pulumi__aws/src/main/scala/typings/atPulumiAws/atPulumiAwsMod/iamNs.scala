package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.arnMod.ARN
import typings.atPulumiAws.iamAccessKeyMod.AccessKeyArgs
import typings.atPulumiAws.iamAccessKeyMod.AccessKeyState
import typings.atPulumiAws.iamAccountAliasMod.AccountAliasArgs
import typings.atPulumiAws.iamAccountAliasMod.AccountAliasState
import typings.atPulumiAws.iamAccountPasswordPolicyMod.AccountPasswordPolicyArgs
import typings.atPulumiAws.iamAccountPasswordPolicyMod.AccountPasswordPolicyState
import typings.atPulumiAws.iamDocumentsMod.PolicyDocument
import typings.atPulumiAws.iamDocumentsMod.Principal
import typings.atPulumiAws.iamGetAccountAliasMod.GetAccountAliasResult
import typings.atPulumiAws.iamGetGroupMod.GetGroupArgs
import typings.atPulumiAws.iamGetGroupMod.GetGroupResult
import typings.atPulumiAws.iamGetInstanceProfileMod.GetInstanceProfileArgs
import typings.atPulumiAws.iamGetInstanceProfileMod.GetInstanceProfileResult
import typings.atPulumiAws.iamGetPolicyDocumentMod.GetPolicyDocumentArgs
import typings.atPulumiAws.iamGetPolicyDocumentMod.GetPolicyDocumentResult
import typings.atPulumiAws.iamGetPolicyMod.GetPolicyArgs
import typings.atPulumiAws.iamGetPolicyMod.GetPolicyResult
import typings.atPulumiAws.iamGetRoleMod.GetRoleArgs
import typings.atPulumiAws.iamGetRoleMod.GetRoleResult
import typings.atPulumiAws.iamGetServerCertificateMod.GetServerCertificateArgs
import typings.atPulumiAws.iamGetServerCertificateMod.GetServerCertificateResult
import typings.atPulumiAws.iamGetUserMod.GetUserArgs
import typings.atPulumiAws.iamGetUserMod.GetUserResult
import typings.atPulumiAws.iamGroupMembershipMod.GroupMembershipArgs
import typings.atPulumiAws.iamGroupMembershipMod.GroupMembershipState
import typings.atPulumiAws.iamGroupMod.GroupArgs
import typings.atPulumiAws.iamGroupMod.GroupState
import typings.atPulumiAws.iamGroupPolicyAttachmentMod.GroupPolicyAttachmentArgs
import typings.atPulumiAws.iamGroupPolicyAttachmentMod.GroupPolicyAttachmentState
import typings.atPulumiAws.iamGroupPolicyMod.GroupPolicyArgs
import typings.atPulumiAws.iamGroupPolicyMod.GroupPolicyState
import typings.atPulumiAws.iamInstanceProfileMod.InstanceProfileArgs
import typings.atPulumiAws.iamInstanceProfileMod.InstanceProfileState
import typings.atPulumiAws.iamOpenIdConnectProviderMod.OpenIdConnectProviderArgs
import typings.atPulumiAws.iamOpenIdConnectProviderMod.OpenIdConnectProviderState
import typings.atPulumiAws.iamPolicyAttachmentMod.PolicyAttachmentArgs
import typings.atPulumiAws.iamPolicyAttachmentMod.PolicyAttachmentState
import typings.atPulumiAws.iamPolicyMod.PolicyArgs
import typings.atPulumiAws.iamPolicyMod.PolicyState
import typings.atPulumiAws.iamRoleMod.RoleArgs
import typings.atPulumiAws.iamRoleMod.RoleState
import typings.atPulumiAws.iamRolePolicyAttachmentMod.RolePolicyAttachmentArgs
import typings.atPulumiAws.iamRolePolicyAttachmentMod.RolePolicyAttachmentState
import typings.atPulumiAws.iamRolePolicyMod.RolePolicyArgs
import typings.atPulumiAws.iamRolePolicyMod.RolePolicyState
import typings.atPulumiAws.iamSamlProviderMod.SamlProviderArgs
import typings.atPulumiAws.iamSamlProviderMod.SamlProviderState
import typings.atPulumiAws.iamServerCertificateMod.ServerCertificateArgs
import typings.atPulumiAws.iamServerCertificateMod.ServerCertificateState
import typings.atPulumiAws.iamServiceLinkedRoleMod.ServiceLinkedRoleArgs
import typings.atPulumiAws.iamServiceLinkedRoleMod.ServiceLinkedRoleState
import typings.atPulumiAws.iamSshKeyMod.SshKeyArgs
import typings.atPulumiAws.iamSshKeyMod.SshKeyState
import typings.atPulumiAws.iamUserGroupMembershipMod.UserGroupMembershipArgs
import typings.atPulumiAws.iamUserGroupMembershipMod.UserGroupMembershipState
import typings.atPulumiAws.iamUserLoginProfileMod.UserLoginProfileArgs
import typings.atPulumiAws.iamUserLoginProfileMod.UserLoginProfileState
import typings.atPulumiAws.iamUserMod.UserArgs
import typings.atPulumiAws.iamUserMod.UserState
import typings.atPulumiAws.iamUserPolicyAttachmentMod.UserPolicyAttachmentArgs
import typings.atPulumiAws.iamUserPolicyAttachmentMod.UserPolicyAttachmentState
import typings.atPulumiAws.iamUserPolicyMod.UserPolicyArgs
import typings.atPulumiAws.iamUserPolicyMod.UserPolicyState
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "iam")
@js.native
object iamNs extends js.Object {
  @js.native
  class AccessKey protected ()
    extends typings.atPulumiAws.iamMod.AccessKey {
    /**
      * Create a AccessKey resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AccessKeyArgs) = this()
    def this(name: String, args: AccessKeyArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class AccountAlias protected ()
    extends typings.atPulumiAws.iamMod.AccountAlias {
    /**
      * Create a AccountAlias resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AccountAliasArgs) = this()
    def this(name: String, args: AccountAliasArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class AccountPasswordPolicy protected ()
    extends typings.atPulumiAws.iamMod.AccountPasswordPolicy {
    /**
      * Create a AccountPasswordPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: AccountPasswordPolicyArgs) = this()
    def this(name: String, args: AccountPasswordPolicyArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Group protected ()
    extends typings.atPulumiAws.iamMod.Group {
    /**
      * Create a Group resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: GroupArgs) = this()
    def this(name: String, args: GroupArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class GroupMembership protected ()
    extends typings.atPulumiAws.iamMod.GroupMembership {
    /**
      * Create a GroupMembership resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GroupMembershipArgs) = this()
    def this(name: String, args: GroupMembershipArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class GroupPolicy protected ()
    extends typings.atPulumiAws.iamMod.GroupPolicy {
    /**
      * Create a GroupPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GroupPolicyArgs) = this()
    def this(name: String, args: GroupPolicyArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class GroupPolicyAttachment protected ()
    extends typings.atPulumiAws.iamMod.GroupPolicyAttachment {
    /**
      * Create a GroupPolicyAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GroupPolicyAttachmentArgs) = this()
    def this(name: String, args: GroupPolicyAttachmentArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class InstanceProfile protected ()
    extends typings.atPulumiAws.iamMod.InstanceProfile {
    /**
      * Create a InstanceProfile resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: InstanceProfileArgs) = this()
    def this(name: String, args: InstanceProfileArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class OpenIdConnectProvider protected ()
    extends typings.atPulumiAws.iamMod.OpenIdConnectProvider {
    /**
      * Create a OpenIdConnectProvider resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: OpenIdConnectProviderArgs) = this()
    def this(name: String, args: OpenIdConnectProviderArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Policy protected ()
    extends typings.atPulumiAws.iamMod.Policy {
    /**
      * Create a Policy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PolicyArgs) = this()
    def this(name: String, args: PolicyArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class PolicyAttachment protected ()
    extends typings.atPulumiAws.iamMod.PolicyAttachment {
    /**
      * Create a PolicyAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PolicyAttachmentArgs) = this()
    def this(name: String, args: PolicyAttachmentArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Role protected ()
    extends typings.atPulumiAws.iamMod.Role {
    /**
      * Create a Role resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RoleArgs) = this()
    def this(name: String, args: RoleArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class RolePolicy protected ()
    extends typings.atPulumiAws.iamMod.RolePolicy {
    /**
      * Create a RolePolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RolePolicyArgs) = this()
    def this(name: String, args: RolePolicyArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class RolePolicyAttachment protected ()
    extends typings.atPulumiAws.iamMod.RolePolicyAttachment {
    /**
      * Create a RolePolicyAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RolePolicyAttachmentArgs) = this()
    def this(name: String, args: RolePolicyAttachmentArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class SamlProvider protected ()
    extends typings.atPulumiAws.iamMod.SamlProvider {
    /**
      * Create a SamlProvider resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SamlProviderArgs) = this()
    def this(name: String, args: SamlProviderArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ServerCertificate protected ()
    extends typings.atPulumiAws.iamMod.ServerCertificate {
    /**
      * Create a ServerCertificate resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ServerCertificateArgs) = this()
    def this(name: String, args: ServerCertificateArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ServiceLinkedRole protected ()
    extends typings.atPulumiAws.iamMod.ServiceLinkedRole {
    /**
      * Create a ServiceLinkedRole resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ServiceLinkedRoleArgs) = this()
    def this(name: String, args: ServiceLinkedRoleArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class SshKey protected ()
    extends typings.atPulumiAws.iamMod.SshKey {
    /**
      * Create a SshKey resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SshKeyArgs) = this()
    def this(name: String, args: SshKeyArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class User protected ()
    extends typings.atPulumiAws.iamMod.User {
    /**
      * Create a User resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: UserArgs) = this()
    def this(name: String, args: UserArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class UserGroupMembership protected ()
    extends typings.atPulumiAws.iamMod.UserGroupMembership {
    /**
      * Create a UserGroupMembership resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: UserGroupMembershipArgs) = this()
    def this(name: String, args: UserGroupMembershipArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class UserLoginProfile protected ()
    extends typings.atPulumiAws.iamMod.UserLoginProfile {
    /**
      * Create a UserLoginProfile resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: UserLoginProfileArgs) = this()
    def this(name: String, args: UserLoginProfileArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class UserPolicy protected ()
    extends typings.atPulumiAws.iamMod.UserPolicy {
    /**
      * Create a UserPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: UserPolicyArgs) = this()
    def this(name: String, args: UserPolicyArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class UserPolicyAttachment protected ()
    extends typings.atPulumiAws.iamMod.UserPolicyAttachment {
    /**
      * Create a UserPolicyAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: UserPolicyAttachmentArgs) = this()
    def this(name: String, args: UserPolicyAttachmentArgs, opts: CustomResourceOptions) = this()
  }
  
  val AWSAccountActivityAccess: ARN = js.native
  val AWSAccountUsageReportAccess: ARN = js.native
  val AWSAgentlessDiscoveryService: ARN = js.native
  val AWSApplicationDiscoveryAgentAccess: ARN = js.native
  val AWSApplicationDiscoveryServiceFullAccess: ARN = js.native
  val AWSBatchFullAccess: ARN = js.native
  val AWSBatchServiceRole: ARN = js.native
  val AWSCertificateManagerFullAccess: ARN = js.native
  val AWSCertificateManagerReadOnly: ARN = js.native
  val AWSCloudFormationReadOnlyAccess: ARN = js.native
  val AWSCloudHSMFullAccess: ARN = js.native
  val AWSCloudHSMReadOnlyAccess: ARN = js.native
  val AWSCloudHSMRole: ARN = js.native
  val AWSCloudTrailFullAccess: ARN = js.native
  val AWSCloudTrailReadOnlyAccess: ARN = js.native
  val AWSCodeBuildAdminAccess: ARN = js.native
  val AWSCodeBuildDeveloperAccess: ARN = js.native
  val AWSCodeBuildReadOnlyAccess: ARN = js.native
  val AWSCodeCommitFullAccess: ARN = js.native
  val AWSCodeCommitPowerUser: ARN = js.native
  val AWSCodeCommitReadOnly: ARN = js.native
  val AWSCodeDeployDeployerAccess: ARN = js.native
  val AWSCodeDeployFullAccess: ARN = js.native
  val AWSCodeDeployReadOnlyAccess: ARN = js.native
  val AWSCodeDeployRole: ARN = js.native
  val AWSCodePipelineApproverAccess: ARN = js.native
  val AWSCodePipelineCustomActionAccess: ARN = js.native
  val AWSCodePipelineFullAccess: ARN = js.native
  val AWSCodePipelineReadOnlyAccess: ARN = js.native
  val AWSCodeStarFullAccess: ARN = js.native
  val AWSCodeStarServiceRole: ARN = js.native
  val AWSConfigRole: ARN = js.native
  val AWSConfigRulesExecutionRole: ARN = js.native
  val AWSConfigUserAccess: ARN = js.native
  val AWSConnector: ARN = js.native
  val AWSDataPipelineRole: ARN = js.native
  val AWSDataPipeline_FullAccess: ARN = js.native
  val AWSDataPipeline_PowerUser: ARN = js.native
  val AWSDeviceFarmFullAccess: ARN = js.native
  val AWSDirectConnectFullAccess: ARN = js.native
  val AWSDirectConnectReadOnlyAccess: ARN = js.native
  val AWSDirectoryServiceFullAccess: ARN = js.native
  val AWSDirectoryServiceReadOnlyAccess: ARN = js.native
  val AWSElasticBeanstalkCustomPlatformforEC2Role: ARN = js.native
  val AWSElasticBeanstalkEnhancedHealth: ARN = js.native
  val AWSElasticBeanstalkFullAccess: ARN = js.native
  val AWSElasticBeanstalkMulticontainerDocker: ARN = js.native
  val AWSElasticBeanstalkReadOnlyAccess: ARN = js.native
  val AWSElasticBeanstalkService: ARN = js.native
  val AWSElasticBeanstalkWebTier: ARN = js.native
  val AWSElasticBeanstalkWorkerTier: ARN = js.native
  val AWSGreengrassFullAccess: ARN = js.native
  val AWSGreengrassResourceAccessRolePolicy: ARN = js.native
  val AWSHealthFullAccess: ARN = js.native
  val AWSImportExportFullAccess: ARN = js.native
  val AWSImportExportReadOnlyAccess: ARN = js.native
  val AWSIoTConfigAccess: ARN = js.native
  val AWSIoTConfigReadOnlyAccess: ARN = js.native
  val AWSIoTDataAccess: ARN = js.native
  val AWSIoTFullAccess: ARN = js.native
  val AWSIoTLogging: ARN = js.native
  val AWSIoTRuleActions: ARN = js.native
  val AWSKeyManagementServicePowerUser: ARN = js.native
  val AWSLambdaBasicExecutionRole: ARN = js.native
  val AWSLambdaDynamoDBExecutionRole: ARN = js.native
  val AWSLambdaENIManagementAccess: ARN = js.native
  val AWSLambdaExecute: ARN = js.native
  val AWSLambdaFullAccess: ARN = js.native
  val AWSLambdaInvocationDynamoDB: ARN = js.native
  val AWSLambdaKinesisExecutionRole: ARN = js.native
  val AWSLambdaReadOnlyAccess: ARN = js.native
  val AWSLambdaRole: ARN = js.native
  val AWSLambdaVPCAccessExecutionRole: ARN = js.native
  val AWSMarketplaceFullAccess: ARN = js.native
  val AWSMarketplaceGetEntitlements: ARN = js.native
  val AWSMarketplaceManageSubscriptions: ARN = js.native
  val AWSMarketplaceMeteringFullAccess: ARN = js.native
  val AWSMarketplaceReadonly: ARN = js.native
  val AWSMobileHub_FullAccess: ARN = js.native
  val AWSMobileHub_ReadOnly: ARN = js.native
  val AWSMobileHub_ServiceUseOnly: ARN = js.native
  val AWSOpsWorksCMInstanceProfileRole: ARN = js.native
  val AWSOpsWorksCMServiceRole: ARN = js.native
  val AWSOpsWorksCloudWatchLogs: ARN = js.native
  val AWSOpsWorksFullAccess: ARN = js.native
  val AWSOpsWorksInstanceRegistration: ARN = js.native
  val AWSOpsWorksRegisterCLI: ARN = js.native
  val AWSOpsWorksRole: ARN = js.native
  val AWSQuickSightDescribeRDS: ARN = js.native
  val AWSQuickSightDescribeRedshift: ARN = js.native
  val AWSQuickSightListIAM: ARN = js.native
  val AWSQuicksightAthenaAccess: ARN = js.native
  val AWSStepFunctionsConsoleFullAccess: ARN = js.native
  val AWSStepFunctionsFullAccess: ARN = js.native
  val AWSStepFunctionsReadOnlyAccess: ARN = js.native
  val AWSStorageGatewayFullAccess: ARN = js.native
  val AWSStorageGatewayReadOnlyAccess: ARN = js.native
  val AWSSupportAccess: ARN = js.native
  val AWSWAFFullAccess: ARN = js.native
  val AWSWAFReadOnlyAccess: ARN = js.native
  val AWSXrayFullAccess: ARN = js.native
  val AWSXrayReadOnlyAccess: ARN = js.native
  val AWSXrayWriteOnlyAccess: ARN = js.native
  val AcmServicePrincipal: Principal = js.native
  val AdministratorAccess: ARN = js.native
  val AmazonAPIGatewayAdministrator: ARN = js.native
  val AmazonAPIGatewayInvokeFullAccess: ARN = js.native
  val AmazonAPIGatewayPushToCloudWatchLogs: ARN = js.native
  val AmazonAppStreamFullAccess: ARN = js.native
  val AmazonAppStreamReadOnlyAccess: ARN = js.native
  val AmazonAppStreamServiceAccess: ARN = js.native
  val AmazonAthenaFullAccess: ARN = js.native
  val AmazonCloudDirectoryFullAccess: ARN = js.native
  val AmazonCloudDirectoryReadOnlyAccess: ARN = js.native
  val AmazonCognitoDeveloperAuthenticatedIdentities: ARN = js.native
  val AmazonCognitoPowerUser: ARN = js.native
  val AmazonCognitoReadOnly: ARN = js.native
  val AmazonDMSCloudWatchLogsRole: ARN = js.native
  val AmazonDMSRedshiftS3Role: ARN = js.native
  val AmazonDMSVPCManagementRole: ARN = js.native
  val AmazonDRSVPCManagement: ARN = js.native
  val AmazonDynamoDBFullAccess: ARN = js.native
  val AmazonDynamoDBFullAccesswithDataPipeline: ARN = js.native
  val AmazonDynamoDBReadOnlyAccess: ARN = js.native
  val AmazonEC2ContainerRegistryFullAccess: ARN = js.native
  val AmazonEC2ContainerRegistryPowerUser: ARN = js.native
  val AmazonEC2ContainerRegistryReadOnly: ARN = js.native
  val AmazonEC2ContainerServiceAutoscaleRole: ARN = js.native
  val AmazonEC2ContainerServiceFullAccess: ARN = js.native
  val AmazonEC2ContainerServiceRole: ARN = js.native
  val AmazonEC2ContainerServiceforEC2Role: ARN = js.native
  val AmazonEC2FullAccess: ARN = js.native
  val AmazonEC2ReadOnlyAccess: ARN = js.native
  val AmazonEC2ReportsAccess: ARN = js.native
  val AmazonEC2RoleforAWSCodeDeploy: ARN = js.native
  val AmazonEC2RoleforDataPipelineRole: ARN = js.native
  val AmazonEC2RoleforSSM: ARN = js.native
  val AmazonEC2SpotFleetAutoscaleRole: ARN = js.native
  val AmazonEC2SpotFleetRole: ARN = js.native
  val AmazonESFullAccess: ARN = js.native
  val AmazonESReadOnlyAccess: ARN = js.native
  val AmazonElastiCacheFullAccess: ARN = js.native
  val AmazonElastiCacheReadOnlyAccess: ARN = js.native
  val AmazonElasticFileSystemFullAccess: ARN = js.native
  val AmazonElasticFileSystemReadOnlyAccess: ARN = js.native
  val AmazonElasticMapReduceFullAccess: ARN = js.native
  val AmazonElasticMapReduceReadOnlyAccess: ARN = js.native
  val AmazonElasticMapReduceRole: ARN = js.native
  val AmazonElasticMapReduceforAutoScalingRole: ARN = js.native
  val AmazonElasticMapReduceforEC2Role: ARN = js.native
  val AmazonElasticTranscoderFullAccess: ARN = js.native
  val AmazonElasticTranscoderJobsSubmitter: ARN = js.native
  val AmazonElasticTranscoderReadOnlyAccess: ARN = js.native
  val AmazonElasticTranscoderRole: ARN = js.native
  val AmazonGlacierFullAccess: ARN = js.native
  val AmazonGlacierReadOnlyAccess: ARN = js.native
  val AmazonInspectorFullAccess: ARN = js.native
  val AmazonInspectorReadOnlyAccess: ARN = js.native
  val AmazonKinesisAnalyticsFullAccess: ARN = js.native
  val AmazonKinesisAnalyticsReadOnly: ARN = js.native
  val AmazonKinesisFirehoseFullAccess: ARN = js.native
  val AmazonKinesisFirehoseReadOnlyAccess: ARN = js.native
  val AmazonKinesisFullAccess: ARN = js.native
  val AmazonKinesisReadOnlyAccess: ARN = js.native
  val AmazonLexFullAccess: ARN = js.native
  val AmazonLexReadOnly: ARN = js.native
  val AmazonLexRunBotsOnly: ARN = js.native
  val AmazonMachineLearningBatchPredictionsAccess: ARN = js.native
  val AmazonMachineLearningCreateOnlyAccess: ARN = js.native
  val AmazonMachineLearningFullAccess: ARN = js.native
  val AmazonMachineLearningManageRealTimeEndpointOnlyAccess: ARN = js.native
  val AmazonMachineLearningReadOnlyAccess: ARN = js.native
  val AmazonMachineLearningRealTimePredictionOnlyAccess: ARN = js.native
  val AmazonMachineLearningRoleforRedshiftDataSource: ARN = js.native
  val AmazonMechanicalTurkFullAccess: ARN = js.native
  val AmazonMechanicalTurkReadOnly: ARN = js.native
  val AmazonMobileAnalyticsFinancialReportAccess: ARN = js.native
  val AmazonMobileAnalyticsFullAccess: ARN = js.native
  val AmazonMobileAnalyticsNonfinancialReportAccess: ARN = js.native
  val AmazonMobileAnalyticsWriteOnlyAccess: ARN = js.native
  val AmazonPollyFullAccess: ARN = js.native
  val AmazonPollyReadOnlyAccess: ARN = js.native
  val AmazonRDSDirectoryServiceAccess: ARN = js.native
  val AmazonRDSEnhancedMonitoringRole: ARN = js.native
  val AmazonRDSFullAccess: ARN = js.native
  val AmazonRDSReadOnlyAccess: ARN = js.native
  val AmazonRedshiftFullAccess: ARN = js.native
  val AmazonRedshiftReadOnlyAccess: ARN = js.native
  val AmazonRekognitionFullAccess: ARN = js.native
  val AmazonRekognitionReadOnlyAccess: ARN = js.native
  val AmazonRoute53DomainsFullAccess: ARN = js.native
  val AmazonRoute53DomainsReadOnlyAccess: ARN = js.native
  val AmazonRoute53FullAccess: ARN = js.native
  val AmazonRoute53ReadOnlyAccess: ARN = js.native
  val AmazonS3FullAccess: ARN = js.native
  val AmazonS3ReadOnlyAccess: ARN = js.native
  val AmazonSESFullAccess: ARN = js.native
  val AmazonSESReadOnlyAccess: ARN = js.native
  val AmazonSNSFullAccess: ARN = js.native
  val AmazonSNSReadOnlyAccess: ARN = js.native
  val AmazonSNSRole: ARN = js.native
  val AmazonSQSFullAccess: ARN = js.native
  val AmazonSQSReadOnlyAccess: ARN = js.native
  val AmazonSSMAutomationRole: ARN = js.native
  val AmazonSSMFullAccess: ARN = js.native
  val AmazonSSMMaintenanceWindowRole: ARN = js.native
  val AmazonSSMReadOnlyAccess: ARN = js.native
  val AmazonVPCFullAccess: ARN = js.native
  val AmazonVPCReadOnlyAccess: ARN = js.native
  val AmazonWorkMailFullAccess: ARN = js.native
  val AmazonWorkMailReadOnlyAccess: ARN = js.native
  val AmazonWorkSpacesAdmin: ARN = js.native
  val AmazonWorkSpacesApplicationManagerAdminAccess: ARN = js.native
  val AmazonZocaloFullAccess: ARN = js.native
  val AmazonZocaloReadOnlyAccess: ARN = js.native
  val ApiGatewayPrincipal: Principal = js.native
  val ApplicationAutoScalingForAmazonAppStreamAccess: ARN = js.native
  val AthenaPrincipal: Principal = js.native
  val AutoScalingConsoleFullAccess: ARN = js.native
  val AutoScalingConsoleReadOnlyAccess: ARN = js.native
  val AutoScalingFullAccess: ARN = js.native
  val AutoScalingNotificationAccessRole: ARN = js.native
  val AutoScalingReadOnlyAccess: ARN = js.native
  val AutoscalingPrincipal: Principal = js.native
  val Billing: ARN = js.native
  val CloudDirectoryPrincipal: Principal = js.native
  val CloudFrontFullAccess: ARN = js.native
  val CloudFrontReadOnlyAccess: ARN = js.native
  val CloudSearchFullAccess: ARN = js.native
  val CloudSearchPrincipal: Principal = js.native
  val CloudSearchReadOnlyAccess: ARN = js.native
  val CloudWatchActionsEC2Access: ARN = js.native
  val CloudWatchEventsBuiltInTargetExecutionAccess: ARN = js.native
  val CloudWatchEventsFullAccess: ARN = js.native
  val CloudWatchEventsInvocationAccess: ARN = js.native
  val CloudWatchEventsReadOnlyAccess: ARN = js.native
  val CloudWatchFullAccess: ARN = js.native
  val CloudWatchLogsFullAccess: ARN = js.native
  val CloudWatchLogsReadOnlyAccess: ARN = js.native
  val CloudWatchReadOnlyAccess: ARN = js.native
  val CloudformationPrincipal: Principal = js.native
  val CloudfrontPrincipal: Principal = js.native
  val CloudtrailPrincipal: Principal = js.native
  val CodeCommitPrincipal: Principal = js.native
  val CodeDeployPrincipal: Principal = js.native
  val CodePipelinePrincipal: Principal = js.native
  val ConfigPrincipal: Principal = js.native
  val DataPipelinePrincipal: Principal = js.native
  val DataScientist: ARN = js.native
  val DatabaseAdministrator: ARN = js.native
  val DirectConnectPrincipal: Principal = js.native
  val DirectoryServicesPrincipal: Principal = js.native
  val DynamoDbPrincipal: Principal = js.native
  val Ec2Principal: Principal = js.native
  val EcrPrincipal: Principal = js.native
  val EcsPrincipal: Principal = js.native
  val EdgeLambdaPrincipal: Principal = js.native
  val ElasticBeanstalkPrincipal: Principal = js.native
  val ElasticFileSystemPrincipal: Principal = js.native
  val ElasticLoadBalancingPrincipal: Principal = js.native
  val ElasticMapReducePrincipal: Principal = js.native
  val ElasticachePrincipal: Principal = js.native
  val EventsPrincipal: Principal = js.native
  val HealthPrincipal: Principal = js.native
  val IAMFullAccess: ARN = js.native
  val IAMReadOnlyAccess: ARN = js.native
  val IAMSelfManageServiceSpecificCredentials: ARN = js.native
  val IAMUserChangePassword: ARN = js.native
  val IAMUserSSHKeys: ARN = js.native
  val IamPrincipal: Principal = js.native
  val InspectorPrincipal: Principal = js.native
  val KinesisPrincipal: Principal = js.native
  val KmsPrincipal: Principal = js.native
  val LambdaPrincipal: Principal = js.native
  val LightsailPrincipal: Principal = js.native
  val LogsPrincipal: Principal = js.native
  val MonitoringPrincipal: Principal = js.native
  val NetworkAdministrator: ARN = js.native
  val OpsworksPrincipal: Principal = js.native
  val OrganizationsPrincipal: Principal = js.native
  val PowerUserAccess: ARN = js.native
  val RDSCloudHsmAuthorizationRole: ARN = js.native
  val RdsPrincipal: Principal = js.native
  val ReadOnlyAccess: ARN = js.native
  val RedshiftPrincipal: Principal = js.native
  val ResourceGroupsandTagEditorFullAccess: ARN = js.native
  val ResourceGroupsandTagEditorReadOnlyAccess: ARN = js.native
  val Route53Principal: Principal = js.native
  val S3Principal: Principal = js.native
  val SecurityAudit: ARN = js.native
  val ServerMigrationConnector: ARN = js.native
  val ServerMigrationServiceRole: ARN = js.native
  val ServiceCatalogAdminFullAccess: ARN = js.native
  val ServiceCatalogAdminReadOnlyAccess: ARN = js.native
  val ServiceCatalogEndUserAccess: ARN = js.native
  val ServiceCatalogEndUserFullAccess: ARN = js.native
  val ServiceCatalogPrincipal: Principal = js.native
  val SesPrincipal: Principal = js.native
  val SigninPrincipal: Principal = js.native
  val SimpleWorkflowFullAccess: ARN = js.native
  val SnsPrincipal: Principal = js.native
  val SqsPrincipal: Principal = js.native
  val SsmPrincipal: Principal = js.native
  val StorageGatewayPrincipal: Principal = js.native
  val StsPrincipal: Principal = js.native
  val SupportPrincipal: Principal = js.native
  val SupportUser: ARN = js.native
  val SystemAdministrator: ARN = js.native
  val VMImportExportRoleForAWSConnector: ARN = js.native
  val ViewOnlyAccess: ARN = js.native
  val VmiePrincipal: Principal = js.native
  val VpcFlowLogsPrincipal: Principal = js.native
  val WafPrincipal: Principal = js.native
  val WorkDocsPrincipal: Principal = js.native
  val WorkspacesPrincipal: Principal = js.native
  def assumeRolePolicyForPrincipal(principal: Principal): PolicyDocument = js.native
  def getAccountAlias(): js.Promise[GetAccountAliasResult] with GetAccountAliasResult = js.native
  def getAccountAlias(opts: InvokeOptions): js.Promise[GetAccountAliasResult] with GetAccountAliasResult = js.native
  def getGroup(args: GetGroupArgs): js.Promise[GetGroupResult] with GetGroupResult = js.native
  def getGroup(args: GetGroupArgs, opts: InvokeOptions): js.Promise[GetGroupResult] with GetGroupResult = js.native
  def getInstanceProfile(args: GetInstanceProfileArgs): js.Promise[GetInstanceProfileResult] with GetInstanceProfileResult = js.native
  def getInstanceProfile(args: GetInstanceProfileArgs, opts: InvokeOptions): js.Promise[GetInstanceProfileResult] with GetInstanceProfileResult = js.native
  def getPolicy(args: GetPolicyArgs): js.Promise[GetPolicyResult] with GetPolicyResult = js.native
  def getPolicy(args: GetPolicyArgs, opts: InvokeOptions): js.Promise[GetPolicyResult] with GetPolicyResult = js.native
  def getPolicyDocument(): js.Promise[GetPolicyDocumentResult] with GetPolicyDocumentResult = js.native
  def getPolicyDocument(args: GetPolicyDocumentArgs): js.Promise[GetPolicyDocumentResult] with GetPolicyDocumentResult = js.native
  def getPolicyDocument(args: GetPolicyDocumentArgs, opts: InvokeOptions): js.Promise[GetPolicyDocumentResult] with GetPolicyDocumentResult = js.native
  def getRole(args: GetRoleArgs): js.Promise[GetRoleResult] with GetRoleResult = js.native
  def getRole(args: GetRoleArgs, opts: InvokeOptions): js.Promise[GetRoleResult] with GetRoleResult = js.native
  def getServerCertificate(): js.Promise[GetServerCertificateResult] with GetServerCertificateResult = js.native
  def getServerCertificate(args: GetServerCertificateArgs): js.Promise[GetServerCertificateResult] with GetServerCertificateResult = js.native
  def getServerCertificate(args: GetServerCertificateArgs, opts: InvokeOptions): js.Promise[GetServerCertificateResult] with GetServerCertificateResult = js.native
  def getUser(args: GetUserArgs): js.Promise[GetUserResult] with GetUserResult = js.native
  def getUser(args: GetUserArgs, opts: InvokeOptions): js.Promise[GetUserResult] with GetUserResult = js.native
  /* static members */
  @js.native
  object AccessKey extends js.Object {
    /**
      * Get an existing AccessKey resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.iamAccessKeyMod.AccessKey = js.native
    def get(name: String, id: Input[ID], state: AccessKeyState): typings.atPulumiAws.iamAccessKeyMod.AccessKey = js.native
    def get(name: String, id: Input[ID], state: AccessKeyState, opts: CustomResourceOptions): typings.atPulumiAws.iamAccessKeyMod.AccessKey = js.native
    /**
      * Returns true if the given object is an instance of AccessKey.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/accessKey.AccessKey */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object AccountAlias extends js.Object {
    /**
      * Get an existing AccountAlias resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.iamAccountAliasMod.AccountAlias = js.native
    def get(name: String, id: Input[ID], state: AccountAliasState): typings.atPulumiAws.iamAccountAliasMod.AccountAlias = js.native
    def get(name: String, id: Input[ID], state: AccountAliasState, opts: CustomResourceOptions): typings.atPulumiAws.iamAccountAliasMod.AccountAlias = js.native
    /**
      * Returns true if the given object is an instance of AccountAlias.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/accountAlias.AccountAlias */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object AccountPasswordPolicy extends js.Object {
    /**
      * Get an existing AccountPasswordPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.iamAccountPasswordPolicyMod.AccountPasswordPolicy = js.native
    def get(name: String, id: Input[ID], state: AccountPasswordPolicyState): typings.atPulumiAws.iamAccountPasswordPolicyMod.AccountPasswordPolicy = js.native
    def get(name: String, id: Input[ID], state: AccountPasswordPolicyState, opts: CustomResourceOptions): typings.atPulumiAws.iamAccountPasswordPolicyMod.AccountPasswordPolicy = js.native
    /**
      * Returns true if the given object is an instance of AccountPasswordPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/accountPasswordPolicy.AccountPasswordPolicy */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Group extends js.Object {
    /**
      * Get an existing Group resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.iamGroupMod.Group = js.native
    def get(name: String, id: Input[ID], state: GroupState): typings.atPulumiAws.iamGroupMod.Group = js.native
    def get(name: String, id: Input[ID], state: GroupState, opts: CustomResourceOptions): typings.atPulumiAws.iamGroupMod.Group = js.native
    /**
      * Returns true if the given object is an instance of Group.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/group.Group */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object GroupMembership extends js.Object {
    /**
      * Get an existing GroupMembership resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.iamGroupMembershipMod.GroupMembership = js.native
    def get(name: String, id: Input[ID], state: GroupMembershipState): typings.atPulumiAws.iamGroupMembershipMod.GroupMembership = js.native
    def get(name: String, id: Input[ID], state: GroupMembershipState, opts: CustomResourceOptions): typings.atPulumiAws.iamGroupMembershipMod.GroupMembership = js.native
    /**
      * Returns true if the given object is an instance of GroupMembership.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/groupMembership.GroupMembership */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object GroupPolicy extends js.Object {
    /**
      * Get an existing GroupPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.iamGroupPolicyMod.GroupPolicy = js.native
    def get(name: String, id: Input[ID], state: GroupPolicyState): typings.atPulumiAws.iamGroupPolicyMod.GroupPolicy = js.native
    def get(name: String, id: Input[ID], state: GroupPolicyState, opts: CustomResourceOptions): typings.atPulumiAws.iamGroupPolicyMod.GroupPolicy = js.native
    /**
      * Returns true if the given object is an instance of GroupPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/groupPolicy.GroupPolicy */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object GroupPolicyAttachment extends js.Object {
    /**
      * Get an existing GroupPolicyAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.iamGroupPolicyAttachmentMod.GroupPolicyAttachment = js.native
    def get(name: String, id: Input[ID], state: GroupPolicyAttachmentState): typings.atPulumiAws.iamGroupPolicyAttachmentMod.GroupPolicyAttachment = js.native
    def get(name: String, id: Input[ID], state: GroupPolicyAttachmentState, opts: CustomResourceOptions): typings.atPulumiAws.iamGroupPolicyAttachmentMod.GroupPolicyAttachment = js.native
    /**
      * Returns true if the given object is an instance of GroupPolicyAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/groupPolicyAttachment.GroupPolicyAttachment */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object InstanceProfile extends js.Object {
    /**
      * Get an existing InstanceProfile resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.iamInstanceProfileMod.InstanceProfile = js.native
    def get(name: String, id: Input[ID], state: InstanceProfileState): typings.atPulumiAws.iamInstanceProfileMod.InstanceProfile = js.native
    def get(name: String, id: Input[ID], state: InstanceProfileState, opts: CustomResourceOptions): typings.atPulumiAws.iamInstanceProfileMod.InstanceProfile = js.native
    /**
      * Returns true if the given object is an instance of InstanceProfile.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/instanceProfile.InstanceProfile */ Boolean = js.native
  }
  
  @JSName("ManagedPolicies")
  @js.native
  object ManagedPoliciesNs extends js.Object {
    val AWSAccountActivityAccess: ARN = js.native
    val AWSAccountUsageReportAccess: ARN = js.native
    val AWSAgentlessDiscoveryService: ARN = js.native
    val AWSApplicationDiscoveryAgentAccess: ARN = js.native
    val AWSApplicationDiscoveryServiceFullAccess: ARN = js.native
    val AWSBatchFullAccess: ARN = js.native
    val AWSBatchServiceRole: ARN = js.native
    val AWSCertificateManagerFullAccess: ARN = js.native
    val AWSCertificateManagerReadOnly: ARN = js.native
    val AWSCloudFormationReadOnlyAccess: ARN = js.native
    val AWSCloudHSMFullAccess: ARN = js.native
    val AWSCloudHSMReadOnlyAccess: ARN = js.native
    val AWSCloudHSMRole: ARN = js.native
    val AWSCloudTrailFullAccess: ARN = js.native
    val AWSCloudTrailReadOnlyAccess: ARN = js.native
    val AWSCodeBuildAdminAccess: ARN = js.native
    val AWSCodeBuildDeveloperAccess: ARN = js.native
    val AWSCodeBuildReadOnlyAccess: ARN = js.native
    val AWSCodeCommitFullAccess: ARN = js.native
    val AWSCodeCommitPowerUser: ARN = js.native
    val AWSCodeCommitReadOnly: ARN = js.native
    val AWSCodeDeployDeployerAccess: ARN = js.native
    val AWSCodeDeployFullAccess: ARN = js.native
    val AWSCodeDeployReadOnlyAccess: ARN = js.native
    val AWSCodeDeployRole: ARN = js.native
    val AWSCodePipelineApproverAccess: ARN = js.native
    val AWSCodePipelineCustomActionAccess: ARN = js.native
    val AWSCodePipelineFullAccess: ARN = js.native
    val AWSCodePipelineReadOnlyAccess: ARN = js.native
    val AWSCodeStarFullAccess: ARN = js.native
    val AWSCodeStarServiceRole: ARN = js.native
    val AWSConfigRole: ARN = js.native
    val AWSConfigRulesExecutionRole: ARN = js.native
    val AWSConfigUserAccess: ARN = js.native
    val AWSConnector: ARN = js.native
    val AWSDataPipelineRole: ARN = js.native
    val AWSDataPipeline_FullAccess: ARN = js.native
    val AWSDataPipeline_PowerUser: ARN = js.native
    val AWSDeviceFarmFullAccess: ARN = js.native
    val AWSDirectConnectFullAccess: ARN = js.native
    val AWSDirectConnectReadOnlyAccess: ARN = js.native
    val AWSDirectoryServiceFullAccess: ARN = js.native
    val AWSDirectoryServiceReadOnlyAccess: ARN = js.native
    val AWSElasticBeanstalkCustomPlatformforEC2Role: ARN = js.native
    val AWSElasticBeanstalkEnhancedHealth: ARN = js.native
    val AWSElasticBeanstalkFullAccess: ARN = js.native
    val AWSElasticBeanstalkMulticontainerDocker: ARN = js.native
    val AWSElasticBeanstalkReadOnlyAccess: ARN = js.native
    val AWSElasticBeanstalkService: ARN = js.native
    val AWSElasticBeanstalkWebTier: ARN = js.native
    val AWSElasticBeanstalkWorkerTier: ARN = js.native
    val AWSGreengrassFullAccess: ARN = js.native
    val AWSGreengrassResourceAccessRolePolicy: ARN = js.native
    val AWSHealthFullAccess: ARN = js.native
    val AWSImportExportFullAccess: ARN = js.native
    val AWSImportExportReadOnlyAccess: ARN = js.native
    val AWSIoTConfigAccess: ARN = js.native
    val AWSIoTConfigReadOnlyAccess: ARN = js.native
    val AWSIoTDataAccess: ARN = js.native
    val AWSIoTFullAccess: ARN = js.native
    val AWSIoTLogging: ARN = js.native
    val AWSIoTRuleActions: ARN = js.native
    val AWSKeyManagementServicePowerUser: ARN = js.native
    val AWSLambdaBasicExecutionRole: ARN = js.native
    val AWSLambdaDynamoDBExecutionRole: ARN = js.native
    val AWSLambdaENIManagementAccess: ARN = js.native
    val AWSLambdaExecute: ARN = js.native
    val AWSLambdaFullAccess: ARN = js.native
    val AWSLambdaInvocationDynamoDB: ARN = js.native
    val AWSLambdaKinesisExecutionRole: ARN = js.native
    val AWSLambdaReadOnlyAccess: ARN = js.native
    val AWSLambdaRole: ARN = js.native
    val AWSLambdaVPCAccessExecutionRole: ARN = js.native
    val AWSMarketplaceFullAccess: ARN = js.native
    val AWSMarketplaceGetEntitlements: ARN = js.native
    val AWSMarketplaceManageSubscriptions: ARN = js.native
    val AWSMarketplaceMeteringFullAccess: ARN = js.native
    val AWSMarketplaceReadonly: ARN = js.native
    val AWSMobileHub_FullAccess: ARN = js.native
    val AWSMobileHub_ReadOnly: ARN = js.native
    val AWSMobileHub_ServiceUseOnly: ARN = js.native
    val AWSOpsWorksCMInstanceProfileRole: ARN = js.native
    val AWSOpsWorksCMServiceRole: ARN = js.native
    val AWSOpsWorksCloudWatchLogs: ARN = js.native
    val AWSOpsWorksFullAccess: ARN = js.native
    val AWSOpsWorksInstanceRegistration: ARN = js.native
    val AWSOpsWorksRegisterCLI: ARN = js.native
    val AWSOpsWorksRole: ARN = js.native
    val AWSQuickSightDescribeRDS: ARN = js.native
    val AWSQuickSightDescribeRedshift: ARN = js.native
    val AWSQuickSightListIAM: ARN = js.native
    val AWSQuicksightAthenaAccess: ARN = js.native
    val AWSStepFunctionsConsoleFullAccess: ARN = js.native
    val AWSStepFunctionsFullAccess: ARN = js.native
    val AWSStepFunctionsReadOnlyAccess: ARN = js.native
    val AWSStorageGatewayFullAccess: ARN = js.native
    val AWSStorageGatewayReadOnlyAccess: ARN = js.native
    val AWSSupportAccess: ARN = js.native
    val AWSWAFFullAccess: ARN = js.native
    val AWSWAFReadOnlyAccess: ARN = js.native
    val AWSXrayFullAccess: ARN = js.native
    val AWSXrayReadOnlyAccess: ARN = js.native
    val AWSXrayWriteOnlyAccess: ARN = js.native
    val AdministratorAccess: ARN = js.native
    val AmazonAPIGatewayAdministrator: ARN = js.native
    val AmazonAPIGatewayInvokeFullAccess: ARN = js.native
    val AmazonAPIGatewayPushToCloudWatchLogs: ARN = js.native
    val AmazonAppStreamFullAccess: ARN = js.native
    val AmazonAppStreamReadOnlyAccess: ARN = js.native
    val AmazonAppStreamServiceAccess: ARN = js.native
    val AmazonAthenaFullAccess: ARN = js.native
    val AmazonCloudDirectoryFullAccess: ARN = js.native
    val AmazonCloudDirectoryReadOnlyAccess: ARN = js.native
    val AmazonCognitoDeveloperAuthenticatedIdentities: ARN = js.native
    val AmazonCognitoPowerUser: ARN = js.native
    val AmazonCognitoReadOnly: ARN = js.native
    val AmazonDMSCloudWatchLogsRole: ARN = js.native
    val AmazonDMSRedshiftS3Role: ARN = js.native
    val AmazonDMSVPCManagementRole: ARN = js.native
    val AmazonDRSVPCManagement: ARN = js.native
    val AmazonDynamoDBFullAccess: ARN = js.native
    val AmazonDynamoDBFullAccesswithDataPipeline: ARN = js.native
    val AmazonDynamoDBReadOnlyAccess: ARN = js.native
    val AmazonEC2ContainerRegistryFullAccess: ARN = js.native
    val AmazonEC2ContainerRegistryPowerUser: ARN = js.native
    val AmazonEC2ContainerRegistryReadOnly: ARN = js.native
    val AmazonEC2ContainerServiceAutoscaleRole: ARN = js.native
    val AmazonEC2ContainerServiceFullAccess: ARN = js.native
    val AmazonEC2ContainerServiceRole: ARN = js.native
    val AmazonEC2ContainerServiceforEC2Role: ARN = js.native
    val AmazonEC2FullAccess: ARN = js.native
    val AmazonEC2ReadOnlyAccess: ARN = js.native
    val AmazonEC2ReportsAccess: ARN = js.native
    val AmazonEC2RoleforAWSCodeDeploy: ARN = js.native
    val AmazonEC2RoleforDataPipelineRole: ARN = js.native
    val AmazonEC2RoleforSSM: ARN = js.native
    val AmazonEC2SpotFleetAutoscaleRole: ARN = js.native
    val AmazonEC2SpotFleetRole: ARN = js.native
    val AmazonESFullAccess: ARN = js.native
    val AmazonESReadOnlyAccess: ARN = js.native
    val AmazonElastiCacheFullAccess: ARN = js.native
    val AmazonElastiCacheReadOnlyAccess: ARN = js.native
    val AmazonElasticFileSystemFullAccess: ARN = js.native
    val AmazonElasticFileSystemReadOnlyAccess: ARN = js.native
    val AmazonElasticMapReduceFullAccess: ARN = js.native
    val AmazonElasticMapReduceReadOnlyAccess: ARN = js.native
    val AmazonElasticMapReduceRole: ARN = js.native
    val AmazonElasticMapReduceforAutoScalingRole: ARN = js.native
    val AmazonElasticMapReduceforEC2Role: ARN = js.native
    val AmazonElasticTranscoderFullAccess: ARN = js.native
    val AmazonElasticTranscoderJobsSubmitter: ARN = js.native
    val AmazonElasticTranscoderReadOnlyAccess: ARN = js.native
    val AmazonElasticTranscoderRole: ARN = js.native
    val AmazonGlacierFullAccess: ARN = js.native
    val AmazonGlacierReadOnlyAccess: ARN = js.native
    val AmazonInspectorFullAccess: ARN = js.native
    val AmazonInspectorReadOnlyAccess: ARN = js.native
    val AmazonKinesisAnalyticsFullAccess: ARN = js.native
    val AmazonKinesisAnalyticsReadOnly: ARN = js.native
    val AmazonKinesisFirehoseFullAccess: ARN = js.native
    val AmazonKinesisFirehoseReadOnlyAccess: ARN = js.native
    val AmazonKinesisFullAccess: ARN = js.native
    val AmazonKinesisReadOnlyAccess: ARN = js.native
    val AmazonLexFullAccess: ARN = js.native
    val AmazonLexReadOnly: ARN = js.native
    val AmazonLexRunBotsOnly: ARN = js.native
    val AmazonMachineLearningBatchPredictionsAccess: ARN = js.native
    val AmazonMachineLearningCreateOnlyAccess: ARN = js.native
    val AmazonMachineLearningFullAccess: ARN = js.native
    val AmazonMachineLearningManageRealTimeEndpointOnlyAccess: ARN = js.native
    val AmazonMachineLearningReadOnlyAccess: ARN = js.native
    val AmazonMachineLearningRealTimePredictionOnlyAccess: ARN = js.native
    val AmazonMachineLearningRoleforRedshiftDataSource: ARN = js.native
    val AmazonMechanicalTurkFullAccess: ARN = js.native
    val AmazonMechanicalTurkReadOnly: ARN = js.native
    val AmazonMobileAnalyticsFinancialReportAccess: ARN = js.native
    val AmazonMobileAnalyticsFullAccess: ARN = js.native
    val AmazonMobileAnalyticsNonfinancialReportAccess: ARN = js.native
    val AmazonMobileAnalyticsWriteOnlyAccess: ARN = js.native
    val AmazonPollyFullAccess: ARN = js.native
    val AmazonPollyReadOnlyAccess: ARN = js.native
    val AmazonRDSDirectoryServiceAccess: ARN = js.native
    val AmazonRDSEnhancedMonitoringRole: ARN = js.native
    val AmazonRDSFullAccess: ARN = js.native
    val AmazonRDSReadOnlyAccess: ARN = js.native
    val AmazonRedshiftFullAccess: ARN = js.native
    val AmazonRedshiftReadOnlyAccess: ARN = js.native
    val AmazonRekognitionFullAccess: ARN = js.native
    val AmazonRekognitionReadOnlyAccess: ARN = js.native
    val AmazonRoute53DomainsFullAccess: ARN = js.native
    val AmazonRoute53DomainsReadOnlyAccess: ARN = js.native
    val AmazonRoute53FullAccess: ARN = js.native
    val AmazonRoute53ReadOnlyAccess: ARN = js.native
    val AmazonS3FullAccess: ARN = js.native
    val AmazonS3ReadOnlyAccess: ARN = js.native
    val AmazonSESFullAccess: ARN = js.native
    val AmazonSESReadOnlyAccess: ARN = js.native
    val AmazonSNSFullAccess: ARN = js.native
    val AmazonSNSReadOnlyAccess: ARN = js.native
    val AmazonSNSRole: ARN = js.native
    val AmazonSQSFullAccess: ARN = js.native
    val AmazonSQSReadOnlyAccess: ARN = js.native
    val AmazonSSMAutomationRole: ARN = js.native
    val AmazonSSMFullAccess: ARN = js.native
    val AmazonSSMMaintenanceWindowRole: ARN = js.native
    val AmazonSSMReadOnlyAccess: ARN = js.native
    val AmazonVPCFullAccess: ARN = js.native
    val AmazonVPCReadOnlyAccess: ARN = js.native
    val AmazonWorkMailFullAccess: ARN = js.native
    val AmazonWorkMailReadOnlyAccess: ARN = js.native
    val AmazonWorkSpacesAdmin: ARN = js.native
    val AmazonWorkSpacesApplicationManagerAdminAccess: ARN = js.native
    val AmazonZocaloFullAccess: ARN = js.native
    val AmazonZocaloReadOnlyAccess: ARN = js.native
    val ApplicationAutoScalingForAmazonAppStreamAccess: ARN = js.native
    val AutoScalingConsoleFullAccess: ARN = js.native
    val AutoScalingConsoleReadOnlyAccess: ARN = js.native
    val AutoScalingFullAccess: ARN = js.native
    val AutoScalingNotificationAccessRole: ARN = js.native
    val AutoScalingReadOnlyAccess: ARN = js.native
    val Billing: ARN = js.native
    val CloudFrontFullAccess: ARN = js.native
    val CloudFrontReadOnlyAccess: ARN = js.native
    val CloudSearchFullAccess: ARN = js.native
    val CloudSearchReadOnlyAccess: ARN = js.native
    val CloudWatchActionsEC2Access: ARN = js.native
    val CloudWatchEventsBuiltInTargetExecutionAccess: ARN = js.native
    val CloudWatchEventsFullAccess: ARN = js.native
    val CloudWatchEventsInvocationAccess: ARN = js.native
    val CloudWatchEventsReadOnlyAccess: ARN = js.native
    val CloudWatchFullAccess: ARN = js.native
    val CloudWatchLogsFullAccess: ARN = js.native
    val CloudWatchLogsReadOnlyAccess: ARN = js.native
    val CloudWatchReadOnlyAccess: ARN = js.native
    val DataScientist: ARN = js.native
    val DatabaseAdministrator: ARN = js.native
    val IAMFullAccess: ARN = js.native
    val IAMReadOnlyAccess: ARN = js.native
    val IAMSelfManageServiceSpecificCredentials: ARN = js.native
    val IAMUserChangePassword: ARN = js.native
    val IAMUserSSHKeys: ARN = js.native
    val NetworkAdministrator: ARN = js.native
    val PowerUserAccess: ARN = js.native
    val RDSCloudHsmAuthorizationRole: ARN = js.native
    val ReadOnlyAccess: ARN = js.native
    val ResourceGroupsandTagEditorFullAccess: ARN = js.native
    val ResourceGroupsandTagEditorReadOnlyAccess: ARN = js.native
    val SecurityAudit: ARN = js.native
    val ServerMigrationConnector: ARN = js.native
    val ServerMigrationServiceRole: ARN = js.native
    val ServiceCatalogAdminFullAccess: ARN = js.native
    val ServiceCatalogAdminReadOnlyAccess: ARN = js.native
    val ServiceCatalogEndUserAccess: ARN = js.native
    val ServiceCatalogEndUserFullAccess: ARN = js.native
    val SimpleWorkflowFullAccess: ARN = js.native
    val SupportUser: ARN = js.native
    val SystemAdministrator: ARN = js.native
    val VMImportExportRoleForAWSConnector: ARN = js.native
    val ViewOnlyAccess: ARN = js.native
  }
  
  /* static members */
  @js.native
  object OpenIdConnectProvider extends js.Object {
    /**
      * Get an existing OpenIdConnectProvider resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.iamOpenIdConnectProviderMod.OpenIdConnectProvider = js.native
    def get(name: String, id: Input[ID], state: OpenIdConnectProviderState): typings.atPulumiAws.iamOpenIdConnectProviderMod.OpenIdConnectProvider = js.native
    def get(name: String, id: Input[ID], state: OpenIdConnectProviderState, opts: CustomResourceOptions): typings.atPulumiAws.iamOpenIdConnectProviderMod.OpenIdConnectProvider = js.native
    /**
      * Returns true if the given object is an instance of OpenIdConnectProvider.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/openIdConnectProvider.OpenIdConnectProvider */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Policy extends js.Object {
    /**
      * Get an existing Policy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.iamPolicyMod.Policy = js.native
    def get(name: String, id: Input[ID], state: PolicyState): typings.atPulumiAws.iamPolicyMod.Policy = js.native
    def get(name: String, id: Input[ID], state: PolicyState, opts: CustomResourceOptions): typings.atPulumiAws.iamPolicyMod.Policy = js.native
    /**
      * Returns true if the given object is an instance of Policy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/policy.Policy */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object PolicyAttachment extends js.Object {
    /**
      * Get an existing PolicyAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.iamPolicyAttachmentMod.PolicyAttachment = js.native
    def get(name: String, id: Input[ID], state: PolicyAttachmentState): typings.atPulumiAws.iamPolicyAttachmentMod.PolicyAttachment = js.native
    def get(name: String, id: Input[ID], state: PolicyAttachmentState, opts: CustomResourceOptions): typings.atPulumiAws.iamPolicyAttachmentMod.PolicyAttachment = js.native
    /**
      * Returns true if the given object is an instance of PolicyAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/policyAttachment.PolicyAttachment */ Boolean = js.native
  }
  
  @JSName("Principals")
  @js.native
  object PrincipalsNs extends js.Object {
    /**
      * Service Principal for Amazon Certificate Manager
      */
    val AcmServicePrincipal: Principal = js.native
    /**
      * Service Principal for API Gateway
      */
    val ApiGatewayPrincipal: Principal = js.native
    /**
      * Service Principal for Athena
      */
    val AthenaPrincipal: Principal = js.native
    /**
      * Service Principal for Autoscaling
      */
    val AutoscalingPrincipal: Principal = js.native
    /**
      * Service Principal for Cloud Directory
      */
    val CloudDirectoryPrincipal: Principal = js.native
    /**
      * Service Principal for Cloud Search
      */
    val CloudSearchPrincipal: Principal = js.native
    /**
      * Service Principal for Cloudformation
      */
    val CloudformationPrincipal: Principal = js.native
    /**
      * Service Principal for Cloudfront
      */
    val CloudfrontPrincipal: Principal = js.native
    /**
      * Service Principal for Cloudtrail
      */
    val CloudtrailPrincipal: Principal = js.native
    /**
      * Service Principal for CodeCommit
      */
    val CodeCommitPrincipal: Principal = js.native
    /**
      * Service Principal for CodeDeploy
      */
    val CodeDeployPrincipal: Principal = js.native
    /**
      * Service Principal for CodePipeline
      */
    val CodePipelinePrincipal: Principal = js.native
    /**
      * Service Principal for EC2 Config Service
      */
    val ConfigPrincipal: Principal = js.native
    /**
      * Service Principal for Data Pipeline
      */
    val DataPipelinePrincipal: Principal = js.native
    /**
      * Service Principal for DirectConnect
      */
    val DirectConnectPrincipal: Principal = js.native
    /**
      * Service Principal for Directory Services
      */
    val DirectoryServicesPrincipal: Principal = js.native
    /**
      * Service Principal for DynamoDB
      */
    val DynamoDbPrincipal: Principal = js.native
    /**
      * Service Principal for EC2
      */
    val Ec2Principal: Principal = js.native
    /**
      * Service Principal for Elastic Container Registry
      */
    val EcrPrincipal: Principal = js.native
    /**
      * Service Principal for Elastic Container Service
      */
    val EcsPrincipal: Principal = js.native
    /**
      * Service Principal for Edge Lambda
      */
    val EdgeLambdaPrincipal: Principal = js.native
    /**
      * Service Principal for Elastic Beanstalk
      */
    val ElasticBeanstalkPrincipal: Principal = js.native
    /**
      * Service Principal for Elastic File System
      */
    val ElasticFileSystemPrincipal: Principal = js.native
    /**
      * Service Principal for Elastic Load Balancing
      */
    val ElasticLoadBalancingPrincipal: Principal = js.native
    /**
      * Service Principal for Elastic MapReduce
      */
    val ElasticMapReducePrincipal: Principal = js.native
    /**
      * Service Principal for Elasticache
      */
    val ElasticachePrincipal: Principal = js.native
    /**
      * Service Principal for Events
      */
    val EventsPrincipal: Principal = js.native
    /**
      * Service Principal for Health
      */
    val HealthPrincipal: Principal = js.native
    /**
      * Service Principal for IAM
      */
    val IamPrincipal: Principal = js.native
    /**
      * Service Principal for AWS Inspector
      */
    val InspectorPrincipal: Principal = js.native
    /**
      * Service Principal for Kinesis
      */
    val KinesisPrincipal: Principal = js.native
    /**
      * Service Principal for Key Mangaement Service
      */
    val KmsPrincipal: Principal = js.native
    /**
      * Service Principal for Lambda
      */
    val LambdaPrincipal: Principal = js.native
    /**
      * Service Principal for Lightsail
      */
    val LightsailPrincipal: Principal = js.native
    /**
      * Service Principal for Cloudwatch Logs
      */
    val LogsPrincipal: Principal = js.native
    /**
      * Service Principal for Cloudwatch Monitoring
      */
    val MonitoringPrincipal: Principal = js.native
    /**
      * Service Principal for Opsworks
      */
    val OpsworksPrincipal: Principal = js.native
    /**
      * Service Principal for Organizations
      */
    val OrganizationsPrincipal: Principal = js.native
    /**
      * Service Principal for Relational Database Service
      */
    val RdsPrincipal: Principal = js.native
    /**
      * Service Principal for Redshift
      */
    val RedshiftPrincipal: Principal = js.native
    /**
      * Service Principal for Route 53
      */
    val Route53Principal: Principal = js.native
    /**
      * Service Principal for S3
      */
    val S3Principal: Principal = js.native
    /**
      * Service Principal for Service Catalog
      */
    val ServiceCatalogPrincipal: Principal = js.native
    /**
      * Service Principal for Simple Email Service
      */
    val SesPrincipal: Principal = js.native
    /**
      * Service Principal for Signin Service
      */
    val SigninPrincipal: Principal = js.native
    /**
      * Service Principal for Simple Notification Service
      */
    val SnsPrincipal: Principal = js.native
    /**
      * Service Principal for Simple Queue Service
      */
    val SqsPrincipal: Principal = js.native
    /**
      * Service Principal for Systems Manager
      */
    val SsmPrincipal: Principal = js.native
    /**
      * Service Principal for Storage Gateway
      */
    val StorageGatewayPrincipal: Principal = js.native
    /**
      * Service Principal for Security Token Service
      */
    val StsPrincipal: Principal = js.native
    /**
      * Service Principal for AWS Support
      */
    val SupportPrincipal: Principal = js.native
    /**
      * Service Principal for VM Import/Export
      */
    val VmiePrincipal: Principal = js.native
    /**
      * Service Principal for VPC Flow Logs
      */
    val VpcFlowLogsPrincipal: Principal = js.native
    /**
      * Service Principal for Web Application Firewall
      */
    val WafPrincipal: Principal = js.native
    /**
      * Service Principal for WorkDocs
      */
    val WorkDocsPrincipal: Principal = js.native
    /**
      * Service Principal for Workspaces
      */
    val WorkspacesPrincipal: Principal = js.native
  }
  
  /* static members */
  @js.native
  object Role extends js.Object {
    /**
      * Get an existing Role resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.iamRoleMod.Role = js.native
    def get(name: String, id: Input[ID], state: RoleState): typings.atPulumiAws.iamRoleMod.Role = js.native
    def get(name: String, id: Input[ID], state: RoleState, opts: CustomResourceOptions): typings.atPulumiAws.iamRoleMod.Role = js.native
    /**
      * Returns true if the given object is an instance of Role.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/role.Role */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object RolePolicy extends js.Object {
    /**
      * Get an existing RolePolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.iamRolePolicyMod.RolePolicy = js.native
    def get(name: String, id: Input[ID], state: RolePolicyState): typings.atPulumiAws.iamRolePolicyMod.RolePolicy = js.native
    def get(name: String, id: Input[ID], state: RolePolicyState, opts: CustomResourceOptions): typings.atPulumiAws.iamRolePolicyMod.RolePolicy = js.native
    /**
      * Returns true if the given object is an instance of RolePolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/rolePolicy.RolePolicy */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object RolePolicyAttachment extends js.Object {
    /**
      * Get an existing RolePolicyAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.iamRolePolicyAttachmentMod.RolePolicyAttachment = js.native
    def get(name: String, id: Input[ID], state: RolePolicyAttachmentState): typings.atPulumiAws.iamRolePolicyAttachmentMod.RolePolicyAttachment = js.native
    def get(name: String, id: Input[ID], state: RolePolicyAttachmentState, opts: CustomResourceOptions): typings.atPulumiAws.iamRolePolicyAttachmentMod.RolePolicyAttachment = js.native
    /**
      * Returns true if the given object is an instance of RolePolicyAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/rolePolicyAttachment.RolePolicyAttachment */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SamlProvider extends js.Object {
    /**
      * Get an existing SamlProvider resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.iamSamlProviderMod.SamlProvider = js.native
    def get(name: String, id: Input[ID], state: SamlProviderState): typings.atPulumiAws.iamSamlProviderMod.SamlProvider = js.native
    def get(name: String, id: Input[ID], state: SamlProviderState, opts: CustomResourceOptions): typings.atPulumiAws.iamSamlProviderMod.SamlProvider = js.native
    /**
      * Returns true if the given object is an instance of SamlProvider.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/samlProvider.SamlProvider */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ServerCertificate extends js.Object {
    /**
      * Get an existing ServerCertificate resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.iamServerCertificateMod.ServerCertificate = js.native
    def get(name: String, id: Input[ID], state: ServerCertificateState): typings.atPulumiAws.iamServerCertificateMod.ServerCertificate = js.native
    def get(name: String, id: Input[ID], state: ServerCertificateState, opts: CustomResourceOptions): typings.atPulumiAws.iamServerCertificateMod.ServerCertificate = js.native
    /**
      * Returns true if the given object is an instance of ServerCertificate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/serverCertificate.ServerCertificate */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ServiceLinkedRole extends js.Object {
    /**
      * Get an existing ServiceLinkedRole resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.iamServiceLinkedRoleMod.ServiceLinkedRole = js.native
    def get(name: String, id: Input[ID], state: ServiceLinkedRoleState): typings.atPulumiAws.iamServiceLinkedRoleMod.ServiceLinkedRole = js.native
    def get(name: String, id: Input[ID], state: ServiceLinkedRoleState, opts: CustomResourceOptions): typings.atPulumiAws.iamServiceLinkedRoleMod.ServiceLinkedRole = js.native
    /**
      * Returns true if the given object is an instance of ServiceLinkedRole.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/serviceLinkedRole.ServiceLinkedRole */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SshKey extends js.Object {
    /**
      * Get an existing SshKey resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.iamSshKeyMod.SshKey = js.native
    def get(name: String, id: Input[ID], state: SshKeyState): typings.atPulumiAws.iamSshKeyMod.SshKey = js.native
    def get(name: String, id: Input[ID], state: SshKeyState, opts: CustomResourceOptions): typings.atPulumiAws.iamSshKeyMod.SshKey = js.native
    /**
      * Returns true if the given object is an instance of SshKey.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/sshKey.SshKey */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object User extends js.Object {
    /**
      * Get an existing User resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.iamUserMod.User = js.native
    def get(name: String, id: Input[ID], state: UserState): typings.atPulumiAws.iamUserMod.User = js.native
    def get(name: String, id: Input[ID], state: UserState, opts: CustomResourceOptions): typings.atPulumiAws.iamUserMod.User = js.native
    /**
      * Returns true if the given object is an instance of User.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/user.User */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object UserGroupMembership extends js.Object {
    /**
      * Get an existing UserGroupMembership resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.iamUserGroupMembershipMod.UserGroupMembership = js.native
    def get(name: String, id: Input[ID], state: UserGroupMembershipState): typings.atPulumiAws.iamUserGroupMembershipMod.UserGroupMembership = js.native
    def get(name: String, id: Input[ID], state: UserGroupMembershipState, opts: CustomResourceOptions): typings.atPulumiAws.iamUserGroupMembershipMod.UserGroupMembership = js.native
    /**
      * Returns true if the given object is an instance of UserGroupMembership.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/userGroupMembership.UserGroupMembership */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object UserLoginProfile extends js.Object {
    /**
      * Get an existing UserLoginProfile resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.iamUserLoginProfileMod.UserLoginProfile = js.native
    def get(name: String, id: Input[ID], state: UserLoginProfileState): typings.atPulumiAws.iamUserLoginProfileMod.UserLoginProfile = js.native
    def get(name: String, id: Input[ID], state: UserLoginProfileState, opts: CustomResourceOptions): typings.atPulumiAws.iamUserLoginProfileMod.UserLoginProfile = js.native
    /**
      * Returns true if the given object is an instance of UserLoginProfile.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/userLoginProfile.UserLoginProfile */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object UserPolicy extends js.Object {
    /**
      * Get an existing UserPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.iamUserPolicyMod.UserPolicy = js.native
    def get(name: String, id: Input[ID], state: UserPolicyState): typings.atPulumiAws.iamUserPolicyMod.UserPolicy = js.native
    def get(name: String, id: Input[ID], state: UserPolicyState, opts: CustomResourceOptions): typings.atPulumiAws.iamUserPolicyMod.UserPolicy = js.native
    /**
      * Returns true if the given object is an instance of UserPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/userPolicy.UserPolicy */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object UserPolicyAttachment extends js.Object {
    /**
      * Get an existing UserPolicyAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.iamUserPolicyAttachmentMod.UserPolicyAttachment = js.native
    def get(name: String, id: Input[ID], state: UserPolicyAttachmentState): typings.atPulumiAws.iamUserPolicyAttachmentMod.UserPolicyAttachment = js.native
    def get(name: String, id: Input[ID], state: UserPolicyAttachmentState, opts: CustomResourceOptions): typings.atPulumiAws.iamUserPolicyAttachmentMod.UserPolicyAttachment = js.native
    /**
      * Returns true if the given object is an instance of UserPolicyAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/userPolicyAttachment.UserPolicyAttachment */ Boolean = js.native
  }
  
}

