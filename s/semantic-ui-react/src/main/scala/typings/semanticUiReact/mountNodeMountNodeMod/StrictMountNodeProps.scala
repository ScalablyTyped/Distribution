package typings.semanticUiReact.mountNodeMountNodeMod

import typings.react.mod.Ref
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictMountNodeProps extends js.Object {
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** The DOM node where we will apply class names. Defaults to document.body. */
  var node: js.UndefOr[HTMLElement | Ref[_]] = js.undefined
}

object StrictMountNodeProps {
  @scala.inline
  def apply(className: String = null, node: js.UndefOr[Null | HTMLElement | Ref[_]] = js.undefined): StrictMountNodeProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(node)) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictMountNodeProps]
  }
}

