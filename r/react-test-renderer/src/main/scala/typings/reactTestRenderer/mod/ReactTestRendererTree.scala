package typings.reactTestRenderer.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactTestRenderer.reactTestRendererStrings.component
import typings.reactTestRenderer.reactTestRendererStrings.host
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactTestRendererTree extends ReactTestRendererJSON {
  var instance: js.Any
  var nodeType: component | host
  var rendered: Null | ReactTestRendererTree
}

object ReactTestRendererTree {
  @scala.inline
  def apply(
    instance: js.Any,
    nodeType: component | host,
    props: StringDictionary[js.Any],
    `type`: String,
    children: js.Array[ReactTestRendererNode] = null,
    rendered: ReactTestRendererTree = null
  ): ReactTestRendererTree = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactTestRendererTree]
  }
}

