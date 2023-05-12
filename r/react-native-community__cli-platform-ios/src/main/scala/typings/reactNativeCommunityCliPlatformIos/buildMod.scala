package typings.reactNativeCommunityCliPlatformIos

import typings.reactNativeCommunityCliPlatformIos.anon.Examples
import typings.reactNativeCommunityCliPlatformIos.anon.Func
import typings.reactNativeCommunityCliPlatformIos.anon.Options
import typings.reactNativeCommunityCliTypes.buildIosMod.IOSDependencyConfig
import typings.reactNativeCommunityCliTypes.buildIosMod.IOSDependencyParams
import typings.reactNativeCommunityCliTypes.buildIosMod.IOSProjectConfig
import typings.reactNativeCommunityCliTypes.buildIosMod.IOSProjectParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMod {
  
  @JSImport("@react-native-community/cli-platform-ios/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-native-community/cli-platform-ios/build", "commands")
  @js.native
  val commands: js.Array[Func | Examples | Options] = js.native
  
  inline def dependencyConfig(folder: String): IOSDependencyConfig | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("dependencyConfig")(folder.asInstanceOf[js.Any]).asInstanceOf[IOSDependencyConfig | Null]
  inline def dependencyConfig(folder: String, userConfig: IOSDependencyParams): IOSDependencyConfig | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("dependencyConfig")(folder.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any])).asInstanceOf[IOSDependencyConfig | Null]
  
  @JSImport("@react-native-community/cli-platform-ios/build", "findPodfilePaths")
  @js.native
  val findPodfilePaths: js.Function1[/* cwd */ String, js.Array[String]] = js.native
  
  inline def projectConfig(folder: String, userConfig: IOSProjectParams): IOSProjectConfig | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("projectConfig")(folder.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any])).asInstanceOf[IOSProjectConfig | Null]
}
