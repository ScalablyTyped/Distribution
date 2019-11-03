package typings.reactDashFloater.reactDashFloaterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderProps extends js.Object {
  def closeFn(): Unit
}

object RenderProps {
  @scala.inline
  def apply(closeFn: () => Unit): RenderProps = {
    val __obj = js.Dynamic.literal(closeFn = js.Any.fromFunction0(closeFn))
  
    __obj.asInstanceOf[RenderProps]
  }
}

