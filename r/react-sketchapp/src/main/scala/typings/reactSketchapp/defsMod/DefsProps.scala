package typings.reactSketchapp.defsMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefsProps extends js.Object {
  var children: js.Array[ReactNode] | ReactNode
}

object DefsProps {
  @scala.inline
  def apply(children: js.Array[ReactNode] | ReactNode = null): DefsProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefsProps]
  }
}

