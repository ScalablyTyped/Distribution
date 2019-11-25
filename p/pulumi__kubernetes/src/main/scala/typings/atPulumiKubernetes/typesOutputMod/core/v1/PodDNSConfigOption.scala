package typings.atPulumiKubernetes.typesOutputMod.core.v1

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
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PodDNSConfigOption]
  }
}

