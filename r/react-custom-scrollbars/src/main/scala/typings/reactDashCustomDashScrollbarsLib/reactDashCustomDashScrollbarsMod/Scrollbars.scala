package typings
package reactDashCustomDashScrollbarsLib.reactDashCustomDashScrollbarsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scrollbars
  extends reactLib.reactMod.Component[ScrollbarProps, js.Object, js.Any] {
  def getClientHeight(): scala.Double = js.native
  def getClientWidth(): scala.Double = js.native
  def getScrollHeight(): scala.Double = js.native
  def getScrollLeft(): scala.Double = js.native
  def getScrollTop(): scala.Double = js.native
  def getScrollWidth(): scala.Double = js.native
  def getValues(): positionValues = js.native
  def scrollLeft(left: scala.Double): scala.Unit = js.native
  def scrollToBottom(): scala.Unit = js.native
  def scrollToLeft(): scala.Unit = js.native
  def scrollToRight(): scala.Unit = js.native
  def scrollToTop(): scala.Unit = js.native
  def scrollTop(top: scala.Double): scala.Unit = js.native
}

