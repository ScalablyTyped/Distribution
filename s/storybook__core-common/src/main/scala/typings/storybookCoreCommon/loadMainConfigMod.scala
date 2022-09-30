package typings.storybookCoreCommon

import typings.storybookCoreCommon.anon.ConfigDir
import typings.storybookCoreCommon.typesMod.StorybookConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadMainConfigMod {
  
  @JSImport("@storybook/core-common/dist/ts3.9/utils/load-main-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadMainConfig(hasConfigDir: ConfigDir): StorybookConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("loadMainConfig")(hasConfigDir.asInstanceOf[js.Any]).asInstanceOf[StorybookConfig]
}
