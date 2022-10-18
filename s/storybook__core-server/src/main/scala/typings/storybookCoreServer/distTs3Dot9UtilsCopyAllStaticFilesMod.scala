package typings.storybookCoreServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9UtilsCopyAllStaticFilesMod {
  
  @JSImport("@storybook/core-server/dist/ts3.9/utils/copy-all-static-files", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def copyAllStaticFiles(staticDirs: js.Array[Any], outputDir: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyAllStaticFiles")(staticDirs.asInstanceOf[js.Any], outputDir.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def copyAllStaticFiles(staticDirs: Unit, outputDir: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyAllStaticFiles")(staticDirs.asInstanceOf[js.Any], outputDir.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def copyAllStaticFilesRelativeToMain(staticDirs: js.Array[Any], outputDir: String, configDir: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyAllStaticFilesRelativeToMain")(staticDirs.asInstanceOf[js.Any], outputDir.asInstanceOf[js.Any], configDir.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def copyAllStaticFilesRelativeToMain(staticDirs: Unit, outputDir: String, configDir: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyAllStaticFilesRelativeToMain")(staticDirs.asInstanceOf[js.Any], outputDir.asInstanceOf[js.Any], configDir.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
