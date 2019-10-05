package typings.reactDashPopper.reactDashPopperMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceChildrenProps extends js.Object {
  var ref: RefHandler
}

object ReferenceChildrenProps {
  @scala.inline
  def apply(ref: /* ref */ HTMLElement | Null => Unit): ReferenceChildrenProps = {
    val __obj = js.Dynamic.literal(ref = js.Any.fromFunction1(ref))
  
    __obj.asInstanceOf[ReferenceChildrenProps]
  }
}

