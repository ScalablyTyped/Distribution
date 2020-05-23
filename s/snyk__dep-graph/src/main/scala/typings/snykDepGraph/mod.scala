package typings.snykDepGraph

import typings.snykDepGraph.legacyMod.DepTree
import typings.snykDepGraph.legacyMod.GraphToTreeOptions
import typings.snykDepGraph.typesMod.DepGraph
import typings.snykDepGraph.typesMod.DepGraphData
import typings.snykDepGraph.typesMod.PkgInfo
import typings.snykDepGraph.typesMod.PkgManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/dep-graph", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class DepGraphBuilder protected ()
    extends typings.snykDepGraph.builderMod.DepGraphBuilder {
    def this(pkgManager: PkgManager) = this()
    def this(pkgManager: PkgManager, rootPkg: PkgInfo) = this()
  }
  
  def createFromJSON(depGraphData: DepGraphData): DepGraph = js.native
  /* static members */
  @js.native
  object DepGraphBuilder extends js.Object {
    var _getPkgId: js.Any = js.native
  }
  
  @js.native
  object Errors extends js.Object {
    @js.native
    class ValidationError protected ()
      extends typings.snykDepGraph.errorsMod.ValidationError {
      def this(message: String) = this()
    }
    
  }
  
  @js.native
  object legacy extends js.Object {
    def depTreeToGraph(depTree: DepTree, pkgManagerName: String): js.Promise[DepGraph] = js.native
    def graphToDepTree(depGraphInterface: DepGraph, pkgType: String): js.Promise[DepTree] = js.native
    def graphToDepTree(depGraphInterface: DepGraph, pkgType: String, opts: GraphToTreeOptions): js.Promise[DepTree] = js.native
  }
  
}

