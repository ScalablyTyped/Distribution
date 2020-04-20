package typings.seleniumWebdriver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISize extends js.Object {
  var height: Double
  var width: Double
}

object ISize {
  @scala.inline
  def apply(height: Double, width: Double): ISize = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISize]
  }
}

