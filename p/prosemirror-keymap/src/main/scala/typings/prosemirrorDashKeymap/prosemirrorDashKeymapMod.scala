package typings.prosemirrorDashKeymap

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorDashState.prosemirrorDashStateMod.Plugin
import typings.prosemirrorDashView.prosemirrorDashViewMod.EditorView
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-keymap", JSImport.Namespace)
@js.native
object prosemirrorDashKeymapMod extends js.Object {
  def keydownHandler(bindings: StringDictionary[js.Any]): js.Function2[/* view */ EditorView[_], /* event */ Event, Boolean] = js.native
  def keymap(bindings: StringDictionary[js.Any]): Plugin[_, _] = js.native
}

