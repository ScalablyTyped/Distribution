package typings
package seenLib.seenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "Shaders")
@js.native
object Shaders extends js.Object {
  def ambient(): seenLib.seenMod.Ambient = js.native
  def diffuse(): seenLib.seenMod.DiffusePhong = js.native
  def flat(): seenLib.seenMod.Flat = js.native
  def phong(): seenLib.seenMod.Phong = js.native
}

