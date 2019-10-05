package typings.reactDashFns

import typings.react.reactMod.ComponentType
import typings.reactDashFns.distDeviceOrientationDeviceOrientationMod.DeviceOrientationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns/dist/DeviceOrientation", JSImport.Namespace)
@js.native
object distDeviceOrientationMod extends js.Object {
  @js.native
  class DeviceOrientation ()
    extends typings.reactDashFns.distDeviceOrientationDeviceOrientationMod.DeviceOrientation
  
  def withDeviceOrientation[Props](Component: ComponentType[Props with DeviceOrientationProps]): ComponentType[Props] = js.native
}

