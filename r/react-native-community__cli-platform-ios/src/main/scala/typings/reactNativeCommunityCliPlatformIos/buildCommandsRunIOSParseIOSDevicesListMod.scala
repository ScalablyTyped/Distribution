package typings.reactNativeCommunityCliPlatformIos

import typings.reactNativeCommunityCliPlatformIos.buildTypesMod.Device
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsRunIOSParseIOSDevicesListMod {
  
  @JSImport("@react-native-community/cli-platform-ios/build/commands/runIOS/parseIOSDevicesList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parses the output of the `xcrun instruments -s` command and returns metadata
    * about available iOS simulators and physical devices, as well as host Mac for
    * Catalyst purposes.
    *
    * Expected text looks roughly like this:
    *
    * ```
    * Known Devices:
    * this-mac-device [UDID]
    * A Physical Device (OS Version) [UDID]
    * A Simulator Device (OS Version) [UDID] (Simulator)
    * ```
    */
  inline def default(text: String): js.Array[Device] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any]).asInstanceOf[js.Array[Device]]
}
