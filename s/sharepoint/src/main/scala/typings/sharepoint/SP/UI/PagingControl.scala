package typings.sharepoint.SP.UI

import typings.sharepoint.Anon_Disabled
import typings.sharepoint.Anon_Next
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.UI.PagingControl")
@js.native
class PagingControl protected () extends js.Object {
  def this(id: String) = this()
  def getButtonState(buttonId: Double): Double = js.native
  def get_innerContent(): HTMLSpanElement = js.native
  def get_innerContentClass(): String = js.native
  def onNext(): Unit = js.native
  /**Should override*/
  def onPrev(): Unit = js.native
  def onWindowResized(): Unit = js.native
  def postRender(): Unit = js.native
  def render(innerContent: String): String = js.native
  def setButtonState(buttonId: Double, state: Double): Unit = js.native
}

/* static members */
@JSGlobal("SP.UI.PagingControl")
@js.native
object PagingControl extends js.Object {
  var ButtonIDs: Anon_Next = js.native
  var ButtonState: Anon_Disabled = js.native
}

