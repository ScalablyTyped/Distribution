package typings.reactMdl.mod

import typings.react.mod.ClassAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableHeaderProps
  extends ClassAttributes[js.Any]
     with MDLHTMLAttributes
     with MDLDOMAttributes[TableHeader] {
  
  var cellFormatter: js.UndefOr[
    js.Function3[/* value */ js.Any, /* row */ js.Any, /* index */ Double, ReactNode]
  ] = js.native
  
  var name: String = js.native
  
  var nosort: js.UndefOr[Boolean] = js.native
  
  var numeric: js.UndefOr[Boolean] = js.native
  
  var onClick: js.UndefOr[
    js.Function2[/* e */ MouseEvent[TableHeader, NativeMouseEvent], /* name */ String, _]
  ] = js.native
  
  var sortFn: js.UndefOr[js.Function3[/* a */ js.Any, /* b */ js.Any, /* isAsc */ Boolean, Double]] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var tooltip: js.UndefOr[ReactNode] = js.native
}
object TableHeaderProps {
  
  @scala.inline
  def apply(name: String): TableHeaderProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableHeaderProps]
  }
  
  @scala.inline
  implicit class TableHeaderPropsMutableBuilder[Self <: TableHeaderProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellFormatter(value: (/* value */ js.Any, /* row */ js.Any, /* index */ Double) => ReactNode): Self = StObject.set(x, "cellFormatter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCellFormatterUndefined: Self = StObject.set(x, "cellFormatter", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNosort(value: Boolean): Self = StObject.set(x, "nosort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNosortUndefined: Self = StObject.set(x, "nosort", js.undefined)
    
    @scala.inline
    def setNumeric(value: Boolean): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumericUndefined: Self = StObject.set(x, "numeric", js.undefined)
    
    @scala.inline
    def setOnClick(value: (/* e */ MouseEvent[TableHeader, NativeMouseEvent], /* name */ String) => _): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setSortFn(value: (/* a */ js.Any, /* b */ js.Any, /* isAsc */ Boolean) => Double): Self = StObject.set(x, "sortFn", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSortFnUndefined: Self = StObject.set(x, "sortFn", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTooltip(value: ReactNode): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
