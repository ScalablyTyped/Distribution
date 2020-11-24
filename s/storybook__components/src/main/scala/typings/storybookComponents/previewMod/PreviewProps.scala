package typings.storybookComponents.previewMod

import typings.storybookComponents.actionBarMod.ActionItem
import typings.storybookComponents.sourceMod.SourceProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviewProps extends js.Object {
  
  var additionalActions: js.UndefOr[js.Array[ActionItem]] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var columns: js.UndefOr[Double] = js.native
  
  var isColumn: js.UndefOr[Boolean] = js.native
  
  var isExpanded: js.UndefOr[Boolean] = js.native
  
  var withSource: js.UndefOr[SourceProps] = js.native
  
  var withToolbar: js.UndefOr[Boolean] = js.native
}
object PreviewProps {
  
  @scala.inline
  def apply(): PreviewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreviewProps]
  }
  
  @scala.inline
  implicit class PreviewPropsOps[Self <: PreviewProps] (val x: Self) extends AnyVal {
    
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
    def setAdditionalActionsVarargs(value: ActionItem*): Self = this.set("additionalActions", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalActions(value: js.Array[ActionItem]): Self = this.set("additionalActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalActions: Self = this.set("additionalActions", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setColumns(value: Double): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setIsColumn(value: Boolean): Self = this.set("isColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsColumn: Self = this.set("isColumn", js.undefined)
    
    @scala.inline
    def setIsExpanded(value: Boolean): Self = this.set("isExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsExpanded: Self = this.set("isExpanded", js.undefined)
    
    @scala.inline
    def setWithSource(value: SourceProps): Self = this.set("withSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithSource: Self = this.set("withSource", js.undefined)
    
    @scala.inline
    def setWithToolbar(value: Boolean): Self = this.set("withToolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithToolbar: Self = this.set("withToolbar", js.undefined)
  }
}
