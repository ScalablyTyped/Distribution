package typings.rcDashEditorDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MultiLines extends js.Object {
  var multiLines: Boolean
  var plugins: js.Array[scala.Nothing]
  var prefixCls: String
  var spilitLine: String
  var toolbars: js.Array[scala.Nothing]
}

object Anon_MultiLines {
  @scala.inline
  def apply(
    multiLines: Boolean,
    plugins: js.Array[scala.Nothing],
    prefixCls: String,
    spilitLine: String,
    toolbars: js.Array[scala.Nothing]
  ): Anon_MultiLines = {
    val __obj = js.Dynamic.literal(multiLines = multiLines, plugins = plugins, prefixCls = prefixCls, spilitLine = spilitLine, toolbars = toolbars)
  
    __obj.asInstanceOf[Anon_MultiLines]
  }
}

