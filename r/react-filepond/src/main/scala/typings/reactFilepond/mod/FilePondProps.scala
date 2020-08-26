package typings.reactFilepond.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilePondProps
  extends FilePondDragDropProps
     with FilePondServerConfigProps
     with FilePondLabelProps
     with FilePondSvgIconProps
     with FilePondCallbackProps
     with FilePondHookProps
     with FilePondBaseProps

object FilePondProps {
  @scala.inline
  def apply(): FilePondProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilePondProps]
  }
}

