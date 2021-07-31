package typings.prosemirrorCollab

import typings.prosemirrorCollab.anon.ClientID
import typings.prosemirrorCollab.anon.MapSelectionBackward
import typings.prosemirrorCollab.anon.Origins
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorState.mod.EditorState
import typings.prosemirrorState.mod.Plugin
import typings.prosemirrorState.mod.Transaction
import typings.prosemirrorTransform.mod.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prosemirror-collab", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def collab(): Plugin[js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("collab")().asInstanceOf[Plugin[js.Any, js.Any]]
  @scala.inline
  def collab(config: ClientID): Plugin[js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("collab")(config.asInstanceOf[js.Any]).asInstanceOf[Plugin[js.Any, js.Any]]
  
  @scala.inline
  def getVersion(state: EditorState[js.Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersion")(state.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def receiveTransaction[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S], steps: js.Array[Step[S]], clientIDs: js.Array[Double | String]): Transaction[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("receiveTransaction")(state.asInstanceOf[js.Any], steps.asInstanceOf[js.Any], clientIDs.asInstanceOf[js.Any])).asInstanceOf[Transaction[S]]
  @scala.inline
  def receiveTransaction[S /* <: Schema[js.Any, js.Any] */](
    state: EditorState[S],
    steps: js.Array[Step[S]],
    clientIDs: js.Array[Double | String],
    options: MapSelectionBackward
  ): Transaction[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("receiveTransaction")(state.asInstanceOf[js.Any], steps.asInstanceOf[js.Any], clientIDs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Transaction[S]]
  
  @scala.inline
  def sendableSteps[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S]): js.UndefOr[Origins[S] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendableSteps")(state.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Origins[S] | Null]]
}
