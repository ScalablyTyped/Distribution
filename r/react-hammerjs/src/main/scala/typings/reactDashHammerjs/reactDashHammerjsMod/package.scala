package typings.reactDashHammerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashHammerjsMod {
  import typings.hammerjs.HammerOptions
  import typings.reactDashHammerjs.Anon_Gesture
  import typings.reactDashHammerjs.Omit
  import typings.reactDashHammerjs.reactDashHammerjsStrings.recognizers

  type HammerOptionsWithRecognizers = (Omit[HammerOptions, recognizers]) with Anon_Gesture
}
