package typings.reactAlert.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
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
    options: AlertCustomOptionsWithType,
    style: CSSProperties,
    message: ReactNode = null
  ): AlertComponentPropsWithStyle = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertComponentPropsWithStyle]
  }
}

