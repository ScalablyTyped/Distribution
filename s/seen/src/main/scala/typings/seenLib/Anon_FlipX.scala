package typings
package seenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FlipX extends js.Object {
  def flipX(): seenLib.seenMod.Matrix
  def flipY(): seenLib.seenMod.Matrix
  def flipZ(): seenLib.seenMod.Matrix
  def identity(): seenLib.seenMod.Matrix
}

object Anon_FlipX {
  @scala.inline
  def apply(
    flipX: () => seenLib.seenMod.Matrix,
    flipY: () => seenLib.seenMod.Matrix,
    flipZ: () => seenLib.seenMod.Matrix,
    identity: () => seenLib.seenMod.Matrix
  ): Anon_FlipX = {
    val __obj = js.Dynamic.literal(flipX = js.Any.fromFunction0(flipX), flipY = js.Any.fromFunction0(flipY), flipZ = js.Any.fromFunction0(flipZ), identity = js.Any.fromFunction0(identity))
  
    __obj.asInstanceOf[Anon_FlipX]
  }
}

