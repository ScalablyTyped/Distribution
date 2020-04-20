package typings.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildContextProvider[CC] extends js.Object {
  def getChildContext(): CC
}

object ChildContextProvider {
  @scala.inline
  def apply[CC](getChildContext: () => CC): ChildContextProvider[CC] = {
    val __obj = js.Dynamic.literal(getChildContext = js.Any.fromFunction0(getChildContext))
    __obj.asInstanceOf[ChildContextProvider[CC]]
  }
}

