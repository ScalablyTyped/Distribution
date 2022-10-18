package typings.reactNativeSensorManager.mod

import typings.react.mod.ReactElement
import typings.reactNative.anon.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Touchable {
  
  @JSImport("react-native-sensor-manager", "Touchable")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-sensor-manager", "Touchable.TOUCH_TARGET_DEBUG")
  @js.native
  def TOUCH_TARGET_DEBUG: Boolean = js.native
  inline def TOUCH_TARGET_DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOUCH_TARGET_DEBUG")(x.asInstanceOf[js.Any])
  
  inline def renderDebugView(config: Color): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("renderDebugView")(config.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
}
