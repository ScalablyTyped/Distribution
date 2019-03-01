package typings
package projectDashOxfordLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Age extends js.Object {
  var age: scala.Double
  var faceRectangle: Anon_Height
  var gender: java.lang.String
}

object Anon_Age {
  @scala.inline
  def apply(age: scala.Double, faceRectangle: Anon_Height, gender: java.lang.String): Anon_Age = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("age")(age)
    __obj.updateDynamic("faceRectangle")(faceRectangle)
    __obj.updateDynamic("gender")(gender)
    __obj.asInstanceOf[Anon_Age]
  }
}

