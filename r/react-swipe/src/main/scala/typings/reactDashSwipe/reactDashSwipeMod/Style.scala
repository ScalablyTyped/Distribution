package typings.reactDashSwipe.reactDashSwipeMod

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Style extends js.Object {
  var child: CSSProperties
  var container: CSSProperties
  var wrapper: CSSProperties
}

object Style {
  @scala.inline
  def apply(child: CSSProperties, container: CSSProperties, wrapper: CSSProperties): Style = {
    val __obj = js.Dynamic.literal(child = child, container = container, wrapper = wrapper)
  
    __obj.asInstanceOf[Style]
  }
}

