package typings.reactSwipe.mod

import typings.react.mod.CSSProperties
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
    val __obj = js.Dynamic.literal(child = child.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
}

