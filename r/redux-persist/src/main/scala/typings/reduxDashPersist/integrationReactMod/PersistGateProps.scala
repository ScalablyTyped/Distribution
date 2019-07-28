package typings.reduxDashPersist.integrationReactMod

import typings.react.reactMod.ReactNode
import typings.reduxDashPersist.esTypesMod.Persistor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistGateProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var loading: js.UndefOr[ReactNode] = js.undefined
  var onBeforeLift: js.UndefOr[js.Function] = js.undefined
  var persistor: Persistor
}

object PersistGateProps {
  @scala.inline
  def apply(
    persistor: Persistor,
    children: ReactNode = null,
    loading: ReactNode = null,
    onBeforeLift: js.Function = null
  ): PersistGateProps = {
    val __obj = js.Dynamic.literal(persistor = persistor)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (onBeforeLift != null) __obj.updateDynamic("onBeforeLift")(onBeforeLift)
    __obj.asInstanceOf[PersistGateProps]
  }
}

