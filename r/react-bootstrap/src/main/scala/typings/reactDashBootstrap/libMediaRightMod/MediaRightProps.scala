package typings.reactDashBootstrap.libMediaRightMod

import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaRightProps extends HTMLProps[MediaRight] {
  var align: js.UndefOr[String] = js.undefined
}

object MediaRightProps {
  @scala.inline
  def apply(HTMLProps: HTMLProps[MediaRight] = null, align: String = null): MediaRightProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (align != null) __obj.updateDynamic("align")(align)
    __obj.asInstanceOf[MediaRightProps]
  }
}

