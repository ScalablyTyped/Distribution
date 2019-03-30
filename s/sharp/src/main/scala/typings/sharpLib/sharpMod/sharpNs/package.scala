package typings
package sharpLib.sharpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sharpNs {
  type Color = java.lang.String | RGBA
  type Gravity = scala.Double | java.lang.String
  type Matrix3x3 = js.Tuple3[
    js.Tuple3[scala.Double, scala.Double, scala.Double], 
    js.Tuple3[scala.Double, scala.Double, scala.Double], 
    js.Tuple3[scala.Double, scala.Double, scala.Double]
  ]
}
