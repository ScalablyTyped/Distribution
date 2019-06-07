package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "elasticloadbalancingv2")
@js.native
object elasticloadbalancingv2Ns extends js.Object {
  @js.native
  class Listener protected ()
    extends atPulumiAwsLib.elasticloadbalancingv2Mod.Listener {
    /**
      * Create a Listener resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.elasticloadbalancingv2ListenerMod.ListenerArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.elasticloadbalancingv2ListenerMod.ListenerArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class ListenerCertificate protected ()
    extends atPulumiAwsLib.elasticloadbalancingv2Mod.ListenerCertificate {
    /**
      * Create a ListenerCertificate resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.elasticloadbalancingv2ListenerCertificateMod.ListenerCertificateArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.elasticloadbalancingv2ListenerCertificateMod.ListenerCertificateArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class ListenerRule protected ()
    extends atPulumiAwsLib.elasticloadbalancingv2Mod.ListenerRule {
    /**
      * Create a ListenerRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.elasticloadbalancingv2ListenerRuleMod.ListenerRuleArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.elasticloadbalancingv2ListenerRuleMod.ListenerRuleArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class LoadBalancer protected ()
    extends atPulumiAwsLib.elasticloadbalancingv2Mod.LoadBalancer {
    /**
      * Create a LoadBalancer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.elasticloadbalancingv2LoadBalancerMod.LoadBalancerArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.elasticloadbalancingv2LoadBalancerMod.LoadBalancerArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class TargetGroup protected ()
    extends atPulumiAwsLib.elasticloadbalancingv2Mod.TargetGroup {
    /**
      * Create a TargetGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.elasticloadbalancingv2TargetGroupMod.TargetGroupArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.elasticloadbalancingv2TargetGroupMod.TargetGroupArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class TargetGroupAttachment protected ()
    extends atPulumiAwsLib.elasticloadbalancingv2Mod.TargetGroupAttachment {
    /**
      * Create a TargetGroupAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.elasticloadbalancingv2TargetGroupAttachmentMod.TargetGroupAttachmentArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.elasticloadbalancingv2TargetGroupAttachmentMod.TargetGroupAttachmentArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  def getListener(): js.Promise[atPulumiAwsLib.elasticloadbalancingv2GetListenerMod.GetListenerResult] = js.native
  def getListener(args: atPulumiAwsLib.elasticloadbalancingv2GetListenerMod.GetListenerArgs): js.Promise[atPulumiAwsLib.elasticloadbalancingv2GetListenerMod.GetListenerResult] = js.native
  def getListener(
    args: atPulumiAwsLib.elasticloadbalancingv2GetListenerMod.GetListenerArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.elasticloadbalancingv2GetListenerMod.GetListenerResult] = js.native
  def getLoadBalancer(): js.Promise[atPulumiAwsLib.elasticloadbalancingv2GetLoadBalancerMod.GetLoadBalancerResult] = js.native
  def getLoadBalancer(args: atPulumiAwsLib.elasticloadbalancingv2GetLoadBalancerMod.GetLoadBalancerArgs): js.Promise[atPulumiAwsLib.elasticloadbalancingv2GetLoadBalancerMod.GetLoadBalancerResult] = js.native
  def getLoadBalancer(
    args: atPulumiAwsLib.elasticloadbalancingv2GetLoadBalancerMod.GetLoadBalancerArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.elasticloadbalancingv2GetLoadBalancerMod.GetLoadBalancerResult] = js.native
  def getTargetGroup(): js.Promise[atPulumiAwsLib.elasticloadbalancingv2GetTargetGroupMod.GetTargetGroupResult] = js.native
  def getTargetGroup(args: atPulumiAwsLib.elasticloadbalancingv2GetTargetGroupMod.GetTargetGroupArgs): js.Promise[atPulumiAwsLib.elasticloadbalancingv2GetTargetGroupMod.GetTargetGroupResult] = js.native
  def getTargetGroup(
    args: atPulumiAwsLib.elasticloadbalancingv2GetTargetGroupMod.GetTargetGroupArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.elasticloadbalancingv2GetTargetGroupMod.GetTargetGroupResult] = js.native
  /* static members */
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.elasticloadbalancingv2ListenerMod.Listener = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.elasticloadbalancingv2ListenerMod.ListenerState
    ): atPulumiAwsLib.elasticloadbalancingv2ListenerMod.Listener = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.elasticloadbalancingv2ListenerMod.ListenerState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.elasticloadbalancingv2ListenerMod.Listener = js.native
    /**
      * Returns true if the given object is an instance of Listener.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancingv2/listener.Listener */ scala.Boolean = js.native
  }
  
  /* static members */
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.elasticloadbalancingv2ListenerCertificateMod.ListenerCertificate = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.elasticloadbalancingv2ListenerCertificateMod.ListenerCertificateState
    ): atPulumiAwsLib.elasticloadbalancingv2ListenerCertificateMod.ListenerCertificate = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.elasticloadbalancingv2ListenerCertificateMod.ListenerCertificateState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.elasticloadbalancingv2ListenerCertificateMod.ListenerCertificate = js.native
    /**
      * Returns true if the given object is an instance of ListenerCertificate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancingv2/listenerCertificate.ListenerCertificate */ scala.Boolean = js.native
  }
  
  /* static members */
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.elasticloadbalancingv2ListenerRuleMod.ListenerRule = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.elasticloadbalancingv2ListenerRuleMod.ListenerRuleState
    ): atPulumiAwsLib.elasticloadbalancingv2ListenerRuleMod.ListenerRule = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.elasticloadbalancingv2ListenerRuleMod.ListenerRuleState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.elasticloadbalancingv2ListenerRuleMod.ListenerRule = js.native
    /**
      * Returns true if the given object is an instance of ListenerRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancingv2/listenerRule.ListenerRule */ scala.Boolean = js.native
  }
  
  /* static members */
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.elasticloadbalancingv2LoadBalancerMod.LoadBalancer = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.elasticloadbalancingv2LoadBalancerMod.LoadBalancerState
    ): atPulumiAwsLib.elasticloadbalancingv2LoadBalancerMod.LoadBalancer = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.elasticloadbalancingv2LoadBalancerMod.LoadBalancerState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.elasticloadbalancingv2LoadBalancerMod.LoadBalancer = js.native
    /**
      * Returns true if the given object is an instance of LoadBalancer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancingv2/loadBalancer.LoadBalancer */ scala.Boolean = js.native
  }
  
  /* static members */
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.elasticloadbalancingv2TargetGroupMod.TargetGroup = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.elasticloadbalancingv2TargetGroupMod.TargetGroupState
    ): atPulumiAwsLib.elasticloadbalancingv2TargetGroupMod.TargetGroup = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.elasticloadbalancingv2TargetGroupMod.TargetGroupState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.elasticloadbalancingv2TargetGroupMod.TargetGroup = js.native
    /**
      * Returns true if the given object is an instance of TargetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancingv2/targetGroup.TargetGroup */ scala.Boolean = js.native
  }
  
  /* static members */
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.elasticloadbalancingv2TargetGroupAttachmentMod.TargetGroupAttachment = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.elasticloadbalancingv2TargetGroupAttachmentMod.TargetGroupAttachmentState
    ): atPulumiAwsLib.elasticloadbalancingv2TargetGroupAttachmentMod.TargetGroupAttachment = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.elasticloadbalancingv2TargetGroupAttachmentMod.TargetGroupAttachmentState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.elasticloadbalancingv2TargetGroupAttachmentMod.TargetGroupAttachment = js.native
    /**
      * Returns true if the given object is an instance of TargetGroupAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancingv2/targetGroupAttachment.TargetGroupAttachment */ scala.Boolean = js.native
  }
  
}

