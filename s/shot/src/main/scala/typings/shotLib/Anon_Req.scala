package typings
package shotLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Req extends js.Object {
  /** the simulated request object. */
  var req: shotLib.shotMod.SimulatedRequestObject
  /** the simulated response object. */
  var res: shotLib.shotMod.SimulatedResponseObject
}

object Anon_Req {
  @scala.inline
  def apply(req: shotLib.shotMod.SimulatedRequestObject, res: shotLib.shotMod.SimulatedResponseObject): Anon_Req = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("req")(req)
    __obj.updateDynamic("res")(res)
    __obj.asInstanceOf[Anon_Req]
  }
}

