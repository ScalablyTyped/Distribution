package typings.prosemirrorKeymap

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorState.mod.Plugin
import typings.prosemirrorView.mod.EditorView
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-keymap", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def keydownHandler(bindings: StringDictionary[js.Any]): js.Function2[/* view */ EditorView[_], /* event */ Event_, Boolean] = js.native
  def keymap(bindings: StringDictionary[js.Any]): Plugin[_, _] = js.native
}

