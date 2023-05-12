package typings.reactNativeCommunityCliPlatformIos

import typings.reactNativeCommunityCliPlatformIos.buildTypesMod.IosProjectInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildToolsCheckIfConfigurationExistsMod {
  
  @JSImport("@react-native-community/cli-platform-ios/build/tools/checkIfConfigurationExists", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkIfConfigurationExists(project: IosProjectInfo, mode: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkIfConfigurationExists")(project.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
