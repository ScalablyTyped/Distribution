package typings.atPulumiKubernetes.typesOutputMod.core.v1

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
  val ip: String
}

object PodIP {
  @scala.inline
  def apply(ip: String): PodIP = {
    val __obj = js.Dynamic.literal(ip = ip)
  
    __obj.asInstanceOf[PodIP]
  }
}

