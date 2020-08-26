package typings.rcSlider.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassName extends js.Object {
  var className: js.Any = js.native
  var included: js.Any = js.native
  var lowerBound: js.Any = js.native
  var marks: js.Any = js.native
  var max: js.Any = js.native
  var min: js.Any = js.native
  var onClickLabel: js.Any = js.native
  var reverse: js.Any = js.native
  var upperBound: js.Any = js.native
  var vertical: js.Any = js.native
}

object ClassName {
  @scala.inline
  def apply(
    className: js.Any,
    included: js.Any,
    lowerBound: js.Any,
    marks: js.Any,
    max: js.Any,
    min: js.Any,
    onClickLabel: js.Any,
    reverse: js.Any,
    upperBound: js.Any,
    vertical: js.Any
  ): ClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], included = included.asInstanceOf[js.Any], lowerBound = lowerBound.asInstanceOf[js.Any], marks = marks.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], onClickLabel = onClickLabel.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], upperBound = upperBound.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName]
  }
  @scala.inline
  implicit class ClassNameOps[Self <: ClassName] (val x: Self) extends AnyVal {
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
    def setClassName(value: js.Any): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncluded(value: js.Any): Self = this.set("included", value.asInstanceOf[js.Any])
    @scala.inline
    def setLowerBound(value: js.Any): Self = this.set("lowerBound", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarks(value: js.Any): Self = this.set("marks", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax(value: js.Any): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: js.Any): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnClickLabel(value: js.Any): Self = this.set("onClickLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setReverse(value: js.Any): Self = this.set("reverse", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpperBound(value: js.Any): Self = this.set("upperBound", value.asInstanceOf[js.Any])
    @scala.inline
    def setVertical(value: js.Any): Self = this.set("vertical", value.asInstanceOf[js.Any])
  }
  
}

