package typings.reactMotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type InterpolateFunction = js.Function1[
    /* previousInterpolatedStyles */ js.UndefOr[js.Array[typings.reactMotion.mod.TransitionPlainStyle]], 
    js.Array[typings.reactMotion.mod.TransitionStyle]
  ]
  type PlainStyle = org.scalablytyped.runtime.StringDictionary[scala.Double]
  type Style = org.scalablytyped.runtime.StringDictionary[scala.Double | typings.reactMotion.mod.OpaqueConfig]
  type Velocity = org.scalablytyped.runtime.StringDictionary[scala.Double]
}
