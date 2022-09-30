package typings.reactNativeReanimated.mod.Animated

import typings.reactNative.mod.StyleProp
import typings.reactNativeReanimated.anon.TypeofBaseAnimationBuildeDelay
import typings.reactNativeReanimated.mod.BaseAnimationBuilder
import typings.reactNativeReanimated.mod.EntryExitAnimationFunction
import typings.reactNativeReanimated.mod.Keyframe
import typings.reactNativeReanimated.mod.LayoutAnimationFunction
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimateProps[P /* <: js.Object */] extends StObject {
  
  var animatedProps: js.UndefOr[Partial[AnimateProps[P]]] = js.native
  
  var entering: js.UndefOr[
    BaseAnimationBuilder | TypeofBaseAnimationBuildeDelay | EntryExitAnimationFunction | Keyframe
  ] = js.native
  
  var exiting: js.UndefOr[
    BaseAnimationBuilder | TypeofBaseAnimationBuildeDelay | EntryExitAnimationFunction | Keyframe
  ] = js.native
  
  var layout: js.UndefOr[BaseAnimationBuilder | LayoutAnimationFunction | TypeofBaseAnimationBuildeDelay] = js.native
  
  var style: js.UndefOr[StyleProp[AnimateStyle[StylesOrDefault[P]]]] = js.native
}
