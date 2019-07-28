package typings.projectDashOxford

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Age extends js.Object {
  var age: Double
  var faceRectangle: Anon_Height
  var gender: String
}

object Anon_Age {
  @scala.inline
  def apply(age: Double, faceRectangle: Anon_Height, gender: String): Anon_Age = {
    val __obj = js.Dynamic.literal(age = age, faceRectangle = faceRectangle, gender = gender)
  
    __obj.asInstanceOf[Anon_Age]
  }
}

