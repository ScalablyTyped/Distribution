package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.Discovery")
@js.native
object Discovery extends js.Object {
  
  @js.native
  trait Case extends ClientObject {
    
    def getExportContent(sourceIds: js.Array[Double]): StringResult = js.native
  }
  
  @js.native
  trait Export extends ClientObject {
    
    def getExportContent(): StringResult = js.native
    
    def get_status(): ExportStatus = js.native
    
    def set_status(value: ExportStatus): ExportStatus = js.native
    
    def update(): Unit = js.native
  }
  
  @js.native
  sealed trait ExportStatus extends js.Object
  @js.native
  object ExportStatus extends js.Object {
    
     // : 2,
    @js.native
    sealed trait complete extends ExportStatus
    
    @js.native
    sealed trait failed extends ExportStatus
    
     // : 0,
    @js.native
    sealed trait notStarted extends ExportStatus
    
     // : 1,
    @js.native
    sealed trait started extends ExportStatus
  }
}
