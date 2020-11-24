package typings.slickgrid.Slick.Data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupItemMetadataProviderOptions extends js.Object {
  
  var enableExpandCollapse: js.UndefOr[Boolean] = js.native
  
  var groupCssClass: js.UndefOr[String] = js.native
  
  var groupFocusable: js.UndefOr[Boolean] = js.native
  
  var groupTitleCssClass: js.UndefOr[String] = js.native
  
  var toggleCollapsedCssClass: js.UndefOr[String] = js.native
  
  var toggleCssClass: js.UndefOr[String] = js.native
  
  var toggleExpandedCssCass: js.UndefOr[String] = js.native
  
  var totalsCssClass: js.UndefOr[String] = js.native
  
  var totalsFocusable: js.UndefOr[Boolean] = js.native
}
object GroupItemMetadataProviderOptions {
  
  @scala.inline
  def apply(): GroupItemMetadataProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupItemMetadataProviderOptions]
  }
  
  @scala.inline
  implicit class GroupItemMetadataProviderOptionsOps[Self <: GroupItemMetadataProviderOptions] (val x: Self) extends AnyVal {
    
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
    def setEnableExpandCollapse(value: Boolean): Self = this.set("enableExpandCollapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableExpandCollapse: Self = this.set("enableExpandCollapse", js.undefined)
    
    @scala.inline
    def setGroupCssClass(value: String): Self = this.set("groupCssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupCssClass: Self = this.set("groupCssClass", js.undefined)
    
    @scala.inline
    def setGroupFocusable(value: Boolean): Self = this.set("groupFocusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupFocusable: Self = this.set("groupFocusable", js.undefined)
    
    @scala.inline
    def setGroupTitleCssClass(value: String): Self = this.set("groupTitleCssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupTitleCssClass: Self = this.set("groupTitleCssClass", js.undefined)
    
    @scala.inline
    def setToggleCollapsedCssClass(value: String): Self = this.set("toggleCollapsedCssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggleCollapsedCssClass: Self = this.set("toggleCollapsedCssClass", js.undefined)
    
    @scala.inline
    def setToggleCssClass(value: String): Self = this.set("toggleCssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggleCssClass: Self = this.set("toggleCssClass", js.undefined)
    
    @scala.inline
    def setToggleExpandedCssCass(value: String): Self = this.set("toggleExpandedCssCass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggleExpandedCssCass: Self = this.set("toggleExpandedCssCass", js.undefined)
    
    @scala.inline
    def setTotalsCssClass(value: String): Self = this.set("totalsCssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalsCssClass: Self = this.set("totalsCssClass", js.undefined)
    
    @scala.inline
    def setTotalsFocusable(value: Boolean): Self = this.set("totalsFocusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalsFocusable: Self = this.set("totalsFocusable", js.undefined)
  }
}
