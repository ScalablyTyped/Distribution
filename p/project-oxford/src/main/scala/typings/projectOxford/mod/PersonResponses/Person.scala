package typings.projectOxford.mod.PersonResponses

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
    val __obj = js.Dynamic.literal(faceIds = faceIds.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], personId = personId.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Person]
  }
}

