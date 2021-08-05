package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elbAppCookieStickinessPolicyMod {
  
  @JSImport("@pulumi/aws/elb/appCookieStickinessPolicy", "AppCookieStickinessPolicy")
  @js.native
  class AppCookieStickinessPolicy protected () extends CustomResource {
    /**
      * Create a AppCookieStickinessPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
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
    
    @JSImport("@pulumi/aws/elb/appCookieStickinessPolicy", "AppCookieStickinessPolicy")
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
    inline def get(name: String, id: Input[ID]): AppCookieStickinessPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[AppCookieStickinessPolicy]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): AppCookieStickinessPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[AppCookieStickinessPolicy]
    inline def get(name: String, id: Input[ID], state: AppCookieStickinessPolicyState): AppCookieStickinessPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[AppCookieStickinessPolicy]
    inline def get(name: String, id: Input[ID], state: AppCookieStickinessPolicyState, opts: CustomResourceOptions): AppCookieStickinessPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[AppCookieStickinessPolicy]
    
    /**
      * Returns true if the given object is an instance of AppCookieStickinessPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elb/appCookieStickinessPolicy.AppCookieStickinessPolicy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/elb/appCookieStickinessPolicy.AppCookieStickinessPolicy */ Boolean]
  }
  
  trait AppCookieStickinessPolicyArgs extends StObject {
    
    /**
      * The application cookie whose lifetime the ELB's cookie should follow.
      */
    val cookieName: Input[String]
    
    /**
      * The load balancer port to which the policy
      * should be applied. This must be an active listener on the load
      * balancer.
      */
    val lbPort: Input[Double]
    
    /**
      * The name of load balancer to which the policy
      * should be attached.
      */
    val loadBalancer: Input[String]
    
    /**
      * The name of the stickiness policy.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
  }
  object AppCookieStickinessPolicyArgs {
    
    inline def apply(cookieName: Input[String], lbPort: Input[Double], loadBalancer: Input[String]): AppCookieStickinessPolicyArgs = {
      val __obj = js.Dynamic.literal(cookieName = cookieName.asInstanceOf[js.Any], lbPort = lbPort.asInstanceOf[js.Any], loadBalancer = loadBalancer.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppCookieStickinessPolicyArgs]
    }
    
    extension [Self <: AppCookieStickinessPolicyArgs](x: Self) {
      
      inline def setCookieName(value: Input[String]): Self = StObject.set(x, "cookieName", value.asInstanceOf[js.Any])
      
      inline def setLbPort(value: Input[Double]): Self = StObject.set(x, "lbPort", value.asInstanceOf[js.Any])
      
      inline def setLoadBalancer(value: Input[String]): Self = StObject.set(x, "loadBalancer", value.asInstanceOf[js.Any])
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait AppCookieStickinessPolicyState extends StObject {
    
    /**
      * The application cookie whose lifetime the ELB's cookie should follow.
      */
    val cookieName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The load balancer port to which the policy
      * should be applied. This must be an active listener on the load
      * balancer.
      */
    val lbPort: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The name of load balancer to which the policy
      * should be attached.
      */
    val loadBalancer: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the stickiness policy.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
  }
  object AppCookieStickinessPolicyState {
    
    inline def apply(): AppCookieStickinessPolicyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppCookieStickinessPolicyState]
    }
    
    extension [Self <: AppCookieStickinessPolicyState](x: Self) {
      
      inline def setCookieName(value: Input[String]): Self = StObject.set(x, "cookieName", value.asInstanceOf[js.Any])
      
      inline def setCookieNameUndefined: Self = StObject.set(x, "cookieName", js.undefined)
      
      inline def setLbPort(value: Input[Double]): Self = StObject.set(x, "lbPort", value.asInstanceOf[js.Any])
      
      inline def setLbPortUndefined: Self = StObject.set(x, "lbPort", js.undefined)
      
      inline def setLoadBalancer(value: Input[String]): Self = StObject.set(x, "loadBalancer", value.asInstanceOf[js.Any])
      
      inline def setLoadBalancerUndefined: Self = StObject.set(x, "loadBalancer", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
