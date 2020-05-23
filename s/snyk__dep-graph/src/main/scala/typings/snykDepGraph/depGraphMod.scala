package typings.snykDepGraph

import org.scalablytyped.runtime.StringDictionary
import typings.snykDepGraph.typesMod.DepGraphInternal
import typings.snykDepGraph.typesMod.Pkg
import typings.snykDepGraph.typesMod.PkgInfo
import typings.snykDepGraph.typesMod.PkgManager
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/dep-graph/dist/core/dep-graph", JSImport.Namespace)
@js.native
object depGraphMod extends js.Object {
  @js.native
  class DepGraphImpl protected () extends DepGraphInternal {
    def this(
      graph: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify graphlib.Graph */ js.Any,
      rootNodeId: String,
      pkgs: StringDictionary[PkgInfo],
      pkgNodes: StringDictionary[Set[String]],
      pkgManager: PkgManager
    ) = this()
    var _countNodePathsToRootCache: js.Any = js.native
    var _depPkgsList: js.Any = js.native
    var _graph: js.Any = js.native
    var _hasCycles: js.Any = js.native
    var _pkgList: js.Any = js.native
    var _pkgManager: js.Any = js.native
    var _pkgNodes: js.Any = js.native
    var _pkgs: js.Any = js.native
    var _rootNodeId: js.Any = js.native
    var _rootPkgId: js.Any = js.native
    var countNodePathsToRoot: js.Any = js.native
    var getGraphNode: js.Any = js.native
    var nodeEquals: js.Any = js.native
    var pathsFromNodeToRoot: js.Any = js.native
    @JSName("pkgManager")
    def pkgManager_MDepGraphImpl: PkgManager = js.native
    @JSName("rootNodeId")
    def rootNodeId_MDepGraphImpl: String = js.native
    @JSName("rootPkg")
    def rootPkg_MDepGraphImpl: PkgInfo = js.native
  }
  
  /* static members */
  @js.native
  object DepGraphImpl extends js.Object {
    var SCHEMA_VERSION: String = js.native
    def getPkgId(pkg: Pkg): String = js.native
  }
  
}

