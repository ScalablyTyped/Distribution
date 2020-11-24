package typings.storybookUi.explorerMod

import typings.storybookUi.sidebarTypesMod.CombinedDataset
import typings.storybookUi.sidebarTypesMod.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExplorerProps extends js.Object {
  
  var dataset: CombinedDataset = js.native
  
  var isBrowsing: Boolean = js.native
  
  var isLoading: Boolean = js.native
  
  var selected: Selection = js.native
}
object ExplorerProps {
  
  @scala.inline
  def apply(dataset: CombinedDataset, isBrowsing: Boolean, isLoading: Boolean): ExplorerProps = {
    val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], isBrowsing = isBrowsing.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplorerProps]
  }
  
  @scala.inline
  implicit class ExplorerPropsOps[Self <: ExplorerProps] (val x: Self) extends AnyVal {
    
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
    def setDataset(value: CombinedDataset): Self = this.set("dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBrowsing(value: Boolean): Self = this.set("isBrowsing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLoading(value: Boolean): Self = this.set("isLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: Selection): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedNull: Self = this.set("selected", null)
  }
}
