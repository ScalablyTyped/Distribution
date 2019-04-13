package typings
package reactDashMdLib.libInksInjectInkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InkProps extends js.Object {
  var ink: reactLib.reactMod.ReactNode | scala.Null
}

object InkProps {
  @scala.inline
  def apply(ink: reactLib.reactMod.ReactNode = null): InkProps = {
    val __obj = js.Dynamic.literal()
    if (ink != null) __obj.updateDynamic("ink")(ink.asInstanceOf[js.Any])
    __obj.asInstanceOf[InkProps]
  }
}

