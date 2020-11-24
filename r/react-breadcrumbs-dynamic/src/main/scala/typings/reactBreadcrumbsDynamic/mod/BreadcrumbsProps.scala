package typings.reactBreadcrumbsDynamic.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BreadcrumbsProps extends js.Object {
  
  var container: js.UndefOr[String | Element | js.Object] = js.native
  
  var containerProps: js.UndefOr[js.Object] = js.native
  
  var duplicateProps: js.UndefOr[js.Object] = js.native
  
  var finalItem: js.UndefOr[String | Element | js.Object] = js.native
  
  var finalProps: js.UndefOr[js.Object] = js.native
  
  var item: js.UndefOr[String | Element | js.Object] = js.native
  
  var renameProps: js.UndefOr[js.Object] = js.native
  
  var separator: js.UndefOr[String | Element | js.Object] = js.native
}
object BreadcrumbsProps {
  
  @scala.inline
  def apply(): BreadcrumbsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BreadcrumbsProps]
  }
  
  @scala.inline
  implicit class BreadcrumbsPropsOps[Self <: BreadcrumbsProps] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: String | Element | js.Object): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setContainerProps(value: js.Object): Self = this.set("containerProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerProps: Self = this.set("containerProps", js.undefined)
    
    @scala.inline
    def setDuplicateProps(value: js.Object): Self = this.set("duplicateProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuplicateProps: Self = this.set("duplicateProps", js.undefined)
    
    @scala.inline
    def setFinalItem(value: String | Element | js.Object): Self = this.set("finalItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinalItem: Self = this.set("finalItem", js.undefined)
    
    @scala.inline
    def setFinalProps(value: js.Object): Self = this.set("finalProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinalProps: Self = this.set("finalProps", js.undefined)
    
    @scala.inline
    def setItem(value: String | Element | js.Object): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    
    @scala.inline
    def setRenameProps(value: js.Object): Self = this.set("renameProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenameProps: Self = this.set("renameProps", js.undefined)
    
    @scala.inline
    def setSeparator(value: String | Element | js.Object): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
  }
}
