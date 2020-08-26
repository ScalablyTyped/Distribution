package typings.pulumiAws.mod

import typings.pulumiAws.elbAppCookieStickinessPolicyMod.AppCookieStickinessPolicyArgs
import typings.pulumiAws.elbAppCookieStickinessPolicyMod.AppCookieStickinessPolicyState
import typings.pulumiAws.elbAttachmentMod.AttachmentArgs
import typings.pulumiAws.elbAttachmentMod.AttachmentState
import typings.pulumiAws.elbGetHostedZoneIdMod.GetHostedZoneIdArgs
import typings.pulumiAws.elbGetHostedZoneIdMod.GetHostedZoneIdResult
import typings.pulumiAws.elbGetLoadBalancerMod.GetLoadBalancerArgs
import typings.pulumiAws.elbGetLoadBalancerMod.GetLoadBalancerResult
import typings.pulumiAws.elbGetServiceAccountMod.GetServiceAccountArgs
import typings.pulumiAws.elbGetServiceAccountMod.GetServiceAccountResult
import typings.pulumiAws.elbListenerPolicyMod.ListenerPolicyArgs
import typings.pulumiAws.elbListenerPolicyMod.ListenerPolicyState
import typings.pulumiAws.elbLoadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicyArgs
import typings.pulumiAws.elbLoadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicyState
import typings.pulumiAws.elbLoadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicyArgs
import typings.pulumiAws.elbLoadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicyState
import typings.pulumiAws.elbLoadBalancerMod.LoadBalancerArgs
import typings.pulumiAws.elbLoadBalancerMod.LoadBalancerState
import typings.pulumiAws.elbLoadBalancerPolicyMod.LoadBalancerPolicyArgs
import typings.pulumiAws.elbLoadBalancerPolicyMod.LoadBalancerPolicyState
import typings.pulumiAws.elbSslNegotiationPolicyMod.SslNegotiationPolicyArgs
import typings.pulumiAws.elbSslNegotiationPolicyMod.SslNegotiationPolicyState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "elb")
@js.native
object elb extends js.Object {
  @js.native
  class AppCookieStickinessPolicy protected ()
    extends typings.pulumiAws.elbMod.AppCookieStickinessPolicy {
    /**
      * Create a AppCookieStickinessPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AppCookieStickinessPolicyArgs) = this()
    def this(name: String, args: AppCookieStickinessPolicyArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Attachment protected ()
    extends typings.pulumiAws.elbMod.Attachment {
    /**
      * Create a Attachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AttachmentArgs) = this()
    def this(name: String, args: AttachmentArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ListenerPolicy protected ()
    extends typings.pulumiAws.elbMod.ListenerPolicy {
    /**
      * Create a ListenerPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ListenerPolicyArgs) = this()
    def this(name: String, args: ListenerPolicyArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class LoadBalancer protected ()
    extends typings.pulumiAws.elbMod.LoadBalancer {
    /**
      * Create a LoadBalancer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LoadBalancerArgs) = this()
    def this(name: String, args: LoadBalancerArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class LoadBalancerBackendServerPolicy protected ()
    extends typings.pulumiAws.elbMod.LoadBalancerBackendServerPolicy {
    /**
      * Create a LoadBalancerBackendServerPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LoadBalancerBackendServerPolicyArgs) = this()
    def this(name: String, args: LoadBalancerBackendServerPolicyArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class LoadBalancerCookieStickinessPolicy protected ()
    extends typings.pulumiAws.elbMod.LoadBalancerCookieStickinessPolicy {
    /**
      * Create a LoadBalancerCookieStickinessPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LoadBalancerCookieStickinessPolicyArgs) = this()
    def this(name: String, args: LoadBalancerCookieStickinessPolicyArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class LoadBalancerPolicy protected ()
    extends typings.pulumiAws.elbMod.LoadBalancerPolicy {
    /**
      * Create a LoadBalancerPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LoadBalancerPolicyArgs) = this()
    def this(name: String, args: LoadBalancerPolicyArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class SslNegotiationPolicy protected ()
    extends typings.pulumiAws.elbMod.SslNegotiationPolicy {
    /**
      * Create a SslNegotiationPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SslNegotiationPolicyArgs) = this()
    def this(name: String, args: SslNegotiationPolicyArgs, opts: CustomResourceOptions) = this()
  }
  
  def getHostedZoneId(): js.Promise[GetHostedZoneIdResult] = js.native
  def getHostedZoneId(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetHostedZoneIdResult] = js.native
  def getHostedZoneId(args: GetHostedZoneIdArgs): js.Promise[GetHostedZoneIdResult] = js.native
  def getHostedZoneId(args: GetHostedZoneIdArgs, opts: InvokeOptions): js.Promise[GetHostedZoneIdResult] = js.native
  def getLoadBalancer(args: GetLoadBalancerArgs): js.Promise[GetLoadBalancerResult] = js.native
  def getLoadBalancer(args: GetLoadBalancerArgs, opts: InvokeOptions): js.Promise[GetLoadBalancerResult] = js.native
  def getServiceAccount(): js.Promise[GetServiceAccountResult] = js.native
  def getServiceAccount(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetServiceAccountResult] = js.native
  def getServiceAccount(args: GetServiceAccountArgs): js.Promise[GetServiceAccountResult] = js.native
  def getServiceAccount(args: GetServiceAccountArgs, opts: InvokeOptions): js.Promise[GetServiceAccountResult] = js.native
  /* static members */
  @js.native
  object AppCookieStickinessPolicy extends js.Object {
    /**
      * Get an existing AppCookieStickinessPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.elbAppCookieStickinessPolicyMod.AppCookieStickinessPolicy = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.elbAppCookieStickinessPolicyMod.AppCookieStickinessPolicy = js.native
    def get(name: String, id: Input[ID], state: AppCookieStickinessPolicyState): typings.pulumiAws.elbAppCookieStickinessPolicyMod.AppCookieStickinessPolicy = js.native
    def get(name: String, id: Input[ID], state: AppCookieStickinessPolicyState, opts: CustomResourceOptions): typings.pulumiAws.elbAppCookieStickinessPolicyMod.AppCookieStickinessPolicy = js.native
    /**
      * Returns true if the given object is an instance of AppCookieStickinessPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elb/appCookieStickinessPolicy.AppCookieStickinessPolicy */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Attachment extends js.Object {
    /**
      * Get an existing Attachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.elbAttachmentMod.Attachment = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.elbAttachmentMod.Attachment = js.native
    def get(name: String, id: Input[ID], state: AttachmentState): typings.pulumiAws.elbAttachmentMod.Attachment = js.native
    def get(name: String, id: Input[ID], state: AttachmentState, opts: CustomResourceOptions): typings.pulumiAws.elbAttachmentMod.Attachment = js.native
    /**
      * Returns true if the given object is an instance of Attachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elb/attachment.Attachment */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ListenerPolicy extends js.Object {
    /**
      * Get an existing ListenerPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.elbListenerPolicyMod.ListenerPolicy = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.elbListenerPolicyMod.ListenerPolicy = js.native
    def get(name: String, id: Input[ID], state: ListenerPolicyState): typings.pulumiAws.elbListenerPolicyMod.ListenerPolicy = js.native
    def get(name: String, id: Input[ID], state: ListenerPolicyState, opts: CustomResourceOptions): typings.pulumiAws.elbListenerPolicyMod.ListenerPolicy = js.native
    /**
      * Returns true if the given object is an instance of ListenerPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elb/listenerPolicy.ListenerPolicy */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.pulumiAws.elbLoadBalancerMod.LoadBalancer = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.elbLoadBalancerMod.LoadBalancer = js.native
    def get(name: String, id: Input[ID], state: LoadBalancerState): typings.pulumiAws.elbLoadBalancerMod.LoadBalancer = js.native
    def get(name: String, id: Input[ID], state: LoadBalancerState, opts: CustomResourceOptions): typings.pulumiAws.elbLoadBalancerMod.LoadBalancer = js.native
    /**
      * Returns true if the given object is an instance of LoadBalancer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elb/loadBalancer.LoadBalancer */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object LoadBalancerBackendServerPolicy extends js.Object {
    /**
      * Get an existing LoadBalancerBackendServerPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.elbLoadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicy = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.elbLoadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicy = js.native
    def get(name: String, id: Input[ID], state: LoadBalancerBackendServerPolicyState): typings.pulumiAws.elbLoadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicy = js.native
    def get(
      name: String,
      id: Input[ID],
      state: LoadBalancerBackendServerPolicyState,
      opts: CustomResourceOptions
    ): typings.pulumiAws.elbLoadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicy = js.native
    /**
      * Returns true if the given object is an instance of LoadBalancerBackendServerPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elb/loadBalancerBackendServerPolicy.LoadBalancerBackendServerPolicy */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object LoadBalancerCookieStickinessPolicy extends js.Object {
    /**
      * Get an existing LoadBalancerCookieStickinessPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.elbLoadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicy = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.elbLoadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicy = js.native
    def get(name: String, id: Input[ID], state: LoadBalancerCookieStickinessPolicyState): typings.pulumiAws.elbLoadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicy = js.native
    def get(
      name: String,
      id: Input[ID],
      state: LoadBalancerCookieStickinessPolicyState,
      opts: CustomResourceOptions
    ): typings.pulumiAws.elbLoadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicy = js.native
    /**
      * Returns true if the given object is an instance of LoadBalancerCookieStickinessPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elb/loadBalancerCookieStickinessPolicy.LoadBalancerCookieStickinessPolicy */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object LoadBalancerPolicy extends js.Object {
    /**
      * Get an existing LoadBalancerPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.elbLoadBalancerPolicyMod.LoadBalancerPolicy = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.elbLoadBalancerPolicyMod.LoadBalancerPolicy = js.native
    def get(name: String, id: Input[ID], state: LoadBalancerPolicyState): typings.pulumiAws.elbLoadBalancerPolicyMod.LoadBalancerPolicy = js.native
    def get(name: String, id: Input[ID], state: LoadBalancerPolicyState, opts: CustomResourceOptions): typings.pulumiAws.elbLoadBalancerPolicyMod.LoadBalancerPolicy = js.native
    /**
      * Returns true if the given object is an instance of LoadBalancerPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elb/loadBalancerPolicy.LoadBalancerPolicy */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SslNegotiationPolicy extends js.Object {
    /**
      * Get an existing SslNegotiationPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.elbSslNegotiationPolicyMod.SslNegotiationPolicy = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.elbSslNegotiationPolicyMod.SslNegotiationPolicy = js.native
    def get(name: String, id: Input[ID], state: SslNegotiationPolicyState): typings.pulumiAws.elbSslNegotiationPolicyMod.SslNegotiationPolicy = js.native
    def get(name: String, id: Input[ID], state: SslNegotiationPolicyState, opts: CustomResourceOptions): typings.pulumiAws.elbSslNegotiationPolicyMod.SslNegotiationPolicy = js.native
    /**
      * Returns true if the given object is an instance of SslNegotiationPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elb/sslNegotiationPolicy.SslNegotiationPolicy */ Boolean = js.native
  }
  
}

