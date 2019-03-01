package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Changed extends js.Object {
  var changed: js.Array[reactDashNativeLib.reactDashNativeMod.ViewToken]
  var viewableItems: js.Array[reactDashNativeLib.reactDashNativeMod.ViewToken]
}

object Anon_Changed {
  @scala.inline
  def apply(
    changed: js.Array[reactDashNativeLib.reactDashNativeMod.ViewToken],
    viewableItems: js.Array[reactDashNativeLib.reactDashNativeMod.ViewToken]
  ): Anon_Changed = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changed")(changed)
    __obj.updateDynamic("viewableItems")(viewableItems)
    __obj.asInstanceOf[Anon_Changed]
  }
}

