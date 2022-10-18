package typings.snyk

import typings.snyk.distLibAppsTypesMod.ICreateAppRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsAppsCreateAppMod {
  
  @JSImport("snyk/dist/cli/commands/apps/create-app", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createApp(data: ICreateAppRequest): js.Promise[String | Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createApp")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String | Unit]]
}
