package typings.pulumiAws.elbSslNegotiationPolicyMod

import typings.pulumiAws.inputMod.elb.SslNegotiationPolicyAttribute
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SslNegotiationPolicyArgs extends js.Object {
  /**
    * An SSL Negotiation policy attribute. Each has two properties:
    */
  val attributes: js.UndefOr[Input[js.Array[Input[SslNegotiationPolicyAttribute]]]] = js.native
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
    * The name of the attribute
    */
  val name: js.UndefOr[Input[String]] = js.native
}

object SslNegotiationPolicyArgs {
  @scala.inline
  def apply(
    lbPort: Input[Double],
    loadBalancer: Input[String],
    attributes: Input[js.Array[Input[SslNegotiationPolicyAttribute]]] = null,
    name: Input[String] = null
  ): SslNegotiationPolicyArgs = {
    val __obj = js.Dynamic.literal(lbPort = lbPort.asInstanceOf[js.Any], loadBalancer = loadBalancer.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SslNegotiationPolicyArgs]
  }
}

