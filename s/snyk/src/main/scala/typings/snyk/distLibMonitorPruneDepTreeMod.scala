package typings.snyk

import typings.snyk.distLibTypesMod.DepTree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibMonitorPruneDepTreeMod {
  
  @JSImport("snyk/dist/lib/monitor/prune-dep-tree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pruneTree(tree: DepTree, packageManagerName: String): js.Promise[DepTree] = (^.asInstanceOf[js.Dynamic].applyDynamic("pruneTree")(tree.asInstanceOf[js.Any], packageManagerName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DepTree]]
}
