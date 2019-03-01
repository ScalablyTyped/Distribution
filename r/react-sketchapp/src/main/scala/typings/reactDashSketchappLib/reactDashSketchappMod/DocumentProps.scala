package typings
package reactDashSketchappLib.reactDashSketchappMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentProps extends js.Object {
  var children: js.UndefOr[js.Any] = js.undefined
}

object DocumentProps {
  @scala.inline
  def apply(children: js.Any = null): DocumentProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    __obj.asInstanceOf[DocumentProps]
  }
}

