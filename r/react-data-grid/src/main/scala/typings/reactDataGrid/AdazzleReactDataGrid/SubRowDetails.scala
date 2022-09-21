package typings.reactDataGrid.AdazzleReactDataGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about subrows.
  */
trait SubRowDetails[T] extends StObject {
  
  /**
    * Determines if the cell can expand.
    */
  var canExpand: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Children data.
    */
  var children: js.UndefOr[js.Array[T]] = js.undefined
  
  /**
    * Determines if the row has already expanded.
    */
  var expanded: Boolean
  
  /**
    * Sets the field/column that will be use to expand the subrows.
    */
  var field: String
  
  var group: js.UndefOr[Boolean] = js.undefined
  
  var numberSiblings: js.UndefOr[Double] = js.undefined
  
  var siblingIndex: js.UndefOr[Double] = js.undefined
  
  var treeDepth: js.UndefOr[Double] = js.undefined
}
object SubRowDetails {
  
  inline def apply[T](expanded: Boolean, field: String): SubRowDetails[T] = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubRowDetails[T]]
  }
  
  extension [Self <: SubRowDetails[?], T](x: Self & SubRowDetails[T]) {
    
    inline def setCanExpand(value: Boolean): Self = StObject.set(x, "canExpand", value.asInstanceOf[js.Any])
    
    inline def setCanExpandUndefined: Self = StObject.set(x, "canExpand", js.undefined)
    
    inline def setChildren(value: js.Array[T]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: T*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: Boolean): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setNumberSiblings(value: Double): Self = StObject.set(x, "numberSiblings", value.asInstanceOf[js.Any])
    
    inline def setNumberSiblingsUndefined: Self = StObject.set(x, "numberSiblings", js.undefined)
    
    inline def setSiblingIndex(value: Double): Self = StObject.set(x, "siblingIndex", value.asInstanceOf[js.Any])
    
    inline def setSiblingIndexUndefined: Self = StObject.set(x, "siblingIndex", js.undefined)
    
    inline def setTreeDepth(value: Double): Self = StObject.set(x, "treeDepth", value.asInstanceOf[js.Any])
    
    inline def setTreeDepthUndefined: Self = StObject.set(x, "treeDepth", js.undefined)
  }
}
