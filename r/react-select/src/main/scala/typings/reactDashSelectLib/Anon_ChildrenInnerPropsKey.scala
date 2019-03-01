package typings
package reactDashSelectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenInnerPropsKey extends js.Object {
  /** The children to be rendered. */
  var children: reactLib.reactMod.ReactNs.ReactNode
  /** props passed to the wrapping element for the group. */
  var innerProps: org.scalablytyped.runtime.StringDictionary[js.Any]
}

object Anon_ChildrenInnerPropsKey {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactNode,
    innerProps: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): Anon_ChildrenInnerPropsKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.updateDynamic("innerProps")(innerProps)
    __obj.asInstanceOf[Anon_ChildrenInnerPropsKey]
  }
}

