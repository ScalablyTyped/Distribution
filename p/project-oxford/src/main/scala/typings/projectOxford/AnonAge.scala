package typings.projectOxford

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAge extends js.Object {
  var age: Double
  var faceRectangle: AnonHeight
  var gender: String
}

object AnonAge {
  @scala.inline
  def apply(age: Double, faceRectangle: AnonHeight, gender: String): AnonAge = {
    val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], faceRectangle = faceRectangle.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAge]
  }
}

