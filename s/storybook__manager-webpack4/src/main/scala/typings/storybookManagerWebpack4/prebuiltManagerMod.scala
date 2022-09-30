package typings.storybookManagerWebpack4

import typings.storybookCoreCommon.checkAddonOrderMod.Options
import typings.storybookManagerWebpack4.storybookManagerWebpack4Booleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prebuiltManagerMod {
  
  @JSImport("@storybook/manager-webpack4/dist/ts3.9/utils/prebuilt-manager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/manager-webpack4/dist/ts3.9/utils/prebuilt-manager", "DEFAULT_ADDONS")
  @js.native
  val DEFAULT_ADDONS: js.Array[String] = js.native
  
  @JSImport("@storybook/manager-webpack4/dist/ts3.9/utils/prebuilt-manager", "IGNORED_ADDONS")
  @js.native
  val IGNORED_ADDONS: js.Array[String] = js.native
  
  inline def getPrebuiltDir(options: Options): js.Promise[String | `false`] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrebuiltDir")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String | `false`]]
}
