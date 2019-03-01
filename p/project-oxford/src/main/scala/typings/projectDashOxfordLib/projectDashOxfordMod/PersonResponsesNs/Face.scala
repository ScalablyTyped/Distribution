package typings
package projectDashOxfordLib.projectDashOxfordMod.PersonResponsesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Face extends js.Object {
  var faceId: java.lang.String
  var userData: java.lang.String
}

object Face {
  @scala.inline
  def apply(faceId: java.lang.String, userData: java.lang.String): Face = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("faceId")(faceId)
    __obj.updateDynamic("userData")(userData)
    __obj.asInstanceOf[Face]
  }
}

