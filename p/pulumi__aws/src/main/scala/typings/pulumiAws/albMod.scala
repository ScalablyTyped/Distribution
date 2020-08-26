package typings.pulumiAws

import typings.pulumiAws.getListenerMod.GetListenerArgs
import typings.pulumiAws.getListenerMod.GetListenerResult
import typings.pulumiAws.getLoadBalancerMod.GetLoadBalancerArgs
import typings.pulumiAws.getLoadBalancerMod.GetLoadBalancerResult
import typings.pulumiAws.getTargetGroupMod.GetTargetGroupArgs
import typings.pulumiAws.getTargetGroupMod.GetTargetGroupResult
import typings.pulumiAws.ipAddressTypeMod.IpAddressType
import typings.pulumiAws.listenerCertificateMod.ListenerCertificateArgs
import typings.pulumiAws.listenerCertificateMod.ListenerCertificateState
import typings.pulumiAws.listenerMod.ListenerArgs
import typings.pulumiAws.listenerMod.ListenerState
import typings.pulumiAws.listenerRuleMod.ListenerRuleArgs
import typings.pulumiAws.listenerRuleMod.ListenerRuleState
import typings.pulumiAws.loadBalancerMod.LoadBalancerArgs
import typings.pulumiAws.loadBalancerMod.LoadBalancerState
import typings.pulumiAws.loadBalancerTypeMod.LoadBalancerType
import typings.pulumiAws.targetGroupAttachmentMod.TargetGroupAttachmentArgs
import typings.pulumiAws.targetGroupAttachmentMod.TargetGroupAttachmentState
import typings.pulumiAws.targetGroupMod.TargetGroupArgs
import typings.pulumiAws.targetGroupMod.TargetGroupState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/alb", JSImport.Namespace)
@js.native
object albMod extends js.Object {
  @js.native
  class Listener protected ()
    extends typings.pulumiAws.listenerMod.Listener {
    /**
      * Create a Listener resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ListenerArgs) = this()
    def this(name: String, args: ListenerArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ListenerCertificate protected ()
    extends typings.pulumiAws.listenerCertificateMod.ListenerCertificate {
    /**
      * Create a ListenerCertificate resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ListenerCertificateArgs) = this()
    def this(name: String, args: ListenerCertificateArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ListenerRule protected ()
    extends typings.pulumiAws.listenerRuleMod.ListenerRule {
    /**
      * Create a ListenerRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ListenerRuleArgs) = this()
    def this(name: String, args: ListenerRuleArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class LoadBalancer protected ()
    extends typings.pulumiAws.loadBalancerMod.LoadBalancer {
    /**
      * Create a LoadBalancer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: LoadBalancerArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: LoadBalancerArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class TargetGroup protected ()
    extends typings.pulumiAws.targetGroupMod.TargetGroup {
    /**
      * Create a TargetGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: TargetGroupArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: TargetGroupArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class TargetGroupAttachment protected ()
    extends typings.pulumiAws.targetGroupAttachmentMod.TargetGroupAttachment {
    /**
      * Create a TargetGroupAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TargetGroupAttachmentArgs) = this()
    def this(name: String, args: TargetGroupAttachmentArgs, opts: CustomResourceOptions) = this()
  }
  
  val ApplicationLoadBalancer: LoadBalancerType = js.native
  val Dualstack: IpAddressType = js.native
  val Ipv4: IpAddressType = js.native
  val NetworkLoadBalancer: LoadBalancerType = js.native
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
    def get(name: String, id: Input[ID]): typings.pulumiAws.listenerMod.Listener = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.listenerMod.Listener = js.native
    def get(name: String, id: Input[ID], state: ListenerState): typings.pulumiAws.listenerMod.Listener = js.native
    def get(name: String, id: Input[ID], state: ListenerState, opts: CustomResourceOptions): typings.pulumiAws.listenerMod.Listener = js.native
    /**
      * Returns true if the given object is an instance of Listener.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/alb/listener.Listener */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.pulumiAws.listenerCertificateMod.ListenerCertificate = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.listenerCertificateMod.ListenerCertificate = js.native
    def get(name: String, id: Input[ID], state: ListenerCertificateState): typings.pulumiAws.listenerCertificateMod.ListenerCertificate = js.native
    def get(name: String, id: Input[ID], state: ListenerCertificateState, opts: CustomResourceOptions): typings.pulumiAws.listenerCertificateMod.ListenerCertificate = js.native
    /**
      * Returns true if the given object is an instance of ListenerCertificate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/alb/listenerCertificate.ListenerCertificate */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.pulumiAws.listenerRuleMod.ListenerRule = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.listenerRuleMod.ListenerRule = js.native
    def get(name: String, id: Input[ID], state: ListenerRuleState): typings.pulumiAws.listenerRuleMod.ListenerRule = js.native
    def get(name: String, id: Input[ID], state: ListenerRuleState, opts: CustomResourceOptions): typings.pulumiAws.listenerRuleMod.ListenerRule = js.native
    /**
      * Returns true if the given object is an instance of ListenerRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/alb/listenerRule.ListenerRule */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.pulumiAws.loadBalancerMod.LoadBalancer = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.loadBalancerMod.LoadBalancer = js.native
    def get(name: String, id: Input[ID], state: LoadBalancerState): typings.pulumiAws.loadBalancerMod.LoadBalancer = js.native
    def get(name: String, id: Input[ID], state: LoadBalancerState, opts: CustomResourceOptions): typings.pulumiAws.loadBalancerMod.LoadBalancer = js.native
    /**
      * Returns true if the given object is an instance of LoadBalancer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/alb/loadBalancer.LoadBalancer */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.pulumiAws.targetGroupMod.TargetGroup = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.targetGroupMod.TargetGroup = js.native
    def get(name: String, id: Input[ID], state: TargetGroupState): typings.pulumiAws.targetGroupMod.TargetGroup = js.native
    def get(name: String, id: Input[ID], state: TargetGroupState, opts: CustomResourceOptions): typings.pulumiAws.targetGroupMod.TargetGroup = js.native
    /**
      * Returns true if the given object is an instance of TargetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/alb/targetGroup.TargetGroup */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.pulumiAws.targetGroupAttachmentMod.TargetGroupAttachment = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.targetGroupAttachmentMod.TargetGroupAttachment = js.native
    def get(name: String, id: Input[ID], state: TargetGroupAttachmentState): typings.pulumiAws.targetGroupAttachmentMod.TargetGroupAttachment = js.native
    def get(name: String, id: Input[ID], state: TargetGroupAttachmentState, opts: CustomResourceOptions): typings.pulumiAws.targetGroupAttachmentMod.TargetGroupAttachment = js.native
    /**
      * Returns true if the given object is an instance of TargetGroupAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/alb/targetGroupAttachment.TargetGroupAttachment */ Boolean = js.native
  }
  
}

