package typings.react.experimentalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactAugmentingMod {
  type TransitionFunction = js.Function0[js.UndefOr[scala.Unit]]
  type TransitionStartFunction = js.Function1[
    /* callback */ typings.react.experimentalMod.reactAugmentingMod.TransitionFunction, 
    scala.Unit
  ]
}
