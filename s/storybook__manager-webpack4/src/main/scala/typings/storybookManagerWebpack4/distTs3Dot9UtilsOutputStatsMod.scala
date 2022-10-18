package typings.storybookManagerWebpack4

import typings.webpack.mod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9UtilsOutputStatsMod {
  
  @JSImport("@storybook/manager-webpack4/dist/ts3.9/utils/output-stats", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def outputStats(directory: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("outputStats")(directory.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def outputStats(directory: String, previewStats: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("outputStats")(directory.asInstanceOf[js.Any], previewStats.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def outputStats(directory: String, previewStats: Any, managerStats: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("outputStats")(directory.asInstanceOf[js.Any], previewStats.asInstanceOf[js.Any], managerStats.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def outputStats(directory: String, previewStats: Unit, managerStats: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("outputStats")(directory.asInstanceOf[js.Any], previewStats.asInstanceOf[js.Any], managerStats.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def writeStats(directory: String, name: String, stats: Stats): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeStats")(directory.asInstanceOf[js.Any], name.asInstanceOf[js.Any], stats.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
