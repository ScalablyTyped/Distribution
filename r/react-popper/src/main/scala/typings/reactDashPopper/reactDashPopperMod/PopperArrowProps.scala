package typings.reactDashPopper.reactDashPopperMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopperArrowProps extends js.Object {
  var ref: Ref[_]
  var style: CSSProperties
}

object PopperArrowProps {
  @scala.inline
  def apply(style: CSSProperties, ref: Ref[_] = null): PopperArrowProps = {
    val __obj = js.Dynamic.literal(style = style)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopperArrowProps]
  }
}

