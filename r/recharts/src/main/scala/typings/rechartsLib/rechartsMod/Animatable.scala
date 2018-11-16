package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Animatable extends js.Object {
  var animationBegin: js.UndefOr[scala.Double] = js.undefined
  var animationDuration: js.UndefOr[scala.Double] = js.undefined
  var animationEasing: js.UndefOr[AnimationEasingType] = js.undefined
  var animationId: js.UndefOr[scala.Double] = js.undefined
  var isAnimationActive: js.UndefOr[scala.Boolean] = js.undefined
  var isUpdateAnimationActive: js.UndefOr[scala.Boolean] = js.undefined
  var onAnimationEnd: js.UndefOr[RechartsFunction] = js.undefined
  var onAnimationStart: js.UndefOr[RechartsFunction] = js.undefined
}

