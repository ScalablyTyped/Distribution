package typings.react.experimentalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactMod {
  type TransitionFunction = js.Function0[js.UndefOr[Unit]]
  type TransitionStartFunction = js.Function1[/* callback */ TransitionFunction, Unit]
}
