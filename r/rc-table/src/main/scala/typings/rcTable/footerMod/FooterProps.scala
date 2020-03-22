package typings.rcTable.footerMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FooterProps extends js.Object {
  var children: ReactNode
}

object FooterProps {
  @scala.inline
  def apply(children: ReactNode = null): FooterProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[FooterProps]
  }
}

