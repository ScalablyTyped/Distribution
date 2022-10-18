package typings.storybookCoreServer

import typings.express.mod.Router
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9UtilsMetadataMod {
  
  @JSImport("@storybook/core-server/dist/ts3.9/utils/metadata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extractStorybookMetadata(outputFile: String, configDir: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractStorybookMetadata")(outputFile.asInstanceOf[js.Any], configDir.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def useStorybookMetadata(router: Router): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useStorybookMetadata")(router.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useStorybookMetadata(router: Router, configDir: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useStorybookMetadata")(router.asInstanceOf[js.Any], configDir.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
