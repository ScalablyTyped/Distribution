package typings.reactDashCountdownDashCircleDashTimer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashCountdownDashCircleDashTimerMod {
  import typings.react.reactMod.ReactNode

  type ColorType = js.Array[js.Tuple2[String, js.UndefOr[Double]]]
  type OnCompleteFunctionType = js.Function0[js.UndefOr[(js.Tuple2[Boolean, Double]) | Unit]]
  type RenderTimeFunctionType = js.Function3[
    /* remainingTime */ Double, 
    /* elapsedTime */ Double, 
    /* isPlaying */ Boolean, 
    ReactNode
  ]
}
