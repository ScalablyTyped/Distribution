package typings.sharepoint.SPNs.SharingNs

import typings.sharepoint.SPNs.BooleanResult
import typings.sharepoint.SPNs.ClientRuntimeContext
import typings.sharepoint.SPNs.List
import typings.sharepoint.SPNs.RoleDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Sharing.DocumentSharingManager")
@js.native
class DocumentSharingManager () extends js.Object

/* static members */
@JSGlobal("SP.Sharing.DocumentSharingManager")
@js.native
object DocumentSharingManager extends js.Object {
  def getRoleDefinition(context: ClientRuntimeContext, role: Role): RoleDefinition = js.native
  def isDocumentSharingEnabled(context: ClientRuntimeContext, list: List[_]): BooleanResult = js.native
  def updateDocumentSharingInfo(
    context: ClientRuntimeContext,
    resourceAddress: String,
    userRoleAssignments: js.Array[UserRoleAssignment],
    validateExistingPermissions: Boolean,
    additiveMode: Boolean,
    sendServerManagedNotification: Boolean,
    customMessage: String,
    includeAnonymousLinksInNotification: Boolean
  ): js.Array[UserSharingResult] = js.native
}

