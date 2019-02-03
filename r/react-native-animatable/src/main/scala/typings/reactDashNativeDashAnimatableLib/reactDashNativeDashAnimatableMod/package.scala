package typings
package reactDashNativeDashAnimatableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashAnimatableMod {
  type Animation = /* import warning: LimitUnionLength.enterTypeRef Was union type with length 62 */ java.lang.String
  type Image = AnimatableComponent[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ImageProperties */ js.Any, 
    reactDashNativeLib.reactDashNativeMod.ImageStyle
  ]
  type Text = AnimatableComponent[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextProperties */ js.Any, 
    reactDashNativeLib.reactDashNativeMod.TextStyle
  ]
  type View = AnimatableComponent[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ViewProperties */ js.Any, 
    reactDashNativeLib.reactDashNativeMod.ViewStyle
  ]
}
