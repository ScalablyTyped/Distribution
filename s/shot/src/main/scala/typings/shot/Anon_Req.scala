package typings.shot

import typings.shot.shotMod.SimulatedRequestObject
import typings.shot.shotMod.SimulatedResponseObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Req extends js.Object {
  /** the simulated request object. */
  var req: SimulatedRequestObject
  /** the simulated response object. */
  var res: SimulatedResponseObject
}

object Anon_Req {
  @scala.inline
  def apply(req: SimulatedRequestObject, res: SimulatedResponseObject): Anon_Req = {
    val __obj = js.Dynamic.literal(req = req, res = res)
  
    __obj.asInstanceOf[Anon_Req]
  }
}

