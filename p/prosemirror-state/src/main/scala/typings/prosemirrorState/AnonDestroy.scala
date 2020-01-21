package typings.prosemirrorState

import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorState.mod.EditorState
import typings.prosemirrorView.mod.EditorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDestroy[S /* <: Schema[_, _] */] extends js.Object {
  var destroy: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  var update: js.UndefOr[
    (js.Function2[/* view */ EditorView[S], /* prevState */ EditorState[S], Unit]) | Null
  ] = js.undefined
}

object AnonDestroy {
  @scala.inline
  def apply[S /* <: Schema[_, _] */](
    destroy: () => Unit = null,
    update: (/* view */ EditorView[S], /* prevState */ EditorState[S]) => Unit = null
  ): AnonDestroy[S] = {
    val __obj = js.Dynamic.literal()
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction2(update))
    __obj.asInstanceOf[AnonDestroy[S]]
  }
}

