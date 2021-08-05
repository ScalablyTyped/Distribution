package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.AccessRequests")
@js.native
class AccessRequests ()
  extends StObject
     with typings.sharepoint.SP.AccessRequests
object AccessRequests {
  
  @JSGlobal("SP.AccessRequests")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def changeRequestStatus(
    context: typings.sharepoint.SP.ClientRuntimeContext,
    itemId: Double,
    newStatus: Double,
    convStr: String,
    permType: String,
    permissionLevel: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("changeRequestStatus")(context.asInstanceOf[js.Any], itemId.asInstanceOf[js.Any], newStatus.asInstanceOf[js.Any], convStr.asInstanceOf[js.Any], permType.asInstanceOf[js.Any], permissionLevel.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def changeRequestStatusBulk(
    context: typings.sharepoint.SP.ClientRuntimeContext,
    requestIds: js.Array[Double],
    newStatus: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("changeRequestStatusBulk")(context.asInstanceOf[js.Any], requestIds.asInstanceOf[js.Any], newStatus.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
