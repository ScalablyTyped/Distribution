package typings.reactInstantsearchCore.anon

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait End extends js.Object {
  var end: js.UndefOr[Double] = js.undefined
  var label: String | Element
  var start: js.UndefOr[Double] = js.undefined
}

object End {
  @scala.inline
  def apply(
    label: String | Element,
    end: js.UndefOr[Double] = js.undefined,
    start: js.UndefOr[Double] = js.undefined
  ): End = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[End]
  }
}

