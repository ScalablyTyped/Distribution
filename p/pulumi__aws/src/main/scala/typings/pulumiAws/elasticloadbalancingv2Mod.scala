package typings.pulumiAws

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elasticloadbalancingv2Mod {
  
  @JSImport("@pulumi/aws/elasticloadbalancingv2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws/elasticloadbalancingv2", "Listener")
  @js.native
  class Listener protected ()
    extends typings.pulumiAws.elasticloadbalancingv2ListenerMod.Listener {
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
  /* static members */
  object Listener {
    
    @JSImport("@pulumi/aws/elasticloadbalancingv2", "Listener")
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
    def get(name: String, id: Input[ID]): typings.pulumiAws.elasticloadbalancingv2ListenerMod.Listener = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.elasticloadbalancingv2ListenerMod.Listener]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.elasticloadbalancingv2ListenerMod.Listener = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.elasticloadbalancingv2ListenerMod.Listener]
    @scala.inline
    def get(name: String, id: Input[ID], state: ListenerState): typings.pulumiAws.elasticloadbalancingv2ListenerMod.Listener = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.elasticloadbalancingv2ListenerMod.Listener]
    @scala.inline
    def get(name: String, id: Input[ID], state: ListenerState, opts: CustomResourceOptions): typings.pulumiAws.elasticloadbalancingv2ListenerMod.Listener = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.elasticloadbalancingv2ListenerMod.Listener]
    
    /**
      * Returns true if the given object is an instance of Listener.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancingv2/listener.Listener */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/elasticloadbalancingv2/listener.Listener */ Boolean]
  }
  
  @JSImport("@pulumi/aws/elasticloadbalancingv2", "ListenerCertificate")
  @js.native
  class ListenerCertificate protected ()
    extends typings.pulumiAws.elasticloadbalancingv2ListenerCertificateMod.ListenerCertificate {
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
  /* static members */
  object ListenerCertificate {
    
    @JSImport("@pulumi/aws/elasticloadbalancingv2", "ListenerCertificate")
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
    def get(name: String, id: Input[ID]): typings.pulumiAws.elasticloadbalancingv2ListenerCertificateMod.ListenerCertificate = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.elasticloadbalancingv2ListenerCertificateMod.ListenerCertificate]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.elasticloadbalancingv2ListenerCertificateMod.ListenerCertificate = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.elasticloadbalancingv2ListenerCertificateMod.ListenerCertificate]
    @scala.inline
    def get(name: String, id: Input[ID], state: ListenerCertificateState): typings.pulumiAws.elasticloadbalancingv2ListenerCertificateMod.ListenerCertificate = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.elasticloadbalancingv2ListenerCertificateMod.ListenerCertificate]
    @scala.inline
    def get(name: String, id: Input[ID], state: ListenerCertificateState, opts: CustomResourceOptions): typings.pulumiAws.elasticloadbalancingv2ListenerCertificateMod.ListenerCertificate = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.elasticloadbalancingv2ListenerCertificateMod.ListenerCertificate]
    
    /**
      * Returns true if the given object is an instance of ListenerCertificate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancingv2/listenerCertificate.ListenerCertificate */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/elasticloadbalancingv2/listenerCertificate.ListenerCertificate */ Boolean]
  }
  
  @JSImport("@pulumi/aws/elasticloadbalancingv2", "ListenerRule")
  @js.native
  class ListenerRule protected ()
    extends typings.pulumiAws.elasticloadbalancingv2ListenerRuleMod.ListenerRule {
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
  /* static members */
  object ListenerRule {
    
    @JSImport("@pulumi/aws/elasticloadbalancingv2", "ListenerRule")
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
    def get(name: String, id: Input[ID]): typings.pulumiAws.elasticloadbalancingv2ListenerRuleMod.ListenerRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.elasticloadbalancingv2ListenerRuleMod.ListenerRule]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.elasticloadbalancingv2ListenerRuleMod.ListenerRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.elasticloadbalancingv2ListenerRuleMod.ListenerRule]
    @scala.inline
    def get(name: String, id: Input[ID], state: ListenerRuleState): typings.pulumiAws.elasticloadbalancingv2ListenerRuleMod.ListenerRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.elasticloadbalancingv2ListenerRuleMod.ListenerRule]
    @scala.inline
    def get(name: String, id: Input[ID], state: ListenerRuleState, opts: CustomResourceOptions): typings.pulumiAws.elasticloadbalancingv2ListenerRuleMod.ListenerRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.elasticloadbalancingv2ListenerRuleMod.ListenerRule]
    
    /**
      * Returns true if the given object is an instance of ListenerRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancingv2/listenerRule.ListenerRule */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/elasticloadbalancingv2/listenerRule.ListenerRule */ Boolean]
  }
  
  @JSImport("@pulumi/aws/elasticloadbalancingv2", "LoadBalancer")
  @js.native
  class LoadBalancer protected ()
    extends typings.pulumiAws.elasticloadbalancingv2LoadBalancerMod.LoadBalancer {
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
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: LoadBalancerArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object LoadBalancer {
    
    @JSImport("@pulumi/aws/elasticloadbalancingv2", "LoadBalancer")
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
    def get(name: String, id: Input[ID]): typings.pulumiAws.elasticloadbalancingv2LoadBalancerMod.LoadBalancer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.elasticloadbalancingv2LoadBalancerMod.LoadBalancer]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.elasticloadbalancingv2LoadBalancerMod.LoadBalancer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.elasticloadbalancingv2LoadBalancerMod.LoadBalancer]
    @scala.inline
    def get(name: String, id: Input[ID], state: LoadBalancerState): typings.pulumiAws.elasticloadbalancingv2LoadBalancerMod.LoadBalancer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.elasticloadbalancingv2LoadBalancerMod.LoadBalancer]
    @scala.inline
    def get(name: String, id: Input[ID], state: LoadBalancerState, opts: CustomResourceOptions): typings.pulumiAws.elasticloadbalancingv2LoadBalancerMod.LoadBalancer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.elasticloadbalancingv2LoadBalancerMod.LoadBalancer]
    
    /**
      * Returns true if the given object is an instance of LoadBalancer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancingv2/loadBalancer.LoadBalancer */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/elasticloadbalancingv2/loadBalancer.LoadBalancer */ Boolean]
  }
  
  @JSImport("@pulumi/aws/elasticloadbalancingv2", "TargetGroup")
  @js.native
  class TargetGroup protected ()
    extends typings.pulumiAws.elasticloadbalancingv2TargetGroupMod.TargetGroup {
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
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: TargetGroupArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object TargetGroup {
    
    @JSImport("@pulumi/aws/elasticloadbalancingv2", "TargetGroup")
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
    def get(name: String, id: Input[ID]): typings.pulumiAws.elasticloadbalancingv2TargetGroupMod.TargetGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.elasticloadbalancingv2TargetGroupMod.TargetGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.elasticloadbalancingv2TargetGroupMod.TargetGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.elasticloadbalancingv2TargetGroupMod.TargetGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: TargetGroupState): typings.pulumiAws.elasticloadbalancingv2TargetGroupMod.TargetGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.elasticloadbalancingv2TargetGroupMod.TargetGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: TargetGroupState, opts: CustomResourceOptions): typings.pulumiAws.elasticloadbalancingv2TargetGroupMod.TargetGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.elasticloadbalancingv2TargetGroupMod.TargetGroup]
    
    /**
      * Returns true if the given object is an instance of TargetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancingv2/targetGroup.TargetGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/elasticloadbalancingv2/targetGroup.TargetGroup */ Boolean]
  }
  
  @JSImport("@pulumi/aws/elasticloadbalancingv2", "TargetGroupAttachment")
  @js.native
  class TargetGroupAttachment protected ()
    extends typings.pulumiAws.elasticloadbalancingv2TargetGroupAttachmentMod.TargetGroupAttachment {
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
  /* static members */
  object TargetGroupAttachment {
    
    @JSImport("@pulumi/aws/elasticloadbalancingv2", "TargetGroupAttachment")
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
    def get(name: String, id: Input[ID]): typings.pulumiAws.elasticloadbalancingv2TargetGroupAttachmentMod.TargetGroupAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.elasticloadbalancingv2TargetGroupAttachmentMod.TargetGroupAttachment]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.elasticloadbalancingv2TargetGroupAttachmentMod.TargetGroupAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.elasticloadbalancingv2TargetGroupAttachmentMod.TargetGroupAttachment]
    @scala.inline
    def get(name: String, id: Input[ID], state: TargetGroupAttachmentState): typings.pulumiAws.elasticloadbalancingv2TargetGroupAttachmentMod.TargetGroupAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.elasticloadbalancingv2TargetGroupAttachmentMod.TargetGroupAttachment]
    @scala.inline
    def get(name: String, id: Input[ID], state: TargetGroupAttachmentState, opts: CustomResourceOptions): typings.pulumiAws.elasticloadbalancingv2TargetGroupAttachmentMod.TargetGroupAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.elasticloadbalancingv2TargetGroupAttachmentMod.TargetGroupAttachment]
    
    /**
      * Returns true if the given object is an instance of TargetGroupAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancingv2/targetGroupAttachment.TargetGroupAttachment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/elasticloadbalancingv2/targetGroupAttachment.TargetGroupAttachment */ Boolean]
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
