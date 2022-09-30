package typings.storybookCoreCommon

import typings.webpack.mod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeWebpackConfigMod {
  
  @JSImport("@storybook/core-common/dist/ts3.9/utils/merge-webpack-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mergeConfigs(config: Configuration, customConfig: Configuration): Configuration = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeConfigs")(config.asInstanceOf[js.Any], customConfig.asInstanceOf[js.Any])).asInstanceOf[Configuration]
}
