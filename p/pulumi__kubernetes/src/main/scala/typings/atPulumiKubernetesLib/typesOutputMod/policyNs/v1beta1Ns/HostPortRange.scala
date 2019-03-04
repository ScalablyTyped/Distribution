package typings
package atPulumiKubernetesLib.typesOutputMod.policyNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HostPortRange defines a range of host ports that will be enabled by a policy for pods to use.
  * It requires both the start and end to be defined.
  */
trait HostPortRange extends js.Object {
  /**
    * max is the end of the range, inclusive.
    */
  val max: scala.Double
  /**
    * min is the start of the range, inclusive.
    */
  val min: scala.Double
}

object HostPortRange {
  @scala.inline
  def apply(max: scala.Double, min: scala.Double): HostPortRange = {
    val __obj = js.Dynamic.literal(max = max, min = min)
  
    __obj.asInstanceOf[HostPortRange]
  }
}

