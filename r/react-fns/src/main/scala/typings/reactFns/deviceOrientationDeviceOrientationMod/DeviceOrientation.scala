package typings.reactFns.deviceOrientationDeviceOrientationMod

import typings.react.mod.Component
import typings.reactFns.typesMod.SharedRenderProps
import typings.std.DeviceOrientationEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-fns/dist/DeviceOrientation/DeviceOrientation", "DeviceOrientation")
@js.native
class DeviceOrientation ()
  extends Component[SharedRenderProps[DeviceOrientationProps], DeviceOrientationProps, js.Any] {
  
  @JSName("componentDidMount")
  def componentDidMount_MDeviceOrientation(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MDeviceOrientation(): Unit = js.native
  
  def handleDeviceOrientation(e: DeviceOrientationEvent): Unit = js.native
}
