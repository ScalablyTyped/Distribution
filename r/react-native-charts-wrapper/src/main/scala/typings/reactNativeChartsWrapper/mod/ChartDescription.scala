package typings.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartDescription extends js.Object {
  
  var positionX: js.UndefOr[Double] = js.native
  
  var positionY: js.UndefOr[Double] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var textColor: js.UndefOr[Color] = js.native
  
  var textSize: js.UndefOr[Double] = js.native
}
object ChartDescription {
  
  @scala.inline
  def apply(): ChartDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartDescription]
  }
  
  @scala.inline
  implicit class ChartDescriptionOps[Self <: ChartDescription] (val x: Self) extends AnyVal {
    
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
    def setPositionX(value: Double): Self = this.set("positionX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionX: Self = this.set("positionX", js.undefined)
    
    @scala.inline
    def setPositionY(value: Double): Self = this.set("positionY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionY: Self = this.set("positionY", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTextColor(value: Color): Self = this.set("textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
    
    @scala.inline
    def setTextSize(value: Double): Self = this.set("textSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextSize: Self = this.set("textSize", js.undefined)
  }
}
