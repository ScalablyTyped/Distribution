package typings.atPulumiKubernetes.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodDNSConfigOption defines DNS resolver options of a pod.
  */
trait PodDNSConfigOption extends js.Object {
  /**
    * Required.
    */
  val name: String
  val value: String
}

object PodDNSConfigOption {
  @scala.inline
  def apply(name: String, value: String): PodDNSConfigOption = {
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[PodDNSConfigOption]
  }
}

