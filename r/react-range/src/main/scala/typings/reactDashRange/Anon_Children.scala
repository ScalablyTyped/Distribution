package typings.reactDashRange

import typings.react.reactMod.ReactNode
import typings.reactDashRange.libTypesMod.ITrackProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: ReactNode
  var disabled: Boolean
  var isDragged: Boolean
  var props: ITrackProps
}

object Anon_Children {
  @scala.inline
  def apply(disabled: Boolean, isDragged: Boolean, props: ITrackProps, children: ReactNode = null): Anon_Children = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], isDragged = isDragged.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Children]
  }
}

