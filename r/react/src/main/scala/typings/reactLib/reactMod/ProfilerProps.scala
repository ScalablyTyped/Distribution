package typings
package reactLib.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfilerProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var id: java.lang.String
  var onRender: ProfilerOnRenderCallback
}

object ProfilerProps {
  @scala.inline
  def apply(id: java.lang.String, onRender: ProfilerOnRenderCallback, children: ReactNode = null): ProfilerProps = {
    val __obj = js.Dynamic.literal(id = id, onRender = onRender)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfilerProps]
  }
}

