package typings.snyk

import typings.snyk.distLibTypesMod.DepTree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibMonitorDropEmptyDepsMod {
  
  @JSImport("snyk/dist/lib/monitor/drop-empty-deps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dropEmptyDeps(depTree: DepTree): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("dropEmptyDeps")(depTree.asInstanceOf[js.Any]).asInstanceOf[Any]
}
