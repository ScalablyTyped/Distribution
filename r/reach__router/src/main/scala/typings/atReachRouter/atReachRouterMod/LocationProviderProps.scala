package typings.atReachRouter.atReachRouterMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationProviderProps extends js.Object {
  var children: js.UndefOr[ReactNode | LocationProviderRenderFn] = js.undefined
  var history: js.UndefOr[History] = js.undefined
}

object LocationProviderProps {
  @scala.inline
  def apply(children: ReactNode | LocationProviderRenderFn = null, history: History = null): LocationProviderProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history)
    __obj.asInstanceOf[LocationProviderProps]
  }
}

