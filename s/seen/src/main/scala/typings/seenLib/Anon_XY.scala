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
    X: () => seenLib.seenMod.Point,
    Y: () => seenLib.seenMod.Point,
    Z: () => seenLib.seenMod.Point,
    ZERO: () => seenLib.seenMod.Point
  ): Anon_XY = {
    val __obj = js.Dynamic.literal(X = js.Any.fromFunction0(X), Y = js.Any.fromFunction0(Y), Z = js.Any.fromFunction0(Z), ZERO = js.Any.fromFunction0(ZERO))
  
    __obj.asInstanceOf[Anon_XY]
  }
}

