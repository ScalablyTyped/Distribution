package typings
package reduxDashPersistLib.integrationReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistGateProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var loading: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var onBeforeLift: js.UndefOr[js.Function] = js.undefined
  var persistor: reduxDashPersistLib.esTypesMod.Persistor
}

object PersistGateProps {
  @scala.inline
  def apply(
    persistor: reduxDashPersistLib.esTypesMod.Persistor,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    loading: reactLib.reactMod.ReactNs.ReactNode = null,
    onBeforeLift: js.Function = null
  ): PersistGateProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("persistor")(persistor)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (onBeforeLift != null) __obj.updateDynamic("onBeforeLift")(onBeforeLift)
    __obj.asInstanceOf[PersistGateProps]
  }
}

