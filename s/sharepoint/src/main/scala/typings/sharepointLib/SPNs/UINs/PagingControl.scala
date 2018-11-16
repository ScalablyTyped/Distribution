package typings
package sharepointLib.SPNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.UI.PagingControl")
@js.native
class PagingControl protected () extends js.Object {
  def this(id: java.lang.String) = this()
  def getButtonState(buttonId: scala.Double): scala.Double = js.native
  def get_innerContent(): stdLib.HTMLSpanElement = js.native
  def get_innerContentClass(): java.lang.String = js.native
  def onNext(): scala.Unit = js.native
  /**Should override*/
  def onPrev(): scala.Unit = js.native
  def onWindowResized(): scala.Unit = js.native
  def postRender(): scala.Unit = js.native
  def render(innerContent: java.lang.String): java.lang.String = js.native
  def setButtonState(buttonId: scala.Double, state: scala.Double): scala.Unit = js.native
}

@JSGlobal("SP.UI.PagingControl")
@js.native
object PagingControl extends js.Object {
  var ButtonIDs: sharepointLib.Anon_Prev = js.native
  var ButtonState: sharepointLib.Anon_Hidden = js.native
}

