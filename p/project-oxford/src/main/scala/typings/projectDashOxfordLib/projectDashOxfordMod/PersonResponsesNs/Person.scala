package typings
package projectDashOxfordLib.projectDashOxfordMod.PersonResponsesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Person extends js.Object {
  var faceIds: js.Array[java.lang.String]
  var name: java.lang.String
  var personId: java.lang.String
  var userData: java.lang.String
}

object Person {
  @scala.inline
  def apply(
    faceIds: js.Array[java.lang.String],
    name: java.lang.String,
    personId: java.lang.String,
    userData: java.lang.String
  ): Person = {
    val __obj = js.Dynamic.literal(faceIds = faceIds, name = name, personId = personId, userData = userData)
  
    __obj.asInstanceOf[Person]
  }
}

