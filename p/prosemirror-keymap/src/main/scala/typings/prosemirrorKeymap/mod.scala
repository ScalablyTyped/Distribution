package typings.prosemirrorKeymap

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorState.mod.EditorState
import typings.prosemirrorState.mod.Plugin
import typings.prosemirrorState.mod.Transaction
import typings.prosemirrorView.mod.EditorView
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-keymap", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def keydownHandler[S /* <: Schema[_, _] */](
    bindings: StringDictionary[
      js.Function3[
        /* state */ EditorState[S], 
        /* dispatch */ js.Function1[/* tr */ Transaction[S], Unit], 
        /* view */ EditorView[S], 
        Boolean
      ]
    ]
  ): js.Function2[/* view */ EditorView[_], /* event */ KeyboardEvent, Boolean] = js.native
  def keymap[S /* <: Schema[_, _] */](
    bindings: StringDictionary[
      js.Function3[
        /* state */ EditorState[S], 
        /* dispatch */ js.Function1[/* tr */ Transaction[S], Unit], 
        /* view */ EditorView[S], 
        Boolean
      ]
    ]
  ): Plugin[_, _] = js.native
}

