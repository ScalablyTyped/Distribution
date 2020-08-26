package typings.pulumiAws.mod

import typings.pulumiAws.elasticloadbalancingv2GetListenerMod.GetListenerArgs
import typings.pulumiAws.elasticloadbalancingv2GetListenerMod.GetListenerResult
import typings.pulumiAws.elasticloadbalancingv2GetLoadBalancerMod.GetLoadBalancerArgs
import typings.pulumiAws.elasticloadbalancingv2GetLoadBalancerMod.GetLoadBalancerResult
import typings.pulumiAws.elasticloadbalancingv2GetTargetGroupMod.GetTargetGroupArgs
import typings.pulumiAws.elasticloadbalancingv2GetTargetGroupMod.GetTargetGroupResult
import typings.pulumiAws.elasticloadbalancingv2ListenerCertificateMod.ListenerCertificateArgs
import typings.pulumiAws.elasticloadbalancingv2ListenerCertificateMod.ListenerCertificateState
import typings.pulumiAws.elasticloadbalancingv2ListenerMod.ListenerArgs
import typings.pulumiAws.elasticloadbalancingv2ListenerMod.ListenerState
import typings.pulumiAws.elasticloadbalancingv2ListenerRuleMod.ListenerRuleArgs
import typings.pulumiAws.elasticloadbalancingv2ListenerRuleMod.ListenerRuleState
import typings.pulumiAws.elasticloadbalancingv2LoadBalancerMod.LoadBalancerArgs
import typings.pulumiAws.elasticloadbalancingv2LoadBalancerMod.LoadBalancerState
import typings.pulumiAws.elasticloadbalancingv2TargetGroupAttachmentMod.TargetGroupAttachmentArgs
import typings.pulumiAws.elasticloadbalancingv2TargetGroupAttachmentMod.TargetGroupAttachmentState
import typings.pulumiAws.elasticloadbalancingv2TargetGroupMod.TargetGroupArgs
import typings.pulumiAws.elasticloadbalancingv2TargetGroupMod.TargetGroupState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "elasticloadbalancingv2")
@js.native
object elasticloadbalancingv2 extends js.Object {
  @js.native
  class Listener protected ()
    extends typings.pulumiAws.elasticloadbalancingv2Mod.Listener {
    /**
      * Create a Listener resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.elasticloadbalancingv2.Listener has been deprecated in favor of aws.lb.Listener */
    def this(name: String, args: ListenerArgs) = this()
    def this(name: String, args: ListenerArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ListenerCertificate protected ()
    extends typings.pulumiAws.elasticloadbalancingv2Mod.ListenerCertificate {
    /**
      * Create a ListenerCertificate resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.elasticloadbalancingv2.ListenerCertificate has been deprecated in favor of aws.lb.ListenerCertificate */
    def this(name: String, args: ListenerCertificateArgs) = this()
    def this(name: String, args: ListenerCertificateArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ListenerRule protected ()
    extends typings.pulumiAws.elasticloadbalancingv2Mod.ListenerRule {
    /**
      * Create a ListenerRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.elasticloadbalancingv2.ListenerRule has been deprecated in favor of aws.lb.ListenerRule */
    def this(name: String, args: ListenerRuleArgs) = this()
    def this(name: String, args: ListenerRuleArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class LoadBalancer protected ()
    extends typings.pulumiAws.elasticloadbalancingv2Mod.LoadBalancer {
    /**
      * Create a LoadBalancer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.elasticloadbalancingv2.LoadBalancer has been deprecated in favor of aws.lb.LoadBalancer */
    def this(name: String) = this()
    def this(name: String, args: LoadBalancerArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: LoadBalancerArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class TargetGroup protected ()
    extends typings.pulumiAws.elasticloadbalancingv2Mod.TargetGroup {
    /**
      * Create a TargetGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.elasticloadbalancingv2.TargetGroup has been deprecated in favor of aws.lb.TargetGroup */
    def this(name: String) = this()
    def this(name: String, args: TargetGroupArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: TargetGroupArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class TargetGroupAttachment protected ()
    extends typings.pulumiAws.elasticloadbalancingv2Mod.TargetGroupAttachment {
    /**
      * Create a TargetGroupAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.elasticloadbalancingv2.TargetGroupAttachment has been deprecated in favor of aws.lb.TargetGroupAttachment */
    def this(name: String, args: TargetGroupAttachmentArgs) = this()
    def this(name: String, args: TargetGroupAttachmentArgs, opts: CustomResourceOptions) = this()
  }
  
  def getListener(): js.Promise[GetListenerResult] = js.native
  def getListener(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetListenerResult] = js.native
  def getListener(args: GetListenerArgs): js.Promise[GetListenerResult] = js.native
  def getListener(args: GetListenerArgs, opts: InvokeOptions): js.Promise[GetListenerResult] = js.native
  def getLoadBalancer(): js.Promise[GetLoadBalancerResult] = js.native
  def getLoadBalancer(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetLoadBalancerResult] = js.native
  def getLoadBalancer(args: GetLoadBalancerArgs): js.Promise[GetLoadBalancerResult] = js.native
  def getLoadBalancer(args: GetLoadBalancerArgs, opts: InvokeOptions): js.Promise[GetLoadBalancerResult] = js.native
  def getTargetGroup(): js.Promise[GetTargetGroupResult] = js.native
  def getTargetGroup(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetTargetGroupResult] = js.native
  def getTargetGroup(args: GetTargetGroupArgs): js.Promise[GetTargetGroupResult] = js.native
  def getTargetGroup(args: GetTargetGroupArgs, opts: InvokeOptions): js.Promise[GetTargetGroupResult] = js.native
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.elasticloadbalancingv2ListenerMod.Listener = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.elasticloadbalancingv2ListenerMod.Listener = js.native
    def get(name: String, id: Input[ID], state: ListenerState): typings.pulumiAws.elasticloadbalancingv2ListenerMod.Listener = js.native
    def get(name: String, id: Input[ID], state: ListenerState, opts: CustomResourceOptions): typings.pulumiAws.elasticloadbalancingv2ListenerMod.Listener = js.native
    /**
      * Returns true if the given object is an instance of Listener.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancingv2/listener.Listener */ Boolean = js.native
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.elasticloadbalancingv2ListenerCertificateMod.ListenerCertificate = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.elasticloadbalancingv2ListenerCertificateMod.ListenerCertificate = js.native
    def get(name: String, id: Input[ID], state: ListenerCertificateState): typings.pulumiAws.elasticloadbalancingv2ListenerCertificateMod.ListenerCertificate = js.native
    def get(name: String, id: Input[ID], state: ListenerCertificateState, opts: CustomResourceOptions): typings.pulumiAws.elasticloadbalancingv2ListenerCertificateMod.ListenerCertificate = js.native
    /**
      * Returns true if the given object is an instance of ListenerCertificate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancingv2/listenerCertificate.ListenerCertificate */ Boolean = js.native
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.elasticloadbalancingv2ListenerRuleMod.ListenerRule = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.elasticloadbalancingv2ListenerRuleMod.ListenerRule = js.native
    def get(name: String, id: Input[ID], state: ListenerRuleState): typings.pulumiAws.elasticloadbalancingv2ListenerRuleMod.ListenerRule = js.native
    def get(name: String, id: Input[ID], state: ListenerRuleState, opts: CustomResourceOptions): typings.pulumiAws.elasticloadbalancingv2ListenerRuleMod.ListenerRule = js.native
    /**
      * Returns true if the given object is an instance of ListenerRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancingv2/listenerRule.ListenerRule */ Boolean = js.native
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.elasticloadbalancingv2LoadBalancerMod.LoadBalancer = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.elasticloadbalancingv2LoadBalancerMod.LoadBalancer = js.native
    def get(name: String, id: Input[ID], state: LoadBalancerState): typings.pulumiAws.elasticloadbalancingv2LoadBalancerMod.LoadBalancer = js.native
    def get(name: String, id: Input[ID], state: LoadBalancerState, opts: CustomResourceOptions): typings.pulumiAws.elasticloadbalancingv2LoadBalancerMod.LoadBalancer = js.native
    /**
      * Returns true if the given object is an instance of LoadBalancer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancingv2/loadBalancer.LoadBalancer */ Boolean = js.native
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.elasticloadbalancingv2TargetGroupMod.TargetGroup = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.elasticloadbalancingv2TargetGroupMod.TargetGroup = js.native
    def get(name: String, id: Input[ID], state: TargetGroupState): typings.pulumiAws.elasticloadbalancingv2TargetGroupMod.TargetGroup = js.native
    def get(name: String, id: Input[ID], state: TargetGroupState, opts: CustomResourceOptions): typings.pulumiAws.elasticloadbalancingv2TargetGroupMod.TargetGroup = js.native
    /**
      * Returns true if the given object is an instance of TargetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancingv2/targetGroup.TargetGroup */ Boolean = js.native
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.elasticloadbalancingv2TargetGroupAttachmentMod.TargetGroupAttachment = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.elasticloadbalancingv2TargetGroupAttachmentMod.TargetGroupAttachment = js.native
    def get(name: String, id: Input[ID], state: TargetGroupAttachmentState): typings.pulumiAws.elasticloadbalancingv2TargetGroupAttachmentMod.TargetGroupAttachment = js.native
    def get(name: String, id: Input[ID], state: TargetGroupAttachmentState, opts: CustomResourceOptions): typings.pulumiAws.elasticloadbalancingv2TargetGroupAttachmentMod.TargetGroupAttachment = js.native
    /**
      * Returns true if the given object is an instance of TargetGroupAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancingv2/targetGroupAttachment.TargetGroupAttachment */ Boolean = js.native
  }
  
}

