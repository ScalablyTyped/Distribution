package typings.rcDashCheckbox.rcDashCheckboxMod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var autoFocus: Boolean
  var checked: Double | Boolean
  var className: String
  var defaultChecked: Double | Boolean
  var disabled: Boolean
  var id: String
  var name: String
  var prefixCls: String
  var readOnly: Boolean
  var style: js.Object
  var tabIndex: String | Double
  var `type`: String
  var value: js.Any
  def onBlur(e: Event): Unit
  def onChange(e: Event): Unit
  def onClick(e: Event): Unit
  def onFocus(e: Event): Unit
}

object Props {
  @scala.inline
  def apply(
    autoFocus: Boolean,
    checked: Double | Boolean,
    className: String,
    defaultChecked: Double | Boolean,
    disabled: Boolean,
    id: String,
    name: String,
    onBlur: Event => Unit,
    onChange: Event => Unit,
    onClick: Event => Unit,
    onFocus: Event => Unit,
    prefixCls: String,
    readOnly: Boolean,
    style: js.Object,
    tabIndex: String | Double,
    `type`: String,
    value: js.Any
  ): Props = {
    val __obj = js.Dynamic.literal(autoFocus = autoFocus, checked = checked.asInstanceOf[js.Any], className = className, defaultChecked = defaultChecked.asInstanceOf[js.Any], disabled = disabled, id = id, name = name, onBlur = js.Any.fromFunction1(onBlur), onChange = js.Any.fromFunction1(onChange), onClick = js.Any.fromFunction1(onClick), onFocus = js.Any.fromFunction1(onFocus), prefixCls = prefixCls, readOnly = readOnly, style = style, tabIndex = tabIndex.asInstanceOf[js.Any], value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Props]
  }
}

