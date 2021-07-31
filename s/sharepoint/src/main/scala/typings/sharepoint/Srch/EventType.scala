package typings.sharepoint.Srch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventType extends StObject
@JSGlobal("Srch.EventType")
@js.native
object EventType extends StObject {
  
  @js.native
  sealed trait batchQueryIssuing
    extends StObject
       with EventType
  
  @js.native
  sealed trait batchResultReady
    extends StObject
       with EventType
  
  @js.native
  sealed trait load
    extends StObject
       with EventType
  
  @js.native
  sealed trait none
    extends StObject
       with EventType
  
  @js.native
  sealed trait postLoad
    extends StObject
       with EventType
  
  @js.native
  sealed trait preLoad
    extends StObject
       with EventType
  
  @js.native
  sealed trait queryIssuing
    extends StObject
       with EventType
  
  @js.native
  sealed trait queryReady
    extends StObject
       with EventType
  
  @js.native
  sealed trait queryStateChanged
    extends StObject
       with EventType
  
  @js.native
  sealed trait resultReady
    extends StObject
       with EventType
  
  @js.native
  sealed trait resultRendered
    extends StObject
       with EventType
}
