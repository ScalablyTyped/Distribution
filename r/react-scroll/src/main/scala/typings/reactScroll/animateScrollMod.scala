package typings.reactScroll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-scroll/modules/mixins/animate-scroll", JSImport.Namespace)
@js.native
object animateScrollMod extends js.Object {
  def animateTopScroll(y: Double, options: js.Any, to: String, target: js.Any): Unit = js.native
  def getAnimationType(options: AnonSmooth): js.Function1[/* x */ Double, Double] = js.native
  def scrollMore(toY: Double): Unit = js.native
  def scrollMore(toY: Double, options: js.Any): Unit = js.native
  def scrollTo(toY: Double): Unit = js.native
  def scrollTo(toY: Double, options: js.Any): Unit = js.native
  def scrollToBottom(): Unit = js.native
  def scrollToBottom(options: js.Any): Unit = js.native
  def scrollToTop(): Unit = js.native
  def scrollToTop(options: js.Any): Unit = js.native
}

