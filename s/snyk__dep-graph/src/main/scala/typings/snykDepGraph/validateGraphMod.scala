package typings.snykDepGraph

import org.scalablytyped.runtime.StringDictionary
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/dep-graph/dist/core/validate-graph", JSImport.Namespace)
@js.native
object validateGraphMod extends js.Object {
  def validateGraph(
    graph: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify graphlib.Graph */ js.Any,
    rootNodeId: String,
    pkgs: StringDictionary[js.Any],
    pkgNodes: StringDictionary[Set[String]]
  ): Unit = js.native
}

