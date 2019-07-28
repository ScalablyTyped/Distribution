package typings.reactDashSketchapp.libComponentsSvgClipPathMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClipPathProps extends js.Object {
  var children: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.undefined
  var id: String
}

object ClipPathProps {
  @scala.inline
  def apply(id: String, children: js.Array[ReactNode] | ReactNode = null): ClipPathProps = {
    val __obj = js.Dynamic.literal(id = id)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipPathProps]
  }
}

