package typings.rcRate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowClear extends js.Object {
  var allowClear: Boolean
  var allowHalf: Boolean
  var character: String
  var count: Double
  var defaultValue: Double
  var direction: String
  var onChange: js.Function0[Unit]
  var onHoverChange: js.Function0[Unit]
  var prefixCls: String
  var tabIndex: Double
}

object AllowClear {
  @scala.inline
  def apply(
    allowClear: Boolean,
    allowHalf: Boolean,
    character: String,
    count: Double,
    defaultValue: Double,
    direction: String,
    onChange: () => Unit,
    onHoverChange: () => Unit,
    prefixCls: String,
    tabIndex: Double
  ): AllowClear = {
    val __obj = js.Dynamic.literal(allowClear = allowClear.asInstanceOf[js.Any], allowHalf = allowHalf.asInstanceOf[js.Any], character = character.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), onHoverChange = js.Any.fromFunction0(onHoverChange), prefixCls = prefixCls.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowClear]
  }
}

