package typings.atPulumiAws.ec2ProxyProtocolPolicyMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyProtocolPolicyState extends js.Object {
  /**
    * List of instance ports to which the policy
    * should be applied. This can be specified if the protocol is SSL or TCP.
    */
  val instancePorts: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The load balancer to which the policy
    * should be attached.
    */
  val loadBalancer: js.UndefOr[Input[String]] = js.native
}

object ProxyProtocolPolicyState {
  @scala.inline
  def apply(instancePorts: Input[js.Array[Input[String]]] = null, loadBalancer: Input[String] = null): ProxyProtocolPolicyState = {
    val __obj = js.Dynamic.literal()
    if (instancePorts != null) __obj.updateDynamic("instancePorts")(instancePorts.asInstanceOf[js.Any])
    if (loadBalancer != null) __obj.updateDynamic("loadBalancer")(loadBalancer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyProtocolPolicyState]
  }
}

