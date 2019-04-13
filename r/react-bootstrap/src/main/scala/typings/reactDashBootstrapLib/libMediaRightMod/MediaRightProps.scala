package typings
package reactDashBootstrapLib.libMediaRightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaRightProps
  extends reactLib.reactMod.HTMLProps[MediaRight] {
  var align: js.UndefOr[java.lang.String] = js.undefined
}

object MediaRightProps {
  @scala.inline
  def apply(HTMLProps: reactLib.reactMod.HTMLProps[MediaRight] = null, align: java.lang.String = null): MediaRightProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (align != null) __obj.updateDynamic("align")(align)
    __obj.asInstanceOf[MediaRightProps]
  }
}

