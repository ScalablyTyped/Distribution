package typings.reactNativeModalPopover.anon

import typings.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Height extends js.Object {
  var height: Requireable[Double] = js.native
  var width: Requireable[Double] = js.native
  var x: Requireable[Double] = js.native
  var y: Requireable[Double] = js.native
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
  @scala.inline
  implicit class HeightOps[Self <: Height] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHeight(value: Requireable[Double]): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Requireable[Double]): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Requireable[Double]): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Requireable[Double]): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

