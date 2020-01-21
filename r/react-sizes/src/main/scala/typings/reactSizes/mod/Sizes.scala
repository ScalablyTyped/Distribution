package typings.reactSizes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sizes extends js.Object {
  var height: Double
  var width: Double
}

object Sizes {
  @scala.inline
  def apply(height: Double, width: Double): Sizes = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Sizes]
  }
}

