package typings.reactRouterNative.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackButtonProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
}

object BackButtonProps {
  @scala.inline
  def apply(children: ReactNode = null): BackButtonProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackButtonProps]
  }
}

