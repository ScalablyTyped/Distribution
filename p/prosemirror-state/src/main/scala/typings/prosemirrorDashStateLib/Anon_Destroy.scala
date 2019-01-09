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

