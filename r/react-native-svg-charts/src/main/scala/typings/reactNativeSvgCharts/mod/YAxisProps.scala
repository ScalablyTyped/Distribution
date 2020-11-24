package typings.reactNativeSvgCharts.mod

import typings.reactNativeSvgCharts.anon.Top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait YAxisProps[T] extends AxisProps[T] {
  
  var contentInset: js.UndefOr[Top] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var yAccessor: js.UndefOr[AccessorFunction[T, _]] = js.native
}
object YAxisProps {
  
  @scala.inline
  def apply[T](data: js.Array[T]): YAxisProps[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[YAxisProps[T]]
  }
  
  @scala.inline
  implicit class YAxisPropsOps[Self <: YAxisProps[_], T] (val x: Self with YAxisProps[T]) extends AnyVal {
    
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
    def setContentInset(value: Top): Self = this.set("contentInset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentInset: Self = this.set("contentInset", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setYAccessor(value: /* props */ AccessorFunctionProps[T] => _): Self = this.set("yAccessor", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteYAccessor: Self = this.set("yAccessor", js.undefined)
  }
}
