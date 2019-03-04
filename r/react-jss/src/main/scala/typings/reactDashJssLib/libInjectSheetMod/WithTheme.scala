package typings
package reactDashJssLib.libInjectSheetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithTheme[T] extends js.Object {
  var innerRef: js.UndefOr[reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_]] = js.undefined
  var theme: T
}

object WithTheme {
  @scala.inline
  def apply[T](
    theme: T,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null
  ): WithTheme[T] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithTheme[T]]
  }
}

