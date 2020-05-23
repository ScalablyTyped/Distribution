package typings.reactPopper.mod

import typings.react.mod.CSSProperties
import typings.react.mod.Ref
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
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopperArrowProps]
  }
}

