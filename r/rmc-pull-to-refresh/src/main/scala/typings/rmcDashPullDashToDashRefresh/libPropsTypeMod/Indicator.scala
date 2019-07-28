package typings.rmcDashPullDashToDashRefresh.libPropsTypeMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Indicator extends js.Object {
  var activate: js.UndefOr[ReactNode] = js.undefined
  var deactivate: js.UndefOr[ReactNode] = js.undefined
  var finish: js.UndefOr[ReactNode] = js.undefined
  var release: js.UndefOr[ReactNode] = js.undefined
}

object Indicator {
  @scala.inline
  def apply(
    activate: ReactNode = null,
    deactivate: ReactNode = null,
    finish: ReactNode = null,
    release: ReactNode = null
  ): Indicator = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(activate.asInstanceOf[js.Any])
    if (deactivate != null) __obj.updateDynamic("deactivate")(deactivate.asInstanceOf[js.Any])
    if (finish != null) __obj.updateDynamic("finish")(finish.asInstanceOf[js.Any])
    if (release != null) __obj.updateDynamic("release")(release.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indicator]
  }
}

