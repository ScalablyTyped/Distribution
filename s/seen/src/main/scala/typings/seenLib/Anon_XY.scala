package typings
package seenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_XY extends js.Object {
  def X(): seenLib.seenMod.Point
  def Y(): seenLib.seenMod.Point
  def Z(): seenLib.seenMod.Point
  def ZERO(): seenLib.seenMod.Point
}

object Anon_XY {
  @scala.inline
  def apply(
    X: js.Function0[seenLib.seenMod.Point],
    Y: js.Function0[seenLib.seenMod.Point],
    Z: js.Function0[seenLib.seenMod.Point],
    ZERO: js.Function0[seenLib.seenMod.Point]
  ): Anon_XY = {
    val __obj = js.Dynamic.literal(X = X, Y = Y, Z = Z, ZERO = ZERO)
  
    __obj.asInstanceOf[Anon_XY]
  }
}

