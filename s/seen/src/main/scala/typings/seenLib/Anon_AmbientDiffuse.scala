package typings
package seenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AmbientDiffuse extends js.Object {
  def ambient(): seenLib.seenMod.Ambient
  def diffuse(): seenLib.seenMod.DiffusePhong
  def flat(): seenLib.seenMod.Flat
  def phong(): seenLib.seenMod.Phong
}

object Anon_AmbientDiffuse {
  @scala.inline
  def apply(
    ambient: js.Function0[seenLib.seenMod.Ambient],
    diffuse: js.Function0[seenLib.seenMod.DiffusePhong],
    flat: js.Function0[seenLib.seenMod.Flat],
    phong: js.Function0[seenLib.seenMod.Phong]
  ): Anon_AmbientDiffuse = {
    val __obj = js.Dynamic.literal(ambient = ambient, diffuse = diffuse, flat = flat, phong = phong)
  
    __obj.asInstanceOf[Anon_AmbientDiffuse]
  }
}

