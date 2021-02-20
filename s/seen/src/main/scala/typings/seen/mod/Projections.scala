package typings.seen.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Projections {
  
  @JSImport("seen", "Projections.ortho")
  @js.native
  def ortho(
    left: js.UndefOr[Double],
    right: js.UndefOr[Double],
    bottom: js.UndefOr[Double],
    top: js.UndefOr[Double],
    near: js.UndefOr[Double],
    far: js.UndefOr[Double]
  ): Matrix = js.native
  
  @JSImport("seen", "Projections.perspective")
  @js.native
  def perspective(
    left: js.UndefOr[Double],
    right: js.UndefOr[Double],
    bottom: js.UndefOr[Double],
    top: js.UndefOr[Double],
    near: js.UndefOr[Double],
    far: js.UndefOr[Double]
  ): Matrix = js.native
  
  @JSImport("seen", "Projections.perspectiveFov")
  @js.native
  def perspectiveFov(): Matrix = js.native
  @JSImport("seen", "Projections.perspectiveFov")
  @js.native
  def perspectiveFov(fovyInDegrees: js.UndefOr[scala.Nothing], front: Double): Matrix = js.native
  @JSImport("seen", "Projections.perspectiveFov")
  @js.native
  def perspectiveFov(fovyInDegrees: Double): Matrix = js.native
  @JSImport("seen", "Projections.perspectiveFov")
  @js.native
  def perspectiveFov(fovyInDegrees: Double, front: Double): Matrix = js.native
}
