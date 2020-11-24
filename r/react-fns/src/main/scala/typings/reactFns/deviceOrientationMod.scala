package typings.reactFns

import typings.react.mod.ComponentType
import typings.reactFns.deviceOrientationDeviceOrientationMod.DeviceOrientationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-fns/dist/DeviceOrientation", JSImport.Namespace)
@js.native
object deviceOrientationMod extends js.Object {
  
  def withDeviceOrientation[Props](Component: ComponentType[Props with DeviceOrientationProps]): ComponentType[Props] = js.native
  
  @js.native
  class DeviceOrientation ()
    extends typings.reactFns.deviceOrientationDeviceOrientationMod.DeviceOrientation
}
