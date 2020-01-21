package typings.reactRange

import typings.react.mod.ReactNode
import typings.reactRange.typesMod.ITrackProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  var children: ReactNode
  var disabled: Boolean
  var isDragged: Boolean
  var props: ITrackProps
}

object AnonChildren {
  @scala.inline
  def apply(disabled: Boolean, isDragged: Boolean, props: ITrackProps, children: ReactNode = null): AnonChildren = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], isDragged = isDragged.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildren]
  }
}

