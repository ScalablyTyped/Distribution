package typings.rcDashMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassName extends js.Object {
  var className: String
  var focusable: Boolean
  var inlineIndent: Double
  var level: Double
  var manualRef: js.Function0[Unit]
  var mode: String
  var prefixCls: String
  var visible: Boolean
}

object Anon_ClassName {
  @scala.inline
  def apply(
    className: String,
    focusable: Boolean,
    inlineIndent: Double,
    level: Double,
    manualRef: () => Unit,
    mode: String,
    prefixCls: String,
    visible: Boolean
  ): Anon_ClassName = {
    val __obj = js.Dynamic.literal(className = className, focusable = focusable, inlineIndent = inlineIndent, level = level, manualRef = js.Any.fromFunction0(manualRef), mode = mode, prefixCls = prefixCls, visible = visible)
  
    __obj.asInstanceOf[Anon_ClassName]
  }
}

