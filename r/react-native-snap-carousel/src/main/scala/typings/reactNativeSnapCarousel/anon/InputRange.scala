package typings.reactNativeSnapCarousel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputRange extends js.Object {
  var inputRange: js.Array[Double] = js.native
  var outputRange: js.Array[Double] = js.native
}

object InputRange {
  @scala.inline
  def apply(inputRange: js.Array[Double], outputRange: js.Array[Double]): InputRange = {
    val __obj = js.Dynamic.literal(inputRange = inputRange.asInstanceOf[js.Any], outputRange = outputRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputRange]
  }
  @scala.inline
  implicit class InputRangeOps[Self <: InputRange] (val x: Self) extends AnyVal {
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
    def setInputRangeVarargs(value: Double*): Self = this.set("inputRange", js.Array(value :_*))
    @scala.inline
    def setInputRange(value: js.Array[Double]): Self = this.set("inputRange", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputRangeVarargs(value: Double*): Self = this.set("outputRange", js.Array(value :_*))
    @scala.inline
    def setOutputRange(value: js.Array[Double]): Self = this.set("outputRange", value.asInstanceOf[js.Any])
  }
  
}

