package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

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
  val name: java.lang.String
  val value: java.lang.String
}

object PodDNSConfigOption {
  @scala.inline
  def apply(name: java.lang.String, value: java.lang.String): PodDNSConfigOption = {
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[PodDNSConfigOption]
  }
}

