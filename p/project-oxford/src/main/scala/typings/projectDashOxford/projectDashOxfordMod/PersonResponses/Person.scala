package typings.projectDashOxford.projectDashOxfordMod.PersonResponses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Person extends js.Object {
  var faceIds: js.Array[String]
  var name: String
  var personId: String
  var userData: String
}

object Person {
  @scala.inline
  def apply(faceIds: js.Array[String], name: String, personId: String, userData: String): Person = {
    val __obj = js.Dynamic.literal(faceIds = faceIds, name = name, personId = personId, userData = userData)
  
    __obj.asInstanceOf[Person]
  }
}

