package typings.react.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Unfortunately, we have no way of declaring that the component constructor must implement this
trait StaticLifecycle[P, S] extends js.Object {
  var getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[P, S]] = js.undefined
  var getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[P, S]] = js.undefined
}

object StaticLifecycle {
  @scala.inline
  def apply[P, S](
    getDerivedStateFromError: GetDerivedStateFromError[P, S] = null,
    getDerivedStateFromProps: GetDerivedStateFromProps[P, S] = null
  ): StaticLifecycle[P, S] = {
    val __obj = js.Dynamic.literal()
    if (getDerivedStateFromError != null) __obj.updateDynamic("getDerivedStateFromError")(getDerivedStateFromError)
    if (getDerivedStateFromProps != null) __obj.updateDynamic("getDerivedStateFromProps")(getDerivedStateFromProps)
    __obj.asInstanceOf[StaticLifecycle[P, S]]
  }
}

