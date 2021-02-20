package typings.sharepoint.global.SP

import typings.sharepoint.SP.Sharing.Role
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Sharing {
  
  @JSGlobal("SP.Sharing.DocumentSharingManager")
  @js.native
  class DocumentSharingManager ()
    extends typings.sharepoint.SP.Sharing.DocumentSharingManager
  object DocumentSharingManager {
    
    /* static member */
    @JSGlobal("SP.Sharing.DocumentSharingManager.getRoleDefinition")
    @js.native
    def getRoleDefinition(context: typings.sharepoint.SP.ClientRuntimeContext, role: Role): typings.sharepoint.SP.RoleDefinition = js.native
    
    /* static member */
    @JSGlobal("SP.Sharing.DocumentSharingManager.isDocumentSharingEnabled")
    @js.native
    def isDocumentSharingEnabled(context: typings.sharepoint.SP.ClientRuntimeContext, list: typings.sharepoint.SP.List[_]): typings.sharepoint.SP.BooleanResult = js.native
    
    /* static member */
    @JSGlobal("SP.Sharing.DocumentSharingManager.updateDocumentSharingInfo")
    @js.native
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
  
  @JSGlobal("SP.Sharing.Role")
  @js.native
  object Role extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Sharing.Role with Double] = js.native
    
    /* 2 */ val edit: typings.sharepoint.SP.Sharing.Role.edit with Double = js.native
    
    /* 0 */ val none: typings.sharepoint.SP.Sharing.Role.none with Double = js.native
    
    /* 3 */ val owner: typings.sharepoint.SP.Sharing.Role.owner with Double = js.native
    
    /* 1 */ val view: typings.sharepoint.SP.Sharing.Role.view with Double = js.native
  }
  
  @JSGlobal("SP.Sharing.UserRoleAssignment")
  @js.native
  class UserRoleAssignment ()
    extends typings.sharepoint.SP.Sharing.UserRoleAssignment
  
  @JSGlobal("SP.Sharing.UserSharingResult")
  @js.native
  class UserSharingResult ()
    extends typings.sharepoint.SP.Sharing.UserSharingResult
}
