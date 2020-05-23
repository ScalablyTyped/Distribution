package typings.snykDepGraph.typesMod

import typings.snykDepGraph.anon.Id
import typings.snykDepGraph.anon.Nodes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DepGraphData extends js.Object {
  var graph: Nodes
  var pkgManager: PkgManager
  var pkgs: js.Array[Id]
  var schemaVersion: String
}

object DepGraphData {
  @scala.inline
  def apply(graph: Nodes, pkgManager: PkgManager, pkgs: js.Array[Id], schemaVersion: String): DepGraphData = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], pkgManager = pkgManager.asInstanceOf[js.Any], pkgs = pkgs.asInstanceOf[js.Any], schemaVersion = schemaVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepGraphData]
  }
}

