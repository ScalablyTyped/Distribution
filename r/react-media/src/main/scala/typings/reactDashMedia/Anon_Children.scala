package typings.reactDashMedia

import typings.react.reactMod.ReactNode
import typings.reactDashMedia.reactDashMediaMod.QueryResults
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children[Queries] extends js.Object {
  var children: js.UndefOr[(js.Function1[/* matches */ QueryResults[Queries], ReactNode]) | ReactNode] = js.undefined
  var defaultMatches: js.UndefOr[Partial[QueryResults[Queries]]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* matches */ QueryResults[Queries], Unit]] = js.undefined
  var queries: Queries
}

object Anon_Children {
  @scala.inline
  def apply[Queries](
    queries: Queries,
    children: (js.Function1[/* matches */ QueryResults[Queries], ReactNode]) | ReactNode = null,
    defaultMatches: Partial[QueryResults[Queries]] = null,
    onChange: /* matches */ QueryResults[Queries] => Unit = null
  ): Anon_Children[Queries] = {
    val __obj = js.Dynamic.literal(queries = queries.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (defaultMatches != null) __obj.updateDynamic("defaultMatches")(defaultMatches)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[Anon_Children[Queries]]
  }
}

