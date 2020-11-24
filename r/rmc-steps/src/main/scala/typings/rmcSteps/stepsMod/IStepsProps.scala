package typings.rmcSteps.stepsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStepsProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var current: js.UndefOr[Double] = js.native
  
  var direction: js.UndefOr[String] = js.native
  
  var iconPrefix: js.UndefOr[String] = js.native
  
  var labelPlacement: js.UndefOr[String] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var progressDot: js.UndefOr[Boolean | js.Function] = js.native
  
  var size: js.UndefOr[String] = js.native
  
  var status: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[js.Any] = js.native
}
object IStepsProps {
  
  @scala.inline
  def apply(): IStepsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStepsProps]
  }
  
  @scala.inline
  implicit class IStepsPropsOps[Self <: IStepsProps] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCurrent(value: Double): Self = this.set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrent: Self = this.set("current", js.undefined)
    
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setIconPrefix(value: String): Self = this.set("iconPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconPrefix: Self = this.set("iconPrefix", js.undefined)
    
    @scala.inline
    def setLabelPlacement(value: String): Self = this.set("labelPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelPlacement: Self = this.set("labelPlacement", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setProgressDot(value: Boolean | js.Function): Self = this.set("progressDot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressDot: Self = this.set("progressDot", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
