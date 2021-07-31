package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectSharingInformation
  extends StObject
     with ClientObject {
  
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
