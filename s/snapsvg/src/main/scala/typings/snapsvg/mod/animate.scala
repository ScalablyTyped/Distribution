package typings.snapsvg.mod

import typings.mina.mina.MinaAnimation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snapsvg", "animate")
@js.native
object animate extends js.Object {
  def apply(
    from: js.Array[Double],
    to: js.Array[Double],
    updater: js.Function1[/* n */ Double, Unit],
    duration: Double
  ): MinaAnimation = js.native
  def apply(
    from: js.Array[Double],
    to: js.Array[Double],
    updater: js.Function1[/* n */ Double, Unit],
    duration: Double,
    easing: js.Function1[/* num */ Double, Double]
  ): MinaAnimation = js.native
  def apply(
    from: js.Array[Double],
    to: js.Array[Double],
    updater: js.Function1[/* n */ Double, Unit],
    duration: Double,
    easing: js.Function1[/* num */ Double, Double],
    callback: js.Function0[Unit]
  ): MinaAnimation = js.native
  def apply(from: js.Array[Double], to: Double, updater: js.Function1[/* n */ Double, Unit], duration: Double): MinaAnimation = js.native
  def apply(
    from: js.Array[Double],
    to: Double,
    updater: js.Function1[/* n */ Double, Unit],
    duration: Double,
    easing: js.Function1[/* num */ Double, Double]
  ): MinaAnimation = js.native
  def apply(
    from: js.Array[Double],
    to: Double,
    updater: js.Function1[/* n */ Double, Unit],
    duration: Double,
    easing: js.Function1[/* num */ Double, Double],
    callback: js.Function0[Unit]
  ): MinaAnimation = js.native
  def apply(from: Double, to: js.Array[Double], updater: js.Function1[/* n */ Double, Unit], duration: Double): MinaAnimation = js.native
  def apply(
    from: Double,
    to: js.Array[Double],
    updater: js.Function1[/* n */ Double, Unit],
    duration: Double,
    easing: js.Function1[/* num */ Double, Double]
  ): MinaAnimation = js.native
  def apply(
    from: Double,
    to: js.Array[Double],
    updater: js.Function1[/* n */ Double, Unit],
    duration: Double,
    easing: js.Function1[/* num */ Double, Double],
    callback: js.Function0[Unit]
  ): MinaAnimation = js.native
  def apply(from: Double, to: Double, updater: js.Function1[/* n */ Double, Unit], duration: Double): MinaAnimation = js.native
  def apply(
    from: Double,
    to: Double,
    updater: js.Function1[/* n */ Double, Unit],
    duration: Double,
    easing: js.Function1[/* num */ Double, Double]
  ): MinaAnimation = js.native
  def apply(
    from: Double,
    to: Double,
    updater: js.Function1[/* n */ Double, Unit],
    duration: Double,
    easing: js.Function1[/* num */ Double, Double],
    callback: js.Function0[Unit]
  ): MinaAnimation = js.native
}

