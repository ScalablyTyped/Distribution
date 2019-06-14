package typings
package reactDashTestDashRendererLib.reactDashTestDashRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactTestRendererTree extends ReactTestRendererJSON {
  var instance: js.Any
  var nodeType: reactDashTestDashRendererLib.reactDashTestDashRendererLibStrings.component | reactDashTestDashRendererLib.reactDashTestDashRendererLibStrings.host
  var rendered: scala.Null | ReactTestRendererTree
}

object ReactTestRendererTree {
  @scala.inline
  def apply(
    instance: js.Any,
    nodeType: reactDashTestDashRendererLib.reactDashTestDashRendererLibStrings.component | reactDashTestDashRendererLib.reactDashTestDashRendererLibStrings.host,
    props: org.scalablytyped.runtime.StringDictionary[js.Any],
    `type`: java.lang.String,
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

