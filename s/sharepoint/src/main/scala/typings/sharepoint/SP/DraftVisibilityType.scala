package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DraftVisibilityType extends StObject
@JSGlobal("SP.DraftVisibilityType")
@js.native
object DraftVisibilityType extends StObject {
  
  @js.native
  sealed trait approver
    extends StObject
       with DraftVisibilityType
  
  @js.native
  sealed trait author
    extends StObject
       with DraftVisibilityType
  
  @js.native
  sealed trait reader
    extends StObject
       with DraftVisibilityType
}
