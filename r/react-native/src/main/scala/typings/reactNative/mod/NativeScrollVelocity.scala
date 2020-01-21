package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeScrollVelocity extends js.Object {
  var x: Double
  var y: Double
}

object NativeScrollVelocity {
  @scala.inline
  def apply(x: Double, y: Double): NativeScrollVelocity = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NativeScrollVelocity]
  }
}

