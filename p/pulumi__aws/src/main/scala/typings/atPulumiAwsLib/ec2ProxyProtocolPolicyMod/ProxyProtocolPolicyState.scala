package typings
package atPulumiAwsLib.ec2ProxyProtocolPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyProtocolPolicyState extends js.Object {
  /**
    * List of instance ports to which the policy
    * should be applied. This can be specified if the protocol is SSL or TCP.
    */
  val instancePorts: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The load balancer to which the policy
    * should be attached.
    */
  val loadBalancer: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object ProxyProtocolPolicyState {
  @scala.inline
  def apply(
    instancePorts: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    loadBalancer: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): ProxyProtocolPolicyState = {
    val __obj = js.Dynamic.literal()
    if (instancePorts != null) __obj.updateDynamic("instancePorts")(instancePorts.asInstanceOf[js.Any])
    if (loadBalancer != null) __obj.updateDynamic("loadBalancer")(loadBalancer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyProtocolPolicyState]
  }
}

