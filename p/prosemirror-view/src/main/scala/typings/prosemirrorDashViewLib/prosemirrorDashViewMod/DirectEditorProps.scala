package typings
package prosemirrorDashViewLib.prosemirrorDashViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectEditorProps[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] extends EditorProps[S] {
  /**
    * The callback over which to send transactions (state updates)
    * produced by the view. If you specify this, you probably want to
    * make sure this ends up calling the view's
    * [`updateState`](#view.EditorView.updateState) method with a new
    * state that has the transaction
    * [applied](#state.EditorState.apply).
    */
  var dispatchTransaction: js.UndefOr[
    (js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Transaction<S> */ /* tr */ js.Any, 
      scala.Unit
    ]) | scala.Null
  ] = js.undefined
  /**
    * The current state of the editor.
    */
  var state: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify EditorState<S> */ js.Any
}

