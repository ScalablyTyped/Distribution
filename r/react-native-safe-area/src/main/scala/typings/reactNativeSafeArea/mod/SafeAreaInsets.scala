package typings.reactNativeSafeArea.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// from `TypeDefinition.js`
trait SafeAreaInsets extends js.Object {
  var bottom: Double
  var left: Double
  var right: Double
  var top: Double
}

object SafeAreaInsets {
  @scala.inline
  def apply(bottom: Double, left: Double, right: Double, top: Double): SafeAreaInsets = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafeAreaInsets]
  }
}

