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
    onClose: () => scala.Unit,
    onOpen: () => scala.Unit,
    prefixCls: java.lang.String,
    right: js.Array[scala.Nothing]
  ): Anon_AutoClose = {
    val __obj = js.Dynamic.literal(autoClose = autoClose, disabled = disabled, left = left, onClose = js.Any.fromFunction0(onClose), onOpen = js.Any.fromFunction0(onOpen), prefixCls = prefixCls, right = right)
  
    __obj.asInstanceOf[Anon_AutoClose]
  }
}

