package typings
package reactDashSketchappLib.reactDashSketchappMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentProps extends js.Object {
  var children: js.UndefOr[js.Array[reactLib.reactMod.ReactElement] | reactLib.reactMod.ReactElement] = js.undefined
}

object DocumentProps {
  @scala.inline
  def apply(children: js.Array[reactLib.reactMod.ReactElement] | reactLib.reactMod.ReactElement = null): DocumentProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentProps]
  }
}

