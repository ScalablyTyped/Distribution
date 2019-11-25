package typings.prosemirrorDashCollab

import typings.prosemirrorDashModel.prosemirrorDashModelMod.Schema
import typings.prosemirrorDashState.prosemirrorDashStateMod.Transaction
import typings.prosemirrorDashTransform.prosemirrorDashTransformMod.Step
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientIDOrigins[S /* <: Schema[_, _] */] extends js.Object {
  var clientID: Double | String
  var origins: js.Array[Transaction[S]]
  var steps: js.Array[Step[S]]
  var version: Double
}

object Anon_ClientIDOrigins {
  @scala.inline
  def apply[S /* <: Schema[_, _] */](
    clientID: Double | String,
    origins: js.Array[Transaction[S]],
    steps: js.Array[Step[S]],
    version: Double
  ): Anon_ClientIDOrigins[S] = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], origins = origins.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ClientIDOrigins[S]]
  }
}

