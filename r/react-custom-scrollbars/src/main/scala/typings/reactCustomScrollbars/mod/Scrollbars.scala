package typings.reactCustomScrollbars.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-custom-scrollbars", "Scrollbars")
@js.native
class Scrollbars ()
  extends Component[ScrollbarProps, js.Object, js.Any] {
  def getClientHeight(): Double = js.native
  def getClientWidth(): Double = js.native
  def getScrollHeight(): Double = js.native
  def getScrollLeft(): Double = js.native
  def getScrollTop(): Double = js.native
  def getScrollWidth(): Double = js.native
  def getValues(): positionValues = js.native
  def scrollLeft(left: Double): Unit = js.native
  def scrollToBottom(): Unit = js.native
  def scrollToLeft(): Unit = js.native
  def scrollToRight(): Unit = js.native
  def scrollToTop(): Unit = js.native
  def scrollTop(top: Double): Unit = js.native
}

