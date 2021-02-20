package typings.reactDataGrid.AdazzleReactDataGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about subrows.
  */
@js.native
trait SubRowDetails[T] extends StObject {
  
  /**
    * Determines if the cell can expand.
    */
  var canExpand: js.UndefOr[Boolean] = js.native
  
  /**
    * Children data.
    */
  var children: js.UndefOr[js.Array[T]] = js.native
  
  /**
    * Determines if the row has already expanded.
    */
  var expanded: Boolean = js.native
  
  /**
    * Sets the field/column that will be use to expand the subrows.
    */
  var field: String = js.native
  
  var group: js.UndefOr[Boolean] = js.native
  
  var numberSiblings: js.UndefOr[Double] = js.native
  
  var siblingIndex: js.UndefOr[Double] = js.native
  
  var treeDepth: js.UndefOr[Double] = js.native
}
object SubRowDetails {
  
  @scala.inline
  def apply[T](expanded: Boolean, field: String): SubRowDetails[T] = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubRowDetails[T]]
  }
  
  @scala.inline
  implicit class SubRowDetailsMutableBuilder[Self <: SubRowDetails[_], T] (val x: Self with SubRowDetails[T]) extends AnyVal {
    
    @scala.inline
    def setCanExpand(value: Boolean): Self = StObject.set(x, "canExpand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanExpandUndefined: Self = StObject.set(x, "canExpand", js.undefined)
    
    @scala.inline
    def setChildren(value: js.Array[T]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: T*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup(value: Boolean): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setNumberSiblings(value: Double): Self = StObject.set(x, "numberSiblings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberSiblingsUndefined: Self = StObject.set(x, "numberSiblings", js.undefined)
    
    @scala.inline
    def setSiblingIndex(value: Double): Self = StObject.set(x, "siblingIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiblingIndexUndefined: Self = StObject.set(x, "siblingIndex", js.undefined)
    
    @scala.inline
    def setTreeDepth(value: Double): Self = StObject.set(x, "treeDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeDepthUndefined: Self = StObject.set(x, "treeDepth", js.undefined)
  }
}
