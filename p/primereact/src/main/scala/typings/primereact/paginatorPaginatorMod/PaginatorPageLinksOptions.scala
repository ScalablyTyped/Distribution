package typings.primereact.paginatorPaginatorMod

import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaginatorPageLinksOptions extends StObject {
  
  var className: String
  
  var currentPage: Double
  
  var element: Element
  
  def onClick(event: SyntheticEvent[typings.std.Element, Event]): Unit
  
  var page: Double
  
  var props: PaginatorProps
  
  var totalPages: Double
  
  var view: PaginatorViewOptions
}
object PaginatorPageLinksOptions {
  
  inline def apply(
    className: String,
    currentPage: Double,
    element: Element,
    onClick: SyntheticEvent[typings.std.Element, Event] => Unit,
    page: Double,
    props: PaginatorProps,
    totalPages: Double,
    view: PaginatorViewOptions
  ): PaginatorPageLinksOptions = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], currentPage = currentPage.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), page = page.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], totalPages = totalPages.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginatorPageLinksOptions]
  }
  
  extension [Self <: PaginatorPageLinksOptions](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
    
    inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: SyntheticEvent[typings.std.Element, Event] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setProps(value: PaginatorProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
    
    inline def setView(value: PaginatorViewOptions): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
