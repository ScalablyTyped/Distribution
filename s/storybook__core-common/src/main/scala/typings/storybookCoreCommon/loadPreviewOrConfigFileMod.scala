package typings.storybookCoreCommon

import typings.storybookCoreCommon.anon.ConfigDir
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadPreviewOrConfigFileMod {
  
  @JSImport("@storybook/core-common/dist/ts3.9/utils/load-preview-or-config-file", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadPreviewOrConfigFile(hasConfigDir: ConfigDir): String = ^.asInstanceOf[js.Dynamic].applyDynamic("loadPreviewOrConfigFile")(hasConfigDir.asInstanceOf[js.Any]).asInstanceOf[String]
}
