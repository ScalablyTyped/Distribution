package typings.atPulumiAws.elbAppCookieStickinessPolicyMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppCookieStickinessPolicyState extends js.Object {
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
  @scala.inline
  def apply(
    cookieName: Input[String] = null,
    lbPort: Input[Double] = null,
    loadBalancer: Input[String] = null,
    name: Input[String] = null
  ): AppCookieStickinessPolicyState = {
    val __obj = js.Dynamic.literal()
    if (cookieName != null) __obj.updateDynamic("cookieName")(cookieName.asInstanceOf[js.Any])
    if (lbPort != null) __obj.updateDynamic("lbPort")(lbPort.asInstanceOf[js.Any])
    if (loadBalancer != null) __obj.updateDynamic("loadBalancer")(loadBalancer.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppCookieStickinessPolicyState]
  }
}

