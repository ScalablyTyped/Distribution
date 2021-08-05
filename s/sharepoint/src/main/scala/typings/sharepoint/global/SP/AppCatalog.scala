package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.AppCatalog")
@js.native
class AppCatalog ()
  extends StObject
     with typings.sharepoint.SP.AppCatalog
object AppCatalog {
  
  @JSGlobal("SP.AppCatalog")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getAppInstances(context: typings.sharepoint.SP.ClientRuntimeContext, web: typings.sharepoint.SP.Web): typings.sharepoint.SP.ClientObjectList[typings.sharepoint.SP.AppInstance] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAppInstances")(context.asInstanceOf[js.Any], web.asInstanceOf[js.Any])).asInstanceOf[typings.sharepoint.SP.ClientObjectList[typings.sharepoint.SP.AppInstance]]
  
  /* static member */
  inline def getDeveloperSiteAppInstancesByIds(
    context: typings.sharepoint.SP.ClientRuntimeContext,
    site: typings.sharepoint.SP.Site,
    appInstanceIds: js.Array[typings.sharepoint.SP.Guid]
  ): typings.sharepoint.SP.ClientObjectList[typings.sharepoint.SP.AppInstance] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeveloperSiteAppInstancesByIds")(context.asInstanceOf[js.Any], site.asInstanceOf[js.Any], appInstanceIds.asInstanceOf[js.Any])).asInstanceOf[typings.sharepoint.SP.ClientObjectList[typings.sharepoint.SP.AppInstance]]
  
  /* static member */
  inline def isAppSideloadingEnabled(context: typings.sharepoint.SP.ClientRuntimeContext): typings.sharepoint.SP.BooleanResult = ^.asInstanceOf[js.Dynamic].applyDynamic("isAppSideloadingEnabled")(context.asInstanceOf[js.Any]).asInstanceOf[typings.sharepoint.SP.BooleanResult]
}
