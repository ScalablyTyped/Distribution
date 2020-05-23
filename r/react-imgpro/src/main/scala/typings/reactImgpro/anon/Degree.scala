package typings.reactImgpro.anon

import typings.reactImgpro.mod.ReactImgpro.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Degree extends js.Object {
  var degree: Double
  var mode: Mode
}

object Degree {
  @scala.inline
  def apply(degree: Double, mode: Mode): Degree = {
    val __obj = js.Dynamic.literal(degree = degree.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Degree]
  }
}

