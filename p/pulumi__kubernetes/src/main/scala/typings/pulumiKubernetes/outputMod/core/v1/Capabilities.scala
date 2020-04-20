package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adds and removes POSIX capabilities from running containers.
  */
trait Capabilities extends js.Object {
  /**
    * Added capabilities
    */
  val add: js.Array[String]
  /**
    * Removed capabilities
    */
  val drop: js.Array[String]
}

object Capabilities {
  @scala.inline
  def apply(add: js.Array[String], drop: js.Array[String]): Capabilities = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Capabilities]
  }
}

