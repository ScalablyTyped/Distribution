package typings.prosemirrorCollab

import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorState.mod.EditorState
import typings.prosemirrorState.mod.Plugin
import typings.prosemirrorState.mod.Transaction
import typings.prosemirrorTransform.mod.Step
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-collab", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def collab(): Plugin[_, _] = js.native
  def collab(config: AnonClientID): Plugin[_, _] = js.native
  def getVersion(state: EditorState[_]): Double = js.native
  def receiveTransaction[S /* <: Schema[_, _] */](state: EditorState[S], steps: js.Array[Step[S]], clientIDs: js.Array[Double | String]): Transaction[S] = js.native
  def sendableSteps[S /* <: Schema[_, _] */](state: EditorState[S]): js.UndefOr[AnonClientIDOrigins[S] | Null] = js.native
}

