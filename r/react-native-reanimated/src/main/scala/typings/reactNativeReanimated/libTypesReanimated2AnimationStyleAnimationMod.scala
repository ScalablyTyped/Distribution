package typings.reactNativeReanimated

import typings.reactNativeReanimated.libTypesReanimated2AnimationCommonTypesMod.StyleLayoutAnimation
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AnimatableValue
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AnimatedStyle
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.NestedObject
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.NestedObjectValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2AnimationStyleAnimationMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/animation/styleAnimation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolvePath[T](obj: NestedObject[T], path: js.Array[AnimatableValue]): js.UndefOr[NestedObjectValues[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolvePath")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[NestedObjectValues[T]]]
  inline def resolvePath[T](obj: NestedObject[T], path: AnimatableValue): js.UndefOr[NestedObjectValues[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolvePath")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[NestedObjectValues[T]]]
  
  inline def setPath[T](obj: NestedObject[T], path: Path, value: NestedObjectValues[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPath")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def withStyleAnimation(styleAnimations: AnimatedStyle): StyleLayoutAnimation = ^.asInstanceOf[js.Dynamic].applyDynamic("withStyleAnimation")(styleAnimations.asInstanceOf[js.Any]).asInstanceOf[StyleLayoutAnimation]
  
  type Path = (js.Array[String | Double]) | String | Double
}
