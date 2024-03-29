package typings.reactFns

import typings.react.mod.ComponentType
import typings.reactFns.distDeviceMotionDeviceMotionMod.DeviceMotionProps
import typings.reactFns.distTypesMod.SharedRenderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeviceMotionMod {
  
  @JSImport("react-fns/dist/DeviceMotion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-fns/dist/DeviceMotion", "DeviceMotion")
  @js.native
  open class DeviceMotion protected ()
    extends typings.reactFns.distDeviceMotionDeviceMotionMod.DeviceMotion {
    def this(props: SharedRenderProps[DeviceMotionProps]) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: SharedRenderProps[DeviceMotionProps], context: Any) = this()
  }
  
  inline def withDeviceMotion[Props](Component: ComponentType[Props & DeviceMotionProps]): ComponentType[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("withDeviceMotion")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Props]]
}
