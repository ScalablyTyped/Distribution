package typings.sharepoint.global.SP.UI

import typings.sharepoint.anon.Disabled
import typings.sharepoint.anon.Next
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.UI.PagingControl")
@js.native
class PagingControl protected ()
  extends typings.sharepoint.SP.UI.PagingControl {
  def this(id: String) = this()
  /* CompleteClass */
  override def getButtonState(buttonId: Double): Double = js.native
  /* CompleteClass */
  override def get_innerContent(): HTMLSpanElement = js.native
  /* CompleteClass */
  override def get_innerContentClass(): String = js.native
  /* CompleteClass */
  override def onNext(): Unit = js.native
  /**Should override*/
  /* CompleteClass */
  override def onPrev(): Unit = js.native
  /* CompleteClass */
  override def onWindowResized(): Unit = js.native
  /* CompleteClass */
  override def postRender(): Unit = js.native
  /* CompleteClass */
  override def render(innerContent: String): String = js.native
  /* CompleteClass */
  override def setButtonState(buttonId: Double, state: Double): Unit = js.native
}

/* static members */
@JSGlobal("SP.UI.PagingControl")
@js.native
object PagingControl extends js.Object {
  var ButtonIDs: Next = js.native
  var ButtonState: Disabled = js.native
}

