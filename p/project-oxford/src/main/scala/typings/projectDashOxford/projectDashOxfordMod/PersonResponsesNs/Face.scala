package typings.projectDashOxford.projectDashOxfordMod.PersonResponsesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Face extends js.Object {
  var faceId: String
  var userData: String
}

object Face {
  @scala.inline
  def apply(faceId: String, userData: String): Face = {
    val __obj = js.Dynamic.literal(faceId = faceId, userData = userData)
  
    __obj.asInstanceOf[Face]
  }
}

