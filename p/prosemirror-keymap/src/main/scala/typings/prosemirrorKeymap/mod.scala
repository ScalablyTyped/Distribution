package typings.prosemirrorKeymap

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorState.mod.Command
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
  
  /**
  Given a set of bindings (using the same format as
  [`keymap`](https://prosemirror.net/docs/ref/#keymap.keymap)), return a [keydown
  handler](https://prosemirror.net/docs/ref/#view.EditorProps.handleKeyDown) that handles them.
  */
  inline def keydownHandler(bindings: StringDictionary[Command]): js.Function2[/* view */ EditorView, /* event */ KeyboardEvent, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("keydownHandler")(bindings.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* view */ EditorView, /* event */ KeyboardEvent, Boolean]]
  
  /**
  Create a keymap plugin for the given set of bindings.
  Bindings should map key names to [command](https://prosemirror.net/docs/ref/#commands)-style
  functions, which will be called with `(EditorState, dispatch,
  EditorView)` arguments, and should return true when they've handled
  the key. Note that the view argument isn't part of the command
  protocol, but can be used as an escape hatch if a binding needs to
  directly interact with the UI.
  Key names may be strings like `"Shift-Ctrl-Enter"`—a key
  identifier prefixed with zero or more modifiers. Key identifiers
  are based on the strings that can appear in
  [`KeyEvent.key`](https:developer.mozilla.org/en-US/docs/Web/API/KeyboardEvent/key).
  Use lowercase letters to refer to letter keys (or uppercase letters
  if you want shift to be held). You may use `"Space"` as an alias
  for the `" "` name.
  Modifiers can be given in any order. `Shift-` (or `s-`), `Alt-` (or
  `a-`), `Ctrl-` (or `c-` or `Control-`) and `Cmd-` (or `m-` or
  `Meta-`) are recognized. For characters that are created by holding
  shift, the `Shift-` prefix is implied, and should not be added
  explicitly.
  You can use `Mod-` as a shorthand for `Cmd-` on Mac and `Ctrl-` on
  other platforms.
  You can add multiple keymap plugins to an editor. The order in
  which they appear determines their precedence (the ones early in
  the array get to dispatch first).
  */
  inline def keymap(bindings: StringDictionary[Command]): Plugin[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("keymap")(bindings.asInstanceOf[js.Any]).asInstanceOf[Plugin[Any]]
}
