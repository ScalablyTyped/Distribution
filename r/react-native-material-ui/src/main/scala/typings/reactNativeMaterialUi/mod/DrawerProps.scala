package typings.reactNativeMaterialUi.mod

import typings.react.mod.global.JSX.Element
import typings.reactNativeMaterialUi.anon.ContainerViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerProps extends js.Object {
  var children: Element
  var style: js.UndefOr[ContainerViewStyle] = js.undefined
}

object DrawerProps {
  @scala.inline
  def apply(children: Element, style: ContainerViewStyle = null): DrawerProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerProps]
  }
}

