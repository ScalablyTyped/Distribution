package typings
package projectDashOxfordLib.projectDashOxfordMod.OptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identify extends js.Object {
  var maxNumOfCandidatesReturned: scala.Double
  var personGroupId: java.lang.String
}

object Identify {
  @scala.inline
  def apply(maxNumOfCandidatesReturned: scala.Double, personGroupId: java.lang.String): Identify = {
    val __obj = js.Dynamic.literal(maxNumOfCandidatesReturned = maxNumOfCandidatesReturned, personGroupId = personGroupId)
  
    __obj.asInstanceOf[Identify]
  }
}

