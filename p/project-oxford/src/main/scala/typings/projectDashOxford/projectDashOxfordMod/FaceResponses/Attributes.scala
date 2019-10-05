package typings.projectDashOxford.projectDashOxfordMod.FaceResponses

import typings.projectDashOxford.Anon_Pitch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributes extends js.Object {
  var age: Double
  var gender: String
  var headPose: Anon_Pitch
}

object Attributes {
  @scala.inline
  def apply(age: Double, gender: String, headPose: Anon_Pitch): Attributes = {
    val __obj = js.Dynamic.literal(age = age, gender = gender, headPose = headPose)
  
    __obj.asInstanceOf[Attributes]
  }
}

