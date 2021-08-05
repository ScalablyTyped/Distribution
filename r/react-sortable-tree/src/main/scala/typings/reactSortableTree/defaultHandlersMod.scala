package typings.reactSortableTree

import typings.reactSortableTree.mod.SearchData
import typings.reactSortableTree.mod.TreeIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultHandlersMod {
  
  @JSImport("react-sortable-tree/utils/default-handlers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultGetNodeKey(data: TreeIndex): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultGetNodeKey")(data.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def defaultSearchMethod(data: SearchData): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultSearchMethod")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
