package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ObjectSharingInformation")
@js.native
class ObjectSharingInformation () extends ClientObject {
  def getSharedWithUsers(): ClientObjectList[ObjectSharingInformationUser] = js.native
  def get_anonymousEditLink(): String = js.native
  def get_anonymousViewLink(): String = js.native
  def get_canManagePermissions(): Boolean = js.native
  def get_hasPendingAccessRequests(): Boolean = js.native
  def get_hasPermissionLevels(): Boolean = js.native
  def get_isSharedWithCurrentUser(): Boolean = js.native
  def get_isSharedWithGuest(): Boolean = js.native
  def get_isSharedWithMany(): Boolean = js.native
  def get_isSharedWithSecurityGroup(): Boolean = js.native
  def get_pendingAccessRequestsLink(): String = js.native
}

/* static members */
@JSGlobal("SP.ObjectSharingInformation")
@js.native
object ObjectSharingInformation extends js.Object {
  def getListItemSharingInformation(
    context: ClientRuntimeContext,
    listID: Guid,
    itemID: Double,
    excludeCurrentUser: Boolean,
    excludeSiteAdmin: Boolean,
    excludeSecurityGroups: Boolean,
    retrieveAnonymousLinks: Boolean,
    retrieveUserInfoDetails: Boolean,
    checkForAccessRequests: Boolean
  ): ObjectSharingInformation = js.native
  def getObjectSharingInformation(
    context: ClientRuntimeContext,
    securableObject: SecurableObject,
    excludeCurrentUser: Boolean,
    excludeSiteAdmin: Boolean,
    excludeSecurityGroups: Boolean,
    retrieveAnonymousLinks: Boolean,
    retrieveUserInfoDetails: Boolean,
    checkForAccessRequests: Boolean,
    retrievePermissionLevels: Boolean
  ): ObjectSharingInformation = js.native
  def getWebSharingInformation(
    context: ClientRuntimeContext,
    excludeCurrentUser: Boolean,
    excludeSiteAdmin: Boolean,
    excludeSecurityGroups: Boolean,
    retrieveAnonymousLinks: Boolean,
    retrieveUserInfoDetails: Boolean,
    checkForAccessRequests: Boolean
  ): ObjectSharingInformation = js.native
}

