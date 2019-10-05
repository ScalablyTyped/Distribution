package typings.atPulumiAws

import typings.atPulumiAws.organizationsAccountMod.AccountArgs
import typings.atPulumiAws.organizationsAccountMod.AccountState
import typings.atPulumiAws.organizationsGetOrganizationMod.GetOrganizationResult
import typings.atPulumiAws.organizationsOrganizationMod.OrganizationArgs
import typings.atPulumiAws.organizationsOrganizationMod.OrganizationState
import typings.atPulumiAws.organizationsOrganizationalUnitMod.OrganizationalUnitArgs
import typings.atPulumiAws.organizationsOrganizationalUnitMod.OrganizationalUnitState
import typings.atPulumiAws.organizationsPolicyAttachmentMod.PolicyAttachmentArgs
import typings.atPulumiAws.organizationsPolicyAttachmentMod.PolicyAttachmentState
import typings.atPulumiAws.organizationsPolicyMod.PolicyArgs
import typings.atPulumiAws.organizationsPolicyMod.PolicyState
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/organizations", JSImport.Namespace)
@js.native
object organizationsMod extends js.Object {
  @js.native
  class Account protected ()
    extends typings.atPulumiAws.organizationsAccountMod.Account {
    /**
      * Create a Account resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AccountArgs) = this()
    def this(name: String, args: AccountArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Organization protected ()
    extends typings.atPulumiAws.organizationsOrganizationMod.Organization {
    /**
      * Create a Organization resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: OrganizationArgs) = this()
    def this(name: String, args: OrganizationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class OrganizationalUnit protected ()
    extends typings.atPulumiAws.organizationsOrganizationalUnitMod.OrganizationalUnit {
    /**
      * Create a OrganizationalUnit resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: OrganizationalUnitArgs) = this()
    def this(name: String, args: OrganizationalUnitArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Policy protected ()
    extends typings.atPulumiAws.organizationsPolicyMod.Policy {
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
    extends typings.atPulumiAws.organizationsPolicyAttachmentMod.PolicyAttachment {
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
  
  def getOrganization(): js.Promise[GetOrganizationResult] with GetOrganizationResult = js.native
  def getOrganization(opts: InvokeOptions): js.Promise[GetOrganizationResult] with GetOrganizationResult = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.organizationsAccountMod.Account = js.native
    def get(name: String, id: Input[ID], state: AccountState): typings.atPulumiAws.organizationsAccountMod.Account = js.native
    def get(name: String, id: Input[ID], state: AccountState, opts: CustomResourceOptions): typings.atPulumiAws.organizationsAccountMod.Account = js.native
    /**
      * Returns true if the given object is an instance of Account.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/organizations/account.Account */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Organization extends js.Object {
    /**
      * Get an existing Organization resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.organizationsOrganizationMod.Organization = js.native
    def get(name: String, id: Input[ID], state: OrganizationState): typings.atPulumiAws.organizationsOrganizationMod.Organization = js.native
    def get(name: String, id: Input[ID], state: OrganizationState, opts: CustomResourceOptions): typings.atPulumiAws.organizationsOrganizationMod.Organization = js.native
    /**
      * Returns true if the given object is an instance of Organization.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/organizations/organization.Organization */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object OrganizationalUnit extends js.Object {
    /**
      * Get an existing OrganizationalUnit resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.organizationsOrganizationalUnitMod.OrganizationalUnit = js.native
    def get(name: String, id: Input[ID], state: OrganizationalUnitState): typings.atPulumiAws.organizationsOrganizationalUnitMod.OrganizationalUnit = js.native
    def get(name: String, id: Input[ID], state: OrganizationalUnitState, opts: CustomResourceOptions): typings.atPulumiAws.organizationsOrganizationalUnitMod.OrganizationalUnit = js.native
    /**
      * Returns true if the given object is an instance of OrganizationalUnit.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/organizations/organizationalUnit.OrganizationalUnit */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.organizationsPolicyMod.Policy = js.native
    def get(name: String, id: Input[ID], state: PolicyState): typings.atPulumiAws.organizationsPolicyMod.Policy = js.native
    def get(name: String, id: Input[ID], state: PolicyState, opts: CustomResourceOptions): typings.atPulumiAws.organizationsPolicyMod.Policy = js.native
    /**
      * Returns true if the given object is an instance of Policy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/organizations/policy.Policy */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.organizationsPolicyAttachmentMod.PolicyAttachment = js.native
    def get(name: String, id: Input[ID], state: PolicyAttachmentState): typings.atPulumiAws.organizationsPolicyAttachmentMod.PolicyAttachment = js.native
    def get(name: String, id: Input[ID], state: PolicyAttachmentState, opts: CustomResourceOptions): typings.atPulumiAws.organizationsPolicyAttachmentMod.PolicyAttachment = js.native
    /**
      * Returns true if the given object is an instance of PolicyAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/organizations/policyAttachment.PolicyAttachment */ Boolean = js.native
  }
  
}

