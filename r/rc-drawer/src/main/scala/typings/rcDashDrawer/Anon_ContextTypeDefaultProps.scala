package typings.rcDashDrawer

import typings.react.reactMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextTypeDefaultProps extends js.Object {
  var contextType: js.UndefOr[Context[_]] = js.undefined
  var defaultProps: Anon_AfterVisibleChange
  var getDerivedStateFromProps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DrawerWrapper.getDerivedStateFromProps */ js.Any
}

object Anon_ContextTypeDefaultProps {
  @scala.inline
  def apply(
    defaultProps: Anon_AfterVisibleChange,
    getDerivedStateFromProps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DrawerWrapper.getDerivedStateFromProps */ js.Any,
    contextType: Context[_] = null
  ): Anon_ContextTypeDefaultProps = {
    val __obj = js.Dynamic.literal(defaultProps = defaultProps.asInstanceOf[js.Any], getDerivedStateFromProps = getDerivedStateFromProps.asInstanceOf[js.Any])
    if (contextType != null) __obj.updateDynamic("contextType")(contextType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContextTypeDefaultProps]
  }
}

