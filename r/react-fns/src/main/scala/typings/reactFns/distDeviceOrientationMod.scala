package typings.reactFns

import typings.react.mod.ComponentType
import typings.reactFns.distDeviceOrientationDeviceOrientationMod.DeviceOrientationProps
import typings.reactFns.distTypesMod.SharedRenderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeviceOrientationMod {
  
  @JSImport("react-fns/dist/DeviceOrientation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-fns/dist/DeviceOrientation", "DeviceOrientation")
  @js.native
  open class DeviceOrientation protected ()
    extends typings.reactFns.distDeviceOrientationDeviceOrientationMod.DeviceOrientation {
    def this(props: SharedRenderProps[DeviceOrientationProps]) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: SharedRenderProps[DeviceOrientationProps], context: Any) = this()
  }
  
  inline def withDeviceOrientation[Props](Component: ComponentType[Props & DeviceOrientationProps]): ComponentType[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("withDeviceOrientation")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Props]]
}
