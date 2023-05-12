package typings.primereact.paginatorPaginatorMod

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom paginator jump to page input options
  */
trait PaginatorJumpToPageInputOptions extends StObject {
  
  /**
    * Style class of the element.
    */
  var className: String
  
  /**
    * Whether the input is disabled.
    */
  var disabled: Boolean
  
  /**
    * JSX element to be used as the jump to page input element.
    */
  var element: Element
  
  /**
    * Callback to invoke when the input value changes.
    * @param {number} first - Custom change event.
    * @param {number} rows - Custom change event.
    */
  def onChange(first: Double, rows: Double): Unit
  
  /**
    * The props of Paginator component.
    */
  var props: PaginatorProps
  
  /**
    * The current value.
    */
  var value: Double
}
object PaginatorJumpToPageInputOptions {
  
  inline def apply(
    className: String,
    disabled: Boolean,
    element: Element,
    onChange: (Double, Double) => Unit,
    props: PaginatorProps,
    value: Double
  ): PaginatorJumpToPageInputOptions = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], onChange = js.Any.fromFunction2(onChange), props = props.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginatorJumpToPageInputOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaginatorJumpToPageInputOptions] (val x: Self) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: (Double, Double) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
    
    inline def setProps(value: PaginatorProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
