package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Analytics")
@js.native
object Analytics extends js.Object {
  @js.native
  sealed trait EventTypeId extends js.Object
  
  @js.native
  object EventTypeId extends js.Object {
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

