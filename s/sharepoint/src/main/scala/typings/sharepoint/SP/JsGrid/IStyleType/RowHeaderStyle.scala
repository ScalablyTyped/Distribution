package typings.sharepoint.SP.JsGrid.IStyleType

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowHeaderStyle extends js.Object {
  
  var backgroundColor: js.Any = js.native
  
  var innerBorderColor: js.Any = js.native
  
  var outerBorderColor: js.Any = js.native
}
object RowHeaderStyle {
  
  @scala.inline
  def apply(backgroundColor: js.Any, innerBorderColor: js.Any, outerBorderColor: js.Any): RowHeaderStyle = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], innerBorderColor = innerBorderColor.asInstanceOf[js.Any], outerBorderColor = outerBorderColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowHeaderStyle]
  }
  
  @scala.inline
  implicit class RowHeaderStyleOps[Self <: RowHeaderStyle] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: js.Any): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerBorderColor(value: js.Any): Self = this.set("innerBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterBorderColor(value: js.Any): Self = this.set("outerBorderColor", value.asInstanceOf[js.Any])
  }
}
