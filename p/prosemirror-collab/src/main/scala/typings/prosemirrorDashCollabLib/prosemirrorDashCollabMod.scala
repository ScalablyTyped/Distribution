package typings
package prosemirrorDashCollabLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-collab", JSImport.Namespace)
@js.native
object prosemirrorDashCollabMod extends js.Object {
  def collab(): prosemirrorDashStateLib.prosemirrorDashStateMod.Plugin[_, _] = js.native
  def collab(config: prosemirrorDashCollabLib.Anon_ClientID): prosemirrorDashStateLib.prosemirrorDashStateMod.Plugin[_, _] = js.native
  def getVersion(state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[_]): scala.Double = js.native
  def receiveTransaction[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S],
    steps: js.Array[prosemirrorDashTransformLib.prosemirrorDashTransformMod.Step[S]],
    clientIDs: js.Array[scala.Double | java.lang.String]
  ): prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S] = js.native
  def sendableSteps[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S]): js.UndefOr[prosemirrorDashCollabLib.Anon_ClientIDOrigins[S] | scala.Null] = js.native
}

