package typings
package rcDashSwipeoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoClose extends js.Object {
  var autoClose: scala.Boolean
  var disabled: scala.Boolean
  var left: js.Array[scala.Nothing]
  var prefixCls: java.lang.String
  var right: js.Array[scala.Nothing]
  def onClose(): scala.Unit
  def onOpen(): scala.Unit
}

object Anon_AutoClose {
  @scala.inline
  def apply(
    autoClose: scala.Boolean,
    disabled: scala.Boolean,
    left: js.Array[scala.Nothing],
    onClose: js.Function0[scala.Unit],
    onOpen: js.Function0[scala.Unit],
    prefixCls: java.lang.String,
    right: js.Array[scala.Nothing]
  ): Anon_AutoClose = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autoClose")(autoClose)
    __obj.updateDynamic("disabled")(disabled)
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("onClose")(onClose)
    __obj.updateDynamic("onOpen")(onOpen)
    __obj.updateDynamic("prefixCls")(prefixCls)
    __obj.updateDynamic("right")(right)
    __obj.asInstanceOf[Anon_AutoClose]
  }
}

