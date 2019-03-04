package typings
package atPulumiAwsLib.ec2ProxyProtocolPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyProtocolPolicyArgs extends js.Object {
  /**
    * List of instance ports to which the policy
    * should be applied. This can be specified if the protocol is SSL or TCP.
    */
  val instancePorts: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  /**
    * The load balancer to which the policy
    * should be attached.
    */
  val loadBalancer: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object ProxyProtocolPolicyArgs {
  @scala.inline
  def apply(
    instancePorts: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]],
    loadBalancer: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): ProxyProtocolPolicyArgs = {
    val __obj = js.Dynamic.literal(instancePorts = instancePorts.asInstanceOf[js.Any], loadBalancer = loadBalancer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProxyProtocolPolicyArgs]
  }
}

