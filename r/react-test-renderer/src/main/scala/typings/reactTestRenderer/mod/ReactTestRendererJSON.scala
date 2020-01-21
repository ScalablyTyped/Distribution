package typings.reactTestRenderer.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactTestRendererJSON extends js.Object {
  var children: Null | js.Array[ReactTestRendererNode]
  var props: StringDictionary[js.Any]
  var `type`: String
}

object ReactTestRendererJSON {
  @scala.inline
  def apply(props: StringDictionary[js.Any], `type`: String, children: js.Array[ReactTestRendererNode] = null): ReactTestRendererJSON = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactTestRendererJSON]
  }
}

