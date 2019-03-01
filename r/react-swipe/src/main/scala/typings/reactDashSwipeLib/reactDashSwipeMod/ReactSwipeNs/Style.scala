package typings
package reactDashSwipeLib.reactDashSwipeMod.ReactSwipeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Style extends js.Object {
  var child: reactLib.reactMod.ReactNs.CSSProperties
  var container: reactLib.reactMod.ReactNs.CSSProperties
  var wrapper: reactLib.reactMod.ReactNs.CSSProperties
}

object Style {
  @scala.inline
  def apply(
    child: reactLib.reactMod.ReactNs.CSSProperties,
    container: reactLib.reactMod.ReactNs.CSSProperties,
    wrapper: reactLib.reactMod.ReactNs.CSSProperties
  ): Style = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("child")(child)
    __obj.updateDynamic("container")(container)
    __obj.updateDynamic("wrapper")(wrapper)
    __obj.asInstanceOf[Style]
  }
}

