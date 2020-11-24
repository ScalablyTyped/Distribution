package typings.reactImageMagnifiers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlassMagnifierProps extends CommonProps {
  
  var allowOverflow: js.UndefOr[Boolean] = js.native
  
  var magnifierBackgroundColor: js.UndefOr[String] = js.native
  
  var magnifierBorderColor: js.UndefOr[String] = js.native
  
  var magnifierBorderSize: js.UndefOr[Double] = js.native
  
  var magnifierOffsetX: js.UndefOr[Double] = js.native
  
  var magnifierOffsetY: js.UndefOr[Double] = js.native
  
  var magnifierSize: js.UndefOr[String | Double] = js.native
  
  var square: js.UndefOr[Boolean] = js.native
}
object GlassMagnifierProps {
  
  @scala.inline
  def apply(imageSrc: String): GlassMagnifierProps = {
    val __obj = js.Dynamic.literal(imageSrc = imageSrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlassMagnifierProps]
  }
  
  @scala.inline
  implicit class GlassMagnifierPropsOps[Self <: GlassMagnifierProps] (val x: Self) extends AnyVal {
    
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
    def setAllowOverflow(value: Boolean): Self = this.set("allowOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowOverflow: Self = this.set("allowOverflow", js.undefined)
    
    @scala.inline
    def setMagnifierBackgroundColor(value: String): Self = this.set("magnifierBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMagnifierBackgroundColor: Self = this.set("magnifierBackgroundColor", js.undefined)
    
    @scala.inline
    def setMagnifierBorderColor(value: String): Self = this.set("magnifierBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMagnifierBorderColor: Self = this.set("magnifierBorderColor", js.undefined)
    
    @scala.inline
    def setMagnifierBorderSize(value: Double): Self = this.set("magnifierBorderSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMagnifierBorderSize: Self = this.set("magnifierBorderSize", js.undefined)
    
    @scala.inline
    def setMagnifierOffsetX(value: Double): Self = this.set("magnifierOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMagnifierOffsetX: Self = this.set("magnifierOffsetX", js.undefined)
    
    @scala.inline
    def setMagnifierOffsetY(value: Double): Self = this.set("magnifierOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMagnifierOffsetY: Self = this.set("magnifierOffsetY", js.undefined)
    
    @scala.inline
    def setMagnifierSize(value: String | Double): Self = this.set("magnifierSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMagnifierSize: Self = this.set("magnifierSize", js.undefined)
    
    @scala.inline
    def setSquare(value: Boolean): Self = this.set("square", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSquare: Self = this.set("square", js.undefined)
  }
}
