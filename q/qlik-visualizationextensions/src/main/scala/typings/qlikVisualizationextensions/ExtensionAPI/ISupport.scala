package typings.qlikVisualizationextensions.ExtensionAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISupport extends StObject {
  
  // | () => boolean;
  var canTakeSnapshot: js.UndefOr[Boolean] = js.undefined
  
  // | () => boolean;
  var `export`: js.UndefOr[Boolean] = js.undefined
  
  var exportData: js.UndefOr[Boolean] = js.undefined
  
  var snapshot: js.UndefOr[Boolean] = js.undefined
}
object ISupport {
  
  @scala.inline
  def apply(): ISupport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISupport]
  }
  
  @scala.inline
  implicit class ISupportMutableBuilder[Self <: ISupport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanTakeSnapshot(value: Boolean): Self = StObject.set(x, "canTakeSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanTakeSnapshotUndefined: Self = StObject.set(x, "canTakeSnapshot", js.undefined)
    
    @scala.inline
    def setExport(value: Boolean): Self = StObject.set(x, "export", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportData(value: Boolean): Self = StObject.set(x, "exportData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportDataUndefined: Self = StObject.set(x, "exportData", js.undefined)
    
    @scala.inline
    def setExportUndefined: Self = StObject.set(x, "export", js.undefined)
    
    @scala.inline
    def setSnapshot(value: Boolean): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
  }
}
