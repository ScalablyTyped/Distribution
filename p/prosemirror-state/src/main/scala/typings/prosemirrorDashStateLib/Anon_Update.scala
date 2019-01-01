package typings
package prosemirrorDashStateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Update[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] extends js.Object {
  var destroy: js.UndefOr[js.Function0[scala.Unit] | scala.Null] = js.undefined
  var update: js.UndefOr[
    (js.Function2[
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify EditorView<S> */ /* view */ js.Any, 
      /* prevState */ prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S], 
      scala.Unit
    ]) | scala.Null
  ] = js.undefined
}

