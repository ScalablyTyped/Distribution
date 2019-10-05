package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
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
  var add: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * Removed capabilities
    */
  var drop: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}

object Capabilities {
  @scala.inline
  def apply(add: Input[js.Array[Input[String]]] = null, drop: Input[js.Array[Input[String]]] = null): Capabilities = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(add.asInstanceOf[js.Any])
    if (drop != null) __obj.updateDynamic("drop")(drop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Capabilities]
  }
}

