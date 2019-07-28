package typings.reactDashSelect

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenInnerPropsKey extends js.Object {
  /** The children to be rendered. */
  var children: ReactNode
  /** props passed to the wrapping element for the group. */
  var innerProps: StringDictionary[js.Any]
}

object Anon_ChildrenInnerPropsKey {
  @scala.inline
  def apply(children: ReactNode, innerProps: StringDictionary[js.Any]): Anon_ChildrenInnerPropsKey = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], innerProps = innerProps)
  
    __obj.asInstanceOf[Anon_ChildrenInnerPropsKey]
  }
}

