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

object appCookieStickinessPolicyMod {
  
  @JSImport("@pulumi/aws/elasticloadbalancing/appCookieStickinessPolicy", "AppCookieStickinessPolicy")
  @js.native
  class AppCookieStickinessPolicy protected () extends CustomResource {
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
    
    /**
      * The application cookie whose lifetime the ELB's cookie should follow.
      */
    val cookieName: Output_[String] = js.native
    
    /**
      * The load balancer port to which the policy
      * should be applied. This must be an active listener on the load
      * balancer.
      */
    val lbPort: Output_[Double] = js.native
    
    /**
      * The name of load balancer to which the policy
      * should be attached.
      */
    val loadBalancer: Output_[String] = js.native
    
    /**
      * The name of the stickiness policy.
      */
    val name: Output_[String] = js.native
  }
  /* static members */
  object AppCookieStickinessPolicy {
    
    /**
      * Get an existing AppCookieStickinessPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/elasticloadbalancing/appCookieStickinessPolicy", "AppCookieStickinessPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): AppCookieStickinessPolicy = js.native
    @JSImport("@pulumi/aws/elasticloadbalancing/appCookieStickinessPolicy", "AppCookieStickinessPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): AppCookieStickinessPolicy = js.native
    @JSImport("@pulumi/aws/elasticloadbalancing/appCookieStickinessPolicy", "AppCookieStickinessPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: AppCookieStickinessPolicyState): AppCookieStickinessPolicy = js.native
    @JSImport("@pulumi/aws/elasticloadbalancing/appCookieStickinessPolicy", "AppCookieStickinessPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: AppCookieStickinessPolicyState, opts: CustomResourceOptions): AppCookieStickinessPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of AppCookieStickinessPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/elasticloadbalancing/appCookieStickinessPolicy", "AppCookieStickinessPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancing/appCookieStickinessPolicy.AppCookieStickinessPolicy */ Boolean = js.native
  }
  
  @js.native
  trait AppCookieStickinessPolicyArgs extends StObject {
    
    /**
      * The application cookie whose lifetime the ELB's cookie should follow.
      */
    val cookieName: Input[String] = js.native
    
    /**
      * The load balancer port to which the policy
      * should be applied. This must be an active listener on the load
      * balancer.
      */
    val lbPort: Input[Double] = js.native
    
    /**
      * The name of load balancer to which the policy
      * should be attached.
      */
    val loadBalancer: Input[String] = js.native
    
    /**
      * The name of the stickiness policy.
      */
    val name: js.UndefOr[Input[String]] = js.native
  }
  object AppCookieStickinessPolicyArgs {
    
    @scala.inline
    def apply(cookieName: Input[String], lbPort: Input[Double], loadBalancer: Input[String]): AppCookieStickinessPolicyArgs = {
      val __obj = js.Dynamic.literal(cookieName = cookieName.asInstanceOf[js.Any], lbPort = lbPort.asInstanceOf[js.Any], loadBalancer = loadBalancer.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppCookieStickinessPolicyArgs]
    }
    
    @scala.inline
    implicit class AppCookieStickinessPolicyArgsMutableBuilder[Self <: AppCookieStickinessPolicyArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCookieName(value: Input[String]): Self = StObject.set(x, "cookieName", value.asInstanceOf[js.Any])
      
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
  trait AppCookieStickinessPolicyState extends StObject {
    
    /**
      * The application cookie whose lifetime the ELB's cookie should follow.
      */
    val cookieName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The load balancer port to which the policy
      * should be applied. This must be an active listener on the load
      * balancer.
      */
    val lbPort: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The name of load balancer to which the policy
      * should be attached.
      */
    val loadBalancer: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the stickiness policy.
      */
    val name: js.UndefOr[Input[String]] = js.native
  }
  object AppCookieStickinessPolicyState {
    
    @scala.inline
    def apply(): AppCookieStickinessPolicyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppCookieStickinessPolicyState]
    }
    
    @scala.inline
    implicit class AppCookieStickinessPolicyStateMutableBuilder[Self <: AppCookieStickinessPolicyState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCookieName(value: Input[String]): Self = StObject.set(x, "cookieName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieNameUndefined: Self = StObject.set(x, "cookieName", js.undefined)
      
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
