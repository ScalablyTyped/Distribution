package typings.atPulumiKubernetes.typesOutputMod.core.v1

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
  val name: String
  /**
    * Value of a property to set
    */
  val value: String
}

object Sysctl {
  @scala.inline
  def apply(name: String, value: String): Sysctl = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Sysctl]
  }
}

