package typings.storybookCoreServer

import typings.express.mod.Router
import typings.storybookCoreCommon.distTs3Dot9UtilsCheckAddonOrderMod.Options
import typings.storybookCoreServer.anon.Address
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9DevServerMod {
  
  @JSImport("@storybook/core-server/dist/ts3.9/dev-server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/core-server/dist/ts3.9/dev-server", "DEBOUNCE")
  @js.native
  val DEBOUNCE: /* 100 */ Double = js.native
  
  @JSImport("@storybook/core-server/dist/ts3.9/dev-server", "router")
  @js.native
  val router: Router = js.native
  
  inline def storybookDevServer(options: Options): js.Promise[Address] = ^.asInstanceOf[js.Dynamic].applyDynamic("storybookDevServer")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Address]]
}
