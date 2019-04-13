package typings
package rmcDashPullDashToDashRefreshLib.esPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Indicator extends js.Object {
  var activate: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var deactivate: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var finish: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var release: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object Indicator {
  @scala.inline
  def apply(
    activate: reactLib.reactMod.ReactNode = null,
    deactivate: reactLib.reactMod.ReactNode = null,
    finish: reactLib.reactMod.ReactNode = null,
    release: reactLib.reactMod.ReactNode = null
  ): Indicator = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(activate.asInstanceOf[js.Any])
    if (deactivate != null) __obj.updateDynamic("deactivate")(deactivate.asInstanceOf[js.Any])
    if (finish != null) __obj.updateDynamic("finish")(finish.asInstanceOf[js.Any])
    if (release != null) __obj.updateDynamic("release")(release.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indicator]
  }
}

