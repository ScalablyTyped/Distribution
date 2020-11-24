package typings.snapsvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("snapsvg", "animation")
@js.native
object animation extends js.Object {
  
  def apply(attr: js.Object, duration: Double): Animation_ = js.native
  def apply(attr: js.Object, duration: Double, easing: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Animation_ = js.native
  def apply(attr: js.Object, duration: Double, easing: js.Function1[/* num */ Double, Double]): Animation_ = js.native
  def apply(
    attr: js.Object,
    duration: Double,
    easing: js.Function1[/* num */ Double, Double],
    callback: js.Function0[Unit]
  ): Animation_ = js.native
}
