package typings.rcTable.anon

import typings.rcTable.libInterfaceMod.CustomizeComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cell extends StObject {
  
  var cell: js.UndefOr[CustomizeComponent] = js.undefined
  
  var row: js.UndefOr[CustomizeComponent] = js.undefined
  
  var wrapper: js.UndefOr[CustomizeComponent] = js.undefined
}
object Cell {
  
  inline def apply(): Cell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cell]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cell] (val x: Self) extends AnyVal {
    
    inline def setCell(value: CustomizeComponent): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
    
    inline def setRow(value: CustomizeComponent): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    
    inline def setWrapper(value: CustomizeComponent): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    
    inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
  }
}
