package typings
package rcDashDrawerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextType extends js.Object {
  var contextType: js.UndefOr[reactLib.reactMod.Context[_]] = js.undefined
  var defaultProps: Anon_AfterVisibleChange
  var getDerivedStateFromProps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DrawerWrapper.getDerivedStateFromProps */ js.Any
}

object Anon_ContextType {
  @scala.inline
  def apply(
    defaultProps: Anon_AfterVisibleChange,
    getDerivedStateFromProps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DrawerWrapper.getDerivedStateFromProps */ js.Any,
    contextType: reactLib.reactMod.Context[_] = null
  ): Anon_ContextType = {
    val __obj = js.Dynamic.literal(defaultProps = defaultProps, getDerivedStateFromProps = getDerivedStateFromProps)
    if (contextType != null) __obj.updateDynamic("contextType")(contextType)
    __obj.asInstanceOf[Anon_ContextType]
  }
}

