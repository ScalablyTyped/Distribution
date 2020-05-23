package typings.prettyFormat.reactTestComponentMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactTestObject extends js.Object {
  @JSName("$$typeof")
  var DollarDollartypeof: js.Symbol
  var children: js.UndefOr[Null | js.Array[ReactTestChild]] = js.undefined
  var props: js.UndefOr[Record[String, _]] = js.undefined
  var `type`: String
}

object ReactTestObject {
  @scala.inline
  def apply(
    DollarDollartypeof: js.Symbol,
    `type`: String,
    children: js.UndefOr[Null | js.Array[ReactTestChild]] = js.undefined,
    props: Record[String, _] = null
  ): ReactTestObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactTestObject]
  }
}

