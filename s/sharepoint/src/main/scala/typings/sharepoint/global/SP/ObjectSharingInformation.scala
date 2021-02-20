package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.ObjectSharingInformation")
@js.native
class ObjectSharingInformation ()
  extends typings.sharepoint.SP.ObjectSharingInformation
object ObjectSharingInformation {
  
  /* static member */
  @JSGlobal("SP.ObjectSharingInformation.getListItemSharingInformation")
  @js.native
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
  
  /* static member */
  @JSGlobal("SP.ObjectSharingInformation.getObjectSharingInformation")
  @js.native
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
  
  /* static member */
  @JSGlobal("SP.ObjectSharingInformation.getWebSharingInformation")
  @js.native
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
