package typings.reduxRouter

import typings.history.mod.Pathname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-router/lib/isActive", JSImport.Namespace)
@js.native
object isActiveMod extends js.Object {
  def default(pathname: Pathname): Boolean = js.native
  def default(pathname: Pathname, query: js.UndefOr[scala.Nothing], indexOnly: Boolean): Boolean = js.native
  def default(
    pathname: Pathname,
    query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify H.Query */ js.Any
  ): Boolean = js.native
  def default(
    pathname: Pathname,
    query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify H.Query */ js.Any,
    indexOnly: Boolean
  ): Boolean = js.native
}

