package typings.reactHammerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type HammerOptionsWithRecognizers = (typings.std.Omit[
    typings.hammerjs.HammerOptions, 
    typings.reactHammerjs.reactHammerjsStrings.recognizers
  ]) with typings.reactHammerjs.AnonGesture
  type Omit[T, K] = typings.std.Pick[T, typings.std.Exclude[java.lang.String, K]]
}
