package typings.reactWindow.mod

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariableSizeListProps
  extends StObject
     with ListProps {
  
  /**
    * Estimated size of a item in the direction being windowed. For vertical lists, this is the row height. For horizontal lists, this is the column width.
    *
    * This value is used to calculated the estimated total size of a list before its items have all been measured. The total size impacts user scrolling behavior.
    * It is updated whenever new items are measured.
    */
  var estimatedItemSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Returns the size of a item in the direction being windowed. For vertical lists, this is the row height. For horizontal lists, this is the column width.
    */
  def itemSize(index: Double): Double
}
object VariableSizeListProps {
  
  @scala.inline
  def apply(
    children: ComponentType[ListChildComponentProps],
    height: Double | String,
    itemCount: Double,
    itemSize: Double => Double,
    width: Double | String
  ): VariableSizeListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], itemCount = itemCount.asInstanceOf[js.Any], itemSize = js.Any.fromFunction1(itemSize), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableSizeListProps]
  }
  
  @scala.inline
  implicit class VariableSizeListPropsMutableBuilder[Self <: VariableSizeListProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEstimatedItemSize(value: Double): Self = StObject.set(x, "estimatedItemSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedItemSizeUndefined: Self = StObject.set(x, "estimatedItemSize", js.undefined)
    
    @scala.inline
    def setItemSize(value: Double => Double): Self = StObject.set(x, "itemSize", js.Any.fromFunction1(value))
  }
}
