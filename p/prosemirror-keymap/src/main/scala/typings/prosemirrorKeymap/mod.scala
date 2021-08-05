package typings.prosemirrorKeymap

import typings.prosemirrorCommands.mod.Keymap
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorState.mod.Plugin
import typings.prosemirrorView.mod.EditorView
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prosemirror-keymap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def keydownHandler[S /* <: Schema[js.Any, js.Any] */](bindings: Keymap[S]): js.Function2[/* view */ EditorView[js.Any], /* event */ KeyboardEvent, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("keydownHandler")(bindings.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* view */ EditorView[js.Any], /* event */ KeyboardEvent, Boolean]]
  
  inline def keymap[S /* <: Schema[js.Any, js.Any] */](bindings: Keymap[S]): Plugin[js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("keymap")(bindings.asInstanceOf[js.Any]).asInstanceOf[Plugin[js.Any, js.Any]]
}
