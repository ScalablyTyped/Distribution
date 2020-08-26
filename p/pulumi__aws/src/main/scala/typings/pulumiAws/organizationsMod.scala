package typings.pulumiAws

import typings.pulumiAws.getOrganizationMod.GetOrganizationResult
import typings.pulumiAws.getOrganizationalUnitsMod.GetOrganizationalUnitsArgs
import typings.pulumiAws.getOrganizationalUnitsMod.GetOrganizationalUnitsResult
import typings.pulumiAws.organizationMod.OrganizationArgs
import typings.pulumiAws.organizationMod.OrganizationState
import typings.pulumiAws.organizationalUnitMod.OrganizationalUnitArgs
import typings.pulumiAws.organizationalUnitMod.OrganizationalUnitState
import typings.pulumiAws.organizationsAccountMod.AccountArgs
import typings.pulumiAws.organizationsAccountMod.AccountState
import typings.pulumiAws.organizationsPolicyAttachmentMod.PolicyAttachmentArgs
import typings.pulumiAws.organizationsPolicyAttachmentMod.PolicyAttachmentState
import typings.pulumiAws.organizationsPolicyMod.PolicyArgs
import typings.pulumiAws.organizationsPolicyMod.PolicyState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/organizations", JSImport.Namespace)
@js.native
object organizationsMod extends js.Object {
  @js.native
  class Account protected ()
    extends typings.pulumiAws.organizationsAccountMod.Account {
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
    extends typings.pulumiAws.organizationMod.Organization {
    /**
      * Create a Organization resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: OrganizationArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: OrganizationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class OrganizationalUnit protected ()
    extends typings.pulumiAws.organizationalUnitMod.OrganizationalUnit {
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
    extends typings.pulumiAws.organizationsPolicyMod.Policy {
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
    extends typings.pulumiAws.organizationsPolicyAttachmentMod.PolicyAttachment {
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
  
  def getOrganization(): js.Promise[GetOrganizationResult] = js.native
  def getOrganization(opts: InvokeOptions): js.Promise[GetOrganizationResult] = js.native
  def getOrganizationalUnits(args: GetOrganizationalUnitsArgs): js.Promise[GetOrganizationalUnitsResult] = js.native
  def getOrganizationalUnits(args: GetOrganizationalUnitsArgs, opts: InvokeOptions): js.Promise[GetOrganizationalUnitsResult] = js.native
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.organizationsAccountMod.Account = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.organizationsAccountMod.Account = js.native
    def get(name: String, id: Input[ID], state: AccountState): typings.pulumiAws.organizationsAccountMod.Account = js.native
    def get(name: String, id: Input[ID], state: AccountState, opts: CustomResourceOptions): typings.pulumiAws.organizationsAccountMod.Account = js.native
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.organizationMod.Organization = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.organizationMod.Organization = js.native
    def get(name: String, id: Input[ID], state: OrganizationState): typings.pulumiAws.organizationMod.Organization = js.native
    def get(name: String, id: Input[ID], state: OrganizationState, opts: CustomResourceOptions): typings.pulumiAws.organizationMod.Organization = js.native
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.organizationalUnitMod.OrganizationalUnit = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.organizationalUnitMod.OrganizationalUnit = js.native
    def get(name: String, id: Input[ID], state: OrganizationalUnitState): typings.pulumiAws.organizationalUnitMod.OrganizationalUnit = js.native
    def get(name: String, id: Input[ID], state: OrganizationalUnitState, opts: CustomResourceOptions): typings.pulumiAws.organizationalUnitMod.OrganizationalUnit = js.native
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.organizationsPolicyMod.Policy = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.organizationsPolicyMod.Policy = js.native
    def get(name: String, id: Input[ID], state: PolicyState): typings.pulumiAws.organizationsPolicyMod.Policy = js.native
    def get(name: String, id: Input[ID], state: PolicyState, opts: CustomResourceOptions): typings.pulumiAws.organizationsPolicyMod.Policy = js.native
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.organizationsPolicyAttachmentMod.PolicyAttachment = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.organizationsPolicyAttachmentMod.PolicyAttachment = js.native
    def get(name: String, id: Input[ID], state: PolicyAttachmentState): typings.pulumiAws.organizationsPolicyAttachmentMod.PolicyAttachment = js.native
    def get(name: String, id: Input[ID], state: PolicyAttachmentState, opts: CustomResourceOptions): typings.pulumiAws.organizationsPolicyAttachmentMod.PolicyAttachment = js.native
    /**
      * Returns true if the given object is an instance of PolicyAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/organizations/policyAttachment.PolicyAttachment */ Boolean = js.native
  }
  
}

