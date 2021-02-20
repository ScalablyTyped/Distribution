package typings.reactMdl.mod

import typings.react.mod.ClassAttributes
import typings.react.mod.DOMAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UndecoratedTableProps
  extends ClassAttributes[js.Any]
     with MDLHTMLAttributes
     with DOMAttributes[UndecoratedTable]
     with ShadowedComponent {
  
  var name: js.UndefOr[String] = js.native
  
  var rowKeyColumn: js.UndefOr[String] = js.native
  
  var rows: js.Array[_] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object UndecoratedTableProps {
  
  @scala.inline
  def apply(rows: js.Array[_]): UndecoratedTableProps = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[UndecoratedTableProps]
  }
  
  @scala.inline
  implicit class UndecoratedTablePropsMutableBuilder[Self <: UndecoratedTableProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRowKeyColumn(value: String): Self = StObject.set(x, "rowKeyColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowKeyColumnUndefined: Self = StObject.set(x, "rowKeyColumn", js.undefined)
    
    @scala.inline
    def setRows(value: js.Array[_]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsVarargs(value: js.Any*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
