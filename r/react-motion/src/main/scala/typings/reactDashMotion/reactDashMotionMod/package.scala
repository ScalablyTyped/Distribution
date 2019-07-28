package typings.reactDashMotion

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashMotionMod {
  type InterpolateFunction = js.Function1[
    /* previousInterpolatedStyles */ js.UndefOr[js.Array[TransitionPlainStyle]], 
    js.Array[TransitionStyle]
  ]
  type PlainStyle = StringDictionary[Double]
  type Style = StringDictionary[Double | OpaqueConfig]
  type Velocity = StringDictionary[Double]
}
