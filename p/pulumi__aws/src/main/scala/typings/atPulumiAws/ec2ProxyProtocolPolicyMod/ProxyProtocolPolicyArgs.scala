package typings.atPulumiAws.ec2ProxyProtocolPolicyMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyProtocolPolicyArgs extends js.Object {
  /**
    * List of instance ports to which the policy
    * should be applied. This can be specified if the protocol is SSL or TCP.
    */
  val instancePorts: Input[js.Array[Input[String]]]
  /**
    * The load balancer to which the policy
    * should be attached.
    */
  val loadBalancer: Input[String]
}

object ProxyProtocolPolicyArgs {
  @scala.inline
  def apply(instancePorts: Input[js.Array[Input[String]]], loadBalancer: Input[String]): ProxyProtocolPolicyArgs = {
    val __obj = js.Dynamic.literal(instancePorts = instancePorts.asInstanceOf[js.Any], loadBalancer = loadBalancer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProxyProtocolPolicyArgs]
  }
}

