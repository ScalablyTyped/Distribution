package typings.ranjs.mod.dist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ranjs", "dist.NoncentralT")
@js.native
class NoncentralT ()
  extends typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.NoncentralT] {
  def this(nu: Double) = this()
  def this(nu: js.UndefOr[scala.Nothing], mu: Double) = this()
  def this(nu: Double, mu: Double) = this()
}

/* static members */
@JSImport("ranjs", "dist.NoncentralT")
@js.native
object NoncentralT extends js.Object {
  def fnm(nu: Double, mu: Double, x: Double): Double = js.native
}

