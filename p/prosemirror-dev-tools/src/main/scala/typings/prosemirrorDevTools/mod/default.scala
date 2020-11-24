package typings.prosemirrorDevTools.mod

import typings.prosemirrorView.mod.EditorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prosemirror-dev-tools", JSImport.Default)
@js.native
object default extends js.Object {
  
  /**
    * Wraps the EditorView instance in the applyDevTools.
    */
  def apply(view: EditorView[_]): Unit = js.native
  def apply(view: EditorView[_], options: ApplyDevToolsOptions): Unit = js.native
}
