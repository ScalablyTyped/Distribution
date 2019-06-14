package typings
package reactDashTestDashRendererLib.reactDashTestDashRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactTestRendererJSON extends js.Object {
  var children: scala.Null | js.Array[ReactTestRendererNode]
  var props: org.scalablytyped.runtime.StringDictionary[js.Any]
  var `type`: java.lang.String
}

object ReactTestRendererJSON {
  @scala.inline
  def apply(
    props: org.scalablytyped.runtime.StringDictionary[js.Any],
    `type`: java.lang.String,
    children: js.Array[ReactTestRendererNode] = null
  ): ReactTestRendererJSON = {
    val __obj = js.Dynamic.literal(props = props)
    __obj.updateDynamic("type")(`type`)
    if (children != null) __obj.updateDynamic("children")(children)
    __obj.asInstanceOf[ReactTestRendererJSON]
  }
}

