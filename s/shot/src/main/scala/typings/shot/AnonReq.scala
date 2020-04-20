package typings.shot

import typings.shot.mod.SimulatedRequestObject
import typings.shot.mod.SimulatedResponseObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReq extends js.Object {
  /** the simulated request object. */
  var req: SimulatedRequestObject
  /** the simulated response object. */
  var res: SimulatedResponseObject
}

object AnonReq {
  @scala.inline
  def apply(req: SimulatedRequestObject, res: SimulatedResponseObject): AnonReq = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReq]
  }
}

