package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.AppCatalog")
@js.native
class AppCatalog () extends js.Object

@JSGlobal("SP.AppCatalog")
@js.native
object AppCatalog extends js.Object {
  def getAppInstances(context: sharepointLib.SPNs.ClientRuntimeContext, web: sharepointLib.SPNs.Web): sharepointLib.SPNs.ClientObjectList[sharepointLib.SPNs.AppInstance] = js.native
  def getDeveloperSiteAppInstancesByIds(
    context: sharepointLib.SPNs.ClientRuntimeContext,
    site: sharepointLib.SPNs.Site,
    appInstanceIds: js.Array[sharepointLib.SPNs.Guid]
  ): sharepointLib.SPNs.ClientObjectList[sharepointLib.SPNs.AppInstance] = js.native
  def isAppSideloadingEnabled(context: sharepointLib.SPNs.ClientRuntimeContext): sharepointLib.SPNs.BooleanResult = js.native
}

