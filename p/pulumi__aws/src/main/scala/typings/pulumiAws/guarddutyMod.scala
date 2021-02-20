package typings.pulumiAws

import typings.pulumiAws.detectorMod.DetectorArgs
import typings.pulumiAws.detectorMod.DetectorState
import typings.pulumiAws.filterMod.FilterArgs
import typings.pulumiAws.filterMod.FilterState
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
import typings.pulumiAws.publishingDestinationMod.PublishingDestinationArgs
import typings.pulumiAws.publishingDestinationMod.PublishingDestinationState
import typings.pulumiAws.threatIntelSetMod.ThreatIntelSetArgs
import typings.pulumiAws.threatIntelSetMod.ThreatIntelSetState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object guarddutyMod {
  
  @JSImport("@pulumi/aws/guardduty", "Detector")
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
  /* static members */
  object Detector {
    
    /**
      * Get an existing Detector resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/guardduty", "Detector.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.detectorMod.Detector = js.native
    @JSImport("@pulumi/aws/guardduty", "Detector.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.detectorMod.Detector = js.native
    @JSImport("@pulumi/aws/guardduty", "Detector.get")
    @js.native
    def get(name: String, id: Input[ID], state: DetectorState): typings.pulumiAws.detectorMod.Detector = js.native
    @JSImport("@pulumi/aws/guardduty", "Detector.get")
    @js.native
    def get(name: String, id: Input[ID], state: DetectorState, opts: CustomResourceOptions): typings.pulumiAws.detectorMod.Detector = js.native
    
    /**
      * Returns true if the given object is an instance of Detector.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/guardduty", "Detector.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/detector.Detector */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/guardduty", "Filter")
  @js.native
  class Filter protected ()
    extends typings.pulumiAws.filterMod.Filter {
    /**
      * Create a Filter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: FilterArgs) = this()
    def this(name: String, args: FilterArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Filter {
    
    /**
      * Get an existing Filter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/guardduty", "Filter.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.filterMod.Filter = js.native
    @JSImport("@pulumi/aws/guardduty", "Filter.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.filterMod.Filter = js.native
    @JSImport("@pulumi/aws/guardduty", "Filter.get")
    @js.native
    def get(name: String, id: Input[ID], state: FilterState): typings.pulumiAws.filterMod.Filter = js.native
    @JSImport("@pulumi/aws/guardduty", "Filter.get")
    @js.native
    def get(name: String, id: Input[ID], state: FilterState, opts: CustomResourceOptions): typings.pulumiAws.filterMod.Filter = js.native
    
    /**
      * Returns true if the given object is an instance of Filter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/guardduty", "Filter.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/filter.Filter */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/guardduty", "IPSet")
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
  /* static members */
  object IPSet {
    
    /**
      * Get an existing IPSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/guardduty", "IPSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.ipsetMod.IPSet = js.native
    @JSImport("@pulumi/aws/guardduty", "IPSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.ipsetMod.IPSet = js.native
    @JSImport("@pulumi/aws/guardduty", "IPSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: IPSetState): typings.pulumiAws.ipsetMod.IPSet = js.native
    @JSImport("@pulumi/aws/guardduty", "IPSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: IPSetState, opts: CustomResourceOptions): typings.pulumiAws.ipsetMod.IPSet = js.native
    
    /**
      * Returns true if the given object is an instance of IPSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/guardduty", "IPSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/ipset.IPSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/guardduty", "InviteAccepter")
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
  /* static members */
  object InviteAccepter {
    
    /**
      * Get an existing InviteAccepter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/guardduty", "InviteAccepter.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.inviteAccepterMod.InviteAccepter = js.native
    @JSImport("@pulumi/aws/guardduty", "InviteAccepter.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.inviteAccepterMod.InviteAccepter = js.native
    @JSImport("@pulumi/aws/guardduty", "InviteAccepter.get")
    @js.native
    def get(name: String, id: Input[ID], state: InviteAccepterState): typings.pulumiAws.inviteAccepterMod.InviteAccepter = js.native
    @JSImport("@pulumi/aws/guardduty", "InviteAccepter.get")
    @js.native
    def get(name: String, id: Input[ID], state: InviteAccepterState, opts: CustomResourceOptions): typings.pulumiAws.inviteAccepterMod.InviteAccepter = js.native
    
    /**
      * Returns true if the given object is an instance of InviteAccepter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/guardduty", "InviteAccepter.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/inviteAccepter.InviteAccepter */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/guardduty", "Member")
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
  /* static members */
  object Member {
    
    /**
      * Get an existing Member resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/guardduty", "Member.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.memberMod.Member = js.native
    @JSImport("@pulumi/aws/guardduty", "Member.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.memberMod.Member = js.native
    @JSImport("@pulumi/aws/guardduty", "Member.get")
    @js.native
    def get(name: String, id: Input[ID], state: MemberState): typings.pulumiAws.memberMod.Member = js.native
    @JSImport("@pulumi/aws/guardduty", "Member.get")
    @js.native
    def get(name: String, id: Input[ID], state: MemberState, opts: CustomResourceOptions): typings.pulumiAws.memberMod.Member = js.native
    
    /**
      * Returns true if the given object is an instance of Member.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/guardduty", "Member.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/member.Member */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/guardduty", "OrganizationAdminAccount")
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
  /* static members */
  object OrganizationAdminAccount {
    
    /**
      * Get an existing OrganizationAdminAccount resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/guardduty", "OrganizationAdminAccount.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.organizationAdminAccountMod.OrganizationAdminAccount = js.native
    @JSImport("@pulumi/aws/guardduty", "OrganizationAdminAccount.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.organizationAdminAccountMod.OrganizationAdminAccount = js.native
    @JSImport("@pulumi/aws/guardduty", "OrganizationAdminAccount.get")
    @js.native
    def get(name: String, id: Input[ID], state: OrganizationAdminAccountState): typings.pulumiAws.organizationAdminAccountMod.OrganizationAdminAccount = js.native
    @JSImport("@pulumi/aws/guardduty", "OrganizationAdminAccount.get")
    @js.native
    def get(name: String, id: Input[ID], state: OrganizationAdminAccountState, opts: CustomResourceOptions): typings.pulumiAws.organizationAdminAccountMod.OrganizationAdminAccount = js.native
    
    /**
      * Returns true if the given object is an instance of OrganizationAdminAccount.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/guardduty", "OrganizationAdminAccount.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/organizationAdminAccount.OrganizationAdminAccount */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/guardduty", "OrganizationConfiguration")
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
  /* static members */
  object OrganizationConfiguration {
    
    /**
      * Get an existing OrganizationConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/guardduty", "OrganizationConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.organizationConfigurationMod.OrganizationConfiguration = js.native
    @JSImport("@pulumi/aws/guardduty", "OrganizationConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.organizationConfigurationMod.OrganizationConfiguration = js.native
    @JSImport("@pulumi/aws/guardduty", "OrganizationConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: OrganizationConfigurationState): typings.pulumiAws.organizationConfigurationMod.OrganizationConfiguration = js.native
    @JSImport("@pulumi/aws/guardduty", "OrganizationConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: OrganizationConfigurationState, opts: CustomResourceOptions): typings.pulumiAws.organizationConfigurationMod.OrganizationConfiguration = js.native
    
    /**
      * Returns true if the given object is an instance of OrganizationConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/guardduty", "OrganizationConfiguration.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/organizationConfiguration.OrganizationConfiguration */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/guardduty", "PublishingDestination")
  @js.native
  class PublishingDestination protected ()
    extends typings.pulumiAws.publishingDestinationMod.PublishingDestination {
    /**
      * Create a PublishingDestination resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PublishingDestinationArgs) = this()
    def this(name: String, args: PublishingDestinationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object PublishingDestination {
    
    /**
      * Get an existing PublishingDestination resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/guardduty", "PublishingDestination.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.publishingDestinationMod.PublishingDestination = js.native
    @JSImport("@pulumi/aws/guardduty", "PublishingDestination.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.publishingDestinationMod.PublishingDestination = js.native
    @JSImport("@pulumi/aws/guardduty", "PublishingDestination.get")
    @js.native
    def get(name: String, id: Input[ID], state: PublishingDestinationState): typings.pulumiAws.publishingDestinationMod.PublishingDestination = js.native
    @JSImport("@pulumi/aws/guardduty", "PublishingDestination.get")
    @js.native
    def get(name: String, id: Input[ID], state: PublishingDestinationState, opts: CustomResourceOptions): typings.pulumiAws.publishingDestinationMod.PublishingDestination = js.native
    
    /**
      * Returns true if the given object is an instance of PublishingDestination.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/guardduty", "PublishingDestination.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/publishingDestination.PublishingDestination */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/guardduty", "ThreatIntelSet")
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
  /* static members */
  object ThreatIntelSet {
    
    /**
      * Get an existing ThreatIntelSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/guardduty", "ThreatIntelSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.threatIntelSetMod.ThreatIntelSet = js.native
    @JSImport("@pulumi/aws/guardduty", "ThreatIntelSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.threatIntelSetMod.ThreatIntelSet = js.native
    @JSImport("@pulumi/aws/guardduty", "ThreatIntelSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: ThreatIntelSetState): typings.pulumiAws.threatIntelSetMod.ThreatIntelSet = js.native
    @JSImport("@pulumi/aws/guardduty", "ThreatIntelSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: ThreatIntelSetState, opts: CustomResourceOptions): typings.pulumiAws.threatIntelSetMod.ThreatIntelSet = js.native
    
    /**
      * Returns true if the given object is an instance of ThreatIntelSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/guardduty", "ThreatIntelSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/threatIntelSet.ThreatIntelSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/guardduty", "getDetector")
  @js.native
  def getDetector(): js.Promise[GetDetectorResult] = js.native
  @JSImport("@pulumi/aws/guardduty", "getDetector")
  @js.native
  def getDetector(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetDetectorResult] = js.native
  @JSImport("@pulumi/aws/guardduty", "getDetector")
  @js.native
  def getDetector(args: GetDetectorArgs): js.Promise[GetDetectorResult] = js.native
  @JSImport("@pulumi/aws/guardduty", "getDetector")
  @js.native
  def getDetector(args: GetDetectorArgs, opts: InvokeOptions): js.Promise[GetDetectorResult] = js.native
}
