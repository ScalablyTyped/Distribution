package typings
package reactDashAlertLib.reactDashAlertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertComponentPropsWithStyle extends AlertComponentProps {
  var style: reactLib.reactMod.CSSProperties
}

object AlertComponentPropsWithStyle {
  @scala.inline
  def apply(
    close: () => scala.Unit,
    id: java.lang.String,
    message: reactLib.reactMod.ReactNode,
    options: AlertCustomOptionsWithType,
    style: reactLib.reactMod.CSSProperties
  ): AlertComponentPropsWithStyle = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), id = id, message = message.asInstanceOf[js.Any], options = options, style = style)
  
    __obj.asInstanceOf[AlertComponentPropsWithStyle]
  }
}

