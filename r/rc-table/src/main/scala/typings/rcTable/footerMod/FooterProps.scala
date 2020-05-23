package typings.rcTable.footerMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FooterProps[RecordType] extends js.Object {
  var children: ReactNode
}

object FooterProps {
  @scala.inline
  def apply[RecordType](children: ReactNode = null): FooterProps[RecordType] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[FooterProps[RecordType]]
  }
}

