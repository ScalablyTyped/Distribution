package typings.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.ServerSettings")
@js.native
class ServerSettings ()
  extends typings.sharepoint.SP.ServerSettings
/* static members */
@JSGlobal("SP.ServerSettings")
@js.native
object ServerSettings extends js.Object {
  
  def getAlternateUrls(context: typings.sharepoint.SP.ClientRuntimeContext): typings.sharepoint.SP.ClientObjectList[typings.sharepoint.SP.AlternateUrl] = js.native
  
  def getGlobalInstalledLanguages(context: typings.sharepoint.SP.ClientRuntimeContext, compatibilityLevel: Double): js.Array[typings.sharepoint.SP.Language] = js.native
}
