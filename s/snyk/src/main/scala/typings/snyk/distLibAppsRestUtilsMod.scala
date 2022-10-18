package typings.snyk

import typings.snyk.distLibAppsConstantsMod.EAppsURL
import typings.snyk.distLibAppsTypesMod.ICreateAppResponse
import typings.snyk.distLibAppsTypesMod.IGetAppsURLOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibAppsRestUtilsMod {
  
  @JSImport("snyk/dist/lib/apps/rest-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAppsURL(selection: EAppsURL): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppsURL")(selection.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getAppsURL(selection: EAppsURL, opts: IGetAppsURLOpts): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getAppsURL")(selection.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def handleCreateAppRes(res: ICreateAppResponse): String = ^.asInstanceOf[js.Dynamic].applyDynamic("handleCreateAppRes")(res.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def handleRestError(error: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRestError")(error.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
