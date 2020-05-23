package typings.reactMovable.anon

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Children extends js.Object {
  var children: ReactNode
  var isDragged: Boolean
  var props: Ref
}

object Children {
  @scala.inline
  def apply(isDragged: Boolean, props: Ref, children: ReactNode = null): Children = {
    val __obj = js.Dynamic.literal(isDragged = isDragged.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
}

