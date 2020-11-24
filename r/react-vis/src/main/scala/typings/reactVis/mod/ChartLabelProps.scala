package typings.reactVis.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartLabelProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var includeMargin: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var text: String = js.native
  
  var xPercent: Double = js.native
  
  var yPercent: Double = js.native
}
object ChartLabelProps {
  
  @scala.inline
  def apply(text: String, xPercent: Double, yPercent: Double): ChartLabelProps = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], xPercent = xPercent.asInstanceOf[js.Any], yPercent = yPercent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartLabelProps]
  }
  
  @scala.inline
  implicit class ChartLabelPropsOps[Self <: ChartLabelProps] (val x: Self) extends AnyVal {
    
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXPercent(value: Double): Self = this.set("xPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYPercent(value: Double): Self = this.set("yPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setIncludeMargin(value: Boolean): Self = this.set("includeMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeMargin: Self = this.set("includeMargin", js.undefined)
    
    @scala.inline
    def setStyle(value: StringDictionary[js.Any]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
