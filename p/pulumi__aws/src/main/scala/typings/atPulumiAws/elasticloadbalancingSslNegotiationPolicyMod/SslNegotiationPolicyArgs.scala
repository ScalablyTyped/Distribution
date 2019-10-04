package typings.atPulumiAws.elasticloadbalancingSslNegotiationPolicyMod

import typings.atPulumiAws.typesInputMod.elasticloadbalancingNs.SslNegotiationPolicyAttribute
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SslNegotiationPolicyArgs extends js.Object {
  /**
    * An SSL Negotiation policy attribute. Each has two properties:
    */
  val attributes: js.UndefOr[Input[js.Array[Input[SslNegotiationPolicyAttribute]]]] = js.undefined
  /**
    * The load balancer port to which the policy
    * should be applied. This must be an active listener on the load
    * balancer.
    */
  val lbPort: Input[Double]
  /**
    * The load balancer to which the policy
    * should be attached.
    */
  val loadBalancer: Input[String]
  /**
    * The name of the attribute
    */
  val name: js.UndefOr[Input[String]] = js.undefined
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

