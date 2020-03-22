package typings.rmcTabs

import typings.rcGesture.mod.IGestureStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOnPanEnd extends js.Object {
  def onPanEnd(): Unit = js.native
  def onPanMove(status: IGestureStatus): Unit = js.native
  def onPanStart(): Unit = js.native
  def setCurrentOffset(offset: String): String | Double = js.native
  def setCurrentOffset(offset: Double): String | Double = js.native
}

