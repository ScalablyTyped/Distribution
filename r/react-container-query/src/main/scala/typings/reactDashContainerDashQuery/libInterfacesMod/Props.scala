package typings.reactDashContainerDashQuery.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: ChildFunction
  var initialSize: js.UndefOr[Size] = js.undefined
  var query: Query
}

object Props {
  @scala.inline
  def apply(children: ChildFunction, query: Query, initialSize: Size = null): Props = {
    val __obj = js.Dynamic.literal(children = children, query = query)
    if (initialSize != null) __obj.updateDynamic("initialSize")(initialSize)
    __obj.asInstanceOf[Props]
  }
}

