package typings.pulumiAws

import typings.pulumiAws.lbGetListenerMod.GetListenerArgs
import typings.pulumiAws.lbGetListenerMod.GetListenerResult
import typings.pulumiAws.lbGetLoadBalancerMod.GetLoadBalancerArgs
import typings.pulumiAws.lbGetLoadBalancerMod.GetLoadBalancerResult
import typings.pulumiAws.lbGetTargetGroupMod.GetTargetGroupArgs
import typings.pulumiAws.lbGetTargetGroupMod.GetTargetGroupResult
import typings.pulumiAws.lbListenerCertificateMod.ListenerCertificateArgs
import typings.pulumiAws.lbListenerCertificateMod.ListenerCertificateState
import typings.pulumiAws.lbListenerMod.ListenerArgs
import typings.pulumiAws.lbListenerMod.ListenerState
import typings.pulumiAws.lbListenerRuleMod.ListenerRuleArgs
import typings.pulumiAws.lbListenerRuleMod.ListenerRuleState
import typings.pulumiAws.lbLoadBalancerMod.LoadBalancerArgs
import typings.pulumiAws.lbLoadBalancerMod.LoadBalancerState
import typings.pulumiAws.lbTargetGroupAttachmentMod.TargetGroupAttachmentArgs
import typings.pulumiAws.lbTargetGroupAttachmentMod.TargetGroupAttachmentState
import typings.pulumiAws.lbTargetGroupMod.TargetGroupArgs
import typings.pulumiAws.lbTargetGroupMod.TargetGroupState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lbMod {
  
  @JSImport("@pulumi/aws/lb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws/lb", "Listener")
  @js.native
  class Listener protected ()
    extends typings.pulumiAws.lbListenerMod.Listener {
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
  /* static members */
  object Listener {
    
    @JSImport("@pulumi/aws/lb", "Listener")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Listener resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.lbListenerMod.Listener = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.lbListenerMod.Listener]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.lbListenerMod.Listener = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.lbListenerMod.Listener]
    @scala.inline
    def get(name: String, id: Input[ID], state: ListenerState): typings.pulumiAws.lbListenerMod.Listener = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.lbListenerMod.Listener]
    @scala.inline
    def get(name: String, id: Input[ID], state: ListenerState, opts: CustomResourceOptions): typings.pulumiAws.lbListenerMod.Listener = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.lbListenerMod.Listener]
    
    /**
      * Returns true if the given object is an instance of Listener.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lb/listener.Listener */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/lb/listener.Listener */ Boolean]
  }
  
  @JSImport("@pulumi/aws/lb", "ListenerCertificate")
  @js.native
  class ListenerCertificate protected ()
    extends typings.pulumiAws.lbListenerCertificateMod.ListenerCertificate {
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
  /* static members */
  object ListenerCertificate {
    
    @JSImport("@pulumi/aws/lb", "ListenerCertificate")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ListenerCertificate resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.lbListenerCertificateMod.ListenerCertificate = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.lbListenerCertificateMod.ListenerCertificate]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.lbListenerCertificateMod.ListenerCertificate = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.lbListenerCertificateMod.ListenerCertificate]
    @scala.inline
    def get(name: String, id: Input[ID], state: ListenerCertificateState): typings.pulumiAws.lbListenerCertificateMod.ListenerCertificate = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.lbListenerCertificateMod.ListenerCertificate]
    @scala.inline
    def get(name: String, id: Input[ID], state: ListenerCertificateState, opts: CustomResourceOptions): typings.pulumiAws.lbListenerCertificateMod.ListenerCertificate = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.lbListenerCertificateMod.ListenerCertificate]
    
    /**
      * Returns true if the given object is an instance of ListenerCertificate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lb/listenerCertificate.ListenerCertificate */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/lb/listenerCertificate.ListenerCertificate */ Boolean]
  }
  
  @JSImport("@pulumi/aws/lb", "ListenerRule")
  @js.native
  class ListenerRule protected ()
    extends typings.pulumiAws.lbListenerRuleMod.ListenerRule {
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
  /* static members */
  object ListenerRule {
    
    @JSImport("@pulumi/aws/lb", "ListenerRule")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ListenerRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.lbListenerRuleMod.ListenerRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.lbListenerRuleMod.ListenerRule]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.lbListenerRuleMod.ListenerRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.lbListenerRuleMod.ListenerRule]
    @scala.inline
    def get(name: String, id: Input[ID], state: ListenerRuleState): typings.pulumiAws.lbListenerRuleMod.ListenerRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.lbListenerRuleMod.ListenerRule]
    @scala.inline
    def get(name: String, id: Input[ID], state: ListenerRuleState, opts: CustomResourceOptions): typings.pulumiAws.lbListenerRuleMod.ListenerRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.lbListenerRuleMod.ListenerRule]
    
    /**
      * Returns true if the given object is an instance of ListenerRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lb/listenerRule.ListenerRule */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/lb/listenerRule.ListenerRule */ Boolean]
  }
  
  @JSImport("@pulumi/aws/lb", "LoadBalancer")
  @js.native
  class LoadBalancer protected ()
    extends typings.pulumiAws.lbLoadBalancerMod.LoadBalancer {
    /**
      * Create a LoadBalancer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: LoadBalancerArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: LoadBalancerArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object LoadBalancer {
    
    @JSImport("@pulumi/aws/lb", "LoadBalancer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing LoadBalancer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.lbLoadBalancerMod.LoadBalancer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.lbLoadBalancerMod.LoadBalancer]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.lbLoadBalancerMod.LoadBalancer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.lbLoadBalancerMod.LoadBalancer]
    @scala.inline
    def get(name: String, id: Input[ID], state: LoadBalancerState): typings.pulumiAws.lbLoadBalancerMod.LoadBalancer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.lbLoadBalancerMod.LoadBalancer]
    @scala.inline
    def get(name: String, id: Input[ID], state: LoadBalancerState, opts: CustomResourceOptions): typings.pulumiAws.lbLoadBalancerMod.LoadBalancer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.lbLoadBalancerMod.LoadBalancer]
    
    /**
      * Returns true if the given object is an instance of LoadBalancer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lb/loadBalancer.LoadBalancer */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/lb/loadBalancer.LoadBalancer */ Boolean]
  }
  
  @JSImport("@pulumi/aws/lb", "TargetGroup")
  @js.native
  class TargetGroup protected ()
    extends typings.pulumiAws.lbTargetGroupMod.TargetGroup {
    /**
      * Create a TargetGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: TargetGroupArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: TargetGroupArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object TargetGroup {
    
    @JSImport("@pulumi/aws/lb", "TargetGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing TargetGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.lbTargetGroupMod.TargetGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.lbTargetGroupMod.TargetGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.lbTargetGroupMod.TargetGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.lbTargetGroupMod.TargetGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: TargetGroupState): typings.pulumiAws.lbTargetGroupMod.TargetGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.lbTargetGroupMod.TargetGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: TargetGroupState, opts: CustomResourceOptions): typings.pulumiAws.lbTargetGroupMod.TargetGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.lbTargetGroupMod.TargetGroup]
    
    /**
      * Returns true if the given object is an instance of TargetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lb/targetGroup.TargetGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/lb/targetGroup.TargetGroup */ Boolean]
  }
  
  @JSImport("@pulumi/aws/lb", "TargetGroupAttachment")
  @js.native
  class TargetGroupAttachment protected ()
    extends typings.pulumiAws.lbTargetGroupAttachmentMod.TargetGroupAttachment {
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
  /* static members */
  object TargetGroupAttachment {
    
    @JSImport("@pulumi/aws/lb", "TargetGroupAttachment")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing TargetGroupAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.lbTargetGroupAttachmentMod.TargetGroupAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.lbTargetGroupAttachmentMod.TargetGroupAttachment]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.lbTargetGroupAttachmentMod.TargetGroupAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.lbTargetGroupAttachmentMod.TargetGroupAttachment]
    @scala.inline
    def get(name: String, id: Input[ID], state: TargetGroupAttachmentState): typings.pulumiAws.lbTargetGroupAttachmentMod.TargetGroupAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.lbTargetGroupAttachmentMod.TargetGroupAttachment]
    @scala.inline
    def get(name: String, id: Input[ID], state: TargetGroupAttachmentState, opts: CustomResourceOptions): typings.pulumiAws.lbTargetGroupAttachmentMod.TargetGroupAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.lbTargetGroupAttachmentMod.TargetGroupAttachment]
    
    /**
      * Returns true if the given object is an instance of TargetGroupAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lb/targetGroupAttachment.TargetGroupAttachment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/lb/targetGroupAttachment.TargetGroupAttachment */ Boolean]
  }
  
  @scala.inline
  def getListener(): js.Promise[GetListenerResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getListener")().asInstanceOf[js.Promise[GetListenerResult]]
  @scala.inline
  def getListener(args: Unit, opts: InvokeOptions): js.Promise[GetListenerResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getListener")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetListenerResult]]
  @scala.inline
  def getListener(args: GetListenerArgs): js.Promise[GetListenerResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getListener")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetListenerResult]]
  @scala.inline
  def getListener(args: GetListenerArgs, opts: InvokeOptions): js.Promise[GetListenerResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getListener")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetListenerResult]]
  
  @scala.inline
  def getLoadBalancer(): js.Promise[GetLoadBalancerResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoadBalancer")().asInstanceOf[js.Promise[GetLoadBalancerResult]]
  @scala.inline
  def getLoadBalancer(args: Unit, opts: InvokeOptions): js.Promise[GetLoadBalancerResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLoadBalancer")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetLoadBalancerResult]]
  @scala.inline
  def getLoadBalancer(args: GetLoadBalancerArgs): js.Promise[GetLoadBalancerResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoadBalancer")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetLoadBalancerResult]]
  @scala.inline
  def getLoadBalancer(args: GetLoadBalancerArgs, opts: InvokeOptions): js.Promise[GetLoadBalancerResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLoadBalancer")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetLoadBalancerResult]]
  
  @scala.inline
  def getTargetGroup(): js.Promise[GetTargetGroupResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTargetGroup")().asInstanceOf[js.Promise[GetTargetGroupResult]]
  @scala.inline
  def getTargetGroup(args: Unit, opts: InvokeOptions): js.Promise[GetTargetGroupResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTargetGroup")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetTargetGroupResult]]
  @scala.inline
  def getTargetGroup(args: GetTargetGroupArgs): js.Promise[GetTargetGroupResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTargetGroup")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetTargetGroupResult]]
  @scala.inline
  def getTargetGroup(args: GetTargetGroupArgs, opts: InvokeOptions): js.Promise[GetTargetGroupResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTargetGroup")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetTargetGroupResult]]
}
