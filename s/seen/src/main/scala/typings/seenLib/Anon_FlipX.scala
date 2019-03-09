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
    flipX: js.Function0[seenLib.seenMod.Matrix],
    flipY: js.Function0[seenLib.seenMod.Matrix],
    flipZ: js.Function0[seenLib.seenMod.Matrix],
    identity: js.Function0[seenLib.seenMod.Matrix]
  ): Anon_FlipX = {
    val __obj = js.Dynamic.literal(flipX = flipX, flipY = flipY, flipZ = flipZ, identity = identity)
  
    __obj.asInstanceOf[Anon_FlipX]
  }
}

