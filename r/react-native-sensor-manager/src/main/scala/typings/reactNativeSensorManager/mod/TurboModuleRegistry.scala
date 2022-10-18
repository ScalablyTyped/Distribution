package typings.reactNativeSensorManager.mod

import typings.reactNative.mod.TurboModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TurboModuleRegistry {
  
  @JSImport("react-native-sensor-manager", "TurboModuleRegistry")
  @js.native
  val ^ : js.Any = js.native
  
  inline def get[T /* <: TurboModule */](name: String): T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any]).asInstanceOf[T | Null]
  
  inline def getEnforcing[T /* <: TurboModule */](name: String): T = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnforcing")(name.asInstanceOf[js.Any]).asInstanceOf[T]
}
