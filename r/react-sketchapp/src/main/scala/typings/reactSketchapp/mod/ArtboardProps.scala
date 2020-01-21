package typings.reactSketchapp.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtboardProps extends js.Object {
  var children: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.undefined
  /**
    * The name to be displayed in the Sketch Layer List
    */
  var name: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[Style | StyleReference] = js.undefined
}

object ArtboardProps {
  @scala.inline
  def apply(
    children: js.Array[ReactNode] | ReactNode = null,
    name: String = null,
    style: Style | StyleReference = null
  ): ArtboardProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtboardProps]
  }
}

