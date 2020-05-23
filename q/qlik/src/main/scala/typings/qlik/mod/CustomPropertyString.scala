package typings.qlik.mod

import typings.qlik.qlikStrings._empty
import typings.qlik.qlikStrings.always
import typings.qlik.qlikStrings.optional
import typings.qlik.qlikStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertyString
  extends CustomPropertyCommon
     with CustomProperty {
  var defaultValue: js.UndefOr[String] = js.undefined
  var expression: js.UndefOr[always | optional | _empty] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  @JSName("type")
  var type_CustomPropertyString: string
}

object CustomPropertyString {
  @scala.inline
  def apply(
    `type`: string,
    defaultValue: String = null,
    expression: always | optional | _empty = null,
    label: String = null,
    maxLength: js.UndefOr[Double] = js.undefined,
    ref: String = null,
    show: Boolean | ShowFunction = null
  ): CustomPropertyString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLength)) __obj.updateDynamic("maxLength")(maxLength.get.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyString]
  }
}

