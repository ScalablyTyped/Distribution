package typings.reactNavigationStack.anon

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildrenReactElement extends js.Object {
  var children: ReactElement
}

object ChildrenReactElement {
  @scala.inline
  def apply(children: ReactElement): ChildrenReactElement = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenReactElement]
  }
}

