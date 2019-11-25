package typings.reactDashMovable

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: ReactNode
  var isDragged: Boolean
  var props: Anon_Ref
}

object Anon_Children {
  @scala.inline
  def apply(isDragged: Boolean, props: Anon_Ref, children: ReactNode = null): Anon_Children = {
    val __obj = js.Dynamic.literal(isDragged = isDragged.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Children]
  }
}

