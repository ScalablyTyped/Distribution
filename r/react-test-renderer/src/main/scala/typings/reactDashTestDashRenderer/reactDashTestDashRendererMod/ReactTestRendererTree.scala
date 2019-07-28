package typings.reactDashTestDashRenderer.reactDashTestDashRendererMod

import org.scalablytyped.runtime.StringDictionary
import typings.reactDashTestDashRenderer.reactDashTestDashRendererStrings.component
import typings.reactDashTestDashRenderer.reactDashTestDashRendererStrings.host
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
    val __obj = js.Dynamic.literal(instance = instance, nodeType = nodeType.asInstanceOf[js.Any], props = props)
    __obj.updateDynamic("type")(`type`)
    if (children != null) __obj.updateDynamic("children")(children)
    if (rendered != null) __obj.updateDynamic("rendered")(rendered)
    __obj.asInstanceOf[ReactTestRendererTree]
  }
}

