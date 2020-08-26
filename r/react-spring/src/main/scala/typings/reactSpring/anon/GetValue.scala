package typings.reactSpring.anon

import typings.reactSpring.webMod.InterpolationChain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetValue[T] extends js.Object {
  var interpolate: InterpolationChain[T] = js.native
  def getValue(): T = js.native
}

object GetValue {
  @scala.inline
  def apply[T](getValue: () => T, interpolate: InterpolationChain[T]): GetValue[T] = {
    val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction0(getValue), interpolate = interpolate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetValue[T]]
  }
  @scala.inline
  implicit class GetValueOps[Self <: GetValue[_], T] (val x: Self with GetValue[T]) extends AnyVal {
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
    def setGetValue(value: () => T): Self = this.set("getValue", js.Any.fromFunction0(value))
    @scala.inline
    def setInterpolate(value: InterpolationChain[T]): Self = this.set("interpolate", value.asInstanceOf[js.Any])
  }
  
}

