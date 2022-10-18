package typings.reactNativeCommunityCliPlatformIos

import typings.reactNativeCommunityCliPlatformIos.anon.Booted
import typings.reactNativeCommunityCliPlatformIos.anon.Devices
import typings.reactNativeCommunityCliPlatformIos.anon.Simulator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsRunIOSFindMatchingSimulatorMod {
  
  @JSImport("@react-native-community/cli-platform-ios/build/commands/runIOS/findMatchingSimulator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Takes in a parsed simulator list and a desired name, and returns an object with the matching simulator. The desired
    * name can optionally include the iOS version in between parenthesis after the device name. Ex: "iPhone 6 (9.2)" in
    * which case it'll attempt to find a simulator with the exact version specified.
    *
    * If the simulatorString argument is null, we'll go into default mode and return the currently booted simulator,
    * the last booted simulator or
    * if none is booted, it will be the first in the list.
    *
    * @param simulators a parsed list from `xcrun simctl list --json devices` command
    * @param findOptions null or an object containing:
    * ```
    * {
    *    simulator: name of desired simulator
    *    udid: udid of desired simulator
    * }
    * ```
    * If null, it will use the currently booted simulator, or if none are booted, the first in the list.
    */
  inline def default(simulators: Devices): Booted | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(simulators.asInstanceOf[js.Any]).asInstanceOf[Booted | Null]
  inline def default(simulators: Devices, findOptions: Simulator): Booted | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(simulators.asInstanceOf[js.Any], findOptions.asInstanceOf[js.Any])).asInstanceOf[Booted | Null]
}
