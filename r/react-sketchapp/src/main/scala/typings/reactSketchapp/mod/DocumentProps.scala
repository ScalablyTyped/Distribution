package typings.reactSketchapp.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentProps extends js.Object {
  var children: js.UndefOr[js.Array[ReactElement] | ReactElement] = js.undefined
}

object DocumentProps {
  @scala.inline
  def apply(children: js.Array[ReactElement] | ReactElement = null): DocumentProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentProps]
  }
}

