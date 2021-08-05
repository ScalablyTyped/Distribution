package typings.pulumiAws

import typings.pulumiAws.appCookieStickinessPolicyMod.AppCookieStickinessPolicyArgs
import typings.pulumiAws.appCookieStickinessPolicyMod.AppCookieStickinessPolicyState
import typings.pulumiAws.elasticloadbalancingAttachmentMod.AttachmentArgs
import typings.pulumiAws.elasticloadbalancingAttachmentMod.AttachmentState
import typings.pulumiAws.elasticloadbalancingGetLoadBalancerMod.GetLoadBalancerArgs
import typings.pulumiAws.elasticloadbalancingGetLoadBalancerMod.GetLoadBalancerResult
import typings.pulumiAws.elasticloadbalancingGetServiceAccountMod.GetServiceAccountArgs
import typings.pulumiAws.elasticloadbalancingGetServiceAccountMod.GetServiceAccountResult
import typings.pulumiAws.elasticloadbalancingLoadBalancerMod.LoadBalancerArgs
import typings.pulumiAws.elasticloadbalancingLoadBalancerMod.LoadBalancerState
import typings.pulumiAws.getHostedZoneIdMod.GetHostedZoneIdArgs
import typings.pulumiAws.getHostedZoneIdMod.GetHostedZoneIdResult
import typings.pulumiAws.listenerPolicyMod.ListenerPolicyArgs
import typings.pulumiAws.listenerPolicyMod.ListenerPolicyState
import typings.pulumiAws.loadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicyArgs
import typings.pulumiAws.loadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicyState
import typings.pulumiAws.loadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicyArgs
import typings.pulumiAws.loadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicyState
import typings.pulumiAws.loadBalancerPolicyMod.LoadBalancerPolicyArgs
import typings.pulumiAws.loadBalancerPolicyMod.LoadBalancerPolicyState
import typings.pulumiAws.sslNegotiationPolicyMod.SslNegotiationPolicyArgs
import typings.pulumiAws.sslNegotiationPolicyMod.SslNegotiationPolicyState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elasticloadbalancingMod {
  
  @JSImport("@pulumi/aws/elasticloadbalancing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws/elasticloadbalancing", "AppCookieStickinessPolicy")
  @js.native
  class AppCookieStickinessPolicy protected ()
    extends typings.pulumiAws.appCookieStickinessPolicyMod.AppCookieStickinessPolicy {
    /**
      * Create a AppCookieStickinessPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.elasticloadbalancing.AppCookieStickinessPolicy has been deprecated in favor of aws.elb.AppCookieStickinessPolicy */
    def this(name: String, args: AppCookieStickinessPolicyArgs) = this()
    def this(name: String, args: AppCookieStickinessPolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object AppCookieStickinessPolicy {
    
    @JSImport("@pulumi/aws/elasticloadbalancing", "AppCookieStickinessPolicy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing AppCookieStickinessPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.appCookieStickinessPolicyMod.AppCookieStickinessPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.appCookieStickinessPolicyMod.AppCookieStickinessPolicy]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.appCookieStickinessPolicyMod.AppCookieStickinessPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.appCookieStickinessPolicyMod.AppCookieStickinessPolicy]
    inline def get(name: String, id: Input[ID], state: AppCookieStickinessPolicyState): typings.pulumiAws.appCookieStickinessPolicyMod.AppCookieStickinessPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.appCookieStickinessPolicyMod.AppCookieStickinessPolicy]
    inline def get(name: String, id: Input[ID], state: AppCookieStickinessPolicyState, opts: CustomResourceOptions): typings.pulumiAws.appCookieStickinessPolicyMod.AppCookieStickinessPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.appCookieStickinessPolicyMod.AppCookieStickinessPolicy]
    
    /**
      * Returns true if the given object is an instance of AppCookieStickinessPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancing/appCookieStickinessPolicy.AppCookieStickinessPolicy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/elasticloadbalancing/appCookieStickinessPolicy.AppCookieStickinessPolicy */ Boolean]
  }
  
  @JSImport("@pulumi/aws/elasticloadbalancing", "Attachment")
  @js.native
  class Attachment protected ()
    extends typings.pulumiAws.elasticloadbalancingAttachmentMod.Attachment {
    /**
      * Create a Attachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.elasticloadbalancing.Attachment has been deprecated in favor of aws.elb.Attachment */
    def this(name: String, args: AttachmentArgs) = this()
    def this(name: String, args: AttachmentArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Attachment {
    
    @JSImport("@pulumi/aws/elasticloadbalancing", "Attachment")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Attachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.elasticloadbalancingAttachmentMod.Attachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.elasticloadbalancingAttachmentMod.Attachment]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.elasticloadbalancingAttachmentMod.Attachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.elasticloadbalancingAttachmentMod.Attachment]
    inline def get(name: String, id: Input[ID], state: AttachmentState): typings.pulumiAws.elasticloadbalancingAttachmentMod.Attachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.elasticloadbalancingAttachmentMod.Attachment]
    inline def get(name: String, id: Input[ID], state: AttachmentState, opts: CustomResourceOptions): typings.pulumiAws.elasticloadbalancingAttachmentMod.Attachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.elasticloadbalancingAttachmentMod.Attachment]
    
    /**
      * Returns true if the given object is an instance of Attachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancing/attachment.Attachment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/elasticloadbalancing/attachment.Attachment */ Boolean]
  }
  
  @JSImport("@pulumi/aws/elasticloadbalancing", "ListenerPolicy")
  @js.native
  class ListenerPolicy protected ()
    extends typings.pulumiAws.listenerPolicyMod.ListenerPolicy {
    /**
      * Create a ListenerPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.elasticloadbalancing.ListenerPolicy has been deprecated in favor of aws.elb.ListenerPolicy */
    def this(name: String, args: ListenerPolicyArgs) = this()
    def this(name: String, args: ListenerPolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ListenerPolicy {
    
    @JSImport("@pulumi/aws/elasticloadbalancing", "ListenerPolicy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ListenerPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.listenerPolicyMod.ListenerPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.listenerPolicyMod.ListenerPolicy]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.listenerPolicyMod.ListenerPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.listenerPolicyMod.ListenerPolicy]
    inline def get(name: String, id: Input[ID], state: ListenerPolicyState): typings.pulumiAws.listenerPolicyMod.ListenerPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.listenerPolicyMod.ListenerPolicy]
    inline def get(name: String, id: Input[ID], state: ListenerPolicyState, opts: CustomResourceOptions): typings.pulumiAws.listenerPolicyMod.ListenerPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.listenerPolicyMod.ListenerPolicy]
    
    /**
      * Returns true if the given object is an instance of ListenerPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancing/listenerPolicy.ListenerPolicy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/elasticloadbalancing/listenerPolicy.ListenerPolicy */ Boolean]
  }
  
  @JSImport("@pulumi/aws/elasticloadbalancing", "LoadBalancer")
  @js.native
  class LoadBalancer protected ()
    extends typings.pulumiAws.elasticloadbalancingLoadBalancerMod.LoadBalancer {
    /**
      * Create a LoadBalancer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.elasticloadbalancing.LoadBalancer has been deprecated in favor of aws.elb.LoadBalancer */
    def this(name: String, args: LoadBalancerArgs) = this()
    def this(name: String, args: LoadBalancerArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object LoadBalancer {
    
    @JSImport("@pulumi/aws/elasticloadbalancing", "LoadBalancer")
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
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.elasticloadbalancingLoadBalancerMod.LoadBalancer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.elasticloadbalancingLoadBalancerMod.LoadBalancer]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.elasticloadbalancingLoadBalancerMod.LoadBalancer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.elasticloadbalancingLoadBalancerMod.LoadBalancer]
    inline def get(name: String, id: Input[ID], state: LoadBalancerState): typings.pulumiAws.elasticloadbalancingLoadBalancerMod.LoadBalancer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.elasticloadbalancingLoadBalancerMod.LoadBalancer]
    inline def get(name: String, id: Input[ID], state: LoadBalancerState, opts: CustomResourceOptions): typings.pulumiAws.elasticloadbalancingLoadBalancerMod.LoadBalancer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.elasticloadbalancingLoadBalancerMod.LoadBalancer]
    
    /**
      * Returns true if the given object is an instance of LoadBalancer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancing/loadBalancer.LoadBalancer */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/elasticloadbalancing/loadBalancer.LoadBalancer */ Boolean]
  }
  
  @JSImport("@pulumi/aws/elasticloadbalancing", "LoadBalancerBackendServerPolicy")
  @js.native
  class LoadBalancerBackendServerPolicy protected ()
    extends typings.pulumiAws.loadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicy {
    /**
      * Create a LoadBalancerBackendServerPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.elasticloadbalancing.LoadBalancerBackendServerPolicy has been deprecated in favor of aws.elb.LoadBalancerBackendServerPolicy */
    def this(name: String, args: LoadBalancerBackendServerPolicyArgs) = this()
    def this(name: String, args: LoadBalancerBackendServerPolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object LoadBalancerBackendServerPolicy {
    
    @JSImport("@pulumi/aws/elasticloadbalancing", "LoadBalancerBackendServerPolicy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing LoadBalancerBackendServerPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.loadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.loadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicy]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.loadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.loadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicy]
    inline def get(name: String, id: Input[ID], state: LoadBalancerBackendServerPolicyState): typings.pulumiAws.loadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.loadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicy]
    inline def get(
      name: String,
      id: Input[ID],
      state: LoadBalancerBackendServerPolicyState,
      opts: CustomResourceOptions
    ): typings.pulumiAws.loadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.loadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicy]
    
    /**
      * Returns true if the given object is an instance of LoadBalancerBackendServerPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancing/loadBalancerBackendServerPolicy.LoadBalancerBackendServerPolicy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/elasticloadbalancing/loadBalancerBackendServerPolicy.LoadBalancerBackendServerPolicy */ Boolean]
  }
  
  @JSImport("@pulumi/aws/elasticloadbalancing", "LoadBalancerCookieStickinessPolicy")
  @js.native
  class LoadBalancerCookieStickinessPolicy protected ()
    extends typings.pulumiAws.loadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicy {
    /**
      * Create a LoadBalancerCookieStickinessPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.elasticloadbalancing.LoadBalancerCookieStickinessPolicy has been deprecated in favor of aws.elb.LoadBalancerCookieStickinessPolicy */
    def this(name: String, args: LoadBalancerCookieStickinessPolicyArgs) = this()
    def this(name: String, args: LoadBalancerCookieStickinessPolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object LoadBalancerCookieStickinessPolicy {
    
    @JSImport("@pulumi/aws/elasticloadbalancing", "LoadBalancerCookieStickinessPolicy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing LoadBalancerCookieStickinessPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.loadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.loadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicy]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.loadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.loadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicy]
    inline def get(name: String, id: Input[ID], state: LoadBalancerCookieStickinessPolicyState): typings.pulumiAws.loadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.loadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicy]
    inline def get(
      name: String,
      id: Input[ID],
      state: LoadBalancerCookieStickinessPolicyState,
      opts: CustomResourceOptions
    ): typings.pulumiAws.loadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.loadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicy]
    
    /**
      * Returns true if the given object is an instance of LoadBalancerCookieStickinessPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancing/loadBalancerCookieStickinessPolicy.LoadBalancerCookieStickinessPolicy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/elasticloadbalancing/loadBalancerCookieStickinessPolicy.LoadBalancerCookieStickinessPolicy */ Boolean]
  }
  
  @JSImport("@pulumi/aws/elasticloadbalancing", "LoadBalancerPolicy")
  @js.native
  class LoadBalancerPolicy protected ()
    extends typings.pulumiAws.loadBalancerPolicyMod.LoadBalancerPolicy {
    /**
      * Create a LoadBalancerPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.elasticloadbalancing.LoadBalancerPolicy has been deprecated in favor of aws.elb.LoadBalancerPolicy */
    def this(name: String, args: LoadBalancerPolicyArgs) = this()
    def this(name: String, args: LoadBalancerPolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object LoadBalancerPolicy {
    
    @JSImport("@pulumi/aws/elasticloadbalancing", "LoadBalancerPolicy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing LoadBalancerPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.loadBalancerPolicyMod.LoadBalancerPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.loadBalancerPolicyMod.LoadBalancerPolicy]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.loadBalancerPolicyMod.LoadBalancerPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.loadBalancerPolicyMod.LoadBalancerPolicy]
    inline def get(name: String, id: Input[ID], state: LoadBalancerPolicyState): typings.pulumiAws.loadBalancerPolicyMod.LoadBalancerPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.loadBalancerPolicyMod.LoadBalancerPolicy]
    inline def get(name: String, id: Input[ID], state: LoadBalancerPolicyState, opts: CustomResourceOptions): typings.pulumiAws.loadBalancerPolicyMod.LoadBalancerPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.loadBalancerPolicyMod.LoadBalancerPolicy]
    
    /**
      * Returns true if the given object is an instance of LoadBalancerPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancing/loadBalancerPolicy.LoadBalancerPolicy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/elasticloadbalancing/loadBalancerPolicy.LoadBalancerPolicy */ Boolean]
  }
  
  @JSImport("@pulumi/aws/elasticloadbalancing", "SslNegotiationPolicy")
  @js.native
  class SslNegotiationPolicy protected ()
    extends typings.pulumiAws.sslNegotiationPolicyMod.SslNegotiationPolicy {
    /**
      * Create a SslNegotiationPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.elasticloadbalancing.SslNegotiationPolicy has been deprecated in favor of aws.elb.SslNegotiationPolicy */
    def this(name: String, args: SslNegotiationPolicyArgs) = this()
    def this(name: String, args: SslNegotiationPolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object SslNegotiationPolicy {
    
    @JSImport("@pulumi/aws/elasticloadbalancing", "SslNegotiationPolicy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing SslNegotiationPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.sslNegotiationPolicyMod.SslNegotiationPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.sslNegotiationPolicyMod.SslNegotiationPolicy]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.sslNegotiationPolicyMod.SslNegotiationPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.sslNegotiationPolicyMod.SslNegotiationPolicy]
    inline def get(name: String, id: Input[ID], state: SslNegotiationPolicyState): typings.pulumiAws.sslNegotiationPolicyMod.SslNegotiationPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.sslNegotiationPolicyMod.SslNegotiationPolicy]
    inline def get(name: String, id: Input[ID], state: SslNegotiationPolicyState, opts: CustomResourceOptions): typings.pulumiAws.sslNegotiationPolicyMod.SslNegotiationPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.sslNegotiationPolicyMod.SslNegotiationPolicy]
    
    /**
      * Returns true if the given object is an instance of SslNegotiationPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancing/sslNegotiationPolicy.SslNegotiationPolicy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/elasticloadbalancing/sslNegotiationPolicy.SslNegotiationPolicy */ Boolean]
  }
  
  inline def getHostedZoneId(): js.Promise[GetHostedZoneIdResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHostedZoneId")().asInstanceOf[js.Promise[GetHostedZoneIdResult]]
  inline def getHostedZoneId(args: Unit, opts: InvokeOptions): js.Promise[GetHostedZoneIdResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHostedZoneId")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetHostedZoneIdResult]]
  inline def getHostedZoneId(args: GetHostedZoneIdArgs): js.Promise[GetHostedZoneIdResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHostedZoneId")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetHostedZoneIdResult]]
  inline def getHostedZoneId(args: GetHostedZoneIdArgs, opts: InvokeOptions): js.Promise[GetHostedZoneIdResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHostedZoneId")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetHostedZoneIdResult]]
  
  inline def getLoadBalancer(args: GetLoadBalancerArgs): js.Promise[GetLoadBalancerResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoadBalancer")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetLoadBalancerResult]]
  inline def getLoadBalancer(args: GetLoadBalancerArgs, opts: InvokeOptions): js.Promise[GetLoadBalancerResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLoadBalancer")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetLoadBalancerResult]]
  
  inline def getServiceAccount(): js.Promise[GetServiceAccountResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getServiceAccount")().asInstanceOf[js.Promise[GetServiceAccountResult]]
  inline def getServiceAccount(args: Unit, opts: InvokeOptions): js.Promise[GetServiceAccountResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getServiceAccount")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetServiceAccountResult]]
  inline def getServiceAccount(args: GetServiceAccountArgs): js.Promise[GetServiceAccountResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getServiceAccount")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetServiceAccountResult]]
  inline def getServiceAccount(args: GetServiceAccountArgs, opts: InvokeOptions): js.Promise[GetServiceAccountResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getServiceAccount")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetServiceAccountResult]]
}
