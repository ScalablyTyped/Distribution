package typings.rmcTabs.anon

import typings.rcGesture.mod.IGestureStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnPanMove extends js.Object {
  
  def onPanEnd(): Unit = js.native
  
  def onPanMove(status: IGestureStatus): Unit = js.native
  
  def onPanStart(status: IGestureStatus): Unit = js.native
  
  def setCurrentOffset(offset: String): String | Double = js.native
  def setCurrentOffset(offset: Double): String | Double = js.native
}
