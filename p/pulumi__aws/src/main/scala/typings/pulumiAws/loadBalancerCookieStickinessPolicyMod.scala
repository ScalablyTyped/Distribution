package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadBalancerCookieStickinessPolicyMod {
  
  @JSImport("@pulumi/aws/elasticloadbalancing/loadBalancerCookieStickinessPolicy", "LoadBalancerCookieStickinessPolicy")
  @js.native
  class LoadBalancerCookieStickinessPolicy protected () extends CustomResource {
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
    
    /**
      * The time period after which
      * the session cookie should be considered stale, expressed in seconds.
      */
    val cookieExpirationPeriod: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The load balancer port to which the policy
      * should be applied. This must be an active listener on the load
      * balancer.
      */
    val lbPort: Output_[Double] = js.native
    
    /**
      * The load balancer to which the policy
      * should be attached.
      */
    val loadBalancer: Output_[String] = js.native
    
    /**
      * The name of the stickiness policy.
      */
    val name: Output_[String] = js.native
  }
  /* static members */
  object LoadBalancerCookieStickinessPolicy {
    
    /**
      * Get an existing LoadBalancerCookieStickinessPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/elasticloadbalancing/loadBalancerCookieStickinessPolicy", "LoadBalancerCookieStickinessPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): LoadBalancerCookieStickinessPolicy = js.native
    @JSImport("@pulumi/aws/elasticloadbalancing/loadBalancerCookieStickinessPolicy", "LoadBalancerCookieStickinessPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): LoadBalancerCookieStickinessPolicy = js.native
    @JSImport("@pulumi/aws/elasticloadbalancing/loadBalancerCookieStickinessPolicy", "LoadBalancerCookieStickinessPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: LoadBalancerCookieStickinessPolicyState): LoadBalancerCookieStickinessPolicy = js.native
    @JSImport("@pulumi/aws/elasticloadbalancing/loadBalancerCookieStickinessPolicy", "LoadBalancerCookieStickinessPolicy.get")
    @js.native
    def get(
      name: String,
      id: Input[ID],
      state: LoadBalancerCookieStickinessPolicyState,
      opts: CustomResourceOptions
    ): LoadBalancerCookieStickinessPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of LoadBalancerCookieStickinessPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/elasticloadbalancing/loadBalancerCookieStickinessPolicy", "LoadBalancerCookieStickinessPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancing/loadBalancerCookieStickinessPolicy.LoadBalancerCookieStickinessPolicy */ Boolean = js.native
  }
  
  @js.native
  trait LoadBalancerCookieStickinessPolicyArgs extends StObject {
    
    /**
      * The time period after which
      * the session cookie should be considered stale, expressed in seconds.
      */
    val cookieExpirationPeriod: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The load balancer port to which the policy
      * should be applied. This must be an active listener on the load
      * balancer.
      */
    val lbPort: Input[Double] = js.native
    
    /**
      * The load balancer to which the policy
      * should be attached.
      */
    val loadBalancer: Input[String] = js.native
    
    /**
      * The name of the stickiness policy.
      */
    val name: js.UndefOr[Input[String]] = js.native
  }
  object LoadBalancerCookieStickinessPolicyArgs {
    
    @scala.inline
    def apply(lbPort: Input[Double], loadBalancer: Input[String]): LoadBalancerCookieStickinessPolicyArgs = {
      val __obj = js.Dynamic.literal(lbPort = lbPort.asInstanceOf[js.Any], loadBalancer = loadBalancer.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadBalancerCookieStickinessPolicyArgs]
    }
    
    @scala.inline
    implicit class LoadBalancerCookieStickinessPolicyArgsMutableBuilder[Self <: LoadBalancerCookieStickinessPolicyArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCookieExpirationPeriod(value: Input[Double]): Self = StObject.set(x, "cookieExpirationPeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieExpirationPeriodUndefined: Self = StObject.set(x, "cookieExpirationPeriod", js.undefined)
      
      @scala.inline
      def setLbPort(value: Input[Double]): Self = StObject.set(x, "lbPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadBalancer(value: Input[String]): Self = StObject.set(x, "loadBalancer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait LoadBalancerCookieStickinessPolicyState extends StObject {
    
    /**
      * The time period after which
      * the session cookie should be considered stale, expressed in seconds.
      */
    val cookieExpirationPeriod: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The load balancer port to which the policy
      * should be applied. This must be an active listener on the load
      * balancer.
      */
    val lbPort: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The load balancer to which the policy
      * should be attached.
      */
    val loadBalancer: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the stickiness policy.
      */
    val name: js.UndefOr[Input[String]] = js.native
  }
  object LoadBalancerCookieStickinessPolicyState {
    
    @scala.inline
    def apply(): LoadBalancerCookieStickinessPolicyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadBalancerCookieStickinessPolicyState]
    }
    
    @scala.inline
    implicit class LoadBalancerCookieStickinessPolicyStateMutableBuilder[Self <: LoadBalancerCookieStickinessPolicyState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCookieExpirationPeriod(value: Input[Double]): Self = StObject.set(x, "cookieExpirationPeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieExpirationPeriodUndefined: Self = StObject.set(x, "cookieExpirationPeriod", js.undefined)
      
      @scala.inline
      def setLbPort(value: Input[Double]): Self = StObject.set(x, "lbPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLbPortUndefined: Self = StObject.set(x, "lbPort", js.undefined)
      
      @scala.inline
      def setLoadBalancer(value: Input[String]): Self = StObject.set(x, "loadBalancer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadBalancerUndefined: Self = StObject.set(x, "loadBalancer", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
