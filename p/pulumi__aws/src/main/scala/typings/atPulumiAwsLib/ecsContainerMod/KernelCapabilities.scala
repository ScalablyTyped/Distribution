package typings
package atPulumiAwsLib.ecsContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KernelCapabilities extends js.Object {
  var add: js.UndefOr[js.Array[KernelCapability]] = js.undefined
  var drop: js.UndefOr[js.Array[KernelCapability]] = js.undefined
}

object KernelCapabilities {
  @scala.inline
  def apply(add: js.Array[KernelCapability] = null, drop: js.Array[KernelCapability] = null): KernelCapabilities = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(add)
    if (drop != null) __obj.updateDynamic("drop")(drop)
    __obj.asInstanceOf[KernelCapabilities]
  }
}

