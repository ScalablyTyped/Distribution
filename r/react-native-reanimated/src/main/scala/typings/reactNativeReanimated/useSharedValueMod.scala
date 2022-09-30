package typings.reactNativeReanimated

import typings.reactNativeReanimated.reanimated2CommonTypesMod.SharedValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useSharedValueMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/hook/useSharedValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useSharedValue[T](init: T): SharedValue[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSharedValue")(init.asInstanceOf[js.Any]).asInstanceOf[SharedValue[T]]
}
