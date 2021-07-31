package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MoveOperations extends StObject
@JSGlobal("SP.MoveOperations")
@js.native
object MoveOperations extends StObject {
  
  @js.native
  sealed trait allowBrokenThickets
    extends StObject
       with MoveOperations
  
  @js.native
  sealed trait bypassApprovePermission
    extends StObject
       with MoveOperations
  
  @js.native
  sealed trait none
    extends StObject
       with MoveOperations
  
  @js.native
  sealed trait overwrite
    extends StObject
       with MoveOperations
}
