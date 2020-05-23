package typings.projectOxford.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Age extends js.Object {
  var age: Double
  var faceRectangle: Height
  var gender: String
}

object Age {
  @scala.inline
  def apply(age: Double, faceRectangle: Height, gender: String): Age = {
    val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], faceRectangle = faceRectangle.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any])
    __obj.asInstanceOf[Age]
  }
}

