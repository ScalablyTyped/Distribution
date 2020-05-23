package typings.snykDepGraph

import typings.snykDepGraph.typesMod.DepGraph
import typings.snykDepGraph.typesMod.DepGraphData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/dep-graph/dist/core/create-from-json", JSImport.Namespace)
@js.native
object createFromJsonMod extends js.Object {
  val SUPPORTED_SCHEMA_RANGE: /* "^1.0.0" */ String = js.native
  def createFromJSON(depGraphData: DepGraphData): DepGraph = js.native
}

