package typings
package projectDashOxfordLib.projectDashOxfordMod.PersonGroupResponsesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersonGroup extends js.Object {
  var name: java.lang.String
  var personGroupId: java.lang.String
  var userData: java.lang.String
}

object PersonGroup {
  @scala.inline
  def apply(name: java.lang.String, personGroupId: java.lang.String, userData: java.lang.String): PersonGroup = {
    val __obj = js.Dynamic.literal(name = name, personGroupId = personGroupId, userData = userData)
  
    __obj.asInstanceOf[PersonGroup]
  }
}

