package typings.reactWindow.mod

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FixedSizeListProps[T]
  extends StObject
     with ListProps[T] {
  
  /**
    * Size of a item in the direction being windowed. For vertical lists, this is the row height. For horizontal lists, this is the column width.
    */
  var itemSize: Double
}
object FixedSizeListProps {
  
  inline def apply[T](
    children: ComponentType[ListChildComponentProps[T]],
    height: Double | String,
    itemCount: Double,
    itemSize: Double,
    width: Double | String
  ): FixedSizeListProps[T] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], itemCount = itemCount.asInstanceOf[js.Any], itemSize = itemSize.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixedSizeListProps[T]]
  }
  
  extension [Self <: FixedSizeListProps[?], T](x: Self & FixedSizeListProps[T]) {
    
    inline def setItemSize(value: Double): Self = StObject.set(x, "itemSize", value.asInstanceOf[js.Any])
  }
}
