package typings.reactNativeCommunityCliPlatformAndroid

import typings.reactNativeCommunityCliTypes.androidMod.AndroidDependencyConfig
import typings.reactNativeCommunityCliTypes.androidMod.AndroidDependencyParams
import typings.reactNativeCommunityCliTypes.androidMod.AndroidProjectConfig
import typings.reactNativeCommunityCliTypes.androidMod.AndroidProjectParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  @JSImport("@react-native-community/cli-platform-android/build/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dependencyConfig(root: String): AndroidDependencyConfig | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("dependencyConfig")(root.asInstanceOf[js.Any]).asInstanceOf[AndroidDependencyConfig | Null]
  inline def dependencyConfig(root: String, userConfig: AndroidDependencyParams): AndroidDependencyConfig | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("dependencyConfig")(root.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any])).asInstanceOf[AndroidDependencyConfig | Null]
  
  inline def projectConfig(root: String): AndroidProjectConfig | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("projectConfig")(root.asInstanceOf[js.Any]).asInstanceOf[AndroidProjectConfig | Null]
  inline def projectConfig(root: String, userConfig: AndroidProjectParams): AndroidProjectConfig | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("projectConfig")(root.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any])).asInstanceOf[AndroidProjectConfig | Null]
}
