package typings.reactDashPopper.reactDashPopperMod

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopperArrowProps extends js.Object {
  var ref: RefHandler
  var style: CSSProperties
}

object PopperArrowProps {
  @scala.inline
  def apply(ref: RefHandler, style: CSSProperties): PopperArrowProps = {
    val __obj = js.Dynamic.literal(ref = ref, style = style)
  
    __obj.asInstanceOf[PopperArrowProps]
  }
}

