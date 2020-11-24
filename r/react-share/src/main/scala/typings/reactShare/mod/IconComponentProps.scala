package typings.reactShare.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IconComponentProps extends js.Object {
  
  /** Allow rounded corners if using rect icons */
  var borderRadius: js.UndefOr[Double] = js.native
  
  /** Customize background style, e.g. fill */
  var iconBgStyle: js.UndefOr[CSSProperties] = js.native
  
  /**
    * Customize logo's fill color
    * @default 'white'
    */
  var logoFillColor: js.UndefOr[String] = js.native
  
  /** Whether to show round or rect icons */
  var round: js.UndefOr[Boolean] = js.native
  
  /** Icon size in pixels */
  var size: js.UndefOr[Double] = js.native
}
object IconComponentProps {
  
  @scala.inline
  def apply(): IconComponentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconComponentProps]
  }
  
  @scala.inline
  implicit class IconComponentPropsOps[Self <: IconComponentProps] (val x: Self) extends AnyVal {
    
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
    def setBorderRadius(value: Double): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    
    @scala.inline
    def setIconBgStyle(value: CSSProperties): Self = this.set("iconBgStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconBgStyle: Self = this.set("iconBgStyle", js.undefined)
    
    @scala.inline
    def setLogoFillColor(value: String): Self = this.set("logoFillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogoFillColor: Self = this.set("logoFillColor", js.undefined)
    
    @scala.inline
    def setRound(value: Boolean): Self = this.set("round", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRound: Self = this.set("round", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
