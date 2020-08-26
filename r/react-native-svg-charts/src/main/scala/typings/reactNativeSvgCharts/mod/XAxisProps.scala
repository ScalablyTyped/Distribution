package typings.reactNativeSvgCharts.mod

import typings.reactNativeSvgCharts.anon.Left
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XAxisProps[T] extends AxisProps[T] {
  var contentInset: js.UndefOr[Left] = js.native
  var xAccessor: js.UndefOr[AccessorFunction[T, _]] = js.native
}

object XAxisProps {
  @scala.inline
  def apply[T](data: js.Array[T]): XAxisProps[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[XAxisProps[T]]
  }
  @scala.inline
  implicit class XAxisPropsOps[Self <: XAxisProps[_], T] (val x: Self with XAxisProps[T]) extends AnyVal {
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
    def setContentInset(value: Left): Self = this.set("contentInset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentInset: Self = this.set("contentInset", js.undefined)
    @scala.inline
    def setXAccessor(value: /* props */ AccessorFunctionProps[T] => _): Self = this.set("xAccessor", js.Any.fromFunction1(value))
    @scala.inline
    def deleteXAccessor: Self = this.set("xAccessor", js.undefined)
  }
  
}

