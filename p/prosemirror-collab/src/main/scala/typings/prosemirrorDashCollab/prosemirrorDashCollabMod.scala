package typings.prosemirrorDashCollab

import typings.prosemirrorDashModel.prosemirrorDashModelMod.Schema
import typings.prosemirrorDashState.prosemirrorDashStateMod.EditorState
import typings.prosemirrorDashState.prosemirrorDashStateMod.Plugin
import typings.prosemirrorDashState.prosemirrorDashStateMod.Transaction
import typings.prosemirrorDashTransform.prosemirrorDashTransformMod.Step
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-collab", JSImport.Namespace)
@js.native
object prosemirrorDashCollabMod extends js.Object {
  def collab(): Plugin[_, _] = js.native
  def collab(config: Anon_ClientID): Plugin[_, _] = js.native
  def getVersion(state: EditorState[_]): Double = js.native
  def receiveTransaction[S /* <: Schema[_, _] */](state: EditorState[S], steps: js.Array[Step[S]], clientIDs: js.Array[Double | String]): Transaction[S] = js.native
  def sendableSteps[S /* <: Schema[_, _] */](state: EditorState[S]): js.UndefOr[Anon_ClientIDOrigins[S] | Null] = js.native
}

