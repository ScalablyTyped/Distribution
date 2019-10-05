package typings.reactDashFns

import typings.react.reactMod.ComponentType
import typings.reactDashFns.distDeviceMotionDeviceMotionMod.DeviceMotionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns/dist/DeviceMotion", JSImport.Namespace)
@js.native
object distDeviceMotionMod extends js.Object {
  @js.native
  class DeviceMotion ()
    extends typings.reactDashFns.distDeviceMotionDeviceMotionMod.DeviceMotion
  
  def withDeviceMotion[Props](Component: ComponentType[Props with DeviceMotionProps]): ComponentType[Props] = js.native
}

