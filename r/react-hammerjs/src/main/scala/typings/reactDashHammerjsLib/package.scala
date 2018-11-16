package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashHammerjsLib {
  type HammerOptionsWithRecognizers = (Omit[
    hammerjsLib.HammerOptions, 
    reactDashHammerjsLib.reactDashHammerjsLibStrings.recognizers
  ]) with Anon_Recognizers
  type Omit[T, K] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
}
