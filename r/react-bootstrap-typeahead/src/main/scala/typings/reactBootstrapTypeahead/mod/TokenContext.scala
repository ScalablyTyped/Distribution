package typings.reactBootstrapTypeahead.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenContext extends js.Object {
  var active: Boolean
  def onBlur(e: js.Any): Unit
  def onClick(e: js.Any): Unit
  def onFocus(e: js.Any): Unit
  def onKeyDown(e: js.Any): Unit
}

object TokenContext {
  @scala.inline
  def apply(
    active: Boolean,
    onBlur: js.Any => Unit,
    onClick: js.Any => Unit,
    onFocus: js.Any => Unit,
    onKeyDown: js.Any => Unit
  ): TokenContext = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onClick = js.Any.fromFunction1(onClick), onFocus = js.Any.fromFunction1(onFocus), onKeyDown = js.Any.fromFunction1(onKeyDown))
    __obj.asInstanceOf[TokenContext]
  }
}

