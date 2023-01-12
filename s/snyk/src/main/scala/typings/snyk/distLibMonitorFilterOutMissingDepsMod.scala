package typings.snyk

import typings.snyk.distLibTypesMod.DepTree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibMonitorFilterOutMissingDepsMod {
  
  @JSImport("snyk/dist/lib/monitor/filter-out-missing-deps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def filterOutMissingDeps(depTree: DepTree): FilteredDepTree = ^.asInstanceOf[js.Dynamic].applyDynamic("filterOutMissingDeps")(depTree.asInstanceOf[js.Any]).asInstanceOf[FilteredDepTree]
  
  trait FilteredDepTree extends StObject {
    
    var filteredDepTree: DepTree
    
    var missingDeps: js.Array[String]
  }
  object FilteredDepTree {
    
    inline def apply(filteredDepTree: DepTree, missingDeps: js.Array[String]): FilteredDepTree = {
      val __obj = js.Dynamic.literal(filteredDepTree = filteredDepTree.asInstanceOf[js.Any], missingDeps = missingDeps.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilteredDepTree]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FilteredDepTree] (val x: Self) extends AnyVal {
      
      inline def setFilteredDepTree(value: DepTree): Self = StObject.set(x, "filteredDepTree", value.asInstanceOf[js.Any])
      
      inline def setMissingDeps(value: js.Array[String]): Self = StObject.set(x, "missingDeps", value.asInstanceOf[js.Any])
      
      inline def setMissingDepsVarargs(value: String*): Self = StObject.set(x, "missingDeps", js.Array(value*))
    }
  }
}
