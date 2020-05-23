package typings.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.AppCatalog")
@js.native
class AppCatalog ()
  extends typings.sharepoint.SP.AppCatalog

/* static members */
@JSGlobal("SP.AppCatalog")
@js.native
object AppCatalog extends js.Object {
  def getAppInstances(context: typings.sharepoint.SP.ClientRuntimeContext, web: typings.sharepoint.SP.Web): typings.sharepoint.SP.ClientObjectList[typings.sharepoint.SP.AppInstance] = js.native
  def getDeveloperSiteAppInstancesByIds(
    context: typings.sharepoint.SP.ClientRuntimeContext,
    site: typings.sharepoint.SP.Site,
    appInstanceIds: js.Array[typings.sharepoint.SP.Guid]
  ): typings.sharepoint.SP.ClientObjectList[typings.sharepoint.SP.AppInstance] = js.native
  def isAppSideloadingEnabled(context: typings.sharepoint.SP.ClientRuntimeContext): typings.sharepoint.SP.BooleanResult = js.native
}

