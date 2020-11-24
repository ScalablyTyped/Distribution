package typings.reactBytesizeIcons.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BytesizeIconsProps extends BytesizeBaseIconsProps {
  
  var strokeLinecap: js.UndefOr[StrokeLinecap] = js.native
  
  var strokeLinejoin: js.UndefOr[StrokeLinejoin] = js.native
  
  var strokeWidth: js.UndefOr[String] = js.native
}
object BytesizeIconsProps {
  
  @scala.inline
  def apply(): BytesizeIconsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BytesizeIconsProps]
  }
  
  @scala.inline
  implicit class BytesizeIconsPropsOps[Self <: BytesizeIconsProps] (val x: Self) extends AnyVal {
    
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
    def setStrokeLinecap(value: StrokeLinecap): Self = this.set("strokeLinecap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeLinecap: Self = this.set("strokeLinecap", js.undefined)
    
    @scala.inline
    def setStrokeLinejoin(value: StrokeLinejoin): Self = this.set("strokeLinejoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeLinejoin: Self = this.set("strokeLinejoin", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: String): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
  }
}
