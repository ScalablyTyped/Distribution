package typings.reactSpring.webMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InterpolationConfig[T, U] extends js.Object {
  var output: js.Array[U] = js.native
  var range: js.Array[T] = js.native
}

object InterpolationConfig {
  @scala.inline
  def apply[T, U](output: js.Array[U], range: js.Array[T]): InterpolationConfig[T, U] = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterpolationConfig[T, U]]
  }
  @scala.inline
  implicit class InterpolationConfigOps[Self <: InterpolationConfig[_, _], T, U] (val x: Self with (InterpolationConfig[T, U])) extends AnyVal {
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
    def setOutputVarargs(value: U*): Self = this.set("output", js.Array(value :_*))
    @scala.inline
    def setOutput(value: js.Array[U]): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def setRangeVarargs(value: T*): Self = this.set("range", js.Array(value :_*))
    @scala.inline
    def setRange(value: js.Array[T]): Self = this.set("range", value.asInstanceOf[js.Any])
  }
  
}

