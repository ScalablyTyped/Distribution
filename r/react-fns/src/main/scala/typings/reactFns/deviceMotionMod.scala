package typings.reactFns

import typings.react.mod.ComponentType
import typings.reactFns.deviceMotionDeviceMotionMod.DeviceMotionProps
import typings.reactFns.typesMod.SharedRenderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deviceMotionMod {
  
  @JSImport("react-fns/dist/DeviceMotion", "DeviceMotion")
  @js.native
  class DeviceMotion protected ()
    extends typings.reactFns.deviceMotionDeviceMotionMod.DeviceMotion {
    def this(props: SharedRenderProps[DeviceMotionProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SharedRenderProps[DeviceMotionProps], context: js.Any) = this()
  }
  
  @JSImport("react-fns/dist/DeviceMotion", "withDeviceMotion")
  @js.native
  def withDeviceMotion[Props](Component: ComponentType[Props with DeviceMotionProps]): ComponentType[Props] = js.native
}
