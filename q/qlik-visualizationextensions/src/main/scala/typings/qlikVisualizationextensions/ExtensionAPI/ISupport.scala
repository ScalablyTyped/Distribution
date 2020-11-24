package typings.qlikVisualizationextensions.ExtensionAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISupport extends js.Object {
  
   // | () => boolean;
  var canTakeSnapshot: js.UndefOr[Boolean] = js.native
  
   // | () => boolean;
  var export: js.UndefOr[Boolean] = js.native
  
  var exportData: js.UndefOr[Boolean] = js.native
  
  var snapshot: js.UndefOr[Boolean] = js.native
}
object ISupport {
  
  @scala.inline
  def apply(): ISupport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISupport]
  }
  
  @scala.inline
  implicit class ISupportOps[Self <: ISupport] (val x: Self) extends AnyVal {
    
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
    def setCanTakeSnapshot(value: Boolean): Self = this.set("canTakeSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanTakeSnapshot: Self = this.set("canTakeSnapshot", js.undefined)
    
    @scala.inline
    def setExport(value: Boolean): Self = this.set("export", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExport: Self = this.set("export", js.undefined)
    
    @scala.inline
    def setExportData(value: Boolean): Self = this.set("exportData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportData: Self = this.set("exportData", js.undefined)
    
    @scala.inline
    def setSnapshot(value: Boolean): Self = this.set("snapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshot: Self = this.set("snapshot", js.undefined)
  }
}
