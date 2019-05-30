package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushPermissionDescriptor extends PermissionDescriptor {
  @JSName("name")
  var name_PushPermissionDescriptor: stdLib.stdLibStrings.push
  var userVisibleOnly: js.UndefOr[scala.Boolean] = js.undefined
}

object PushPermissionDescriptor {
  @scala.inline
  def apply(name: stdLib.stdLibStrings.push, userVisibleOnly: js.UndefOr[scala.Boolean] = js.undefined): PushPermissionDescriptor = {
    val __obj = js.Dynamic.literal(name = name)
    if (!js.isUndefined(userVisibleOnly)) __obj.updateDynamic("userVisibleOnly")(userVisibleOnly)
    __obj.asInstanceOf[PushPermissionDescriptor]
  }
}

