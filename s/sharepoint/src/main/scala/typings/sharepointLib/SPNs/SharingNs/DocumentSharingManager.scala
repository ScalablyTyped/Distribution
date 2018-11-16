package typings
package sharepointLib.SPNs.SharingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Sharing.DocumentSharingManager")
@js.native
class DocumentSharingManager () extends js.Object

@JSGlobal("SP.Sharing.DocumentSharingManager")
@js.native
object DocumentSharingManager extends js.Object {
  def getRoleDefinition(context: sharepointLib.SPNs.ClientRuntimeContext, role: sharepointLib.SPNs.SharingNs.Role): sharepointLib.SPNs.RoleDefinition = js.native
  def isDocumentSharingEnabled(context: sharepointLib.SPNs.ClientRuntimeContext, list: sharepointLib.SPNs.List[_]): sharepointLib.SPNs.BooleanResult = js.native
  def updateDocumentSharingInfo(
    context: sharepointLib.SPNs.ClientRuntimeContext,
    resourceAddress: java.lang.String,
    userRoleAssignments: js.Array[sharepointLib.SPNs.SharingNs.UserRoleAssignment],
    validateExistingPermissions: scala.Boolean,
    additiveMode: scala.Boolean,
    sendServerManagedNotification: scala.Boolean,
    customMessage: java.lang.String,
    includeAnonymousLinksInNotification: scala.Boolean
  ): js.Array[sharepointLib.SPNs.SharingNs.UserSharingResult] = js.native
}

