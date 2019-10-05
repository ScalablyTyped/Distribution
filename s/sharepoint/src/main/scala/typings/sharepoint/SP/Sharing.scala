package typings.sharepoint.SP

import typings.sharepoint.SP.Sharing.Role
import typings.sharepoint.SP.Sharing.UserRoleAssignment
import typings.sharepoint.SP.Sharing.UserSharingResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Sharing")
@js.native
object Sharing extends js.Object {
  @js.native
  class DocumentSharingManager () extends js.Object
  
  @js.native
  sealed trait Role extends js.Object
  
  @js.native
  class UserRoleAssignment () extends ClientValueObject {
    def get_role(): Role = js.native
    def get_userId(): String = js.native
    def set_role(value: Role): Unit = js.native
    def set_userId(value: String): Unit = js.native
  }
  
  @js.native
  class UserSharingResult () extends ClientValueObject {
    def get_allowedRoles(): js.Array[Role] = js.native
    def get_currentRole(): Role = js.native
    def get_isUserKnown(): Boolean = js.native
    def get_message(): String = js.native
    def get_status(): Boolean = js.native
    def get_user(): String = js.native
  }
  
  /* static members */
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
  
  @js.native
  object Role extends js.Object {
    @js.native
    sealed trait edit extends Role
    
    @js.native
    sealed trait none extends Role
    
    @js.native
    sealed trait owner extends Role
    
    @js.native
    sealed trait view extends Role
    
    /* 2 */ val edit: typings.sharepoint.SP.Sharing.Role.edit with Double = js.native
    /* 0 */ val none: typings.sharepoint.SP.Sharing.Role.none with Double = js.native
    /* 3 */ val owner: typings.sharepoint.SP.Sharing.Role.owner with Double = js.native
    /* 1 */ val view: typings.sharepoint.SP.Sharing.Role.view with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Role with Double] = js.native
  }
  
}

