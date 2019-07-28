package typings.projectDashOxford.projectDashOxfordMod.PersonGroupResponsesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersonGroup extends js.Object {
  var name: String
  var personGroupId: String
  var userData: String
}

object PersonGroup {
  @scala.inline
  def apply(name: String, personGroupId: String, userData: String): PersonGroup = {
    val __obj = js.Dynamic.literal(name = name, personGroupId = personGroupId, userData = userData)
  
    __obj.asInstanceOf[PersonGroup]
  }
}

