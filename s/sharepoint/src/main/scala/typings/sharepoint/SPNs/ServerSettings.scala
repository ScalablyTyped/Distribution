package typings.sharepoint.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ServerSettings")
@js.native
class ServerSettings () extends js.Object

/* static members */
@JSGlobal("SP.ServerSettings")
@js.native
object ServerSettings extends js.Object {
  def getAlternateUrls(context: ClientRuntimeContext): ClientObjectList[AlternateUrl] = js.native
  def getGlobalInstalledLanguages(context: ClientRuntimeContext, compatibilityLevel: Double): js.Array[Language] = js.native
}

