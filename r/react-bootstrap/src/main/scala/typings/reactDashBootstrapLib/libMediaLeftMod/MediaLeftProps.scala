package typings
package reactDashBootstrapLib.libMediaLeftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaLeftProps
  extends reactLib.reactMod.HTMLProps[MediaLeft] {
  var align: js.UndefOr[java.lang.String] = js.undefined
}

object MediaLeftProps {
  @scala.inline
  def apply(HTMLProps: reactLib.reactMod.HTMLProps[MediaLeft] = null, align: java.lang.String = null): MediaLeftProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (align != null) __obj.updateDynamic("align")(align)
    __obj.asInstanceOf[MediaLeftProps]
  }
}

