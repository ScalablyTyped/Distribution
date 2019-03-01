package typings
package select2Lib.select2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptGroupData extends js.Object {
  var children: js.Array[OptionData]
  var disabled: scala.Boolean
  var element: stdLib.HTMLOptGroupElement
  var loading: js.UndefOr[scala.Nothing] = js.undefined
  var selected: scala.Boolean
  var text: java.lang.String
  var title: java.lang.String
}

object OptGroupData {
  @scala.inline
  def apply(
    children: js.Array[OptionData],
    disabled: scala.Boolean,
    element: stdLib.HTMLOptGroupElement,
    selected: scala.Boolean,
    text: java.lang.String,
    title: java.lang.String,
    loading: js.UndefOr[scala.Nothing] = js.undefined
  ): OptGroupData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children)
    __obj.updateDynamic("disabled")(disabled)
    __obj.updateDynamic("element")(element)
    __obj.updateDynamic("selected")(selected)
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("title")(title)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    __obj.asInstanceOf[OptGroupData]
  }
}

