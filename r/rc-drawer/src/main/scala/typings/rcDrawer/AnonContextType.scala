package typings.rcDrawer

import typings.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContextType extends js.Object {
  var contextType: js.UndefOr[Context[_]] = js.undefined
  var defaultProps: AnonSwitchScrollingEffect
  var getDerivedStateFromProps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DrawerChild.getDerivedStateFromProps */ js.Any
}

object AnonContextType {
  @scala.inline
  def apply(
    defaultProps: AnonSwitchScrollingEffect,
    getDerivedStateFromProps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DrawerChild.getDerivedStateFromProps */ js.Any,
    contextType: Context[_] = null
  ): AnonContextType = {
    val __obj = js.Dynamic.literal(defaultProps = defaultProps.asInstanceOf[js.Any], getDerivedStateFromProps = getDerivedStateFromProps.asInstanceOf[js.Any])
    if (contextType != null) __obj.updateDynamic("contextType")(contextType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContextType]
  }
}

