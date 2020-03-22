package typings.rcTable.panelMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TitleProps extends js.Object {
  var children: ReactNode
  var className: String
}

object TitleProps {
  @scala.inline
  def apply(className: String, children: ReactNode = null): TitleProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[TitleProps]
  }
}

