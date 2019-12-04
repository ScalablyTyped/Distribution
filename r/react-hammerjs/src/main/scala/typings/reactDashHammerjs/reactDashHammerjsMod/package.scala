package typings.reactDashHammerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashHammerjsMod {
  import typings.hammerjs.HammerOptions
  import typings.reactDashHammerjs.Anon_Gesture
  import typings.reactDashHammerjs.reactDashHammerjsStrings.recognizers
  import typings.std.Exclude
  import typings.std.Pick

  type HammerOptionsWithRecognizers = (typings.std.Omit[HammerOptions, recognizers]) with Anon_Gesture
  type Omit[T, K] = Pick[T, Exclude[String, K]]
}
