package typings.reactFns

import typings.react.mod.ComponentType
import typings.reactFns.deviceOrientationDeviceOrientationMod.DeviceOrientationProps
import typings.reactFns.typesMod.SharedRenderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deviceOrientationMod {
  
  @JSImport("react-fns/dist/DeviceOrientation", "DeviceOrientation")
  @js.native
  class DeviceOrientation protected ()
    extends typings.reactFns.deviceOrientationDeviceOrientationMod.DeviceOrientation {
    def this(props: SharedRenderProps[DeviceOrientationProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SharedRenderProps[DeviceOrientationProps], context: js.Any) = this()
  }
  
  @JSImport("react-fns/dist/DeviceOrientation", "withDeviceOrientation")
  @js.native
  def withDeviceOrientation[Props](Component: ComponentType[Props with DeviceOrientationProps]): ComponentType[Props] = js.native
}
