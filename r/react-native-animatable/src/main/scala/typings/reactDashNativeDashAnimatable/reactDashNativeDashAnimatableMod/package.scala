package typings.reactDashNativeDashAnimatable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashAnimatableMod {
  import typings.reactDashNative.reactDashNativeMod.ImageStyle
  import typings.reactDashNative.reactDashNativeMod.TextStyle
  import typings.reactDashNative.reactDashNativeMod.ViewStyle

  type GetPropertyType[B, K /* <: String */] = /* import warning: ImportType.apply Failed type conversion: B[K] */ js.Any
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
