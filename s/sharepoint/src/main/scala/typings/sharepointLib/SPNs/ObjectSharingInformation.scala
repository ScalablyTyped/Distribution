package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ObjectSharingInformation")
@js.native
class ObjectSharingInformation () extends ClientObject {
  def getSharedWithUsers(): ClientObjectList[ObjectSharingInformationUser] = js.native
  def get_anonymousEditLink(): java.lang.String = js.native
  def get_anonymousViewLink(): java.lang.String = js.native
  def get_canManagePermissions(): scala.Boolean = js.native
  def get_hasPendingAccessRequests(): scala.Boolean = js.native
  def get_hasPermissionLevels(): scala.Boolean = js.native
  def get_isSharedWithCurrentUser(): scala.Boolean = js.native
  def get_isSharedWithGuest(): scala.Boolean = js.native
  def get_isSharedWithMany(): scala.Boolean = js.native
  def get_isSharedWithSecurityGroup(): scala.Boolean = js.native
  def get_pendingAccessRequestsLink(): java.lang.String = js.native
}

@JSGlobal("SP.ObjectSharingInformation")
@js.native
object ObjectSharingInformation extends js.Object {
  def getListItemSharingInformation(
    context: sharepointLib.SPNs.ClientRuntimeContext,
    listID: sharepointLib.SPNs.Guid,
    itemID: scala.Double,
    excludeCurrentUser: scala.Boolean,
    excludeSiteAdmin: scala.Boolean,
    excludeSecurityGroups: scala.Boolean,
    retrieveAnonymousLinks: scala.Boolean,
    retrieveUserInfoDetails: scala.Boolean,
    checkForAccessRequests: scala.Boolean
  ): sharepointLib.SPNs.ObjectSharingInformation = js.native
  def getObjectSharingInformation(
    context: sharepointLib.SPNs.ClientRuntimeContext,
    securableObject: sharepointLib.SPNs.SecurableObject,
    excludeCurrentUser: scala.Boolean,
    excludeSiteAdmin: scala.Boolean,
    excludeSecurityGroups: scala.Boolean,
    retrieveAnonymousLinks: scala.Boolean,
    retrieveUserInfoDetails: scala.Boolean,
    checkForAccessRequests: scala.Boolean,
    retrievePermissionLevels: scala.Boolean
  ): sharepointLib.SPNs.ObjectSharingInformation = js.native
  def getWebSharingInformation(
    context: sharepointLib.SPNs.ClientRuntimeContext,
    excludeCurrentUser: scala.Boolean,
    excludeSiteAdmin: scala.Boolean,
    excludeSecurityGroups: scala.Boolean,
    retrieveAnonymousLinks: scala.Boolean,
    retrieveUserInfoDetails: scala.Boolean,
    checkForAccessRequests: scala.Boolean
  ): sharepointLib.SPNs.ObjectSharingInformation = js.native
}

