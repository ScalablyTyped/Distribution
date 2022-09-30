package typings.storybookCoreCommon

import typings.babelCore.mod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadCustomBabelConfigMod {
  
  @JSImport("@storybook/core-common/dist/ts3.9/utils/load-custom-babel-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadCustomBabelConfig(configDir: String, getDefaultConfig: js.Function0[TransformOptions]): js.Promise[TransformOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadCustomBabelConfig")(configDir.asInstanceOf[js.Any], getDefaultConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransformOptions]]
}
