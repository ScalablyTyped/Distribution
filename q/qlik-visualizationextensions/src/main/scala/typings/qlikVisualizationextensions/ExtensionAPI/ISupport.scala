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
  
  inline def apply(): ISupport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISupport]
  }
  
  extension [Self <: ISupport](x: Self) {
    
    inline def setCanTakeSnapshot(value: Boolean): Self = StObject.set(x, "canTakeSnapshot", value.asInstanceOf[js.Any])
    
    inline def setCanTakeSnapshotUndefined: Self = StObject.set(x, "canTakeSnapshot", js.undefined)
    
    inline def setExport(value: Boolean): Self = StObject.set(x, "export", value.asInstanceOf[js.Any])
    
    inline def setExportData(value: Boolean): Self = StObject.set(x, "exportData", value.asInstanceOf[js.Any])
    
    inline def setExportDataUndefined: Self = StObject.set(x, "exportData", js.undefined)
    
    inline def setExportUndefined: Self = StObject.set(x, "export", js.undefined)
    
    inline def setSnapshot(value: Boolean): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
  }
}
