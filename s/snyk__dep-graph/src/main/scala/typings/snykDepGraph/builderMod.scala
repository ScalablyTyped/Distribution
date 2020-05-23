package typings.snykDepGraph

import typings.snykDepGraph.typesMod.DepGraph
import typings.snykDepGraph.typesMod.NodeInfo
import typings.snykDepGraph.typesMod.PkgInfo
import typings.snykDepGraph.typesMod.PkgManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/dep-graph/dist/core/builder", JSImport.Namespace)
@js.native
object builderMod extends js.Object {
  @js.native
  class DepGraphBuilder protected () extends js.Object {
    def this(pkgManager: PkgManager) = this()
    def this(pkgManager: PkgManager, rootPkg: PkgInfo) = this()
    var _graph: js.Any = js.native
    var _pkgManager: js.Any = js.native
    var _pkgNodes: js.Any = js.native
    var _pkgs: js.Any = js.native
    var _rootNodeId: js.Any = js.native
    var _rootPkgId: js.Any = js.native
    def addPkgNode(pkgInfo: PkgInfo, nodeId: String): Unit = js.native
    def addPkgNode(pkgInfo: PkgInfo, nodeId: String, nodeInfo: NodeInfo): Unit = js.native
    def build(): DepGraph = js.native
    def connectDep(parentNodeId: String, depNodeId: String): Unit = js.native
    def rootNodeId: String = js.native
  }
  
  /* static members */
  @js.native
  object DepGraphBuilder extends js.Object {
    var _getPkgId: js.Any = js.native
  }
  
}

