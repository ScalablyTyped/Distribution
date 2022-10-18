package typings.storybookCoreServer

import typings.storybookCoreCommon.distTs3Dot9UtilsCheckAddonOrderMod.Options
import typings.storybookCoreServer.anon.StaticDir
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9UtilsServerStaticsMod {
  
  @JSImport("@storybook/core-server/dist/ts3.9/utils/server-statics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseStaticDir(arg: String): js.Promise[StaticDir] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseStaticDir")(arg.asInstanceOf[js.Any]).asInstanceOf[js.Promise[StaticDir]]
  
  inline def useStatics(router: Any, options: Options): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("useStatics")(router.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
