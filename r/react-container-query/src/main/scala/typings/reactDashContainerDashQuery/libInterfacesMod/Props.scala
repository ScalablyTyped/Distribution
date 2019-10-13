package typings.reactDashContainerDashQuery.libInterfacesMod

import typings.react.reactMod._Global_.JSX.Element
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
  def apply(children: /* params */ Params => Element | Null, query: Query, initialSize: Size = null): Props = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), query = query)
    if (initialSize != null) __obj.updateDynamic("initialSize")(initialSize)
    __obj.asInstanceOf[Props]
  }
}

