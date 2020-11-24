package typings.reactVis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomSVGSeriesProps extends AbstractSeriesProps[CustomSVGSeriesPoint] {
  
  var customComponent: js.UndefOr[String | (js.Function1[/* row */ js.Any, _])] = js.native
  
   // default: 'circle'
  var marginLeft: js.UndefOr[Double] = js.native
  
  var marginTop: js.UndefOr[Double] = js.native
}
object CustomSVGSeriesProps {
  
  @scala.inline
  def apply(): CustomSVGSeriesProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomSVGSeriesProps]
  }
  
  @scala.inline
  implicit class CustomSVGSeriesPropsOps[Self <: CustomSVGSeriesProps] (val x: Self) extends AnyVal {
    
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
    def setCustomComponentFunction1(value: /* row */ js.Any => _): Self = this.set("customComponent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCustomComponent(value: String | (js.Function1[/* row */ js.Any, _])): Self = this.set("customComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomComponent: Self = this.set("customComponent", js.undefined)
    
    @scala.inline
    def setMarginLeft(value: Double): Self = this.set("marginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginLeft: Self = this.set("marginLeft", js.undefined)
    
    @scala.inline
    def setMarginTop(value: Double): Self = this.set("marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginTop: Self = this.set("marginTop", js.undefined)
  }
}
