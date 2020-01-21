package typings.seen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "Shaders")
@js.native
object Shaders extends js.Object {
  def ambient(): Ambient = js.native
  def diffuse(): DiffusePhong = js.native
  def flat(): Flat = js.native
  def phong(): Phong = js.native
}

