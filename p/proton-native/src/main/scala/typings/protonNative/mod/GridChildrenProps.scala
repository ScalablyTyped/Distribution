package typings.protonNative.mod

import typings.protonNative.anon.H
import typings.protonNative.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridChildrenProps extends StObject {
  
  /**
    * Whether the component is aligned with the other components in the column/row.
    */
  var align: js.UndefOr[H] = js.undefined
  
  /**
    * What column the component resides in.
    */
  var column: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether the component can expand in the direction.
    */
  var expand: js.UndefOr[H] = js.undefined
  
  /**
    * What row the component resides in.
    */
  var row: js.UndefOr[Double] = js.undefined
  
  /**
    * How many rows/columns the component takes off.
    */
  var span: js.UndefOr[X] = js.undefined
}
object GridChildrenProps {
  
  inline def apply(): GridChildrenProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridChildrenProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridChildrenProps] (val x: Self) extends AnyVal {
    
    inline def setAlign(value: H): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setExpand(value: H): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    
    inline def setSpan(value: X): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
    
    inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
  }
}
