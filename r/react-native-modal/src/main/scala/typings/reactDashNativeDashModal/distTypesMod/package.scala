package typings.reactDashNativeDashModal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  import typings.reactDashNative.reactDashNativeMod.ImageStyle
  import typings.reactDashNative.reactDashNativeMod.NativeSyntheticEvent
  import typings.reactDashNative.reactDashNativeMod.TextStyle
  import typings.reactDashNative.reactDashNativeMod.ViewStyle
  import typings.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableMod.Animation
  import typings.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableMod.CustomAnimation

  type AnimationEvent = js.Function1[/* repeated */ js.Any, Unit]
  type OnOrientationChange = js.Function1[/* orientation */ NativeSyntheticEvent[js.Any], Unit]
  type OrNull[T] = Null | T
  type SupportedAnimation = Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle])
}
