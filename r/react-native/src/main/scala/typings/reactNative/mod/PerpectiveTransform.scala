package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerpectiveTransform extends js.Object {
  var perspective: Double
}

object PerpectiveTransform {
  @scala.inline
  def apply(perspective: Double): PerpectiveTransform = {
    val __obj = js.Dynamic.literal(perspective = perspective.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PerpectiveTransform]
  }
}

