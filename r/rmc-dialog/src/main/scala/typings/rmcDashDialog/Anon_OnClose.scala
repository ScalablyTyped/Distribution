package typings.rmcDashDialog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnClose extends js.Object {
  var onClose: js.Function0[Unit]
  var prefixCls: String
  var visible: Boolean
}

object Anon_OnClose {
  @scala.inline
  def apply(onClose: () => Unit, prefixCls: String, visible: Boolean): Anon_OnClose = {
    val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction0(onClose), prefixCls = prefixCls, visible = visible)
  
    __obj.asInstanceOf[Anon_OnClose]
  }
}

