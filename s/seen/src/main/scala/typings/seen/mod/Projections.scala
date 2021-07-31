package typings.seen.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Projections {
  
  @JSImport("seen", "Projections")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def ortho(
    left: js.UndefOr[Double],
    right: js.UndefOr[Double],
    bottom: js.UndefOr[Double],
    top: js.UndefOr[Double],
    near: js.UndefOr[Double],
    far: js.UndefOr[Double]
  ): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("ortho")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any], top.asInstanceOf[js.Any], near.asInstanceOf[js.Any], far.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  
  @scala.inline
  def perspective(
    left: js.UndefOr[Double],
    right: js.UndefOr[Double],
    bottom: js.UndefOr[Double],
    top: js.UndefOr[Double],
    near: js.UndefOr[Double],
    far: js.UndefOr[Double]
  ): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("perspective")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any], top.asInstanceOf[js.Any], near.asInstanceOf[js.Any], far.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  
  @scala.inline
  def perspectiveFov(): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("perspectiveFov")().asInstanceOf[Matrix]
  @scala.inline
  def perspectiveFov(fovyInDegrees: Double): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("perspectiveFov")(fovyInDegrees.asInstanceOf[js.Any]).asInstanceOf[Matrix]
  @scala.inline
  def perspectiveFov(fovyInDegrees: Double, front: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("perspectiveFov")(fovyInDegrees.asInstanceOf[js.Any], front.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  @scala.inline
  def perspectiveFov(fovyInDegrees: Unit, front: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("perspectiveFov")(fovyInDegrees.asInstanceOf[js.Any], front.asInstanceOf[js.Any])).asInstanceOf[Matrix]
}
