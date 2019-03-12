package typings
package prosemirrorDashStateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Destroy[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] extends js.Object {
  var destroy: js.UndefOr[js.Function0[scala.Unit] | scala.Null] = js.undefined
  var update: js.UndefOr[
    (js.Function2[
      /* view */ prosemirrorDashViewLib.prosemirrorDashViewMod.EditorView[S], 
      /* prevState */ prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S], 
      scala.Unit
    ]) | scala.Null
  ] = js.undefined
}

object Anon_Destroy {
  @scala.inline
  def apply[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    destroy: () => scala.Unit = null,
    update: (/* view */ prosemirrorDashViewLib.prosemirrorDashViewMod.EditorView[S], /* prevState */ prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S]) => scala.Unit = null
  ): Anon_Destroy[S] = {
    val __obj = js.Dynamic.literal()
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction2(update))
    __obj.asInstanceOf[Anon_Destroy[S]]
  }
}

