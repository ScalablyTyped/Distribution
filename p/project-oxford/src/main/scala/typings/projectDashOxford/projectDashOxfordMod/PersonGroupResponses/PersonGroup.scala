package typings.projectDashOxford.projectDashOxfordMod.PersonGroupResponses

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
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], personGroupId = personGroupId.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PersonGroup]
  }
}

