package typings.reactDashNativeDashAnimatable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashAnimatableMod {
  import typings.reactDashNative.reactDashNativeMod.ImageStyle
  import typings.reactDashNative.reactDashNativeMod.TextStyle
  import typings.reactDashNative.reactDashNativeMod.ViewStyle

  /* Rewritten from type alias, can be one of: 
    - typings.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableStrings.linear
    - typings.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableStrings.ease
    - typings.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableStrings.`ease-in`
    - typings.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableStrings.`ease-out`
    - typings.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableStrings.`ease-in-out`
    - typings.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableStrings.`ease-in-cubic`
    - typings.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableStrings.`ease-out-cubic`
    - typings.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableStrings.`ease-in-out-cubic`
    - typings.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableStrings.`ease-in-circ`
    - typings.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableStrings.`ease-out-circ`
    - typings.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableStrings.`ease-in-out-circ`
    - typings.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableStrings.`ease-in-expo`
    - typings.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableStrings.`ease-out-expo`
    - typings.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableStrings.`ease-in-out-expo`
    - typings.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableStrings.`ease-in-quad`
    - typings.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableStrings.`ease-out-quad`
    - typings.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableStrings.`ease-in-out-quad`
    - typings.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableStrings.`ease-in-quart`
    - typings.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableStrings.`ease-out-quart`
    - typings.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableStrings.`ease-in-out-quart`
    - typings.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableStrings.`ease-in-quint`
    - typings.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableStrings.`ease-out-quint`
    - typings.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableStrings.`ease-in-out-quint`
    - typings.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableStrings.`ease-in-sine`
    - typings.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableStrings.`ease-out-sine`
    - typings.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableStrings.`ease-in-out-sine`
    - typings.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableStrings.`ease-in-back`
    - typings.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableStrings.`ease-out-back`
    - typings.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableStrings.`ease-in-out-back`
    - typings.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableMod.EasingFunction
  */
  type Easing = _Easing | EasingFunction
  type EasingFunction = js.Function1[/* t */ Double, Double]
  type GetPropertyType[B, K /* <: String */] = /* import warning: importer.ImportType#apply Failed type conversion: B[K] */ js.Any
  type Image = AnimatableComponent[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ImageProperties */ js.Any, 
    ImageStyle
  ]
  type Text = AnimatableComponent[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextProperties */ js.Any, 
    TextStyle
  ]
  type View = AnimatableComponent[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ViewProperties */ js.Any, 
    ViewStyle
  ]
}
