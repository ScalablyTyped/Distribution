package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.AppCatalog")
@js.native
class AppCatalog ()
  extends typings.sharepoint.SP.AppCatalog
object AppCatalog {
  
  /* static member */
  @JSGlobal("SP.AppCatalog.getAppInstances")
  @js.native
  def getAppInstances(context: typings.sharepoint.SP.ClientRuntimeContext, web: typings.sharepoint.SP.Web): typings.sharepoint.SP.ClientObjectList[typings.sharepoint.SP.AppInstance] = js.native
  
  /* static member */
  @JSGlobal("SP.AppCatalog.getDeveloperSiteAppInstancesByIds")
  @js.native
  def getDeveloperSiteAppInstancesByIds(
    context: typings.sharepoint.SP.ClientRuntimeContext,
    site: typings.sharepoint.SP.Site,
    appInstanceIds: js.Array[typings.sharepoint.SP.Guid]
  ): typings.sharepoint.SP.ClientObjectList[typings.sharepoint.SP.AppInstance] = js.native
  
  /* static member */
  @JSGlobal("SP.AppCatalog.isAppSideloadingEnabled")
  @js.native
  def isAppSideloadingEnabled(context: typings.sharepoint.SP.ClientRuntimeContext): typings.sharepoint.SP.BooleanResult = js.native
}
