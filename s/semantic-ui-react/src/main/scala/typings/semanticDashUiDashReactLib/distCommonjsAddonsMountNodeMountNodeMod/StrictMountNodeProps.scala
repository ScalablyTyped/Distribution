package typings
package semanticDashUiDashReactLib.distCommonjsAddonsMountNodeMountNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictMountNodeProps extends js.Object {
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** The DOM node where we will apply class names. Defaults to document.body. */
  var node: js.UndefOr[stdLib.HTMLElement | reactLib.reactMod.Ref[_]] = js.undefined
}

object StrictMountNodeProps {
  @scala.inline
  def apply(className: java.lang.String = null, node: stdLib.HTMLElement | reactLib.reactMod.Ref[_] = null): StrictMountNodeProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictMountNodeProps]
  }
}

