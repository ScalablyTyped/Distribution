package typings.reactNativeCommunityCliPlatformAndroid

import typings.reactNativeCommunityCliTypes.buildAndroidMod.AndroidDependencyConfig
import typings.reactNativeCommunityCliTypes.buildAndroidMod.AndroidDependencyParams
import typings.reactNativeCommunityCliTypes.buildAndroidMod.AndroidProjectConfig
import typings.reactNativeCommunityCliTypes.buildAndroidMod.AndroidProjectParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildConfigMod {
  
  @JSImport("@react-native-community/cli-platform-android/build/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dependencyConfig(root: String): AndroidDependencyConfig | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("dependencyConfig")(root.asInstanceOf[js.Any]).asInstanceOf[AndroidDependencyConfig | Null]
  inline def dependencyConfig(root: String, userConfig: AndroidDependencyParams): AndroidDependencyConfig | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("dependencyConfig")(root.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any])).asInstanceOf[AndroidDependencyConfig | Null]
  
  inline def projectConfig(root: String): AndroidProjectConfig | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("projectConfig")(root.asInstanceOf[js.Any]).asInstanceOf[AndroidProjectConfig | Null]
  inline def projectConfig(root: String, userConfig: AndroidProjectParams): AndroidProjectConfig | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("projectConfig")(root.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any])).asInstanceOf[AndroidProjectConfig | Null]
}
