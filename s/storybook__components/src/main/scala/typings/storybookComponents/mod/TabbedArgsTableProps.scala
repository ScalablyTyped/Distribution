package typings.storybookComponents.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabbedArgsTableProps extends StObject {
  
  var sort: js.UndefOr[SortType] = js.undefined
  
  var tabs: Record[String, ArgsTableProps]
}
object TabbedArgsTableProps {
  
  inline def apply(tabs: Record[String, ArgsTableProps]): TabbedArgsTableProps = {
    val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabbedArgsTableProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TabbedArgsTableProps] (val x: Self) extends AnyVal {
    
    inline def setSort(value: SortType): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setTabs(value: Record[String, ArgsTableProps]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
  }
}
