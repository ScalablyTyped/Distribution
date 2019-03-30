package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "guardduty")
@js.native
object guarddutyNs extends js.Object {
  @js.native
  class Detector protected ()
    extends atPulumiAwsLib.guarddutyMod.Detector {
    /**
      * Create a Detector resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.guarddutyDetectorMod.DetectorArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.guarddutyDetectorMod.DetectorArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class IPSet protected ()
    extends atPulumiAwsLib.guarddutyMod.IPSet {
    /**
      * Create a IPSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.guarddutyIPSetMod.IPSetArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.guarddutyIPSetMod.IPSetArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class InviteAccepter protected ()
    extends atPulumiAwsLib.guarddutyMod.InviteAccepter {
    /**
      * Create a InviteAccepter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.guarddutyInviteAccepterMod.InviteAccepterArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.guarddutyInviteAccepterMod.InviteAccepterArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Member protected ()
    extends atPulumiAwsLib.guarddutyMod.Member {
    /**
      * Create a Member resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.guarddutyMemberMod.MemberArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.guarddutyMemberMod.MemberArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class ThreatIntelSet protected ()
    extends atPulumiAwsLib.guarddutyMod.ThreatIntelSet {
    /**
      * Create a ThreatIntelSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.guarddutyThreatIntelSetMod.ThreatIntelSetArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.guarddutyThreatIntelSetMod.ThreatIntelSetArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
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
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.guarddutyDetectorMod.Detector = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.guarddutyDetectorMod.DetectorState
    ): atPulumiAwsLib.guarddutyDetectorMod.Detector = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.guarddutyDetectorMod.DetectorState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.guarddutyDetectorMod.Detector = js.native
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
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.guarddutyIPSetMod.IPSet = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.guarddutyIPSetMod.IPSetState
    ): atPulumiAwsLib.guarddutyIPSetMod.IPSet = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.guarddutyIPSetMod.IPSetState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.guarddutyIPSetMod.IPSet = js.native
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
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.guarddutyInviteAccepterMod.InviteAccepter = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.guarddutyInviteAccepterMod.InviteAccepterState
    ): atPulumiAwsLib.guarddutyInviteAccepterMod.InviteAccepter = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.guarddutyInviteAccepterMod.InviteAccepterState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.guarddutyInviteAccepterMod.InviteAccepter = js.native
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
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.guarddutyMemberMod.Member = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.guarddutyMemberMod.MemberState
    ): atPulumiAwsLib.guarddutyMemberMod.Member = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.guarddutyMemberMod.MemberState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.guarddutyMemberMod.Member = js.native
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
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.guarddutyThreatIntelSetMod.ThreatIntelSet = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.guarddutyThreatIntelSetMod.ThreatIntelSetState
    ): atPulumiAwsLib.guarddutyThreatIntelSetMod.ThreatIntelSet = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.guarddutyThreatIntelSetMod.ThreatIntelSetState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.guarddutyThreatIntelSetMod.ThreatIntelSet = js.native
  }
  
}

