package typings.reactour.reactourMod

import typings.react.reactMod.MouseEventHandler
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var onClick: MouseEventHandler[HTMLButtonElement]
}

object CloseProps {
  @scala.inline
  def apply(onClick: MouseEventHandler[HTMLButtonElement], className: String = null): CloseProps = {
    val __obj = js.Dynamic.literal(onClick = onClick)
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[CloseProps]
  }
}

