package typings
package rcDashCheckboxLib.rcDashCheckboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var autoFocus: scala.Boolean
  var checked: scala.Double | scala.Boolean
  var className: java.lang.String
  var defaultChecked: scala.Double | scala.Boolean
  var disabled: scala.Boolean
  var id: java.lang.String
  var name: java.lang.String
  var prefixCls: java.lang.String
  var readOnly: scala.Boolean
  var style: js.Object
  var tabIndex: java.lang.String | scala.Double
  var `type`: java.lang.String
  var value: js.Any
  def onBlur(e: stdLib.Event): scala.Unit
  def onChange(e: stdLib.Event): scala.Unit
  def onClick(e: stdLib.Event): scala.Unit
  def onFocus(e: stdLib.Event): scala.Unit
}

object Props {
  @scala.inline
  def apply(
    autoFocus: scala.Boolean,
    checked: scala.Double | scala.Boolean,
    className: java.lang.String,
    defaultChecked: scala.Double | scala.Boolean,
    disabled: scala.Boolean,
    id: java.lang.String,
    name: java.lang.String,
    onBlur: stdLib.Event => scala.Unit,
    onChange: stdLib.Event => scala.Unit,
    onClick: stdLib.Event => scala.Unit,
    onFocus: stdLib.Event => scala.Unit,
    prefixCls: java.lang.String,
    readOnly: scala.Boolean,
    style: js.Object,
    tabIndex: java.lang.String | scala.Double,
    `type`: java.lang.String,
    value: js.Any
  ): Props = {
    val __obj = js.Dynamic.literal(autoFocus = autoFocus, checked = checked.asInstanceOf[js.Any], className = className, defaultChecked = defaultChecked.asInstanceOf[js.Any], disabled = disabled, id = id, name = name, onBlur = js.Any.fromFunction1(onBlur), onChange = js.Any.fromFunction1(onChange), onClick = js.Any.fromFunction1(onClick), onFocus = js.Any.fromFunction1(onFocus), prefixCls = prefixCls, readOnly = readOnly, style = style, tabIndex = tabIndex.asInstanceOf[js.Any], value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Props]
  }
}

