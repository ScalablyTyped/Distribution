package typings.reactNativeCommunityCliPlatformIos

import typings.reactNativeCommunityCliPlatformIos.buildTypesMod.Device
import typings.reactNativeCommunityCliPlatformIos.buildTypesMod.IosProjectInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildToolsPromptsMod {
  
  @JSImport("@react-native-community/cli-platform-ios/build/tools/prompts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def promptForConfigurationSelection(project: IosProjectInfo): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("promptForConfigurationSelection")(project.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def promptForDeviceSelection(availableDevices: js.Array[Device]): js.Promise[js.UndefOr[Device]] = ^.asInstanceOf[js.Dynamic].applyDynamic("promptForDeviceSelection")(availableDevices.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[Device]]]
  
  inline def promptForSchemeSelection(project: IosProjectInfo): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("promptForSchemeSelection")(project.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
