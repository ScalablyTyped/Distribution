package typings.sharepoint.global.SP

import typings.sharepoint.SP.Sharing.Role
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.Sharing")
@js.native
object Sharing extends js.Object {
  
  @js.native
  class DocumentSharingManager ()
    extends typings.sharepoint.SP.Sharing.DocumentSharingManager
  /* static members */
  @js.native
  object DocumentSharingManager extends js.Object {
    
    def getRoleDefinition(context: typings.sharepoint.SP.ClientRuntimeContext, role: Role): typings.sharepoint.SP.RoleDefinition = js.native
    
    def isDocumentSharingEnabled(context: typings.sharepoint.SP.ClientRuntimeContext, list: typings.sharepoint.SP.List[_]): typings.sharepoint.SP.BooleanResult = js.native
    
    def updateDocumentSharingInfo(
      context: typings.sharepoint.SP.ClientRuntimeContext,
      resourceAddress: String,
      userRoleAssignments: js.Array[typings.sharepoint.SP.Sharing.UserRoleAssignment],
      validateExistingPermissions: Boolean,
      additiveMode: Boolean,
      sendServerManagedNotification: Boolean,
      customMessage: String,
      includeAnonymousLinksInNotification: Boolean
    ): js.Array[typings.sharepoint.SP.Sharing.UserSharingResult] = js.native
  }
  
  @js.native
  object Role extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Sharing.Role with Double] = js.native
    
    /* 2 */ val edit: typings.sharepoint.SP.Sharing.Role.edit with Double = js.native
    
    /* 0 */ val none: typings.sharepoint.SP.Sharing.Role.none with Double = js.native
    
    /* 3 */ val owner: typings.sharepoint.SP.Sharing.Role.owner with Double = js.native
    
    /* 1 */ val view: typings.sharepoint.SP.Sharing.Role.view with Double = js.native
  }
  
  @js.native
  class UserRoleAssignment ()
    extends typings.sharepoint.SP.Sharing.UserRoleAssignment
  
  @js.native
  class UserSharingResult ()
    extends typings.sharepoint.SP.Sharing.UserSharingResult
}
