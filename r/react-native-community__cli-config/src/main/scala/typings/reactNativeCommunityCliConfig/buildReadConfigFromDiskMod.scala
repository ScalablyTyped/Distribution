package typings.reactNativeCommunityCliConfig

import typings.reactNativeCommunityCliTypes.mod.UserConfig
import typings.reactNativeCommunityCliTypes.mod.UserDependencyConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildReadConfigFromDiskMod {
  
  @JSImport("@react-native-community/cli-config/build/readConfigFromDisk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readConfigFromDisk(rootFolder: String): UserConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("readConfigFromDisk")(rootFolder.asInstanceOf[js.Any]).asInstanceOf[UserConfig]
  
  inline def readDependencyConfigFromDisk(rootFolder: String, dependencyName: String): UserDependencyConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("readDependencyConfigFromDisk")(rootFolder.asInstanceOf[js.Any], dependencyName.asInstanceOf[js.Any])).asInstanceOf[UserDependencyConfig]
}
