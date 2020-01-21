package typings.reactMovable

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  var children: ReactNode
  var isDragged: Boolean
  var props: AnonRef
}

object AnonChildren {
  @scala.inline
  def apply(isDragged: Boolean, props: AnonRef, children: ReactNode = null): AnonChildren = {
    val __obj = js.Dynamic.literal(isDragged = isDragged.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildren]
  }
}

