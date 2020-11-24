package typings.reactVis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkSeriesProps extends AbstractSeriesProps[MarkSeriesPoint] {
  
  var getNull: js.UndefOr[RVGetNull[MarkSeriesPoint]] = js.native
  
  var strokeWidth: js.UndefOr[Double] = js.native
}
object MarkSeriesProps {
  
  @scala.inline
  def apply(): MarkSeriesProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkSeriesProps]
  }
  
  @scala.inline
  implicit class MarkSeriesPropsOps[Self <: MarkSeriesProps] (val x: Self) extends AnyVal {
    
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
    def setGetNull(value: MarkSeriesPoint => js.Any): Self = this.set("getNull", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetNull: Self = this.set("getNull", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
  }
}
