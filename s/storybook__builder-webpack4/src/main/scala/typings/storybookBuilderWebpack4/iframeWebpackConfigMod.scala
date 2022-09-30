package typings.storybookBuilderWebpack4

import typings.std.Record
import typings.storybookCoreCommon.checkAddonOrderMod.Options
import typings.webpack.mod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iframeWebpackConfigMod {
  
  @JSImport("@storybook/builder-webpack4/dist/ts3.9/preview/iframe-webpack.config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: Options & (Record[String, Any])): js.Promise[Configuration] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Configuration]]
}
