package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Discovery {
  
  @js.native
  sealed trait ExportStatus extends StObject
  @JSGlobal("SP.Discovery.ExportStatus")
  @js.native
  object ExportStatus extends StObject {
    
    // : 1,
    @js.native
    sealed trait complete
      extends StObject
         with ExportStatus
    
    // : 2,
    @js.native
    sealed trait failed
      extends StObject
         with ExportStatus
    
    @js.native
    sealed trait notStarted
      extends StObject
         with ExportStatus
    
    // : 0,
    @js.native
    sealed trait started
      extends StObject
         with ExportStatus
  }
  
  @js.native
  trait Case
    extends StObject
       with ClientObject {
    
    def getExportContent(sourceIds: js.Array[Double]): StringResult = js.native
  }
  
  @js.native
  trait Export
    extends StObject
       with ClientObject {
    
    def getExportContent(): StringResult = js.native
    
    def get_status(): ExportStatus = js.native
    
    def set_status(value: ExportStatus): ExportStatus = js.native
    
    def update(): Unit = js.native
  }
}
