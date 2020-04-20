package typings.rmcCascader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCols extends js.Object {
  var cols: Double
  var data: js.Array[scala.Nothing]
  var disabled: Boolean
  var pickerPrefixCls: String
  var prefixCls: String
}

object AnonCols {
  @scala.inline
  def apply(
    cols: Double,
    data: js.Array[scala.Nothing],
    disabled: Boolean,
    pickerPrefixCls: String,
    prefixCls: String
  ): AnonCols = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], pickerPrefixCls = pickerPrefixCls.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCols]
  }
}

