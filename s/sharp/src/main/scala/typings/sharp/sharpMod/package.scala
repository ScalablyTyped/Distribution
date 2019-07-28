package typings.sharp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sharpMod {
  type Color = String | RGBA
  type Gravity = Double | String
  type Matrix3x3 = js.Tuple3[
    js.Tuple3[Double, Double, Double], 
    js.Tuple3[Double, Double, Double], 
    js.Tuple3[Double, Double, Double]
  ]
}
