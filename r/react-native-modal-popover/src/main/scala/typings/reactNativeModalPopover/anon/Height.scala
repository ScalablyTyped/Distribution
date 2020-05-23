package typings.reactNativeModalPopover.anon

import typings.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Height extends js.Object {
  var height: Requireable[Double]
  var width: Requireable[Double]
  var x: Requireable[Double]
  var y: Requireable[Double]
}

object Height {
  @scala.inline
  def apply(
    height: Requireable[Double],
    width: Requireable[Double],
    x: Requireable[Double],
    y: Requireable[Double]
  ): Height = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
}

