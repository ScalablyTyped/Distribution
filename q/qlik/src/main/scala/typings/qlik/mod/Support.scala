package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Support extends StObject {
  
  var export: SupportItem = js.native
  
  var exportData: SupportItem = js.native
  
  var snapshot: SupportItem | SnapshotLegacy = js.native
}
object Support {
  
  @scala.inline
  def apply(export: SupportItem, exportData: SupportItem, snapshot: SupportItem | SnapshotLegacy): Support = {
    val __obj = js.Dynamic.literal(export = export.asInstanceOf[js.Any], exportData = exportData.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[Support]
  }
  
  @scala.inline
  implicit class SupportMutableBuilder[Self <: Support] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExport(value: SupportItem): Self = StObject.set(x, "export", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportData(value: SupportItem): Self = StObject.set(x, "exportData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportDataFunction1(value: /* layout */ Layout => Boolean): Self = StObject.set(x, "exportData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExportFunction1(value: /* layout */ Layout => Boolean): Self = StObject.set(x, "export", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSnapshot(value: SupportItem | SnapshotLegacy): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotFunction1(value: /* layout */ Layout => Boolean): Self = StObject.set(x, "snapshot", js.Any.fromFunction1(value))
  }
}
