package typings.qlik.qlikMod

import typings.qlik.qlikStrings.string
import typings.qlik.qlikStrings.textarea
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertyTextArea
  extends CustomPropertyCommon
     with CustomProperty {
  var component: textarea
  var defaultValue: js.UndefOr[String] = js.undefined
  var maxlength: js.UndefOr[Double] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  @JSName("type")
  var type_CustomPropertyTextArea: string
}

object CustomPropertyTextArea {
  @scala.inline
  def apply(
    component: textarea,
    `type`: string,
    defaultValue: String = null,
    label: String = null,
    maxlength: Int | Double = null,
    ref: String = null,
    rows: Int | Double = null,
    show: Boolean | ShowFunction = null
  ): CustomPropertyTextArea = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (maxlength != null) __obj.updateDynamic("maxlength")(maxlength.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyTextArea]
  }
}

