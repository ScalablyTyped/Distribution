package typings.rmcDashTabs

import typings.rcDashGesture.rcDashGestureMod.IGestureStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_OffsetOnPanEnd extends js.Object {
  def onPanEnd(): Unit = js.native
  def onPanMove(status: IGestureStatus): Unit = js.native
  def onPanStart(status: IGestureStatus): Unit = js.native
  def setCurrentOffset(offset: String): String | Double = js.native
  def setCurrentOffset(offset: Double): String | Double = js.native
}

