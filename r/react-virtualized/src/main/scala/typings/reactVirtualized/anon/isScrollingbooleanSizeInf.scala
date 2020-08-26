package typings.reactVirtualized.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  isScrolling :boolean} & react-virtualized.react-virtualized.SizeInfo */
@js.native
trait isScrollingbooleanSizeInf extends js.Object {
  var height: Double = js.native
  var isScrolling: Boolean = js.native
  var width: Double = js.native
}

object isScrollingbooleanSizeInf {
  @scala.inline
  def apply(height: Double, isScrolling: Boolean, width: Double): isScrollingbooleanSizeInf = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[isScrollingbooleanSizeInf]
  }
  @scala.inline
  implicit class isScrollingbooleanSizeInfOps[Self <: isScrollingbooleanSizeInf] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsScrolling(value: Boolean): Self = this.set("isScrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

