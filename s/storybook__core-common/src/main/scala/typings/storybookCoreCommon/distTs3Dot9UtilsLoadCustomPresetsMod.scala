package typings.storybookCoreCommon

import typings.storybookCoreCommon.anon.ConfigDir
import typings.storybookCoreCommon.distTs3Dot9TypesMod.PresetConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9UtilsLoadCustomPresetsMod {
  
  @JSImport("@storybook/core-common/dist/ts3.9/utils/load-custom-presets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadCustomPresets(hasConfigDir: ConfigDir): js.Array[PresetConfig] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadCustomPresets")(hasConfigDir.asInstanceOf[js.Any]).asInstanceOf[js.Array[PresetConfig]]
}
