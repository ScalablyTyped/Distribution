package typings
package sharepointLib.SPNs

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
  def getAlternateUrls(context: sharepointLib.SPNs.ClientRuntimeContext): sharepointLib.SPNs.ClientObjectList[sharepointLib.SPNs.AlternateUrl] = js.native
  def getGlobalInstalledLanguages(context: sharepointLib.SPNs.ClientRuntimeContext, compatibilityLevel: scala.Double): js.Array[sharepointLib.SPNs.Language] = js.native
}

