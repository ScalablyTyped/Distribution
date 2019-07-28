package typings.qlik.qlikMod

import typings.qlik.qlikStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertyArray
  extends CustomPropertyCommon
     with CustomProperty {
  var addTranslation: js.UndefOr[String] = js.undefined
  var allowAdd: js.UndefOr[Boolean] = js.undefined
  var allowMove: js.UndefOr[Boolean] = js.undefined
  var allowRemove: js.UndefOr[Boolean] = js.undefined
  var component: js.UndefOr[scala.Nothing] = js.undefined
  var itemTitleRef: js.UndefOr[String] = js.undefined
  @JSName("type")
  var type_CustomPropertyArray: array
}

object CustomPropertyArray {
  @scala.inline
  def apply(
    `type`: array,
    addTranslation: String = null,
    allowAdd: js.UndefOr[Boolean] = js.undefined,
    allowMove: js.UndefOr[Boolean] = js.undefined,
    allowRemove: js.UndefOr[Boolean] = js.undefined,
    component: js.UndefOr[scala.Nothing] = js.undefined,
    itemTitleRef: String = null,
    label: String = null,
    ref: String = null,
    show: Boolean | ShowFunction = null
  ): CustomPropertyArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
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

