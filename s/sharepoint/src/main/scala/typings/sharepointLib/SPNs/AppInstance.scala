package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.AppInstance")
@js.native
class AppInstance () extends ClientObject {
  def cancelAllJobs(): BooleanResult = js.native
  def getErrorDetails(): ClientObjectList[AppInstanceErrorDetails] = js.native
  def getPreviousAppVersion(): App = js.native
  def get_appPrincipalId(): java.lang.String = js.native
  def get_appWebFullUrl(): java.lang.String = js.native
  def get_id(): Guid = js.native
  def get_inError(): scala.Boolean = js.native
  def get_remoteAppUrl(): java.lang.String = js.native
  def get_settingsPageUrl(): java.lang.String = js.native
  def get_siteId(): Guid = js.native
  def get_startPage(): java.lang.String = js.native
  def get_status(): AppInstanceStatus = js.native
  def get_title(): java.lang.String = js.native
  def get_webId(): Guid = js.native
  def install(): GuidResult = js.native
  def retryAllJobs(): scala.Unit = js.native
  def uninstall(): GuidResult = js.native
  def upgrade(appPackageStream: Base64EncodedByteArray): scala.Unit = js.native
}

