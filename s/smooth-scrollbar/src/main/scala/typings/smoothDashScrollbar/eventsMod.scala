package typings.smoothDashScrollbar

import typings.smoothDashScrollbar.interfacesScrollbarMod.Scrollbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smooth-scrollbar/events", JSImport.Namespace)
@js.native
object eventsMod extends js.Object {
  def keyboardHandler(scrollbar: Scrollbar): Unit = js.native
  def mouseHandler(scrollbar: Scrollbar): Unit = js.native
  def resizeHandler(scrollbar: Scrollbar): Unit = js.native
  def selectHandler(scrollbar: Scrollbar): Unit = js.native
  def touchHandler(scrollbar: Scrollbar): Unit = js.native
  def wheelHandler(scrollbar: Scrollbar): Unit = js.native
}

