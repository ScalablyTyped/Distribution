package typings
package rmcDashDialogLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnClose extends js.Object {
  var onClose: js.Function0[scala.Unit]
  var prefixCls: java.lang.String
  var visible: scala.Boolean
}

object Anon_OnClose {
  @scala.inline
  def apply(onClose: () => scala.Unit, prefixCls: java.lang.String, visible: scala.Boolean): Anon_OnClose = {
    val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction0(onClose), prefixCls = prefixCls, visible = visible)
  
    __obj.asInstanceOf[Anon_OnClose]
  }
}

