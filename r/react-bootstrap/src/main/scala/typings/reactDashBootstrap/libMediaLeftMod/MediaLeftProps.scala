package typings.reactDashBootstrap.libMediaLeftMod

import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaLeftProps extends HTMLProps[MediaLeft] {
  var align: js.UndefOr[String] = js.undefined
}

object MediaLeftProps {
  @scala.inline
  def apply(HTMLProps: HTMLProps[MediaLeft] = null, align: String = null): MediaLeftProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (align != null) __obj.updateDynamic("align")(align)
    __obj.asInstanceOf[MediaLeftProps]
  }
}

