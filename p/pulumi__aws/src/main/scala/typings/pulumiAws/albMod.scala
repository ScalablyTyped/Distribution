package typings.pulumiAws

import typings.pulumiAws.enumsAlbMod.IpAddressType
import typings.pulumiAws.enumsAlbMod.LoadBalancerType
import typings.pulumiAws.getListenerMod.GetListenerArgs
import typings.pulumiAws.getListenerMod.GetListenerResult
import typings.pulumiAws.getLoadBalancerMod.GetLoadBalancerArgs
import typings.pulumiAws.getLoadBalancerMod.GetLoadBalancerResult
import typings.pulumiAws.getTargetGroupMod.GetTargetGroupArgs
import typings.pulumiAws.getTargetGroupMod.GetTargetGroupResult
import typings.pulumiAws.listenerCertificateMod.ListenerCertificateArgs
import typings.pulumiAws.listenerCertificateMod.ListenerCertificateState
import typings.pulumiAws.listenerMod.ListenerArgs
import typings.pulumiAws.listenerMod.ListenerState
import typings.pulumiAws.listenerRuleMod.ListenerRuleArgs
import typings.pulumiAws.listenerRuleMod.ListenerRuleState
import typings.pulumiAws.loadBalancerMod.LoadBalancerArgs
import typings.pulumiAws.loadBalancerMod.LoadBalancerState
import typings.pulumiAws.pulumiAwsStrings.application
import typings.pulumiAws.pulumiAwsStrings.dualstack
import typings.pulumiAws.pulumiAwsStrings.ipv4
import typings.pulumiAws.pulumiAwsStrings.network
import typings.pulumiAws.targetGroupAttachmentMod.TargetGroupAttachmentArgs
import typings.pulumiAws.targetGroupAttachmentMod.TargetGroupAttachmentState
import typings.pulumiAws.targetGroupMod.TargetGroupArgs
import typings.pulumiAws.targetGroupMod.TargetGroupState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object albMod {
  
  @JSImport("@pulumi/aws/alb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws/alb", "ApplicationLoadBalancer")
  @js.native
  val ApplicationLoadBalancer: LoadBalancerType = js.native
  
  @JSImport("@pulumi/aws/alb", "Dualstack")
  @js.native
  val Dualstack: IpAddressType = js.native
  
  object IpAddressType {
    
    @JSImport("@pulumi/aws/alb", "IpAddressType.Dualstack")
    @js.native
    val Dualstack: dualstack = js.native
    
    @JSImport("@pulumi/aws/alb", "IpAddressType.Ipv4")
    @js.native
    val Ipv4: ipv4 = js.native
  }
  
  @JSImport("@pulumi/aws/alb", "Ipv4")
  @js.native
  val Ipv4: IpAddressType = js.native
  
  @JSImport("@pulumi/aws/alb", "Listener")
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
  /* static members */
  object Listener {
    
    @JSImport("@pulumi/aws/alb", "Listener")
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
    def get(name: String, id: Input[ID]): typings.pulumiAws.listenerMod.Listener = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.listenerMod.Listener]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.listenerMod.Listener = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.listenerMod.Listener]
    @scala.inline
    def get(name: String, id: Input[ID], state: ListenerState): typings.pulumiAws.listenerMod.Listener = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.listenerMod.Listener]
    @scala.inline
    def get(name: String, id: Input[ID], state: ListenerState, opts: CustomResourceOptions): typings.pulumiAws.listenerMod.Listener = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.listenerMod.Listener]
    
    /**
      * Returns true if the given object is an instance of Listener.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/alb/listener.Listener */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/alb/listener.Listener */ Boolean]
  }
  
  @JSImport("@pulumi/aws/alb", "ListenerCertificate")
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
  /* static members */
  object ListenerCertificate {
    
    @JSImport("@pulumi/aws/alb", "ListenerCertificate")
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
    def get(name: String, id: Input[ID]): typings.pulumiAws.listenerCertificateMod.ListenerCertificate = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.listenerCertificateMod.ListenerCertificate]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.listenerCertificateMod.ListenerCertificate = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.listenerCertificateMod.ListenerCertificate]
    @scala.inline
    def get(name: String, id: Input[ID], state: ListenerCertificateState): typings.pulumiAws.listenerCertificateMod.ListenerCertificate = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.listenerCertificateMod.ListenerCertificate]
    @scala.inline
    def get(name: String, id: Input[ID], state: ListenerCertificateState, opts: CustomResourceOptions): typings.pulumiAws.listenerCertificateMod.ListenerCertificate = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.listenerCertificateMod.ListenerCertificate]
    
    /**
      * Returns true if the given object is an instance of ListenerCertificate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/alb/listenerCertificate.ListenerCertificate */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/alb/listenerCertificate.ListenerCertificate */ Boolean]
  }
  
  @JSImport("@pulumi/aws/alb", "ListenerRule")
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
  /* static members */
  object ListenerRule {
    
    @JSImport("@pulumi/aws/alb", "ListenerRule")
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
    def get(name: String, id: Input[ID]): typings.pulumiAws.listenerRuleMod.ListenerRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.listenerRuleMod.ListenerRule]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.listenerRuleMod.ListenerRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.listenerRuleMod.ListenerRule]
    @scala.inline
    def get(name: String, id: Input[ID], state: ListenerRuleState): typings.pulumiAws.listenerRuleMod.ListenerRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.listenerRuleMod.ListenerRule]
    @scala.inline
    def get(name: String, id: Input[ID], state: ListenerRuleState, opts: CustomResourceOptions): typings.pulumiAws.listenerRuleMod.ListenerRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.listenerRuleMod.ListenerRule]
    
    /**
      * Returns true if the given object is an instance of ListenerRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/alb/listenerRule.ListenerRule */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/alb/listenerRule.ListenerRule */ Boolean]
  }
  
  @JSImport("@pulumi/aws/alb", "LoadBalancer")
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
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: LoadBalancerArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object LoadBalancer {
    
    @JSImport("@pulumi/aws/alb", "LoadBalancer")
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
    def get(name: String, id: Input[ID]): typings.pulumiAws.loadBalancerMod.LoadBalancer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.loadBalancerMod.LoadBalancer]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.loadBalancerMod.LoadBalancer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.loadBalancerMod.LoadBalancer]
    @scala.inline
    def get(name: String, id: Input[ID], state: LoadBalancerState): typings.pulumiAws.loadBalancerMod.LoadBalancer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.loadBalancerMod.LoadBalancer]
    @scala.inline
    def get(name: String, id: Input[ID], state: LoadBalancerState, opts: CustomResourceOptions): typings.pulumiAws.loadBalancerMod.LoadBalancer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.loadBalancerMod.LoadBalancer]
    
    /**
      * Returns true if the given object is an instance of LoadBalancer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/alb/loadBalancer.LoadBalancer */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/alb/loadBalancer.LoadBalancer */ Boolean]
  }
  
  object LoadBalancerType {
    
    @JSImport("@pulumi/aws/alb", "LoadBalancerType.Application")
    @js.native
    val Application: application = js.native
    
    @JSImport("@pulumi/aws/alb", "LoadBalancerType.Network")
    @js.native
    val Network: network = js.native
  }
  
  @JSImport("@pulumi/aws/alb", "NetworkLoadBalancer")
  @js.native
  val NetworkLoadBalancer: LoadBalancerType = js.native
  
  @JSImport("@pulumi/aws/alb", "TargetGroup")
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
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: TargetGroupArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object TargetGroup {
    
    @JSImport("@pulumi/aws/alb", "TargetGroup")
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
    def get(name: String, id: Input[ID]): typings.pulumiAws.targetGroupMod.TargetGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.targetGroupMod.TargetGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.targetGroupMod.TargetGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.targetGroupMod.TargetGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: TargetGroupState): typings.pulumiAws.targetGroupMod.TargetGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.targetGroupMod.TargetGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: TargetGroupState, opts: CustomResourceOptions): typings.pulumiAws.targetGroupMod.TargetGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.targetGroupMod.TargetGroup]
    
    /**
      * Returns true if the given object is an instance of TargetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/alb/targetGroup.TargetGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/alb/targetGroup.TargetGroup */ Boolean]
  }
  
  @JSImport("@pulumi/aws/alb", "TargetGroupAttachment")
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
  /* static members */
  object TargetGroupAttachment {
    
    @JSImport("@pulumi/aws/alb", "TargetGroupAttachment")
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
    def get(name: String, id: Input[ID]): typings.pulumiAws.targetGroupAttachmentMod.TargetGroupAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.targetGroupAttachmentMod.TargetGroupAttachment]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.targetGroupAttachmentMod.TargetGroupAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.targetGroupAttachmentMod.TargetGroupAttachment]
    @scala.inline
    def get(name: String, id: Input[ID], state: TargetGroupAttachmentState): typings.pulumiAws.targetGroupAttachmentMod.TargetGroupAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.targetGroupAttachmentMod.TargetGroupAttachment]
    @scala.inline
    def get(name: String, id: Input[ID], state: TargetGroupAttachmentState, opts: CustomResourceOptions): typings.pulumiAws.targetGroupAttachmentMod.TargetGroupAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.targetGroupAttachmentMod.TargetGroupAttachment]
    
    /**
      * Returns true if the given object is an instance of TargetGroupAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/alb/targetGroupAttachment.TargetGroupAttachment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/alb/targetGroupAttachment.TargetGroupAttachment */ Boolean]
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
