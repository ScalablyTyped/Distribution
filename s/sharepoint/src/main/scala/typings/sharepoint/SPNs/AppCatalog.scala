package typings.sharepoint.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.AppCatalog")
@js.native
class AppCatalog () extends js.Object

/* static members */
@JSGlobal("SP.AppCatalog")
@js.native
object AppCatalog extends js.Object {
  def getAppInstances(context: ClientRuntimeContext, web: Web): ClientObjectList[AppInstance] = js.native
  def getDeveloperSiteAppInstancesByIds(context: ClientRuntimeContext, site: Site, appInstanceIds: js.Array[Guid]): ClientObjectList[AppInstance] = js.native
  def isAppSideloadingEnabled(context: ClientRuntimeContext): BooleanResult = js.native
}

