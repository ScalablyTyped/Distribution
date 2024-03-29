package typings.reactTable.anon

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-table.react-table.TableSortByToggleProps> */
trait PartialTableSortByToggleP extends StObject {
  
  var onClick: js.UndefOr[js.Function1[/* e */ MouseEvent[Element, NativeMouseEvent], Unit]] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object PartialTableSortByToggleP {
  
  inline def apply(): PartialTableSortByToggleP = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTableSortByToggleP]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialTableSortByToggleP] (val x: Self) extends AnyVal {
    
    inline def setOnClick(value: /* e */ MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
