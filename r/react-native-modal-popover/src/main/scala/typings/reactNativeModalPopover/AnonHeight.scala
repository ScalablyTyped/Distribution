package typings.reactNativeModalPopover

import typings.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeight extends js.Object {
  var height: Requireable[Double]
  var width: Requireable[Double]
  var x: Requireable[Double]
  var y: Requireable[Double]
}

object AnonHeight {
  @scala.inline
  def apply(
    height: Requireable[Double],
    width: Requireable[Double],
    x: Requireable[Double],
    y: Requireable[Double]
  ): AnonHeight = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHeight]
  }
}

