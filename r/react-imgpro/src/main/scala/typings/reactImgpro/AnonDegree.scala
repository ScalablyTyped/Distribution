package typings.reactImgpro

import typings.reactImgpro.mod.ReactImgpro.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDegree extends js.Object {
  var degree: Double
  var mode: Mode
}

object AnonDegree {
  @scala.inline
  def apply(degree: Double, mode: Mode): AnonDegree = {
    val __obj = js.Dynamic.literal(degree = degree.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDegree]
  }
}

