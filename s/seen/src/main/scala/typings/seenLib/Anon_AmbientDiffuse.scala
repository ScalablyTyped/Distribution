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
    ambient: () => seenLib.seenMod.Ambient,
    diffuse: () => seenLib.seenMod.DiffusePhong,
    flat: () => seenLib.seenMod.Flat,
    phong: () => seenLib.seenMod.Phong
  ): Anon_AmbientDiffuse = {
    val __obj = js.Dynamic.literal(ambient = js.Any.fromFunction0(ambient), diffuse = js.Any.fromFunction0(diffuse), flat = js.Any.fromFunction0(flat), phong = js.Any.fromFunction0(phong))
  
    __obj.asInstanceOf[Anon_AmbientDiffuse]
  }
}

