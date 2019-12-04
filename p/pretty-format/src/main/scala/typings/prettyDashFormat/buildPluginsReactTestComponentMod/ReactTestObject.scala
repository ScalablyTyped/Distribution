package typings.prettyDashFormat.buildPluginsReactTestComponentMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactTestObject extends js.Object {
  @JSName("$$typeof")
  var $$typeof: js.Symbol
  var children: js.UndefOr[Null | js.Array[ReactTestChild]] = js.undefined
  var props: js.UndefOr[Record[String, _]] = js.undefined
  var `type`: String
}

object ReactTestObject {
  @scala.inline
  def apply(
    $$typeof: js.Symbol,
    `type`: String,
    children: js.Array[ReactTestChild] = null,
    props: Record[String, _] = null
  ): ReactTestObject = {
    val __obj = js.Dynamic.literal($$typeof = $$typeof.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactTestObject]
  }
}

