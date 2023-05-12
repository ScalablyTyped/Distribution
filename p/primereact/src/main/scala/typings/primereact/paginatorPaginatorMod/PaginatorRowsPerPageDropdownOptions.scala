package typings.primereact.paginatorPaginatorMod

import typings.primereact.primereactStrings.self
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom rows per page dropdown options
  */
trait PaginatorRowsPerPageDropdownOptions extends StObject {
  
  /**
    * DOM element instance where the overlay panel should be mounted. Valid values are any DOM Element and "self". The "self" value is used to render a component where it is located.
    */
  var appendTo: js.UndefOr[self | HTMLElement | Null] = js.undefined
  
  /**
    * The current page number.
    */
  var currentPage: Double
  
  /**
    * Whether the dropdown is disabled.
    */
  var disabled: Boolean
  
  /**
    * JSX element to be used as the rows per page dropdown.
    */
  var element: Element
  
  /**
    * Paginator options change callback
    * @param {PaginatorChangeEvent} event - Custom change event.
    */
  def onChange(event: PaginatorChangeEvent): Unit
  
  /**
    * The options available in the rows per page dropdown.
    */
  var options: js.Array[Any]
  
  /**
    * The props of Paginator component.
    */
  var props: PaginatorProps
  
  /**
    * The total number of pages.
    */
  var totalPages: Double
  
  /**
    * The total number of records.
    */
  var totalRecords: Double
  
  /**
    * New value of the element.
    */
  var value: Any
}
object PaginatorRowsPerPageDropdownOptions {
  
  inline def apply(
    currentPage: Double,
    disabled: Boolean,
    element: Element,
    onChange: PaginatorChangeEvent => Unit,
    options: js.Array[Any],
    props: PaginatorProps,
    totalPages: Double,
    totalRecords: Double,
    value: Any
  ): PaginatorRowsPerPageDropdownOptions = {
    val __obj = js.Dynamic.literal(currentPage = currentPage.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), options = options.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], totalPages = totalPages.asInstanceOf[js.Any], totalRecords = totalRecords.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginatorRowsPerPageDropdownOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaginatorRowsPerPageDropdownOptions] (val x: Self) extends AnyVal {
    
    inline def setAppendTo(value: self | HTMLElement): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
    
    inline def setAppendToNull: Self = StObject.set(x, "appendTo", null)
    
    inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
    
    inline def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: PaginatorChangeEvent => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOptions(value: js.Array[Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: Any*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setProps(value: PaginatorProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
    
    inline def setTotalRecords(value: Double): Self = StObject.set(x, "totalRecords", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
