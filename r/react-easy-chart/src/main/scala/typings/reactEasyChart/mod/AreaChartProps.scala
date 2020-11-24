package typings.reactEasyChart.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AreaChartProps extends LineChartProps {
  
  /** Make the gradient area a solid fill rather than a gradient */
  var noAreaGradient: js.UndefOr[Boolean] = js.native
}
object AreaChartProps {
  
  @scala.inline
  def apply(data: js.Array[js.Array[LineData]]): AreaChartProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaChartProps]
  }
  
  @scala.inline
  implicit class AreaChartPropsOps[Self <: AreaChartProps] (val x: Self) extends AnyVal {
    
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
    def setNoAreaGradient(value: Boolean): Self = this.set("noAreaGradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoAreaGradient: Self = this.set("noAreaGradient", js.undefined)
  }
}
