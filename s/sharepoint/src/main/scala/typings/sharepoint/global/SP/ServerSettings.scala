package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.ServerSettings")
@js.native
class ServerSettings ()
  extends typings.sharepoint.SP.ServerSettings
object ServerSettings {
  
  /* static member */
  @JSGlobal("SP.ServerSettings.getAlternateUrls")
  @js.native
  def getAlternateUrls(context: typings.sharepoint.SP.ClientRuntimeContext): typings.sharepoint.SP.ClientObjectList[typings.sharepoint.SP.AlternateUrl] = js.native
  
  /* static member */
  @JSGlobal("SP.ServerSettings.getGlobalInstalledLanguages")
  @js.native
  def getGlobalInstalledLanguages(context: typings.sharepoint.SP.ClientRuntimeContext, compatibilityLevel: Double): js.Array[typings.sharepoint.SP.Language] = js.native
}
