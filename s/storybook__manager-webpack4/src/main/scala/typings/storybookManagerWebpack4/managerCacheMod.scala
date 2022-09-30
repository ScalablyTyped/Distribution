package typings.storybookManagerWebpack4

import typings.storybookCoreCommon.checkAddonOrderMod.Options
import typings.webpack.mod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object managerCacheMod {
  
  @JSImport("@storybook/manager-webpack4/dist/ts3.9/utils/manager-cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearManagerCache(cacheKey: String, options: Options): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("clearManagerCache")(cacheKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def useManagerCache(cacheKey: String, options: Options, managerConfig: Configuration): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useManagerCache")(cacheKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], managerConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
}
