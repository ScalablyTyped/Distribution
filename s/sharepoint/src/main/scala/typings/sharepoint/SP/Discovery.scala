package typings.sharepoint.SP

import typings.sharepoint.SP.Discovery.ExportStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Discovery")
@js.native
object Discovery extends js.Object {
  @js.native
  class Case protected () extends ClientObject {
    def this(context: ClientRuntimeContext, web: Web) = this()
    def getExportContent(sourceIds: js.Array[Double]): StringResult = js.native
  }
  
  @js.native
  class Export protected () extends ClientObject {
    def this(context: ClientRuntimeContext, item: typings.sharepoint.SP.ListItem[_]) = this()
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
    
    /* 2 */ val complete: typings.sharepoint.SP.Discovery.ExportStatus.complete with Double = js.native
    /* 3 */ val failed: typings.sharepoint.SP.Discovery.ExportStatus.failed with Double = js.native
    /* 0 */ val notStarted: typings.sharepoint.SP.Discovery.ExportStatus.notStarted with Double = js.native
    /* 1 */ val started: typings.sharepoint.SP.Discovery.ExportStatus.started with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ExportStatus with Double] = js.native
  }
  
}

