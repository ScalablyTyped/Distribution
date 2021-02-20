package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Analytics {
  
  @js.native
  sealed trait EventTypeId extends StObject
  @JSGlobal("SP.Analytics.EventTypeId")
  @js.native
  object EventTypeId extends StObject {
    
    @js.native
    sealed trait first extends EventTypeId
    
    @js.native
    sealed trait last extends EventTypeId
    
    @js.native
    sealed trait none extends EventTypeId
    
    @js.native
    sealed trait recommendationClick extends EventTypeId
    
    @js.native
    sealed trait recommendationView extends EventTypeId
    
    @js.native
    sealed trait view extends EventTypeId
  }
  
  type AnalyticsUsageEntry = ClientObject
}
