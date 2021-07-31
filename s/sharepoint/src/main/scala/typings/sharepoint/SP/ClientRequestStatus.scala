package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ClientRequestStatus extends StObject
@JSGlobal("SP.ClientRequestStatus")
@js.native
object ClientRequestStatus extends StObject {
  
  @js.native
  sealed trait active
    extends StObject
       with ClientRequestStatus
  
  @js.native
  sealed trait completedException
    extends StObject
       with ClientRequestStatus
  
  @js.native
  sealed trait completedSuccess
    extends StObject
       with ClientRequestStatus
  
  @js.native
  sealed trait inProgress
    extends StObject
       with ClientRequestStatus
}
