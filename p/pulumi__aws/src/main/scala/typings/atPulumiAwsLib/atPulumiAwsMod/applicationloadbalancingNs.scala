package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "applicationloadbalancing")
@js.native
object applicationloadbalancingNs extends js.Object {
  @js.native
  class Listener protected ()
    extends atPulumiAwsLib.applicationloadbalancingMod.Listener {
    /**
      * Create a Listener resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.applicationloadbalancingListenerMod.ListenerArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.applicationloadbalancingListenerMod.ListenerArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class ListenerCertificate protected ()
    extends atPulumiAwsLib.applicationloadbalancingMod.ListenerCertificate {
    /**
      * Create a ListenerCertificate resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.applicationloadbalancingListenerCertificateMod.ListenerCertificateArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.applicationloadbalancingListenerCertificateMod.ListenerCertificateArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class ListenerRule protected ()
    extends atPulumiAwsLib.applicationloadbalancingMod.ListenerRule {
    /**
      * Create a ListenerRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.applicationloadbalancingListenerRuleMod.ListenerRuleArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.applicationloadbalancingListenerRuleMod.ListenerRuleArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class LoadBalancer protected ()
    extends atPulumiAwsLib.applicationloadbalancingMod.LoadBalancer {
    /**
      * Create a LoadBalancer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.applicationloadbalancingLoadBalancerMod.LoadBalancerArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.applicationloadbalancingLoadBalancerMod.LoadBalancerArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class TargetGroup protected ()
    extends atPulumiAwsLib.applicationloadbalancingMod.TargetGroup {
    /**
      * Create a TargetGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.applicationloadbalancingTargetGroupMod.TargetGroupArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.applicationloadbalancingTargetGroupMod.TargetGroupArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class TargetGroupAttachment protected ()
    extends atPulumiAwsLib.applicationloadbalancingMod.TargetGroupAttachment {
    /**
      * Create a TargetGroupAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.applicationloadbalancingTargetGroupAttachmentMod.TargetGroupAttachmentArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.applicationloadbalancingTargetGroupAttachmentMod.TargetGroupAttachmentArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  def getListener(): js.Promise[atPulumiAwsLib.applicationloadbalancingGetListenerMod.GetListenerResult] = js.native
  def getListener(args: atPulumiAwsLib.applicationloadbalancingGetListenerMod.GetListenerArgs): js.Promise[atPulumiAwsLib.applicationloadbalancingGetListenerMod.GetListenerResult] = js.native
  def getListener(
    args: atPulumiAwsLib.applicationloadbalancingGetListenerMod.GetListenerArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.applicationloadbalancingGetListenerMod.GetListenerResult] = js.native
  def getLoadBalancer(): js.Promise[atPulumiAwsLib.applicationloadbalancingGetLoadBalancerMod.GetLoadBalancerResult] = js.native
  def getLoadBalancer(args: atPulumiAwsLib.applicationloadbalancingGetLoadBalancerMod.GetLoadBalancerArgs): js.Promise[atPulumiAwsLib.applicationloadbalancingGetLoadBalancerMod.GetLoadBalancerResult] = js.native
  def getLoadBalancer(
    args: atPulumiAwsLib.applicationloadbalancingGetLoadBalancerMod.GetLoadBalancerArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.applicationloadbalancingGetLoadBalancerMod.GetLoadBalancerResult] = js.native
  def getTargetGroup(): js.Promise[atPulumiAwsLib.applicationloadbalancingGetTargetGroupMod.GetTargetGroupResult] = js.native
  def getTargetGroup(args: atPulumiAwsLib.applicationloadbalancingGetTargetGroupMod.GetTargetGroupArgs): js.Promise[atPulumiAwsLib.applicationloadbalancingGetTargetGroupMod.GetTargetGroupResult] = js.native
  def getTargetGroup(
    args: atPulumiAwsLib.applicationloadbalancingGetTargetGroupMod.GetTargetGroupArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.applicationloadbalancingGetTargetGroupMod.GetTargetGroupResult] = js.native
  @js.native
  object Listener extends js.Object {
    /**
      * Get an existing Listener resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.applicationloadbalancingListenerMod.Listener = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.applicationloadbalancingListenerMod.ListenerState
    ): atPulumiAwsLib.applicationloadbalancingListenerMod.Listener = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.applicationloadbalancingListenerMod.ListenerState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.applicationloadbalancingListenerMod.Listener = js.native
  }
  
  @js.native
  object ListenerCertificate extends js.Object {
    /**
      * Get an existing ListenerCertificate resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.applicationloadbalancingListenerCertificateMod.ListenerCertificate = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.applicationloadbalancingListenerCertificateMod.ListenerCertificateState
    ): atPulumiAwsLib.applicationloadbalancingListenerCertificateMod.ListenerCertificate = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.applicationloadbalancingListenerCertificateMod.ListenerCertificateState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.applicationloadbalancingListenerCertificateMod.ListenerCertificate = js.native
  }
  
  @js.native
  object ListenerRule extends js.Object {
    /**
      * Get an existing ListenerRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.applicationloadbalancingListenerRuleMod.ListenerRule = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.applicationloadbalancingListenerRuleMod.ListenerRuleState
    ): atPulumiAwsLib.applicationloadbalancingListenerRuleMod.ListenerRule = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.applicationloadbalancingListenerRuleMod.ListenerRuleState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.applicationloadbalancingListenerRuleMod.ListenerRule = js.native
  }
  
  @js.native
  object LoadBalancer extends js.Object {
    /**
      * Get an existing LoadBalancer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.applicationloadbalancingLoadBalancerMod.LoadBalancer = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.applicationloadbalancingLoadBalancerMod.LoadBalancerState
    ): atPulumiAwsLib.applicationloadbalancingLoadBalancerMod.LoadBalancer = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.applicationloadbalancingLoadBalancerMod.LoadBalancerState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.applicationloadbalancingLoadBalancerMod.LoadBalancer = js.native
  }
  
  @js.native
  object TargetGroup extends js.Object {
    /**
      * Get an existing TargetGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.applicationloadbalancingTargetGroupMod.TargetGroup = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.applicationloadbalancingTargetGroupMod.TargetGroupState
    ): atPulumiAwsLib.applicationloadbalancingTargetGroupMod.TargetGroup = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.applicationloadbalancingTargetGroupMod.TargetGroupState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.applicationloadbalancingTargetGroupMod.TargetGroup = js.native
  }
  
  @js.native
  object TargetGroupAttachment extends js.Object {
    /**
      * Get an existing TargetGroupAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.applicationloadbalancingTargetGroupAttachmentMod.TargetGroupAttachment = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.applicationloadbalancingTargetGroupAttachmentMod.TargetGroupAttachmentState
    ): atPulumiAwsLib.applicationloadbalancingTargetGroupAttachmentMod.TargetGroupAttachment = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.applicationloadbalancingTargetGroupAttachmentMod.TargetGroupAttachmentState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.applicationloadbalancingTargetGroupAttachmentMod.TargetGroupAttachment = js.native
  }
  
}

