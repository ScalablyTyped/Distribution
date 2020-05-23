package typings.rcSlider.anon

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends js.Object {
  var label: String | Element
  var style: js.Any
}

object Label {
  @scala.inline
  def apply(label: String | Element, style: js.Any): Label = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
}

