package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.ObjectSharingInformation")
@js.native
class ObjectSharingInformation ()
  extends StObject
     with typings.sharepoint.SP.ObjectSharingInformation
object ObjectSharingInformation {
  
  @JSGlobal("SP.ObjectSharingInformation")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def getListItemSharingInformation(
    context: typings.sharepoint.SP.ClientRuntimeContext,
    listID: typings.sharepoint.SP.Guid,
    itemID: Double,
    excludeCurrentUser: Boolean,
    excludeSiteAdmin: Boolean,
    excludeSecurityGroups: Boolean,
    retrieveAnonymousLinks: Boolean,
    retrieveUserInfoDetails: Boolean,
    checkForAccessRequests: Boolean
  ): typings.sharepoint.SP.ObjectSharingInformation = (^.asInstanceOf[js.Dynamic].applyDynamic("getListItemSharingInformation")(context.asInstanceOf[js.Any], listID.asInstanceOf[js.Any], itemID.asInstanceOf[js.Any], excludeCurrentUser.asInstanceOf[js.Any], excludeSiteAdmin.asInstanceOf[js.Any], excludeSecurityGroups.asInstanceOf[js.Any], retrieveAnonymousLinks.asInstanceOf[js.Any], retrieveUserInfoDetails.asInstanceOf[js.Any], checkForAccessRequests.asInstanceOf[js.Any])).asInstanceOf[typings.sharepoint.SP.ObjectSharingInformation]
  
  /* static member */
  @scala.inline
  def getObjectSharingInformation(
    context: typings.sharepoint.SP.ClientRuntimeContext,
    securableObject: typings.sharepoint.SP.SecurableObject,
    excludeCurrentUser: Boolean,
    excludeSiteAdmin: Boolean,
    excludeSecurityGroups: Boolean,
    retrieveAnonymousLinks: Boolean,
    retrieveUserInfoDetails: Boolean,
    checkForAccessRequests: Boolean,
    retrievePermissionLevels: Boolean
  ): typings.sharepoint.SP.ObjectSharingInformation = (^.asInstanceOf[js.Dynamic].applyDynamic("getObjectSharingInformation")(context.asInstanceOf[js.Any], securableObject.asInstanceOf[js.Any], excludeCurrentUser.asInstanceOf[js.Any], excludeSiteAdmin.asInstanceOf[js.Any], excludeSecurityGroups.asInstanceOf[js.Any], retrieveAnonymousLinks.asInstanceOf[js.Any], retrieveUserInfoDetails.asInstanceOf[js.Any], checkForAccessRequests.asInstanceOf[js.Any], retrievePermissionLevels.asInstanceOf[js.Any])).asInstanceOf[typings.sharepoint.SP.ObjectSharingInformation]
  
  /* static member */
  @scala.inline
  def getWebSharingInformation(
    context: typings.sharepoint.SP.ClientRuntimeContext,
    excludeCurrentUser: Boolean,
    excludeSiteAdmin: Boolean,
    excludeSecurityGroups: Boolean,
    retrieveAnonymousLinks: Boolean,
    retrieveUserInfoDetails: Boolean,
    checkForAccessRequests: Boolean
  ): typings.sharepoint.SP.ObjectSharingInformation = (^.asInstanceOf[js.Dynamic].applyDynamic("getWebSharingInformation")(context.asInstanceOf[js.Any], excludeCurrentUser.asInstanceOf[js.Any], excludeSiteAdmin.asInstanceOf[js.Any], excludeSecurityGroups.asInstanceOf[js.Any], retrieveAnonymousLinks.asInstanceOf[js.Any], retrieveUserInfoDetails.asInstanceOf[js.Any], checkForAccessRequests.asInstanceOf[js.Any])).asInstanceOf[typings.sharepoint.SP.ObjectSharingInformation]
}
