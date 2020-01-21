package typings.reactAliceCarousel.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactAliceCarousel
  extends Component[Props, js.Object, js.Any] {
  def slideNext(): Unit = js.native
  def slidePrev(): Unit = js.native
  def slideTo(index: Double): Unit = js.native
}

