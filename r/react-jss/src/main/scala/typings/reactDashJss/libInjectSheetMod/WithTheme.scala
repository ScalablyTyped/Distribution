package typings.reactDashJss.libInjectSheetMod

import typings.react.reactMod.Ref
import typings.react.reactMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithTheme[T] extends js.Object {
  var innerRef: js.UndefOr[Ref[_] | RefObject[_]] = js.undefined
  var theme: T
}

object WithTheme {
  @scala.inline
  def apply[T](theme: T, innerRef: Ref[_] | RefObject[_] = null): WithTheme[T] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithTheme[T]]
  }
}

