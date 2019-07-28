package typings.reactDashAlert.reactDashAlertMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertComponentPropsWithStyle extends AlertComponentProps {
  var style: CSSProperties
}

object AlertComponentPropsWithStyle {
  @scala.inline
  def apply(
    close: () => Unit,
    id: String,
    message: ReactNode,
    options: AlertCustomOptionsWithType,
    style: CSSProperties
  ): AlertComponentPropsWithStyle = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), id = id, message = message.asInstanceOf[js.Any], options = options, style = style)
  
    __obj.asInstanceOf[AlertComponentPropsWithStyle]
  }
}

