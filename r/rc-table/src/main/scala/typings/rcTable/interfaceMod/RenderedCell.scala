package typings.rcTable.interfaceMod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderedCell[RecordType] extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var props: js.UndefOr[CellType[RecordType]] = js.undefined
}
object RenderedCell {
  
  inline def apply[RecordType](): RenderedCell[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderedCell[RecordType]]
  }
  
  extension [Self <: RenderedCell[?], RecordType](x: Self & RenderedCell[RecordType]) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setProps(value: CellType[RecordType]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
  }
}
