package typings.reactDashInstantsearchDashCore

import typings.react.reactMod.Global.JSXNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_End extends js.Object {
  var end: js.UndefOr[Double] = js.undefined
  var label: String | Element
  var start: js.UndefOr[Double] = js.undefined
}

object Anon_End {
  @scala.inline
  def apply(label: String | Element, end: Int | Double = null, start: Int | Double = null): Anon_End = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_End]
  }
}

