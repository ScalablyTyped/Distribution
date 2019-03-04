package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerPosition extends js.Object {
  var Left: scala.Double
  var Right: scala.Double
}

object DrawerPosition {
  @scala.inline
  def apply(Left: scala.Double, Right: scala.Double): DrawerPosition = {
    val __obj = js.Dynamic.literal(Left = Left, Right = Right)
  
    __obj.asInstanceOf[DrawerPosition]
  }
}

