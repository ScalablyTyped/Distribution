package typings
package reactDashNativeDashAnimatableLib.reactDashNativeDashAnimatableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimatableProperties[S /* <: js.Object */] extends js.Object {
  var animation: js.UndefOr[reactDashNativeDashAnimatableLib.Animation | java.lang.String] = js.undefined
  var delay: js.UndefOr[scala.Double] = js.undefined
  var direction: js.UndefOr[
    reactDashNativeDashAnimatableLib.reactDashNativeDashAnimatableLibStrings.normal | reactDashNativeDashAnimatableLib.reactDashNativeDashAnimatableLibStrings.reverse | reactDashNativeDashAnimatableLib.reactDashNativeDashAnimatableLibStrings.alternate | reactDashNativeDashAnimatableLib.reactDashNativeDashAnimatableLibStrings.`alternate-reverse`
  ] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var easing: js.UndefOr[reactDashNativeDashAnimatableLib.Easing] = js.undefined
  var iterationCount: js.UndefOr[
    scala.Double | reactDashNativeDashAnimatableLib.reactDashNativeDashAnimatableLibStrings.infinite
  ] = js.undefined
  var iterationDelay: js.UndefOr[scala.Double] = js.undefined
  var onAnimationBegin: js.UndefOr[js.Function] = js.undefined
  var onAnimationEnd: js.UndefOr[js.Function] = js.undefined
  var onTransitionBegin: js.UndefOr[js.Function1[/* property */ java.lang.String, scala.Unit]] = js.undefined
  var onTransitionEnd: js.UndefOr[js.Function1[/* property */ java.lang.String, scala.Unit]] = js.undefined
  var transition: js.UndefOr[java.lang.String] = js.undefined
  var useNativeDriver: js.UndefOr[scala.Boolean] = js.undefined
}

