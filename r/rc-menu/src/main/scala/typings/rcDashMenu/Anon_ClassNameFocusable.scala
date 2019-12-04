package typings.rcDashMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassNameFocusable extends js.Object {
  var className: String
  var focusable: Boolean
  var inlineIndent: Double
  var level: Double
  var manualRef: js.Function0[Unit]
  var mode: String
  var prefixCls: String
  var visible: Boolean
}

object Anon_ClassNameFocusable {
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
  ): Anon_ClassNameFocusable = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], inlineIndent = inlineIndent.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], manualRef = js.Any.fromFunction0(manualRef), mode = mode.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ClassNameFocusable]
  }
}

