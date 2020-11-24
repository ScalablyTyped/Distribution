package typings.reactNativeWindowsCli.mod

import org.scalablytyped.runtime.TopLevel
import typings.reactNativeWindowsCli.anon.PartialWindowsProjectConf
import typings.reactNativeWindowsCli.projectConfigMod.WindowsProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-native-windows/cli/lib-commonjs", "projectConfig")
@js.native
object projectConfig
  extends TopLevel[
      js.Function2[
        /* folder */ String, 
        /* userConfig */ js.UndefOr[PartialWindowsProjectConf], 
        WindowsProjectConfig | Null
      ]
    ]
