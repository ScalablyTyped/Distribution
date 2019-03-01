package typings
package reactDashAddonsDashLinkedDashStateDashMixinLib.reactDashAddonsDashLinkedDashStateDashMixinMod.LinkedStateMixinNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactLink[T] extends js.Object {
  var value: T
  def requestChange(newValue: T): scala.Unit
}

object ReactLink {
  @scala.inline
  def apply[T](requestChange: js.Function1[T, scala.Unit], value: T): ReactLink[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("requestChange")(requestChange)
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactLink[T]]
  }
}

