package typings
package reactourLib.reactourMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var onClick: reactLib.reactMod.MouseEventHandler[stdLib.HTMLButtonElement]
}

object CloseProps {
  @scala.inline
  def apply(
    onClick: reactLib.reactMod.MouseEventHandler[stdLib.HTMLButtonElement],
    className: java.lang.String = null
  ): CloseProps = {
    val __obj = js.Dynamic.literal(onClick = onClick)
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[CloseProps]
  }
}

