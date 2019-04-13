package typings
package reactDashSketchappLib.libComponentsSvgClipPathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClipPathProps extends js.Object {
  var children: js.UndefOr[js.Array[reactLib.reactMod.ReactNode] | reactLib.reactMod.ReactNode] = js.undefined
  var id: java.lang.String
}

object ClipPathProps {
  @scala.inline
  def apply(
    id: java.lang.String,
    children: js.Array[reactLib.reactMod.ReactNode] | reactLib.reactMod.ReactNode = null
  ): ClipPathProps = {
    val __obj = js.Dynamic.literal(id = id)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipPathProps]
  }
}

