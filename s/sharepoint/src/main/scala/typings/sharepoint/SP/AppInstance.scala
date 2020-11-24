package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppInstance extends ClientObject {
  
  def cancelAllJobs(): BooleanResult = js.native
  
  def getErrorDetails(): ClientObjectList[AppInstanceErrorDetails] = js.native
  
  def getPreviousAppVersion(): App = js.native
  
  def get_appPrincipalId(): String = js.native
  
  def get_appWebFullUrl(): String = js.native
  
  def get_id(): Guid = js.native
  
  def get_inError(): Boolean = js.native
  
  def get_remoteAppUrl(): String = js.native
  
  def get_settingsPageUrl(): String = js.native
  
  def get_siteId(): Guid = js.native
  
  def get_startPage(): String = js.native
  
  def get_status(): AppInstanceStatus = js.native
  
  def get_title(): String = js.native
  
  def get_webId(): Guid = js.native
  
  def install(): GuidResult = js.native
  
  def retryAllJobs(): Unit = js.native
  
  def uninstall(): GuidResult = js.native
  
  def upgrade(appPackageStream: Base64EncodedByteArray): Unit = js.native
}
