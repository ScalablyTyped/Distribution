package typings
package reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenContext extends js.Object {
  var active: scala.Boolean
  def onBlur(e: js.Any): scala.Unit
  def onClick(e: js.Any): scala.Unit
  def onFocus(e: js.Any): scala.Unit
  def onKeyDown(e: js.Any): scala.Unit
}

object TokenContext {
  @scala.inline
  def apply(
    active: scala.Boolean,
    onBlur: js.Function1[js.Any, scala.Unit],
    onClick: js.Function1[js.Any, scala.Unit],
    onFocus: js.Function1[js.Any, scala.Unit],
    onKeyDown: js.Function1[js.Any, scala.Unit]
  ): TokenContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("active")(active)
    __obj.updateDynamic("onBlur")(onBlur)
    __obj.updateDynamic("onClick")(onClick)
    __obj.updateDynamic("onFocus")(onFocus)
    __obj.updateDynamic("onKeyDown")(onKeyDown)
    __obj.asInstanceOf[TokenContext]
  }
}

