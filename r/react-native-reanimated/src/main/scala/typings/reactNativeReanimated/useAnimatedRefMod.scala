package typings.reactNativeReanimated

import typings.react.mod.Component
import typings.reactNativeReanimated.hookCommonTypesMod.RefObjectFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useAnimatedRefMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/hook/useAnimatedRef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useAnimatedRef[T /* <: Component[js.Object, js.Object, Any] */](): RefObjectFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedRef")().asInstanceOf[RefObjectFunction[T]]
}
