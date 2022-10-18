package typings.snyk

import typings.snyk.distLibAppsTypesMod.ICreateAppOptions
import typings.snyk.distLibAppsTypesMod.ICreateAppRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibAppsCreateAppMod {
  
  @JSImport("snyk/dist/lib/apps/create-app", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createAppDataInteractive(): js.Promise[ICreateAppRequest] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAppDataInteractive")().asInstanceOf[js.Promise[ICreateAppRequest]]
  
  inline def createAppDataScriptable(options: ICreateAppOptions): ICreateAppRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("createAppDataScriptable")(options.asInstanceOf[js.Any]).asInstanceOf[ICreateAppRequest]
}
