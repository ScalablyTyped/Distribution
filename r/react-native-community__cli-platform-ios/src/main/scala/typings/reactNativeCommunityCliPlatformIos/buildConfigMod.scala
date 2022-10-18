package typings.reactNativeCommunityCliPlatformIos

import typings.reactNativeCommunityCliTypes.buildIosMod.IOSDependencyConfig
import typings.reactNativeCommunityCliTypes.buildIosMod.IOSDependencyParams
import typings.reactNativeCommunityCliTypes.buildIosMod.IOSProjectConfig
import typings.reactNativeCommunityCliTypes.buildIosMod.IOSProjectParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildConfigMod {
  
  @JSImport("@react-native-community/cli-platform-ios/build/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dependencyConfig(folder: String): IOSDependencyConfig | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("dependencyConfig")(folder.asInstanceOf[js.Any]).asInstanceOf[IOSDependencyConfig | Null]
  inline def dependencyConfig(folder: String, userConfig: IOSDependencyParams): IOSDependencyConfig | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("dependencyConfig")(folder.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any])).asInstanceOf[IOSDependencyConfig | Null]
  
  @JSImport("@react-native-community/cli-platform-ios/build/config", "findPodfilePaths")
  @js.native
  val findPodfilePaths: js.Function1[/* cwd */ String, js.Array[String]] = js.native
  
  inline def projectConfig(folder: String, userConfig: IOSProjectParams): IOSProjectConfig | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("projectConfig")(folder.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any])).asInstanceOf[IOSProjectConfig | Null]
}
