package typings.reactRnd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  x :number,   y :number} & react-rnd.react-rnd.Size */
@js.native
trait xnumberynumberSize extends js.Object {
  var height: String | Double = js.native
  var width: String | Double = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object xnumberynumberSize {
  @scala.inline
  def apply(height: String | Double, width: String | Double, x: Double, y: Double): xnumberynumberSize = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[xnumberynumberSize]
  }
  @scala.inline
  implicit class xnumberynumberSizeOps[Self <: xnumberynumberSize] (val x: Self) extends AnyVal {
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
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

