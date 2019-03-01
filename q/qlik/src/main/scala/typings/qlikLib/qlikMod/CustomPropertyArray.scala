package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertyArray
  extends CustomPropertyCommon
     with CustomProperty {
  var addTranslation: js.UndefOr[java.lang.String] = js.undefined
  var allowAdd: js.UndefOr[scala.Boolean] = js.undefined
  var allowMove: js.UndefOr[scala.Boolean] = js.undefined
  var allowRemove: js.UndefOr[scala.Boolean] = js.undefined
  var component: js.UndefOr[scala.Nothing] = js.undefined
  var itemTitleRef: js.UndefOr[java.lang.String] = js.undefined
  @JSName("type")
  var type_CustomPropertyArray: qlikLib.qlikLibStrings.array
}

object CustomPropertyArray {
  @scala.inline
  def apply(
    `type`: qlikLib.qlikLibStrings.array,
    addTranslation: java.lang.String = null,
    allowAdd: js.UndefOr[scala.Boolean] = js.undefined,
    allowMove: js.UndefOr[scala.Boolean] = js.undefined,
    allowRemove: js.UndefOr[scala.Boolean] = js.undefined,
    component: js.UndefOr[scala.Nothing] = js.undefined,
    itemTitleRef: java.lang.String = null,
    label: java.lang.String = null,
    ref: java.lang.String = null,
    show: scala.Boolean | ShowFunction = null
  ): CustomPropertyArray = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (addTranslation != null) __obj.updateDynamic("addTranslation")(addTranslation)
    if (!js.isUndefined(allowAdd)) __obj.updateDynamic("allowAdd")(allowAdd)
    if (!js.isUndefined(allowMove)) __obj.updateDynamic("allowMove")(allowMove)
    if (!js.isUndefined(allowRemove)) __obj.updateDynamic("allowRemove")(allowRemove)
    if (!js.isUndefined(component)) __obj.updateDynamic("component")(component)
    if (itemTitleRef != null) __obj.updateDynamic("itemTitleRef")(itemTitleRef)
    if (label != null) __obj.updateDynamic("label")(label)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyArray]
  }
}

