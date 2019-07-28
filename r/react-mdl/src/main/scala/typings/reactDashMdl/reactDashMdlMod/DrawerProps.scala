package typings.reactDashMdl.reactDashMdlMod

import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerProps
  extends HTMLProps[js.Any]

object DrawerProps {
  @scala.inline
  def apply(HTMLProps: HTMLProps[js.Any] = null, title: String = null): DrawerProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[DrawerProps]
  }
}

