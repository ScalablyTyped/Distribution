package typings.primereact.paginatorPaginatorMod

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom paginator current page report options
  */
trait PaginatorCurrentPageReportOptions extends StObject {
  
  /**
    * Style class of the element.
    */
  var className: String
  
  /**
    * The current page number.
    */
  var currentPage: Double
  
  /**
    * JSX element to be used as the current page report element.
    */
  var element: Element
  
  /**
    * The first number of the current page.
    */
  var first: Double
  
  /**
    * The last number of the current page.
    */
  var last: Double
  
  /**
    * The props of Paginator component.
    */
  var props: PaginatorProps
  
  /**
    * The number of rows per page.
    */
  var rows: Double
  
  /**
    * The total number of pages.
    */
  var totalPages: Double
  
  /**
    * The total number of records.
    */
  var totalRecords: Double
}
object PaginatorCurrentPageReportOptions {
  
  inline def apply(
    className: String,
    currentPage: Double,
    element: Element,
    first: Double,
    last: Double,
    props: PaginatorProps,
    rows: Double,
    totalPages: Double,
    totalRecords: Double
  ): PaginatorCurrentPageReportOptions = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], currentPage = currentPage.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], totalPages = totalPages.asInstanceOf[js.Any], totalRecords = totalRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginatorCurrentPageReportOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaginatorCurrentPageReportOptions] (val x: Self) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
    
    inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setFirst(value: Double): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setLast(value: Double): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    
    inline def setProps(value: PaginatorProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
    
    inline def setTotalRecords(value: Double): Self = StObject.set(x, "totalRecords", value.asInstanceOf[js.Any])
  }
}
