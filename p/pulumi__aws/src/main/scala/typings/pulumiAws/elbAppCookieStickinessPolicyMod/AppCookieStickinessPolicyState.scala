package typings.pulumiAws.elbAppCookieStickinessPolicyMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppCookieStickinessPolicyState extends js.Object {
  
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
  implicit class AppCookieStickinessPolicyStateOps[Self <: AppCookieStickinessPolicyState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCookieName(value: Input[String]): Self = this.set("cookieName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookieName: Self = this.set("cookieName", js.undefined)
    
    @scala.inline
    def setLbPort(value: Input[Double]): Self = this.set("lbPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLbPort: Self = this.set("lbPort", js.undefined)
    
    @scala.inline
    def setLoadBalancer(value: Input[String]): Self = this.set("loadBalancer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadBalancer: Self = this.set("loadBalancer", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
