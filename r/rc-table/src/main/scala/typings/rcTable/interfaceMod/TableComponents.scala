package typings.rcTable.interfaceMod

import typings.rcTable.anon.Cell
import typings.rcTable.anon.OnScroll
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableComponents[RecordType] extends StObject {
  
  var body: js.UndefOr[CustomizeScrollBody[RecordType] | Cell] = js.undefined
  
  var header: js.UndefOr[Cell] = js.undefined
  
  var table: js.UndefOr[CustomizeComponent] = js.undefined
}
object TableComponents {
  
  @scala.inline
  def apply[RecordType](): TableComponents[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableComponents[RecordType]]
  }
  
  @scala.inline
  implicit class TableComponentsMutableBuilder[Self <: TableComponents[?], RecordType] (val x: Self & TableComponents[RecordType]) extends AnyVal {
    
    @scala.inline
    def setBody(value: CustomizeScrollBody[RecordType] | Cell): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyFunction2(value: (/* data */ js.Array[RecordType], /* info */ OnScroll) => ReactNode): Self = StObject.set(x, "body", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setHeader(value: Cell): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setTable(value: CustomizeComponent): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
  }
}
