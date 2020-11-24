package typings.reactFns

import typings.react.mod.ComponentType
import typings.reactFns.deviceMotionDeviceMotionMod.DeviceMotionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-fns/dist/DeviceMotion", JSImport.Namespace)
@js.native
object deviceMotionMod extends js.Object {
  
  def withDeviceMotion[Props](Component: ComponentType[Props with DeviceMotionProps]): ComponentType[Props] = js.native
  
  @js.native
  class DeviceMotion ()
    extends typings.reactFns.deviceMotionDeviceMotionMod.DeviceMotion
}
