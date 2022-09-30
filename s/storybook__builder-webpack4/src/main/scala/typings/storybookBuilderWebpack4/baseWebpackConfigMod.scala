package typings.storybookBuilderWebpack4

import typings.storybookCoreCommon.checkAddonOrderMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseWebpackConfigMod {
  
  @JSImport("@storybook/builder-webpack4/dist/ts3.9/preview/base-webpack.config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDefaultWebpackConfig(storybookBaseConfig: Any, options: Options): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultWebpackConfig")(storybookBaseConfig.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
}
