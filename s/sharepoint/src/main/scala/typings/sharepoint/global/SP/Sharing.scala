package typings.sharepoint.global.SP

import typings.sharepoint.SP.Sharing.Role
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Sharing {
  
  @JSGlobal("SP.Sharing.DocumentSharingManager")
  @js.native
  class DocumentSharingManager ()
    extends StObject
       with typings.sharepoint.SP.Sharing.DocumentSharingManager
  object DocumentSharingManager {
    
    @JSGlobal("SP.Sharing.DocumentSharingManager")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @scala.inline
    def getRoleDefinition(context: typings.sharepoint.SP.ClientRuntimeContext, role: Role): typings.sharepoint.SP.RoleDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("getRoleDefinition")(context.asInstanceOf[js.Any], role.asInstanceOf[js.Any])).asInstanceOf[typings.sharepoint.SP.RoleDefinition]
    
    /* static member */
    @scala.inline
    def isDocumentSharingEnabled(context: typings.sharepoint.SP.ClientRuntimeContext, list: typings.sharepoint.SP.List[js.Any]): typings.sharepoint.SP.BooleanResult = (^.asInstanceOf[js.Dynamic].applyDynamic("isDocumentSharingEnabled")(context.asInstanceOf[js.Any], list.asInstanceOf[js.Any])).asInstanceOf[typings.sharepoint.SP.BooleanResult]
    
    /* static member */
    @scala.inline
    def updateDocumentSharingInfo(
      context: typings.sharepoint.SP.ClientRuntimeContext,
      resourceAddress: String,
      userRoleAssignments: js.Array[typings.sharepoint.SP.Sharing.UserRoleAssignment],
      validateExistingPermissions: Boolean,
      additiveMode: Boolean,
      sendServerManagedNotification: Boolean,
      customMessage: String,
      includeAnonymousLinksInNotification: Boolean
    ): js.Array[typings.sharepoint.SP.Sharing.UserSharingResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDocumentSharingInfo")(context.asInstanceOf[js.Any], resourceAddress.asInstanceOf[js.Any], userRoleAssignments.asInstanceOf[js.Any], validateExistingPermissions.asInstanceOf[js.Any], additiveMode.asInstanceOf[js.Any], sendServerManagedNotification.asInstanceOf[js.Any], customMessage.asInstanceOf[js.Any], includeAnonymousLinksInNotification.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.sharepoint.SP.Sharing.UserSharingResult]]
  }
  
  @JSGlobal("SP.Sharing.Role")
  @js.native
  object Role extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Sharing.Role & Double] = js.native
    
    /* 2 */ val edit: typings.sharepoint.SP.Sharing.Role.edit & Double = js.native
    
    /* 0 */ val none: typings.sharepoint.SP.Sharing.Role.none & Double = js.native
    
    /* 3 */ val owner: typings.sharepoint.SP.Sharing.Role.owner & Double = js.native
    
    /* 1 */ val view: typings.sharepoint.SP.Sharing.Role.view & Double = js.native
  }
  
  @JSGlobal("SP.Sharing.UserRoleAssignment")
  @js.native
  class UserRoleAssignment ()
    extends StObject
       with typings.sharepoint.SP.Sharing.UserRoleAssignment {
    
    /* CompleteClass */
    override def customFromJson(obj: js.Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def get_role(): Role = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /* CompleteClass */
    override def get_userId(): String = js.native
    
    /* CompleteClass */
    override def set_role(value: Role): Unit = js.native
    
    /* CompleteClass */
    override def set_userId(value: String): Unit = js.native
    
    /* CompleteClass */
    override def writeToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
  
  @JSGlobal("SP.Sharing.UserSharingResult")
  @js.native
  class UserSharingResult ()
    extends StObject
       with typings.sharepoint.SP.Sharing.UserSharingResult {
    
    /* CompleteClass */
    override def customFromJson(obj: js.Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def get_allowedRoles(): js.Array[Role] = js.native
    
    /* CompleteClass */
    override def get_currentRole(): Role = js.native
    
    /* CompleteClass */
    override def get_isUserKnown(): Boolean = js.native
    
    /* CompleteClass */
    override def get_message(): String = js.native
    
    /* CompleteClass */
    override def get_status(): Boolean = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /* CompleteClass */
    override def get_user(): String = js.native
    
    /* CompleteClass */
    override def writeToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
}
