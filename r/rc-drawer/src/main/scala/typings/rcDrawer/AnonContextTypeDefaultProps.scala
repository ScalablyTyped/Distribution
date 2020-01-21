package typings.rcDrawer

import typings.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContextTypeDefaultProps extends js.Object {
  var contextType: js.UndefOr[Context[_]] = js.undefined
  var defaultProps: AnonAfterVisibleChange
  var getDerivedStateFromProps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DrawerWrapper.getDerivedStateFromProps */ js.Any
}

object AnonContextTypeDefaultProps {
  @scala.inline
  def apply(
    defaultProps: AnonAfterVisibleChange,
    getDerivedStateFromProps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DrawerWrapper.getDerivedStateFromProps */ js.Any,
    contextType: Context[_] = null
  ): AnonContextTypeDefaultProps = {
    val __obj = js.Dynamic.literal(defaultProps = defaultProps.asInstanceOf[js.Any], getDerivedStateFromProps = getDerivedStateFromProps.asInstanceOf[js.Any])
    if (contextType != null) __obj.updateDynamic("contextType")(contextType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContextTypeDefaultProps]
  }
}

