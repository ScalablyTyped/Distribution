package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sysctl defines a kernel parameter to be set
  */
trait Sysctl extends js.Object {
  /**
    * Name of a property to set
    */
  val name: java.lang.String
  /**
    * Value of a property to set
    */
  val value: java.lang.String
}

object Sysctl {
  @scala.inline
  def apply(name: java.lang.String, value: java.lang.String): Sysctl = {
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[Sysctl]
  }
}

