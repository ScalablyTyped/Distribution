package typings.snykDepGraph.legacyMod

import typings.snykDepGraph.typesMod.DepGraph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/dep-graph/dist/legacy", "graphToDepTree")
@js.native
object graphToDepTree extends js.Object {
  def apply(depGraphInterface: DepGraph, pkgType: String): js.Promise[DepTree] = js.native
  def apply(depGraphInterface: DepGraph, pkgType: String, opts: GraphToTreeOptions): js.Promise[DepTree] = js.native
}

