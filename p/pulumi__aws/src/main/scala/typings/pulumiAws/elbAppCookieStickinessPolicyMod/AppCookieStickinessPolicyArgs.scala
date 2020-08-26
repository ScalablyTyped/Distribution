package typings.pulumiAws.elbAppCookieStickinessPolicyMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppCookieStickinessPolicyArgs extends js.Object {
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
  implicit class AppCookieStickinessPolicyArgsOps[Self <: AppCookieStickinessPolicyArgs] (val x: Self) extends AnyVal {
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
    def setLbPort(value: Input[Double]): Self = this.set("lbPort", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadBalancer(value: Input[String]): Self = this.set("loadBalancer", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

