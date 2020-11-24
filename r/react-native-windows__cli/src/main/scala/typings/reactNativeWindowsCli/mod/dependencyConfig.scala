package typings.reactNativeWindowsCli.mod

import org.scalablytyped.runtime.TopLevel
import typings.reactNativeWindowsCli.anon.PartialWindowsDependencyC
import typings.reactNativeWindowsCli.dependencyConfigMod.WindowsDependencyConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-native-windows/cli/lib-commonjs", "dependencyConfig")
@js.native
object dependencyConfig
  extends TopLevel[
      js.Function2[
        /* folder */ String, 
        /* userConfig */ js.UndefOr[PartialWindowsDependencyC | Null], 
        WindowsDependencyConfig | Null
      ]
    ]
