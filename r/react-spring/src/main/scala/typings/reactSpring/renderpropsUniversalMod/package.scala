package typings.reactSpring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object renderpropsUniversalMod {
  type SpringEasingFunc = js.Function1[/* t */ scala.Double, scala.Double]
  type SpringRendererFunc[DS /* <: js.Object */] = js.Function1[/* params */ DS, typings.react.mod.ReactNode]
  type TrailKeyProps = java.lang.String | scala.Double
  type TransitionKeyProps = java.lang.String | scala.Double
}
