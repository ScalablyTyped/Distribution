package typings.reactTextareaAutosize.getSizingDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SizingData extends js.Object {
  
  var borderSize: Double = js.native
  
  var paddingSize: Double = js.native
  
  var sizingStyle: SizingStyle = js.native
}
object SizingData {
  
  @scala.inline
  def apply(borderSize: Double, paddingSize: Double, sizingStyle: SizingStyle): SizingData = {
    val __obj = js.Dynamic.literal(borderSize = borderSize.asInstanceOf[js.Any], paddingSize = paddingSize.asInstanceOf[js.Any], sizingStyle = sizingStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizingData]
  }
  
  @scala.inline
  implicit class SizingDataOps[Self <: SizingData] (val x: Self) extends AnyVal {
    
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
    def setBorderSize(value: Double): Self = this.set("borderSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingSize(value: Double): Self = this.set("paddingSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizingStyle(value: SizingStyle): Self = this.set("sizingStyle", value.asInstanceOf[js.Any])
  }
}
