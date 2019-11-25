package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerPosition extends js.Object {
  var Left: Double
  var Right: Double
}

object DrawerPosition {
  @scala.inline
  def apply(Left: Double, Right: Double): DrawerPosition = {
    val __obj = js.Dynamic.literal(Left = Left.asInstanceOf[js.Any], Right = Right.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DrawerPosition]
  }
}

