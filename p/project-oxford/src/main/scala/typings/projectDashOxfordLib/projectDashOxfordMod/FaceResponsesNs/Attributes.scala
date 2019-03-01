package typings
package projectDashOxfordLib.projectDashOxfordMod.FaceResponsesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributes extends js.Object {
  var age: scala.Double
  var gender: java.lang.String
  var headPose: projectDashOxfordLib.Anon_Pitch
}

object Attributes {
  @scala.inline
  def apply(age: scala.Double, gender: java.lang.String, headPose: projectDashOxfordLib.Anon_Pitch): Attributes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("age")(age)
    __obj.updateDynamic("gender")(gender)
    __obj.updateDynamic("headPose")(headPose)
    __obj.asInstanceOf[Attributes]
  }
}

