package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IP address information for entries in the (plural) PodIPs field. Each entry includes:
  *    IP: An IP address allocated to the pod. Routable at least within the cluster.
  */
trait PodIP extends js.Object {
  /**
    * ip is an IP address (IPv4 or IPv6) assigned to the pod
    */
  var ip: js.UndefOr[Input[String]] = js.undefined
}

object PodIP {
  @scala.inline
  def apply(ip: Input[String] = null): PodIP = {
    val __obj = js.Dynamic.literal()
    if (ip != null) __obj.updateDynamic("ip")(ip.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodIP]
  }
}

