package typings.atPulumiAws

import typings.atPulumiAws.elbAppCookieStickinessPolicyMod.AppCookieStickinessPolicyArgs
import typings.atPulumiAws.elbAppCookieStickinessPolicyMod.AppCookieStickinessPolicyState
import typings.atPulumiAws.elbAttachmentMod.AttachmentArgs
import typings.atPulumiAws.elbAttachmentMod.AttachmentState
import typings.atPulumiAws.elbGetHostedZoneIdMod.GetHostedZoneIdArgs
import typings.atPulumiAws.elbGetHostedZoneIdMod.GetHostedZoneIdResult
import typings.atPulumiAws.elbGetLoadBalancerMod.GetLoadBalancerArgs
import typings.atPulumiAws.elbGetLoadBalancerMod.GetLoadBalancerResult
import typings.atPulumiAws.elbGetServiceAccountMod.GetServiceAccountArgs
import typings.atPulumiAws.elbGetServiceAccountMod.GetServiceAccountResult
import typings.atPulumiAws.elbListenerPolicyMod.ListenerPolicyArgs
import typings.atPulumiAws.elbListenerPolicyMod.ListenerPolicyState
import typings.atPulumiAws.elbLoadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicyArgs
import typings.atPulumiAws.elbLoadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicyState
import typings.atPulumiAws.elbLoadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicyArgs
import typings.atPulumiAws.elbLoadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicyState
import typings.atPulumiAws.elbLoadBalancerMod.LoadBalancerArgs
import typings.atPulumiAws.elbLoadBalancerMod.LoadBalancerState
import typings.atPulumiAws.elbLoadBalancerPolicyMod.LoadBalancerPolicyArgs
import typings.atPulumiAws.elbLoadBalancerPolicyMod.LoadBalancerPolicyState
import typings.atPulumiAws.elbSslNegotiationPolicyMod.SslNegotiationPolicyArgs
import typings.atPulumiAws.elbSslNegotiationPolicyMod.SslNegotiationPolicyState
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elb", JSImport.Namespace)
@js.native
object elbMod extends js.Object {
  @js.native
  class AppCookieStickinessPolicy protected ()
    extends typings.atPulumiAws.elbAppCookieStickinessPolicyMod.AppCookieStickinessPolicy {
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
    extends typings.atPulumiAws.elbAttachmentMod.Attachment {
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
    extends typings.atPulumiAws.elbListenerPolicyMod.ListenerPolicy {
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
    extends typings.atPulumiAws.elbLoadBalancerMod.LoadBalancer {
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
    extends typings.atPulumiAws.elbLoadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicy {
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
    extends typings.atPulumiAws.elbLoadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicy {
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
    extends typings.atPulumiAws.elbLoadBalancerPolicyMod.LoadBalancerPolicy {
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
    extends typings.atPulumiAws.elbSslNegotiationPolicyMod.SslNegotiationPolicy {
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
  
  def getHostedZoneId(): js.Promise[GetHostedZoneIdResult] with GetHostedZoneIdResult = js.native
  def getHostedZoneId(args: GetHostedZoneIdArgs): js.Promise[GetHostedZoneIdResult] with GetHostedZoneIdResult = js.native
  def getHostedZoneId(args: GetHostedZoneIdArgs, opts: InvokeOptions): js.Promise[GetHostedZoneIdResult] with GetHostedZoneIdResult = js.native
  def getLoadBalancer(args: GetLoadBalancerArgs): js.Promise[GetLoadBalancerResult] with GetLoadBalancerResult = js.native
  def getLoadBalancer(args: GetLoadBalancerArgs, opts: InvokeOptions): js.Promise[GetLoadBalancerResult] with GetLoadBalancerResult = js.native
  def getServiceAccount(): js.Promise[GetServiceAccountResult] with GetServiceAccountResult = js.native
  def getServiceAccount(args: GetServiceAccountArgs): js.Promise[GetServiceAccountResult] with GetServiceAccountResult = js.native
  def getServiceAccount(args: GetServiceAccountArgs, opts: InvokeOptions): js.Promise[GetServiceAccountResult] with GetServiceAccountResult = js.native
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
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.elbAppCookieStickinessPolicyMod.AppCookieStickinessPolicy = js.native
    def get(name: String, id: Input[ID], state: AppCookieStickinessPolicyState): typings.atPulumiAws.elbAppCookieStickinessPolicyMod.AppCookieStickinessPolicy = js.native
    def get(name: String, id: Input[ID], state: AppCookieStickinessPolicyState, opts: CustomResourceOptions): typings.atPulumiAws.elbAppCookieStickinessPolicyMod.AppCookieStickinessPolicy = js.native
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
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.elbAttachmentMod.Attachment = js.native
    def get(name: String, id: Input[ID], state: AttachmentState): typings.atPulumiAws.elbAttachmentMod.Attachment = js.native
    def get(name: String, id: Input[ID], state: AttachmentState, opts: CustomResourceOptions): typings.atPulumiAws.elbAttachmentMod.Attachment = js.native
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
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.elbListenerPolicyMod.ListenerPolicy = js.native
    def get(name: String, id: Input[ID], state: ListenerPolicyState): typings.atPulumiAws.elbListenerPolicyMod.ListenerPolicy = js.native
    def get(name: String, id: Input[ID], state: ListenerPolicyState, opts: CustomResourceOptions): typings.atPulumiAws.elbListenerPolicyMod.ListenerPolicy = js.native
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
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.elbLoadBalancerMod.LoadBalancer = js.native
    def get(name: String, id: Input[ID], state: LoadBalancerState): typings.atPulumiAws.elbLoadBalancerMod.LoadBalancer = js.native
    def get(name: String, id: Input[ID], state: LoadBalancerState, opts: CustomResourceOptions): typings.atPulumiAws.elbLoadBalancerMod.LoadBalancer = js.native
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
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.elbLoadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicy = js.native
    def get(name: String, id: Input[ID], state: LoadBalancerBackendServerPolicyState): typings.atPulumiAws.elbLoadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicy = js.native
    def get(
      name: String,
      id: Input[ID],
      state: LoadBalancerBackendServerPolicyState,
      opts: CustomResourceOptions
    ): typings.atPulumiAws.elbLoadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicy = js.native
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
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.elbLoadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicy = js.native
    def get(name: String, id: Input[ID], state: LoadBalancerCookieStickinessPolicyState): typings.atPulumiAws.elbLoadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicy = js.native
    def get(
      name: String,
      id: Input[ID],
      state: LoadBalancerCookieStickinessPolicyState,
      opts: CustomResourceOptions
    ): typings.atPulumiAws.elbLoadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicy = js.native
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
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.elbLoadBalancerPolicyMod.LoadBalancerPolicy = js.native
    def get(name: String, id: Input[ID], state: LoadBalancerPolicyState): typings.atPulumiAws.elbLoadBalancerPolicyMod.LoadBalancerPolicy = js.native
    def get(name: String, id: Input[ID], state: LoadBalancerPolicyState, opts: CustomResourceOptions): typings.atPulumiAws.elbLoadBalancerPolicyMod.LoadBalancerPolicy = js.native
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
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.elbSslNegotiationPolicyMod.SslNegotiationPolicy = js.native
    def get(name: String, id: Input[ID], state: SslNegotiationPolicyState): typings.atPulumiAws.elbSslNegotiationPolicyMod.SslNegotiationPolicy = js.native
    def get(name: String, id: Input[ID], state: SslNegotiationPolicyState, opts: CustomResourceOptions): typings.atPulumiAws.elbSslNegotiationPolicyMod.SslNegotiationPolicy = js.native
    /**
      * Returns true if the given object is an instance of SslNegotiationPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elb/sslNegotiationPolicy.SslNegotiationPolicy */ Boolean = js.native
  }
  
}

