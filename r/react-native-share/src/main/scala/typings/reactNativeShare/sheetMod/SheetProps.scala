package typings.reactNativeShare.sheetMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetProps extends js.Object {
  var children: ReactNode
  var visible: Boolean
}

object SheetProps {
  @scala.inline
  def apply(visible: Boolean, children: ReactNode = null): SheetProps = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetProps]
  }
}

