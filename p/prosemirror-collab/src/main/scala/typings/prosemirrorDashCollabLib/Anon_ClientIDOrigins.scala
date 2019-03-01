package typings
package prosemirrorDashCollabLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientIDOrigins[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] extends js.Object {
  var clientID: scala.Double | java.lang.String
  var origins: js.Array[prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S]]
  var steps: js.Array[prosemirrorDashTransformLib.prosemirrorDashTransformMod.Step[S]]
  var version: scala.Double
}

object Anon_ClientIDOrigins {
  @scala.inline
  def apply[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    clientID: scala.Double | java.lang.String,
    origins: js.Array[prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S]],
    steps: js.Array[prosemirrorDashTransformLib.prosemirrorDashTransformMod.Step[S]],
    version: scala.Double
  ): Anon_ClientIDOrigins[S] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clientID")(clientID.asInstanceOf[js.Any])
    __obj.updateDynamic("origins")(origins)
    __obj.updateDynamic("steps")(steps)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Anon_ClientIDOrigins[S]]
  }
}

