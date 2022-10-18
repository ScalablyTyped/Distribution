package typings.reactFns

import typings.react.mod.ComponentType
import typings.reactFns.distDeviceOrientationDeviceOrientationMod.DeviceOrientationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeviceOrientationWithDeviceOrientationMod {
  
  @JSImport("react-fns/dist/DeviceOrientation/withDeviceOrientation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withDeviceOrientation[Props](Component: ComponentType[Props & DeviceOrientationProps]): ComponentType[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("withDeviceOrientation")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Props]]
}
