package typings.prosemirrorState.anon

import typings.prosemirrorState.mod.EditorState
import typings.prosemirrorView.mod.EditorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Destroy[S /* <: typings.prosemirrorModel.mod.Schema[_, _] */] extends js.Object {
  var destroy: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  var update: js.UndefOr[
    (js.Function2[/* view */ EditorView[S], /* prevState */ EditorState[S], Unit]) | Null
  ] = js.undefined
}

object Destroy {
  @scala.inline
  def apply[/* <: typings.prosemirrorModel.mod.Schema[_, _] */ S](
    destroy: js.UndefOr[Null | (() => Unit)] = js.undefined,
    update: js.UndefOr[Null | ((/* view */ EditorView[S], /* prevState */ EditorState[S]) => Unit)] = js.undefined
  ): Destroy[S] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(destroy)) __obj.updateDynamic("destroy")(if (destroy != null) js.Any.fromFunction0(destroy.asInstanceOf[() => Unit]) else null)
    if (!js.isUndefined(update)) __obj.updateDynamic("update")(if (update != null) js.Any.fromFunction2(update.asInstanceOf[(/* view */ EditorView[S], /* prevState */ EditorState[S]) => Unit]) else null)
    __obj.asInstanceOf[Destroy[S]]
  }
}

