package typings.pulumiAws.containerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KernelCapabilities extends js.Object {
  var add: js.UndefOr[js.Array[KernelCapability]] = js.native
  var drop: js.UndefOr[js.Array[KernelCapability]] = js.native
}

object KernelCapabilities {
  @scala.inline
  def apply(add: js.Array[KernelCapability] = null, drop: js.Array[KernelCapability] = null): KernelCapabilities = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(add.asInstanceOf[js.Any])
    if (drop != null) __obj.updateDynamic("drop")(drop.asInstanceOf[js.Any])
    __obj.asInstanceOf[KernelCapabilities]
  }
}

