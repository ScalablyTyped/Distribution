package typings
package seenLib.seenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "Projections")
@js.native
object Projections extends js.Object {
  def ortho(
    left: js.UndefOr[scala.Double],
    right: js.UndefOr[scala.Double],
    bottom: js.UndefOr[scala.Double],
    top: js.UndefOr[scala.Double],
    near: js.UndefOr[scala.Double],
    far: js.UndefOr[scala.Double]
  ): seenLib.seenMod.Matrix = js.native
  def perspective(
    left: js.UndefOr[scala.Double],
    right: js.UndefOr[scala.Double],
    bottom: js.UndefOr[scala.Double],
    top: js.UndefOr[scala.Double],
    near: js.UndefOr[scala.Double],
    far: js.UndefOr[scala.Double]
  ): seenLib.seenMod.Matrix = js.native
  def perspectiveFov(): seenLib.seenMod.Matrix = js.native
  def perspectiveFov(fovyInDegrees: scala.Double): seenLib.seenMod.Matrix = js.native
  def perspectiveFov(fovyInDegrees: scala.Double, front: scala.Double): seenLib.seenMod.Matrix = js.native
}

