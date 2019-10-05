package typings.projectDashOxford.projectDashOxfordMod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identify extends js.Object {
  var maxNumOfCandidatesReturned: Double
  var personGroupId: String
}

object Identify {
  @scala.inline
  def apply(maxNumOfCandidatesReturned: Double, personGroupId: String): Identify = {
    val __obj = js.Dynamic.literal(maxNumOfCandidatesReturned = maxNumOfCandidatesReturned, personGroupId = personGroupId)
  
    __obj.asInstanceOf[Identify]
  }
}

