package typings.prosemirrorKeymap

import typings.prosemirrorCommands.mod.Keymap
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorState.mod.Plugin
import typings.prosemirrorView.mod.EditorView
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-keymap", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def keydownHandler[S /* <: Schema[_, _] */](bindings: Keymap[S]): js.Function2[/* view */ EditorView[_], /* event */ KeyboardEvent, Boolean] = js.native
  def keymap[S /* <: Schema[_, _] */](bindings: Keymap[S]): Plugin[_, _] = js.native
}

