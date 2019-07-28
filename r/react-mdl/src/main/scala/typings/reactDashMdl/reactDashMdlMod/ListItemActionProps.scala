package typings.reactDashMdl.reactDashMdlMod

import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemActionProps
  extends HTMLProps[js.Any] {
  var info: js.UndefOr[String] = js.undefined
}

object ListItemActionProps {
  @scala.inline
  def apply(HTMLProps: HTMLProps[js.Any] = null, info: String = null): ListItemActionProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (info != null) __obj.updateDynamic("info")(info)
    __obj.asInstanceOf[ListItemActionProps]
  }
}

