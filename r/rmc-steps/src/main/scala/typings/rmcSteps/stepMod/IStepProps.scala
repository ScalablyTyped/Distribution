package typings.rmcSteps.stepMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStepProps extends js.Object {
  
  var adjustMarginRight: js.UndefOr[Double | String] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[js.Any] = js.native
  
  var icon: js.UndefOr[ReactNode] = js.native
  
  var iconPrefix: js.UndefOr[String] = js.native
  
  var itemWidth: js.UndefOr[Double | String] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var progressDot: js.UndefOr[Boolean | js.Function] = js.native
  
  var status: js.UndefOr[String] = js.native
  
  var stepNumber: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[js.Any] = js.native
  
  var title: js.UndefOr[js.Any] = js.native
  
  var wrapperStyle: js.UndefOr[js.Any] = js.native
}
object IStepProps {
  
  @scala.inline
  def apply(): IStepProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStepProps]
  }
  
  @scala.inline
  implicit class IStepPropsOps[Self <: IStepProps] (val x: Self) extends AnyVal {
    
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
    def setAdjustMarginRight(value: Double | String): Self = this.set("adjustMarginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdjustMarginRight: Self = this.set("adjustMarginRight", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDescription(value: js.Any): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setIcon(value: ReactNode): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIconPrefix(value: String): Self = this.set("iconPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconPrefix: Self = this.set("iconPrefix", js.undefined)
    
    @scala.inline
    def setItemWidth(value: Double | String): Self = this.set("itemWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemWidth: Self = this.set("itemWidth", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setProgressDot(value: Boolean | js.Function): Self = this.set("progressDot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressDot: Self = this.set("progressDot", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStepNumber(value: Double): Self = this.set("stepNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepNumber: Self = this.set("stepNumber", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTitle(value: js.Any): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setWrapperStyle(value: js.Any): Self = this.set("wrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapperStyle: Self = this.set("wrapperStyle", js.undefined)
  }
}
