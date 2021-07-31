package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Discovery {
  
  @JSGlobal("SP.Discovery.Case")
  @js.native
  class Case protected ()
    extends StObject
       with typings.sharepoint.SP.Discovery.Case {
    def this(context: typings.sharepoint.SP.ClientRuntimeContext, web: typings.sharepoint.SP.Web) = this()
  }
  
  @JSGlobal("SP.Discovery.Export")
  @js.native
  class Export protected ()
    extends StObject
       with typings.sharepoint.SP.Discovery.Export {
    def this(context: typings.sharepoint.SP.ClientRuntimeContext, item: typings.sharepoint.SP.ListItem[js.Any]) = this()
  }
  
  @JSGlobal("SP.Discovery.ExportStatus")
  @js.native
  object ExportStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Discovery.ExportStatus & Double] = js.native
    
    /* 2 */ val complete: typings.sharepoint.SP.Discovery.ExportStatus.complete & Double = js.native
    
    /* 3 */ val failed: typings.sharepoint.SP.Discovery.ExportStatus.failed & Double = js.native
    
    /* 0 */ val notStarted: typings.sharepoint.SP.Discovery.ExportStatus.notStarted & Double = js.native
    
    /* 1 */ val started: typings.sharepoint.SP.Discovery.ExportStatus.started & Double = js.native
  }
}
