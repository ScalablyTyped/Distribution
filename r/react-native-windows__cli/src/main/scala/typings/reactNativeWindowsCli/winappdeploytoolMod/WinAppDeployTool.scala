package typings.reactNativeWindowsCli.winappdeploytoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WinAppDeployTool extends js.Object {
  
  def enumerateDevices(): js.Array[DeviceInfo] = js.native
  
  def findDevice(target: String): DeviceInfo = js.native
  
  def installAppPackage(
    pathToAppxPackage: String,
    targetDevice: DeviceInfo,
    shouldLaunch: Boolean,
    shouldUpdate: Boolean,
    pin: Boolean
  ): js.Promise[Unit] = js.native
  def installAppPackage(
    pathToAppxPackage: String,
    targetDevice: DeviceInfo,
    shouldLaunch: Boolean,
    shouldUpdate: Boolean,
    pin: Boolean,
    verbose: Boolean
  ): js.Promise[Unit] = js.native
  
  def isAvailable: Boolean = js.native
  
  var path: js.Any = js.native
  
  def uninstallAppPackage(appName: String, targetDevice: DeviceInfo, verbose: Boolean): js.Promise[Unit] = js.native
}
