package typings.pulumiAws

import typings.pulumiAws.detectorMod.DetectorArgs
import typings.pulumiAws.detectorMod.DetectorState
import typings.pulumiAws.getDetectorMod.GetDetectorArgs
import typings.pulumiAws.getDetectorMod.GetDetectorResult
import typings.pulumiAws.inviteAccepterMod.InviteAccepterArgs
import typings.pulumiAws.inviteAccepterMod.InviteAccepterState
import typings.pulumiAws.ipsetMod.IPSetArgs
import typings.pulumiAws.ipsetMod.IPSetState
import typings.pulumiAws.memberMod.MemberArgs
import typings.pulumiAws.memberMod.MemberState
import typings.pulumiAws.organizationAdminAccountMod.OrganizationAdminAccountArgs
import typings.pulumiAws.organizationAdminAccountMod.OrganizationAdminAccountState
import typings.pulumiAws.organizationConfigurationMod.OrganizationConfigurationArgs
import typings.pulumiAws.organizationConfigurationMod.OrganizationConfigurationState
import typings.pulumiAws.threatIntelSetMod.ThreatIntelSetArgs
import typings.pulumiAws.threatIntelSetMod.ThreatIntelSetState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/guardduty", JSImport.Namespace)
@js.native
object guarddutyMod extends js.Object {
  @js.native
  class Detector protected ()
    extends typings.pulumiAws.detectorMod.Detector {
    /**
      * Create a Detector resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: DetectorArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: DetectorArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class IPSet protected ()
    extends typings.pulumiAws.ipsetMod.IPSet {
    /**
      * Create a IPSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: IPSetArgs) = this()
    def this(name: String, args: IPSetArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class InviteAccepter protected ()
    extends typings.pulumiAws.inviteAccepterMod.InviteAccepter {
    /**
      * Create a InviteAccepter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: InviteAccepterArgs) = this()
    def this(name: String, args: InviteAccepterArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Member protected ()
    extends typings.pulumiAws.memberMod.Member {
    /**
      * Create a Member resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MemberArgs) = this()
    def this(name: String, args: MemberArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class OrganizationAdminAccount protected ()
    extends typings.pulumiAws.organizationAdminAccountMod.OrganizationAdminAccount {
    /**
      * Create a OrganizationAdminAccount resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: OrganizationAdminAccountArgs) = this()
    def this(name: String, args: OrganizationAdminAccountArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class OrganizationConfiguration protected ()
    extends typings.pulumiAws.organizationConfigurationMod.OrganizationConfiguration {
    /**
      * Create a OrganizationConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: OrganizationConfigurationArgs) = this()
    def this(name: String, args: OrganizationConfigurationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ThreatIntelSet protected ()
    extends typings.pulumiAws.threatIntelSetMod.ThreatIntelSet {
    /**
      * Create a ThreatIntelSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ThreatIntelSetArgs) = this()
    def this(name: String, args: ThreatIntelSetArgs, opts: CustomResourceOptions) = this()
  }
  
  def getDetector(): js.Promise[GetDetectorResult] = js.native
  def getDetector(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetDetectorResult] = js.native
  def getDetector(args: GetDetectorArgs): js.Promise[GetDetectorResult] = js.native
  def getDetector(args: GetDetectorArgs, opts: InvokeOptions): js.Promise[GetDetectorResult] = js.native
  /* static members */
  @js.native
  object Detector extends js.Object {
    /**
      * Get an existing Detector resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.detectorMod.Detector = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.detectorMod.Detector = js.native
    def get(name: String, id: Input[ID], state: DetectorState): typings.pulumiAws.detectorMod.Detector = js.native
    def get(name: String, id: Input[ID], state: DetectorState, opts: CustomResourceOptions): typings.pulumiAws.detectorMod.Detector = js.native
    /**
      * Returns true if the given object is an instance of Detector.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/detector.Detector */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object IPSet extends js.Object {
    /**
      * Get an existing IPSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.ipsetMod.IPSet = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.ipsetMod.IPSet = js.native
    def get(name: String, id: Input[ID], state: IPSetState): typings.pulumiAws.ipsetMod.IPSet = js.native
    def get(name: String, id: Input[ID], state: IPSetState, opts: CustomResourceOptions): typings.pulumiAws.ipsetMod.IPSet = js.native
    /**
      * Returns true if the given object is an instance of IPSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/ipset.IPSet */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object InviteAccepter extends js.Object {
    /**
      * Get an existing InviteAccepter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.inviteAccepterMod.InviteAccepter = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.inviteAccepterMod.InviteAccepter = js.native
    def get(name: String, id: Input[ID], state: InviteAccepterState): typings.pulumiAws.inviteAccepterMod.InviteAccepter = js.native
    def get(name: String, id: Input[ID], state: InviteAccepterState, opts: CustomResourceOptions): typings.pulumiAws.inviteAccepterMod.InviteAccepter = js.native
    /**
      * Returns true if the given object is an instance of InviteAccepter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/inviteAccepter.InviteAccepter */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Member extends js.Object {
    /**
      * Get an existing Member resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.memberMod.Member = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.memberMod.Member = js.native
    def get(name: String, id: Input[ID], state: MemberState): typings.pulumiAws.memberMod.Member = js.native
    def get(name: String, id: Input[ID], state: MemberState, opts: CustomResourceOptions): typings.pulumiAws.memberMod.Member = js.native
    /**
      * Returns true if the given object is an instance of Member.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/member.Member */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object OrganizationAdminAccount extends js.Object {
    /**
      * Get an existing OrganizationAdminAccount resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.organizationAdminAccountMod.OrganizationAdminAccount = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.organizationAdminAccountMod.OrganizationAdminAccount = js.native
    def get(name: String, id: Input[ID], state: OrganizationAdminAccountState): typings.pulumiAws.organizationAdminAccountMod.OrganizationAdminAccount = js.native
    def get(name: String, id: Input[ID], state: OrganizationAdminAccountState, opts: CustomResourceOptions): typings.pulumiAws.organizationAdminAccountMod.OrganizationAdminAccount = js.native
    /**
      * Returns true if the given object is an instance of OrganizationAdminAccount.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/organizationAdminAccount.OrganizationAdminAccount */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object OrganizationConfiguration extends js.Object {
    /**
      * Get an existing OrganizationConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.organizationConfigurationMod.OrganizationConfiguration = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.organizationConfigurationMod.OrganizationConfiguration = js.native
    def get(name: String, id: Input[ID], state: OrganizationConfigurationState): typings.pulumiAws.organizationConfigurationMod.OrganizationConfiguration = js.native
    def get(name: String, id: Input[ID], state: OrganizationConfigurationState, opts: CustomResourceOptions): typings.pulumiAws.organizationConfigurationMod.OrganizationConfiguration = js.native
    /**
      * Returns true if the given object is an instance of OrganizationConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/organizationConfiguration.OrganizationConfiguration */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ThreatIntelSet extends js.Object {
    /**
      * Get an existing ThreatIntelSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.threatIntelSetMod.ThreatIntelSet = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.threatIntelSetMod.ThreatIntelSet = js.native
    def get(name: String, id: Input[ID], state: ThreatIntelSetState): typings.pulumiAws.threatIntelSetMod.ThreatIntelSet = js.native
    def get(name: String, id: Input[ID], state: ThreatIntelSetState, opts: CustomResourceOptions): typings.pulumiAws.threatIntelSetMod.ThreatIntelSet = js.native
    /**
      * Returns true if the given object is an instance of ThreatIntelSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/threatIntelSet.ThreatIntelSet */ Boolean = js.native
  }
  
}

