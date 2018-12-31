package typings
package atPulumiAwsLib.awsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "iam")
@js.native
object iamNs extends js.Object {
  @js.native
  class AccessKey protected ()
    extends atPulumiAwsLib.iamMod.AccessKey {
    /**
      * Create a AccessKey resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.iamAccessKeyMod.AccessKeyArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.iamAccessKeyMod.AccessKeyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class AccountAlias protected ()
    extends atPulumiAwsLib.iamMod.AccountAlias {
    /**
      * Create a AccountAlias resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.iamAccountAliasMod.AccountAliasArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.iamAccountAliasMod.AccountAliasArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class AccountPasswordPolicy protected ()
    extends atPulumiAwsLib.iamMod.AccountPasswordPolicy {
    /**
      * Create a AccountPasswordPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.iamAccountPasswordPolicyMod.AccountPasswordPolicyArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.iamAccountPasswordPolicyMod.AccountPasswordPolicyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Group protected ()
    extends atPulumiAwsLib.iamMod.Group {
    /**
      * Create a Group resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.iamGroupMod.GroupArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.iamGroupMod.GroupArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class GroupMembership protected ()
    extends atPulumiAwsLib.iamMod.GroupMembership {
    /**
      * Create a GroupMembership resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.iamGroupMembershipMod.GroupMembershipArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.iamGroupMembershipMod.GroupMembershipArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class GroupPolicy protected ()
    extends atPulumiAwsLib.iamMod.GroupPolicy {
    /**
      * Create a GroupPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.iamGroupPolicyMod.GroupPolicyArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.iamGroupPolicyMod.GroupPolicyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class GroupPolicyAttachment protected ()
    extends atPulumiAwsLib.iamMod.GroupPolicyAttachment {
    /**
      * Create a GroupPolicyAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.iamGroupPolicyAttachmentMod.GroupPolicyAttachmentArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.iamGroupPolicyAttachmentMod.GroupPolicyAttachmentArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class InstanceProfile protected ()
    extends atPulumiAwsLib.iamMod.InstanceProfile {
    /**
      * Create a InstanceProfile resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.iamInstanceProfileMod.InstanceProfileArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.iamInstanceProfileMod.InstanceProfileArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class OpenIdConnectProvider protected ()
    extends atPulumiAwsLib.iamMod.OpenIdConnectProvider {
    /**
      * Create a OpenIdConnectProvider resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.iamOpenIdConnectProviderMod.OpenIdConnectProviderArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.iamOpenIdConnectProviderMod.OpenIdConnectProviderArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Policy protected ()
    extends atPulumiAwsLib.iamMod.Policy {
    /**
      * Create a Policy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.iamPolicyMod.PolicyArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.iamPolicyMod.PolicyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class PolicyAttachment protected ()
    extends atPulumiAwsLib.iamMod.PolicyAttachment {
    /**
      * Create a PolicyAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.iamPolicyAttachmentMod.PolicyAttachmentArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.iamPolicyAttachmentMod.PolicyAttachmentArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Role protected ()
    extends atPulumiAwsLib.iamMod.Role {
    /**
      * Create a Role resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.iamRoleMod.RoleArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.iamRoleMod.RoleArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class RolePolicy protected ()
    extends atPulumiAwsLib.iamMod.RolePolicy {
    /**
      * Create a RolePolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.iamRolePolicyMod.RolePolicyArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.iamRolePolicyMod.RolePolicyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class RolePolicyAttachment protected ()
    extends atPulumiAwsLib.iamMod.RolePolicyAttachment {
    /**
      * Create a RolePolicyAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.iamRolePolicyAttachmentMod.RolePolicyAttachmentArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.iamRolePolicyAttachmentMod.RolePolicyAttachmentArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class SamlProvider protected ()
    extends atPulumiAwsLib.iamMod.SamlProvider {
    /**
      * Create a SamlProvider resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.iamSamlProviderMod.SamlProviderArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.iamSamlProviderMod.SamlProviderArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class ServerCertificate protected ()
    extends atPulumiAwsLib.iamMod.ServerCertificate {
    /**
      * Create a ServerCertificate resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.iamServerCertificateMod.ServerCertificateArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.iamServerCertificateMod.ServerCertificateArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class ServiceLinkedRole protected ()
    extends atPulumiAwsLib.iamMod.ServiceLinkedRole {
    /**
      * Create a ServiceLinkedRole resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.iamServiceLinkedRoleMod.ServiceLinkedRoleArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.iamServiceLinkedRoleMod.ServiceLinkedRoleArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class SshKey protected ()
    extends atPulumiAwsLib.iamMod.SshKey {
    /**
      * Create a SshKey resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.iamSshKeyMod.SshKeyArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.iamSshKeyMod.SshKeyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class User protected ()
    extends atPulumiAwsLib.iamMod.User {
    /**
      * Create a User resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.iamUserMod.UserArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.iamUserMod.UserArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class UserGroupMembership protected ()
    extends atPulumiAwsLib.iamMod.UserGroupMembership {
    /**
      * Create a UserGroupMembership resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.iamUserGroupMembershipMod.UserGroupMembershipArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.iamUserGroupMembershipMod.UserGroupMembershipArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class UserLoginProfile protected ()
    extends atPulumiAwsLib.iamMod.UserLoginProfile {
    /**
      * Create a UserLoginProfile resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.iamUserLoginProfileMod.UserLoginProfileArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.iamUserLoginProfileMod.UserLoginProfileArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class UserPolicy protected ()
    extends atPulumiAwsLib.iamMod.UserPolicy {
    /**
      * Create a UserPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.iamUserPolicyMod.UserPolicyArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.iamUserPolicyMod.UserPolicyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class UserPolicyAttachment protected ()
    extends atPulumiAwsLib.iamMod.UserPolicyAttachment {
    /**
      * Create a UserPolicyAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.iamUserPolicyAttachmentMod.UserPolicyAttachmentArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.iamUserPolicyAttachmentMod.UserPolicyAttachmentArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  val AWSAccountActivityAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSAccountUsageReportAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSAgentlessDiscoveryService: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSApplicationDiscoveryAgentAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSApplicationDiscoveryServiceFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSBatchFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSBatchServiceRole: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSCertificateManagerFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSCertificateManagerReadOnly: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSCloudFormationReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSCloudHSMFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSCloudHSMReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSCloudHSMRole: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSCloudTrailFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSCloudTrailReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSCodeBuildAdminAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSCodeBuildDeveloperAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSCodeBuildReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSCodeCommitFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSCodeCommitPowerUser: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSCodeCommitReadOnly: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSCodeDeployDeployerAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSCodeDeployFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSCodeDeployReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSCodeDeployRole: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSCodePipelineApproverAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSCodePipelineCustomActionAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSCodePipelineFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSCodePipelineReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSCodeStarFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSCodeStarServiceRole: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSConfigRole: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSConfigRulesExecutionRole: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSConfigUserAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSConnector: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSDataPipelineRole: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSDataPipeline_FullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSDataPipeline_PowerUser: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSDeviceFarmFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSDirectConnectFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSDirectConnectReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSDirectoryServiceFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSDirectoryServiceReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSElasticBeanstalkCustomPlatformforEC2Role: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSElasticBeanstalkEnhancedHealth: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSElasticBeanstalkFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSElasticBeanstalkMulticontainerDocker: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSElasticBeanstalkReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSElasticBeanstalkService: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSElasticBeanstalkWebTier: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSElasticBeanstalkWorkerTier: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSGreengrassFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSGreengrassResourceAccessRolePolicy: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSHealthFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSImportExportFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSImportExportReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSIoTConfigAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSIoTConfigReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSIoTDataAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSIoTFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSIoTLogging: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSIoTRuleActions: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSKeyManagementServicePowerUser: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSLambdaBasicExecutionRole: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSLambdaDynamoDBExecutionRole: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSLambdaENIManagementAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSLambdaExecute: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSLambdaFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSLambdaInvocationDynamoDB: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSLambdaKinesisExecutionRole: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSLambdaReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSLambdaRole: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSLambdaVPCAccessExecutionRole: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSMarketplaceFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSMarketplaceGetEntitlements: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSMarketplaceManageSubscriptions: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSMarketplaceMeteringFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSMarketplaceReadonly: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSMobileHub_FullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSMobileHub_ReadOnly: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSMobileHub_ServiceUseOnly: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSOpsWorksCMInstanceProfileRole: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSOpsWorksCMServiceRole: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSOpsWorksCloudWatchLogs: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSOpsWorksFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSOpsWorksInstanceRegistration: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSOpsWorksRegisterCLI: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSOpsWorksRole: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSQuickSightDescribeRDS: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSQuickSightDescribeRedshift: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSQuickSightListIAM: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSQuicksightAthenaAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSStepFunctionsConsoleFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSStepFunctionsFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSStepFunctionsReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSStorageGatewayFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSStorageGatewayReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSSupportAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSWAFFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSWAFReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSXrayFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSXrayReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AWSXrayWriteOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AcmServicePrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val AdministratorAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonAPIGatewayAdministrator: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonAPIGatewayInvokeFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonAPIGatewayPushToCloudWatchLogs: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonAppStreamFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonAppStreamReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonAppStreamServiceAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonAthenaFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonCloudDirectoryFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonCloudDirectoryReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonCognitoDeveloperAuthenticatedIdentities: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonCognitoPowerUser: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonCognitoReadOnly: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonDMSCloudWatchLogsRole: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonDMSRedshiftS3Role: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonDMSVPCManagementRole: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonDRSVPCManagement: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonDynamoDBFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonDynamoDBFullAccesswithDataPipeline: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonDynamoDBReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonEC2ContainerRegistryFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonEC2ContainerRegistryPowerUser: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonEC2ContainerRegistryReadOnly: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonEC2ContainerServiceAutoscaleRole: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonEC2ContainerServiceFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonEC2ContainerServiceRole: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonEC2ContainerServiceforEC2Role: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonEC2FullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonEC2ReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonEC2ReportsAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonEC2RoleforAWSCodeDeploy: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonEC2RoleforDataPipelineRole: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonEC2RoleforSSM: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonEC2SpotFleetAutoscaleRole: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonEC2SpotFleetRole: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonESFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonESReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonElastiCacheFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonElastiCacheReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonElasticFileSystemFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonElasticFileSystemReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonElasticMapReduceFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonElasticMapReduceReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonElasticMapReduceRole: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonElasticMapReduceforAutoScalingRole: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonElasticMapReduceforEC2Role: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonElasticTranscoderFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonElasticTranscoderJobsSubmitter: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonElasticTranscoderReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonElasticTranscoderRole: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonGlacierFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonGlacierReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonInspectorFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonInspectorReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonKinesisAnalyticsFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonKinesisAnalyticsReadOnly: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonKinesisFirehoseFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonKinesisFirehoseReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonKinesisFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonKinesisReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonLexFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonLexReadOnly: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonLexRunBotsOnly: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonMachineLearningBatchPredictionsAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonMachineLearningCreateOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonMachineLearningFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonMachineLearningManageRealTimeEndpointOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonMachineLearningReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonMachineLearningRealTimePredictionOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonMachineLearningRoleforRedshiftDataSource: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonMechanicalTurkFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonMechanicalTurkReadOnly: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonMobileAnalyticsFinancialReportAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonMobileAnalyticsFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonMobileAnalyticsNonfinancialReportAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonMobileAnalyticsWriteOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonPollyFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonPollyReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonRDSDirectoryServiceAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonRDSEnhancedMonitoringRole: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonRDSFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonRDSReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonRedshiftFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonRedshiftReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonRekognitionFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonRekognitionReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonRoute53DomainsFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonRoute53DomainsReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonRoute53FullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonRoute53ReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonS3FullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonS3ReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonSESFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonSESReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonSNSFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonSNSReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonSNSRole: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonSQSFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonSQSReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonSSMAutomationRole: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonSSMFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonSSMMaintenanceWindowRole: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonSSMReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonVPCFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonVPCReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonWorkMailFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonWorkMailReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonWorkSpacesAdmin: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonWorkSpacesApplicationManagerAdminAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonZocaloFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AmazonZocaloReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val ApiGatewayPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val ApplicationAutoScalingForAmazonAppStreamAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AthenaPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val AutoScalingConsoleFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AutoScalingConsoleReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AutoScalingFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AutoScalingNotificationAccessRole: atPulumiAwsLib.arnMod.ARN = js.native
  val AutoScalingReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val AutoscalingPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val Billing: atPulumiAwsLib.arnMod.ARN = js.native
  val CloudDirectoryPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val CloudFrontFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val CloudFrontReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val CloudSearchFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val CloudSearchPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val CloudSearchReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val CloudWatchActionsEC2Access: atPulumiAwsLib.arnMod.ARN = js.native
  val CloudWatchEventsBuiltInTargetExecutionAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val CloudWatchEventsFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val CloudWatchEventsInvocationAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val CloudWatchEventsReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val CloudWatchFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val CloudWatchLogsFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val CloudWatchLogsReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val CloudWatchReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val CloudformationPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val CloudfrontPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val CloudtrailPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val CodeCommitPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val CodeDeployPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val CodePipelinePrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val ConfigPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val DataPipelinePrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val DataScientist: atPulumiAwsLib.arnMod.ARN = js.native
  val DatabaseAdministrator: atPulumiAwsLib.arnMod.ARN = js.native
  val DirectConnectPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val DirectoryServicesPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val DynamoDbPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val Ec2Principal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val EcrPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val EcsPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val EdgeLambdaPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val ElasticBeanstalkPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val ElasticFileSystemPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val ElasticLoadBalancingPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val ElasticMapReducePrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val ElasticachePrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val EventsPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val HealthPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val IAMFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val IAMReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val IAMSelfManageServiceSpecificCredentials: atPulumiAwsLib.arnMod.ARN = js.native
  val IAMUserChangePassword: atPulumiAwsLib.arnMod.ARN = js.native
  val IAMUserSSHKeys: atPulumiAwsLib.arnMod.ARN = js.native
  val IamPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val InspectorPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val KinesisPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val KmsPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val LambdaPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val LightsailPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val LogsPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val MonitoringPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val NetworkAdministrator: atPulumiAwsLib.arnMod.ARN = js.native
  val OpsworksPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val OrganizationsPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val PowerUserAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val RDSCloudHsmAuthorizationRole: atPulumiAwsLib.arnMod.ARN = js.native
  val RdsPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val ReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val RedshiftPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val ResourceGroupsandTagEditorFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val ResourceGroupsandTagEditorReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val Route53Principal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val S3Principal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val SecurityAudit: atPulumiAwsLib.arnMod.ARN = js.native
  val ServerMigrationConnector: atPulumiAwsLib.arnMod.ARN = js.native
  val ServerMigrationServiceRole: atPulumiAwsLib.arnMod.ARN = js.native
  val ServiceCatalogAdminFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val ServiceCatalogAdminReadOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val ServiceCatalogEndUserAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val ServiceCatalogEndUserFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val ServiceCatalogPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val SesPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val SigninPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val SimpleWorkflowFullAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val SnsPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val SqsPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val SsmPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val StorageGatewayPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val StsPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val SupportPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val SupportUser: atPulumiAwsLib.arnMod.ARN = js.native
  val SystemAdministrator: atPulumiAwsLib.arnMod.ARN = js.native
  val VMImportExportRoleForAWSConnector: atPulumiAwsLib.arnMod.ARN = js.native
  val ViewOnlyAccess: atPulumiAwsLib.arnMod.ARN = js.native
  val VmiePrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val VpcFlowLogsPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val WafPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val WorkDocsPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  val WorkspacesPrincipal: atPulumiAwsLib.iamDocumentsMod.Principal = js.native
  def assumeRolePolicyForPrincipal(principal: atPulumiAwsLib.iamDocumentsMod.Principal): atPulumiAwsLib.iamDocumentsMod.PolicyDocument = js.native
  def getAccountAlias(): js.Promise[atPulumiAwsLib.iamGetAccountAliasMod.GetAccountAliasResult] = js.native
  def getAccountAlias(opts: atPulumiPulumiLib.invokeMod.InvokeOptions): js.Promise[atPulumiAwsLib.iamGetAccountAliasMod.GetAccountAliasResult] = js.native
  def getGroup(args: atPulumiAwsLib.iamGetGroupMod.GetGroupArgs): js.Promise[atPulumiAwsLib.iamGetGroupMod.GetGroupResult] = js.native
  def getGroup(args: atPulumiAwsLib.iamGetGroupMod.GetGroupArgs, opts: atPulumiPulumiLib.invokeMod.InvokeOptions): js.Promise[atPulumiAwsLib.iamGetGroupMod.GetGroupResult] = js.native
  def getInstanceProfile(args: atPulumiAwsLib.iamGetInstanceProfileMod.GetInstanceProfileArgs): js.Promise[atPulumiAwsLib.iamGetInstanceProfileMod.GetInstanceProfileResult] = js.native
  def getInstanceProfile(
    args: atPulumiAwsLib.iamGetInstanceProfileMod.GetInstanceProfileArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.iamGetInstanceProfileMod.GetInstanceProfileResult] = js.native
  def getPolicy(args: atPulumiAwsLib.iamGetPolicyMod.GetPolicyArgs): js.Promise[atPulumiAwsLib.iamGetPolicyMod.GetPolicyResult] = js.native
  def getPolicy(
    args: atPulumiAwsLib.iamGetPolicyMod.GetPolicyArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.iamGetPolicyMod.GetPolicyResult] = js.native
  def getPolicyDocument(): js.Promise[atPulumiAwsLib.iamGetPolicyDocumentMod.GetPolicyDocumentResult] = js.native
  def getPolicyDocument(args: atPulumiAwsLib.iamGetPolicyDocumentMod.GetPolicyDocumentArgs): js.Promise[atPulumiAwsLib.iamGetPolicyDocumentMod.GetPolicyDocumentResult] = js.native
  def getPolicyDocument(
    args: atPulumiAwsLib.iamGetPolicyDocumentMod.GetPolicyDocumentArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.iamGetPolicyDocumentMod.GetPolicyDocumentResult] = js.native
  def getRole(): js.Promise[atPulumiAwsLib.iamGetRoleMod.GetRoleResult] = js.native
  def getRole(args: atPulumiAwsLib.iamGetRoleMod.GetRoleArgs): js.Promise[atPulumiAwsLib.iamGetRoleMod.GetRoleResult] = js.native
  def getRole(args: atPulumiAwsLib.iamGetRoleMod.GetRoleArgs, opts: atPulumiPulumiLib.invokeMod.InvokeOptions): js.Promise[atPulumiAwsLib.iamGetRoleMod.GetRoleResult] = js.native
  def getServerCertificate(): js.Promise[atPulumiAwsLib.iamGetServerCertificateMod.GetServerCertificateResult] = js.native
  def getServerCertificate(args: atPulumiAwsLib.iamGetServerCertificateMod.GetServerCertificateArgs): js.Promise[atPulumiAwsLib.iamGetServerCertificateMod.GetServerCertificateResult] = js.native
  def getServerCertificate(
    args: atPulumiAwsLib.iamGetServerCertificateMod.GetServerCertificateArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.iamGetServerCertificateMod.GetServerCertificateResult] = js.native
  def getUser(args: atPulumiAwsLib.iamGetUserMod.GetUserArgs): js.Promise[atPulumiAwsLib.iamGetUserMod.GetUserResult] = js.native
  def getUser(args: atPulumiAwsLib.iamGetUserMod.GetUserArgs, opts: atPulumiPulumiLib.invokeMod.InvokeOptions): js.Promise[atPulumiAwsLib.iamGetUserMod.GetUserResult] = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iamAccessKeyMod.AccessKey = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamAccessKeyMod.AccessKeyState
    ): atPulumiAwsLib.iamAccessKeyMod.AccessKey = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamAccessKeyMod.AccessKeyState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.iamAccessKeyMod.AccessKey = js.native
  }
  
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iamAccountAliasMod.AccountAlias = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamAccountAliasMod.AccountAliasState
    ): atPulumiAwsLib.iamAccountAliasMod.AccountAlias = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamAccountAliasMod.AccountAliasState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.iamAccountAliasMod.AccountAlias = js.native
  }
  
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iamAccountPasswordPolicyMod.AccountPasswordPolicy = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamAccountPasswordPolicyMod.AccountPasswordPolicyState
    ): atPulumiAwsLib.iamAccountPasswordPolicyMod.AccountPasswordPolicy = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamAccountPasswordPolicyMod.AccountPasswordPolicyState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.iamAccountPasswordPolicyMod.AccountPasswordPolicy = js.native
  }
  
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iamGroupMod.Group = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamGroupMod.GroupState
    ): atPulumiAwsLib.iamGroupMod.Group = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamGroupMod.GroupState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.iamGroupMod.Group = js.native
  }
  
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iamGroupMembershipMod.GroupMembership = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamGroupMembershipMod.GroupMembershipState
    ): atPulumiAwsLib.iamGroupMembershipMod.GroupMembership = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamGroupMembershipMod.GroupMembershipState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.iamGroupMembershipMod.GroupMembership = js.native
  }
  
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iamGroupPolicyMod.GroupPolicy = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamGroupPolicyMod.GroupPolicyState
    ): atPulumiAwsLib.iamGroupPolicyMod.GroupPolicy = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamGroupPolicyMod.GroupPolicyState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.iamGroupPolicyMod.GroupPolicy = js.native
  }
  
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iamGroupPolicyAttachmentMod.GroupPolicyAttachment = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamGroupPolicyAttachmentMod.GroupPolicyAttachmentState
    ): atPulumiAwsLib.iamGroupPolicyAttachmentMod.GroupPolicyAttachment = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamGroupPolicyAttachmentMod.GroupPolicyAttachmentState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.iamGroupPolicyAttachmentMod.GroupPolicyAttachment = js.native
  }
  
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iamInstanceProfileMod.InstanceProfile = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamInstanceProfileMod.InstanceProfileState
    ): atPulumiAwsLib.iamInstanceProfileMod.InstanceProfile = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamInstanceProfileMod.InstanceProfileState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.iamInstanceProfileMod.InstanceProfile = js.native
  }
  
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iamOpenIdConnectProviderMod.OpenIdConnectProvider = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamOpenIdConnectProviderMod.OpenIdConnectProviderState
    ): atPulumiAwsLib.iamOpenIdConnectProviderMod.OpenIdConnectProvider = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamOpenIdConnectProviderMod.OpenIdConnectProviderState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.iamOpenIdConnectProviderMod.OpenIdConnectProvider = js.native
  }
  
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iamPolicyMod.Policy = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamPolicyMod.PolicyState
    ): atPulumiAwsLib.iamPolicyMod.Policy = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamPolicyMod.PolicyState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.iamPolicyMod.Policy = js.native
  }
  
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iamPolicyAttachmentMod.PolicyAttachment = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamPolicyAttachmentMod.PolicyAttachmentState
    ): atPulumiAwsLib.iamPolicyAttachmentMod.PolicyAttachment = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamPolicyAttachmentMod.PolicyAttachmentState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.iamPolicyAttachmentMod.PolicyAttachment = js.native
  }
  
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iamRoleMod.Role = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamRoleMod.RoleState
    ): atPulumiAwsLib.iamRoleMod.Role = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamRoleMod.RoleState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.iamRoleMod.Role = js.native
  }
  
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iamRolePolicyMod.RolePolicy = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamRolePolicyMod.RolePolicyState
    ): atPulumiAwsLib.iamRolePolicyMod.RolePolicy = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamRolePolicyMod.RolePolicyState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.iamRolePolicyMod.RolePolicy = js.native
  }
  
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iamRolePolicyAttachmentMod.RolePolicyAttachment = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamRolePolicyAttachmentMod.RolePolicyAttachmentState
    ): atPulumiAwsLib.iamRolePolicyAttachmentMod.RolePolicyAttachment = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamRolePolicyAttachmentMod.RolePolicyAttachmentState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.iamRolePolicyAttachmentMod.RolePolicyAttachment = js.native
  }
  
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iamSamlProviderMod.SamlProvider = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamSamlProviderMod.SamlProviderState
    ): atPulumiAwsLib.iamSamlProviderMod.SamlProvider = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamSamlProviderMod.SamlProviderState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.iamSamlProviderMod.SamlProvider = js.native
  }
  
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iamServerCertificateMod.ServerCertificate = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamServerCertificateMod.ServerCertificateState
    ): atPulumiAwsLib.iamServerCertificateMod.ServerCertificate = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamServerCertificateMod.ServerCertificateState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.iamServerCertificateMod.ServerCertificate = js.native
  }
  
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iamServiceLinkedRoleMod.ServiceLinkedRole = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamServiceLinkedRoleMod.ServiceLinkedRoleState
    ): atPulumiAwsLib.iamServiceLinkedRoleMod.ServiceLinkedRole = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamServiceLinkedRoleMod.ServiceLinkedRoleState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.iamServiceLinkedRoleMod.ServiceLinkedRole = js.native
  }
  
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iamSshKeyMod.SshKey = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamSshKeyMod.SshKeyState
    ): atPulumiAwsLib.iamSshKeyMod.SshKey = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamSshKeyMod.SshKeyState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.iamSshKeyMod.SshKey = js.native
  }
  
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iamUserMod.User = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamUserMod.UserState
    ): atPulumiAwsLib.iamUserMod.User = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamUserMod.UserState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.iamUserMod.User = js.native
  }
  
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iamUserGroupMembershipMod.UserGroupMembership = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamUserGroupMembershipMod.UserGroupMembershipState
    ): atPulumiAwsLib.iamUserGroupMembershipMod.UserGroupMembership = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamUserGroupMembershipMod.UserGroupMembershipState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.iamUserGroupMembershipMod.UserGroupMembership = js.native
  }
  
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iamUserLoginProfileMod.UserLoginProfile = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamUserLoginProfileMod.UserLoginProfileState
    ): atPulumiAwsLib.iamUserLoginProfileMod.UserLoginProfile = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamUserLoginProfileMod.UserLoginProfileState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.iamUserLoginProfileMod.UserLoginProfile = js.native
  }
  
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iamUserPolicyMod.UserPolicy = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamUserPolicyMod.UserPolicyState
    ): atPulumiAwsLib.iamUserPolicyMod.UserPolicy = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamUserPolicyMod.UserPolicyState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.iamUserPolicyMod.UserPolicy = js.native
  }
  
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iamUserPolicyAttachmentMod.UserPolicyAttachment = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamUserPolicyAttachmentMod.UserPolicyAttachmentState
    ): atPulumiAwsLib.iamUserPolicyAttachmentMod.UserPolicyAttachment = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iamUserPolicyAttachmentMod.UserPolicyAttachmentState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.iamUserPolicyAttachmentMod.UserPolicyAttachment = js.native
  }
  
}

