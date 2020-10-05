package typings.semanticUiReact.mountNodeMountNodeMod

import typings.react.mod.Ref
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrictMountNodeProps extends js.Object {
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  /** The DOM node where we will apply class names. Defaults to document.body. */
  var node: js.UndefOr[HTMLElement | Ref[_]] = js.native
}

object StrictMountNodeProps {
  @scala.inline
  def apply(): StrictMountNodeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictMountNodeProps]
  }
  @scala.inline
  implicit class StrictMountNodePropsOps[Self <: StrictMountNodeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setNodeFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("node", js.Any.fromFunction1(value))
    @scala.inline
    def setNode(value: HTMLElement | Ref[_]): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNode: Self = this.set("node", js.undefined)
    @scala.inline
    def setNodeNull: Self = this.set("node", null)
  }
  
}

