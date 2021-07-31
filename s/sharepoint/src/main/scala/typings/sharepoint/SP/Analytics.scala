package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Analytics {
  
  @js.native
  sealed trait EventTypeId extends StObject
  @JSGlobal("SP.Analytics.EventTypeId")
  @js.native
  object EventTypeId extends StObject {
    
    @js.native
    sealed trait first
      extends StObject
         with EventTypeId
    
    @js.native
    sealed trait last
      extends StObject
         with EventTypeId
    
    @js.native
    sealed trait none
      extends StObject
         with EventTypeId
    
    @js.native
    sealed trait recommendationClick
      extends StObject
         with EventTypeId
    
    @js.native
    sealed trait recommendationView
      extends StObject
         with EventTypeId
    
    @js.native
    sealed trait view
      extends StObject
         with EventTypeId
  }
  
  type AnalyticsUsageEntry = ClientObject
}
