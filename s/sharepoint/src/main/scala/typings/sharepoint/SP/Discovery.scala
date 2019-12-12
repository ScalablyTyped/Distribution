package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SP.Discovery.ExportStatus
import typings.sharepoint.SP.Discovery.ExportStatus.complete
import typings.sharepoint.SP.Discovery.ExportStatus.failed
import typings.sharepoint.SP.Discovery.ExportStatus.notStarted
import typings.sharepoint.SP.Discovery.ExportStatus.started
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ExportStatus with Double] = js.native
    /* 2 */ @js.native
    object complete extends TopLevel[complete with Double]
    
    /* 3 */ @js.native
    object failed extends TopLevel[failed with Double]
    
    /* 0 */ @js.native
    object notStarted extends TopLevel[notStarted with Double]
    
    /* 1 */ @js.native
    object started extends TopLevel[started with Double]
    
  }
  
}

