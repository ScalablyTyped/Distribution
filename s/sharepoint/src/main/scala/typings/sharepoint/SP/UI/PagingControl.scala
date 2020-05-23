package typings.sharepoint.SP.UI

import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagingControl extends js.Object {
  def getButtonState(buttonId: Double): Double
  def get_innerContent(): HTMLSpanElement
  def get_innerContentClass(): String
  def onNext(): Unit
  /**Should override*/
  def onPrev(): Unit
  def onWindowResized(): Unit
  def postRender(): Unit
  def render(innerContent: String): String
  def setButtonState(buttonId: Double, state: Double): Unit
}

object PagingControl {
  @scala.inline
  def apply(
    getButtonState: Double => Double,
    get_innerContent: () => HTMLSpanElement,
    get_innerContentClass: () => String,
    onNext: () => Unit,
    onPrev: () => Unit,
    onWindowResized: () => Unit,
    postRender: () => Unit,
    render: String => String,
    setButtonState: (Double, Double) => Unit
  ): PagingControl = {
    val __obj = js.Dynamic.literal(getButtonState = js.Any.fromFunction1(getButtonState), get_innerContent = js.Any.fromFunction0(get_innerContent), get_innerContentClass = js.Any.fromFunction0(get_innerContentClass), onNext = js.Any.fromFunction0(onNext), onPrev = js.Any.fromFunction0(onPrev), onWindowResized = js.Any.fromFunction0(onWindowResized), postRender = js.Any.fromFunction0(postRender), render = js.Any.fromFunction1(render), setButtonState = js.Any.fromFunction2(setButtonState))
    __obj.asInstanceOf[PagingControl]
  }
}

