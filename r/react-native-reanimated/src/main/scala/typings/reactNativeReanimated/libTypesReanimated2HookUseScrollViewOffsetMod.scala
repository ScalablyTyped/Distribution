package typings.reactNativeReanimated

import typings.react.mod.RefObject
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.SharedValue
import typings.reactNativeReanimated.mod.Animated.ScrollView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2HookUseScrollViewOffsetMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/hook/useScrollViewOffset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useScrollViewOffset(aref: RefObject[ScrollView]): SharedValue[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("useScrollViewOffset")(aref.asInstanceOf[js.Any]).asInstanceOf[SharedValue[Double]]
}
