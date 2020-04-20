package typings.projectOxford.mod.FaceResponses

import typings.projectOxford.AnonPitch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributes extends js.Object {
  var age: Double
  var gender: String
  var headPose: AnonPitch
}

object Attributes {
  @scala.inline
  def apply(age: Double, gender: String, headPose: AnonPitch): Attributes = {
    val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], headPose = headPose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
}

