package typings.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.ObjectSharingInformation")
@js.native
class ObjectSharingInformation ()
  extends typings.sharepoint.SP.ObjectSharingInformation
/* static members */
@JSGlobal("SP.ObjectSharingInformation")
@js.native
object ObjectSharingInformation extends js.Object {
  
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
  ): typings.sharepoint.SP.ObjectSharingInformation = js.native
  
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
  ): typings.sharepoint.SP.ObjectSharingInformation = js.native
  
  def getWebSharingInformation(
    context: typings.sharepoint.SP.ClientRuntimeContext,
    excludeCurrentUser: Boolean,
    excludeSiteAdmin: Boolean,
    excludeSecurityGroups: Boolean,
    retrieveAnonymousLinks: Boolean,
    retrieveUserInfoDetails: Boolean,
    checkForAccessRequests: Boolean
  ): typings.sharepoint.SP.ObjectSharingInformation = js.native
}
