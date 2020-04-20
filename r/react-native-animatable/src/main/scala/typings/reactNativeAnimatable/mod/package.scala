package typings.reactNativeAnimatable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.linear
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.ease
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-cubic`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-cubic`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-cubic`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-circ`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-circ`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-circ`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-expo`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-expo`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-expo`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-quad`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-quad`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-quad`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-quart`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-quart`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-quart`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-quint`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-quint`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-quint`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-sine`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-sine`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-sine`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-back`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-back`
    - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-back`
    - typings.reactNativeAnimatable.mod.EasingFunction
  */
  type Easing = typings.reactNativeAnimatable.mod._Easing | typings.reactNativeAnimatable.mod.EasingFunction
  type EasingFunction = js.Function1[/* t */ scala.Double, scala.Double]
  type GetPropertyType[B, K /* <: /* keyof B */ java.lang.String */] = /* import warning: importer.ImportType#apply Failed type conversion: B[K] */ js.Any
  type Image = typings.reactNativeAnimatable.mod.AnimatableComponent[typings.reactNative.mod.ImageProperties, typings.reactNative.mod.ImageStyle]
  type Text = typings.reactNativeAnimatable.mod.AnimatableComponent[typings.reactNative.mod.TextProperties, typings.reactNative.mod.TextStyle]
  type View = typings.reactNativeAnimatable.mod.AnimatableComponent[typings.reactNative.mod.ViewProperties, typings.reactNative.mod.ViewStyle]
}
