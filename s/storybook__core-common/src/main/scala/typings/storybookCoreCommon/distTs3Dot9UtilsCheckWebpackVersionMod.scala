package typings.storybookCoreCommon

import typings.storybookCoreCommon.anon.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9UtilsCheckWebpackVersionMod {
  
  @JSImport("@storybook/core-common/dist/ts3.9/utils/check-webpack-version", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkWebpackVersion(webpack: Version, specifier: String, caption: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkWebpackVersion")(webpack.asInstanceOf[js.Any], specifier.asInstanceOf[js.Any], caption.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
