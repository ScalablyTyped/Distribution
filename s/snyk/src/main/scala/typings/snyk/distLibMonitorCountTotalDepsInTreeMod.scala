package typings.snyk

import typings.snyk.distLibTypesMod.DepTree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibMonitorCountTotalDepsInTreeMod {
  
  @JSImport("snyk/dist/lib/monitor/count-total-deps-in-tree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def countTotalDependenciesInTree(depTree: DepTree): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("countTotalDependenciesInTree")(depTree.asInstanceOf[js.Any]).asInstanceOf[Double]
}
