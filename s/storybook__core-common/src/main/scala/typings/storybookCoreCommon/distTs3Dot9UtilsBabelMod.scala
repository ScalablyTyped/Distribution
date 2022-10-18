package typings.storybookCoreCommon

import typings.babelCore.mod.TransformOptions
import typings.storybookCoreCommon.anon.Local
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9UtilsBabelMod {
  
  @JSImport("@storybook/core-common/dist/ts3.9/utils/babel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStorybookBabelConfig(): TransformOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getStorybookBabelConfig")().asInstanceOf[TransformOptions]
  inline def getStorybookBabelConfig(hasLocal: Local): TransformOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getStorybookBabelConfig")(hasLocal.asInstanceOf[js.Any]).asInstanceOf[TransformOptions]
  
  inline def getStorybookBabelDependencies(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStorybookBabelDependencies")().asInstanceOf[js.Array[String]]
}
