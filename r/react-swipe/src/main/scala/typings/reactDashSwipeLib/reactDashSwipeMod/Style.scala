package typings
package reactDashSwipeLib.reactDashSwipeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Style extends js.Object {
  var child: reactLib.reactMod.CSSProperties
  var container: reactLib.reactMod.CSSProperties
  var wrapper: reactLib.reactMod.CSSProperties
}

object Style {
  @scala.inline
  def apply(
    child: reactLib.reactMod.CSSProperties,
    container: reactLib.reactMod.CSSProperties,
    wrapper: reactLib.reactMod.CSSProperties
  ): Style = {
    val __obj = js.Dynamic.literal(child = child, container = container, wrapper = wrapper)
  
    __obj.asInstanceOf[Style]
  }
}

